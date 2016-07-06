package Chapter_10_Object_Oriented_Thinking;
import java.util.Date;

public class Account
{
	private int id;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	
	public Account()
	{
		dateCreated = new Date();
	}
	
	public Account(int id, double balance)
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