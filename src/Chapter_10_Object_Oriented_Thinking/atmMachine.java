package Chapter_10_Object_Oriented_Thinking;
import java.util.Scanner;

public class atmMachine 
{
	Account account;
	
	static Scanner input = new Scanner(System.in);
	int userinput;
	
	public atmMachine(Account account)
	{
		this.account = account;
	}
	
	public void displayMainMenu()
	{
		System.out.print("Main Menu"
				+ "\n1: Check Balance"
				+ "\n2: Withdraw"
				+ "\n3: Deposit"
				+ "\n4: Exit");
		
		userinput = input.nextInt();
		checkInput(userinput);
	}
	
	public void checkInput(int userinput)
	{
		if (userinput == 1)
		{
			checkBalance();
			displayMainMenu();
		}
		else if (userinput == 2)
		{
			withdraw();
			displayMainMenu();
		}
		else if (userinput == 3)
		{
			deposit();
			displayMainMenu();
		}
		else if (userinput == 4)
		{
			System.out.println("Exiting ATM Machine.");
		}
		else
		{
			System.out.println("Incorrect input. Try again: ");
			checkInput(input.nextInt());
		}
	}
	
	public void deposit()
	{
		System.out.println("How much do you want to deposit: ");
		account.deposit(input.nextDouble());
	}
	
	public void withdraw()
	{
		System.out.println("How much do you want to withdraw: ");
		account.withdraw(input.nextDouble());
	}
	
	public void checkBalance()
	{
		System.out.println(account.getBalance()); 
	}
}
