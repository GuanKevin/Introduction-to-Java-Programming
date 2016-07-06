package Chapter_11_Inheritence_and_Polymorphism;
import java.util.ArrayList;
import java.util.Date;

public class Account 
{
	private String customerName;
	static protected int accountNumber;
	int accountID;
	protected double accountBalance = 0;
	private double annualInterestRate = 3.5;
	private Date dateCreated; 
	protected ArrayList<Double> transactions;
	
	public Account()
	{
		this (100);
	}
	
	public Account(double accountBalance)
	{
		dateCreated = new Date();
		this.accountBalance = accountBalance;
		++accountNumber;
	}
	
	public Account(String customerName, int accountID, double accountBalance)
	{
		dateCreated = new Date();
		this.customerName = customerName;
		this.accountBalance = accountBalance;
		this.accountID = accountID;
		transactions = new ArrayList<>();
	}
	
	public ArrayList<Double> getTransactions() 
	{
		return new ArrayList<Double>(transactions);
	}
	
	public void withdraw(double withdraw)
	{
		transactions.add(new Double(-withdraw));
		accountBalance -= withdraw;
	}
	
	public void deposit(double deposit)
	{
		transactions.add(new Double(deposit));
		accountBalance += deposit;
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
		return accountBalance;
	}
	
	public void setBalance(double accountBalance)
	{
		this.accountBalance = accountBalance;
	}
	
	public void setID(double accountBalance)
	{
		this.accountBalance = accountBalance;
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
		accountBalance += accountBalance * getMonthlyInterestRate();
		return accountBalance;
	}
}
