package utilities;

import java.util.Date;

public class Transaction extends Account1
{
	private Date date;
	private char type;
	private double amount;
	private double balance;
	private String description;
	
	public Transaction()
	{
		this('N', 0, 0, "Default");
	}
	
	public Transaction(char type, double amount, double balance, String description)
	{
		date = new Date();
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
	}
	
	public Date getDate()
	{
		return date;
	}
	
	public char getType()
	{
		return type;
	}
	
	public double getAmount()
	{
		return amount;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public String getDescription()
	{
		return description;
	}
}

