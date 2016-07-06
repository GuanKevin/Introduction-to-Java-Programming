package Chapter_10_Object_Oriented_Thinking;
import java.util.Scanner;

/**
 * Game: ATM machine
 * Use the Account class created in Programming Exercise 9.7 to simulate an ATM machine. 
 * Create ten accounts in an array with id 0, 1, . . . , 9, and initial balance $100. 
 * The system prompts the user to enter an id. 
 * If the id is entered incorrectly, ask the user to enter a correct id. 
 * Once an id is accepted, the main menu is displayed as shown in the sample run. 
 * You can enter a choice 1 for viewing the current balance, 2 for withdrawing money, 3 for depositing money, and 4 for exiting the main menu. 
 * Once you exit, the system will prompt for an id again. Thus, once the system starts, it will not stop.
 * 
 * 03/10/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_07 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		Account[] accounts = new Account[10];
		createInitialBalance(accounts, 100);
		atmMachine myaccount;
		while (true)
		{
			System.out.print("Enter your account number: ");
			int accountid = checkAccountID(accounts);
			myaccount = new atmMachine(accounts[accountid]);
			myaccount.displayMainMenu();
		}
	}
	
	public static int checkAccountID(Account[] accounts)
	{
		int accountid = input.nextInt();
		
		outerloop:
		while(true)
		{
			for (int i = 0; i < accounts.length; i++)
			{
				if (i == accountid)
				{
					break outerloop;
				}
			}
			accountid = requestID();
		}
		
		return accountid;
	}
	
	public static int requestID()
	{
		System.out.print("ID is incorrect, enter ID again: ");
		return input.nextInt();
	}
	
	public static void createInitialBalance(Account[] accounts, int balance)
	{
		for (int i = 0; i < accounts.length; i++)
		{
			accounts[i] = new Account(i, balance);
		}
	}
}
