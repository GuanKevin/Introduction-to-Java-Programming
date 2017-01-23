package Chapter_11_Inheritence_and_Polymorphism;

import utilities.Account;
import utilities.CheckingAccount;
import utilities.SavingsAccount;

/**
 * Subclasses of Account
 * In Programming Exercise 9.7, the Account class was defined to model a bank account. 
 * An account has the properties account number, balance, annual interest rate, and date created, 
 * and methods to deposit and withdraw funds. 
 * Create two subclasses for checking and saving accounts. 
 * A checking account has an overdraft limit, but a savings account cannot be overdrawn. 
 * Write a test program that creates objects of Account, SavingsAccount, and CheckingAccount and invokes their toString() methods.
 *
 * 12/02/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_03 
{
	public static void main(String[] args) 
	{
		Account myAccount = new Account();
		myAccount = new CheckingAccount();
		myAccount = new SavingsAccount();
		
		System.out.println(myAccount.withdraw(110.15) + "\n" + myAccount.toString());
	}
}
