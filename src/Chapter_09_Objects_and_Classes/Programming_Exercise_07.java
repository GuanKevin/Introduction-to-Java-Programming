package Chapter_09_Objects_and_Classes;

import java.util.Date;

/**
 * The Account class
 * Design a class named Account that contains:
 * A private int data field named id for the account (default 0).
 * A private double data field named balance for the account (default 0).
 * A private double data field named annualInterestRate that stores the current interest rate (default 0). 
 * Assume all accounts have the same interest rate.
 * A private Date data field named dateCreated that stores the date when the account was created.
 * A no-arg constructor that creates a default account.
 * A constructor that creates an account with the specified id and initial balance.
 * The accessor and mutator methods for id, balance, and annualInterestRate.
 * The accessor method for dateCreated.
 * A method named getMonthlyInterestRate() that returns the monthly interest rate.
 * A method named getMonthlyInterest() that returns the monthly interest.
 * A method named withdraw that withdraws a specified amount from the account.
 * A method named deposit that deposits a specified amount to the account.
 * (Hint: The method getMonthlyInterest() is to return monthly interest, not the interest rate. 
 * Monthly interest is balance * monthlyInterestRate. monthlyInterestRate is annualInterestRate / 12. 
 * Note that annualInterestRate is a percentage, e.g., like 4.5%. You need to divide it by 100.)
 * Write a test program that creates an Account object with an account ID of 1122, a balance of $20,000, 
 * and an annual interest rate of 4.5%. 
 * Use the withdraw method to withdraw $2,500, use the deposit method to deposit $3,000, 
 * and print the balance, the monthly interest, and the date when this account was created.
 * 
 * 11/07/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_07 
{
	public static void main(String[] args) 
	{
		Account myAccount = new Account(1122, 20000);
		myAccount.setAnnualInterestRate(4.5);
		myAccount.withdraw(2500);
		myAccount.deposit(3000);
		System.out.println("Balance: " + myAccount.getBalance() + 
				"\nMonthly Interest: " + myAccount.getMonthlyInterest() + 
				"\nAccount created: " + myAccount.getDataCreated());
	}
}

class Account
{
	private int id;
	private double balance;
	private double annualInterestRate;
	Date dateCreated = new Date();
	
	public Account()
	{
		setId(0);
		setBalance(0);
		setAnnualInterestRate(0);
		dateCreated = new Date();
	}
	
	public Account(int id, double balance)
	{
		this.id = id;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public Date getDataCreated()
	{
		return dateCreated;
	}
	
	public double getMonthlyInterestRate()
	{
		return (getAnnualInterestRate() / 100 / 12);
	}
	
	public double getMonthlyInterest()
	{
		return (getBalance() * getMonthlyInterestRate());
	}
	
	public double withdraw(double withdraw) 
	{
		balance -= withdraw;
		return (getBalance() - withdraw);
	}
	
	public double deposit(double deposit)
	{
		balance += deposit;
		return (getBalance() + deposit);
	}
}

