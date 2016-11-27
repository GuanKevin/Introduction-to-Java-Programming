package Chapter_11_Inheritence_and_Polymorphism;
import java.util.Scanner;

import Utilities.Account;
import Utilities.checkingsAccount;
import Utilities.savingsAccount;

/**
 * Subclasses of Account
 * In Programming Exercise 9.7, the Account class was defined to model a bank account. 
 * An account has the properties account number, balance, annual interest rate, and date created, 
 * and methods to deposit and withdraw funds. 
 * Create two subclasses for checking and saving accounts. 
 * A checking account has an overdraft limit, but a savings account cannot be overdrawn. 
 * Write a test program that creates objects of Account, SavingsAccount, and CheckingAccount and invokes their toString() methods.
 *
 * 03/20/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_03 
{
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		Account myAcc = new Account();
		//System.out.println(myAcc.toString());
		myAcc = new checkingsAccount();
		//System.out.println(myAcc.toString());
		//myAcc.withdraw(1000);
		//System.out.println(myAcc.accountBalance);
		//myAcc.withdraw(1000);
		myAcc = new savingsAccount();
		//System.out.println(myAcc.toString());
		//myAcc.withdraw(100);
		//System.out.println(myAcc.accountBalance);
		//myAcc.withdraw(1000);
		myAcc = new savingsAccount();
		System.out.println(myAcc.toString());
		myAcc = new savingsAccount();
		System.out.println(myAcc.toString());
	}
}
