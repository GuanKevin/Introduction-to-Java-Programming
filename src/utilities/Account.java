package utilities;

import java.util.Date;

public class Account
{
	protected int accountNumber;
	protected double balance;
	protected double annualInterestRate;
	Date dateCreated = new Date();
	
	public Account()
	{
		this(07, 12.15, 5, new Date());
	}
	
	public Account(int accountNumber, double balance, double annualInterestRate, Date dateCreated)
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.dateCreated = dateCreated; 
	}

	public int getAccNum() 
	{
		return accountNumber;
	}

	public void setAccNum(int accountNumber) 
	{
		this.accountNumber = accountNumber;
	}

	public double getBalance() 
	{
		return balance;
	}

	public void setBalance(double balance) 
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
		return (balance -= withdraw);
	}
	
	public double deposit(double deposit)
	{
		return (balance += deposit);
	}
	
	public String toString()
	{
		return "Account # " + getAccNum() + "\nBalance $" + getBalance() + " as of " + new Date() + ".";
	}
}