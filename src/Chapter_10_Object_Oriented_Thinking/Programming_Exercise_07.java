package Chapter_10_Object_Oriented_Thinking;
import java.util.Date;
import java.util.Scanner;

import utilities.Account;

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
 * 11/23/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_07 
{
	public static void main(String[] args) 
	{
		Account[] account = new Account[10];
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < account.length; i++)
			account[i] = new Account(i, 100, 8, new Date());
		
		while (true)
		{
			System.out.print("Enter your id: ");
			int id = input.nextInt();
			
			while (id < 0 || id > 9)
			{
				System.out.print("ID is incorrect, try again: ");
				id = input.nextInt();
			}
			
			while (true)
			{
				displayMenu();
				
				if (!useMenu(account[id], input))
				{
					System.out.println();
					break;
				}
				
				System.out.println("\n");
			}
		}
	}
	
	public static boolean useMenu(Account account, Scanner input)
	{
		int option = input.nextInt();
		
		if (option == 4)
			return false;
		else if (option == 1)
		{
			System.out.print("The balance is " + account.getBalance());
			return true;
		}
		else if (option == 2)
		{
			System.out.print("Enter an amount to withdraw: ");
			account.withdraw(input.nextDouble());
			return true;
		}
		else if (option == 3)
		{
			System.out.print("Enter an amount to deposit: ");
			account.deposit(input.nextDouble());
			return true;
		}
		else
			System.out.print("Invalid option.");
		
		return true;
	}
	
	public static void displayMenu()
	{
		System.out.print("Main menu "
				+ "\n1: check balance"
				+ "\n2: withdraw"
				+ "\n3: deposit"
				+ "\n4: exit"
				+ "\nEnter a choice: ");
	}
}