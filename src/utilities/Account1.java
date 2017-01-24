package utilities;

import java.util.ArrayList;
import java.util.Date;

public class Account1 
{
	private int id;
	private String name;
	private double balance;
	private static double annualinterestRate;
	private Date dateCreated;
	private ArrayList<Transaction> transactions = new ArrayList<>();
	
	public Account1()
	{
		dateCreated = new Date();
	}
	
	public Account1(String name, int id, double balance)
	{
		this.id = id;
		this.setName(name);
		this.balance = balance;
		dateCreated = new Date();
	}

	public int getId() 
	{
		return id;
	}
	
	public double getBalance() 
	{
		return balance;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public static double getAnnualinterestRate() 
	{
		return annualinterestRate;
	}

	public static void setAnnualinterestRate(double annualinterestRate) 
	{
		Account1.annualinterestRate = annualinterestRate;
	}
	
	public double getMonthlyInterest()
	{
		return balance * (annualinterestRate / 1200);
	}

	public Date getDateCreated() 
	{
		return dateCreated;
	}

	public ArrayList<Transaction> getTransactions() 
	{
		return transactions;
	}
	
	public void withdraw(double amount)
	{
		balance -= amount;
		transactions.add(new Transaction('W', amount, balance, ""));
	}
	
	public void deposit(double amount)
	{
		balance += amount;
		transactions.add(new Transaction('D', amount , balance, ""));
	}
}