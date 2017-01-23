package Chapter_11_Inheritence_and_Polymorphism;

import java.util.ArrayList;

import utilities.Account1;
import utilities.Transaction;

/**
 * New Account class
 * An Account class was specified in Programming Exercise 9.7. Design a new Account class as follows:
 * Add a new data field name of the String type to store the name of the customer.
 * Add a new constructor that constructs an account with the specified name, id, and balance.
 * Add a new data field named transactions whose type is ArrayList that stores the transaction for the accounts. 
 * Each transaction is an instance of the Transaction class. 
 * Modify the withdraw and deposit methods to add a transaction to the transactions array list.
 * All other properties and methods are the same as in Programming Exercise 9.7. 
 * Write a test program that creates an Account with annual interest rate 1.5%, balance 1000, id 1122, and name George. 
 * Deposit $30, $40, and $50 to the account and withdraw $5, $4, and $2 from the account. 
 * Print an account summary that shows account holder name, interest rate, balance, and all transactions.
 *
 * 12/05/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_08 
{
	public static void main (String[] args)  
	{
		Account1.setAnnualinterestRate(1.5);
		
		Account1 account = new Account1("George", 1122, 1000);
		
		account.deposit(30);
		account.deposit(40);
		account.deposit(50);
		
		account.withdraw(5);
		account.withdraw(4);
		account.withdraw(2);
		
		System.out.println("Name: " + account.getName());
	    System.out.println("Annual interest rate: " + Account1.getAnnualinterestRate());
	    System.out.println("Balance: " + account.getBalance());
	    
	    ArrayList<Transaction> list = account.getTransactions();
	    
	    System.out.printf("%-35s%-15s%-15s%-15s\n", "Date", "Type", "Amount", "Balance");
	    
	    for (int i = 0; i < list.size(); i++) 
	    {
	    	Transaction transaction = (list.get(i));
	    	System.out.printf("%-35s%-15s%-15s%-15s\n", transaction.getDate(), transaction.getType(), transaction.getAmount(), transaction.getBalance());
	    }		
	}
}