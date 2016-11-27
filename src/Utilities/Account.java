package Utilities;
import java.util.ArrayList;
import java.util.Date;

public class Account 
{
	private String customerName;
	static protected int accountNumber;
	int accountID;
	protected double balance = 0;
	private double annualInterestRate = 3.5;
	protected ArrayList<Double> transactions;
	private int id;
	Date dateCreated = new Date();
	
	public Account()
	{
		this (100);
	}
	
	public Account(double accountBalance)
	{
		dateCreated = new Date();
		this.balance = accountBalance;
		++accountNumber;
	}
	
	public Account(int id, double balance)
	{
		this.id = id;
		this.balance = balance;
	}
	
	public Account(String customerName, int accountID, double accountBalance)
	{
		dateCreated = new Date();
		this.customerName = customerName;
		this.balance = accountBalance;
		this.accountID = accountID;
		transactions = new ArrayList<>();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public ArrayList<Double> getTransactions() 
	{
		return new ArrayList<Double>(transactions);
	}
	
	public void withdraw(double withdraw)
	{
		transactions.add(new Double(-withdraw));
		balance -= withdraw;
	}
	
	public void deposit(double deposit)
	{
		transactions.add(new Double(deposit));
		balance += deposit;
	}
	
	public String getCustomerName()
	{
		return customerName;
	}
	
	@Override
	public String toString()
	{
		return "Account Number: " + accountID
				+ "\nBalance: " + getBalance()
				+ "\nAnnual Interest Rate: " + getAnnualInterestRate() + "%"
				+ "\nDate Created: " + dateCreated();
	}
	
	public int getID()
	{
		return accountNumber;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void setBalance(double accountBalance)
	{
		this.balance = accountBalance;
	}
	
	public void setID(double accountBalance)
	{
		this.balance = accountBalance;
	}
	
	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double annualInterestRate)
	{
		this.annualInterestRate = annualInterestRate;
	}
	
	public String dateCreated()
	{
		return dateCreated.toString();
	}
	
	public double getMonthlyInterestRate()
	{
		return annualInterestRate/12;
	}
	
	public double getMonthlyInterest()
	{
		balance += balance * getMonthlyInterestRate();
		return balance;
	}
}
