package Chapter_09_Objects_and_Classes;
import java.util.Date;
import java.util.Scanner;

/**
 * The Account class
 * Design a class named Account that contains:
 * A private int data field named id for the account (default 0).
 * A private double data field named balance for the account (default 0).
 * A private double data field named annualInterestRate that stores the current interest rate (default 0). 
 * Assume all accounts have the same interest rate.
 * A private Date data field named dateCreated that stores the date when the account was created.\
 * A no-arg constructor that creates a default account.
 * A constructor that creates an account with the specified id and initial balance.
 * The accessor and mutator methods for id, balance, and annualInterestRate.
 * The accessor method for dateCreated.
 * A method named getMonthlyInterestRate() that returns the monthly interest rate.
 * A method named getMonthlyInterest() that returns the monthly interest.
 * A method named withdraw that withdraws a specified amount from the account.
 * A method named deposit that deposits a specified amount to the account.
 * Draw the UML diagram for the class and then implement the class. 
 * (Hint: The method getMonthlyInterest() is to return monthly interest, not the interest rate. 
 * Monthly interest is balance * monthlyInterestRate. monthlyInterestRate is annualInterestRate / 12. 
 * Note that annualInterestRate is a percentage, e.g., like 4.5%. You need to divide it by 100.)
 * Write a test program that creates an Account object with an account ID of 1122, a balance of $20,000, 
 * and an annual interest rate of 4.5%. 
 * Use the withdraw method to withdraw $2,500, use the deposit method to deposit $3,000, 
 * and print the balance, the monthly interest, and the date when this account was created.
 * 
 * 03/01/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_07 
{
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		Account account = new Account(1122, 20000);
		account.setAnnualInterestRate(.045);
		System.out.println("Your current account balance is: " + account.getBalance());
		account.withdraw(2500);
		System.out.println("After withdrawing, your current balance is: " + account.getBalance());
		account.deposit(3000);
		System.out.println("After deposit, your current balance is: " + account.getBalance());
		System.out.println("The monthly interest will be: " + account.getMonthlyInterest());
		System.out.println("Account created on: " + account.dateCreated());
	}
}

class Account
{
	private int id;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	
	Account()
	{
		dateCreated = new Date();
	}
	
	Account(int id, double balance)
	{
		dateCreated = new Date();
		this.id = id;
		this.balance = balance;
	}
	
	//The accessor and mutator methods for id, balance, and annualInterestRate.
	public int getID()
	{
		return id;
	}
	
	public void setID(int id)
	{
		this.id = id;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void setID(double balance)
	{
		this.balance = balance;
	}
	
	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double annualInterestRate)
	{
		this.annualInterestRate = annualInterestRate;
	}
	
	//The accessor method for dateCreated.
	public String dateCreated()
	{
		return dateCreated.toString();
	}
	
	//A method named getMonthlyInterestRate() that returns the monthly interest rate.
	public double getMonthlyInterestRate()
	{
		return annualInterestRate/12;
	}
	
	//A method named getMonthlyInterest() that returns the monthly interest.
	public double getMonthlyInterest()
	{
		balance += balance * getMonthlyInterestRate();
		return balance;
	}
	
	//A method named withdraw that withdraws a specified amount from the account.
	public void withdraw(double withdraw)
	{
		balance -= withdraw;
	}
	
	//A method named deposit that deposits a specified amount to the account.
	public void deposit(double deposit)
	{
		balance += deposit;
	}
}