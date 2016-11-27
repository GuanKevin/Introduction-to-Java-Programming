package Utilities;

public class checkingsAccount extends Account 
{
	final double overdraftLimit = 1000; 
	
	public checkingsAccount()
	{
		this (250);
	}
	
	public checkingsAccount(double accountBalance)
	{
		super();
		setID(++accountNumber);
		setBalance(accountBalance);
	}
	
	//Overload --> Have Two or More Methods with the same name, but different argument
	//Override --> Two methods with same argument, but different implementation
	@Override
	public void withdraw(double withdraw)
	{
		if ((super.getBalance() - withdraw) < -1000)
		{
			System.out.println("Error! Overdraft Limit!");
		}
		else
			super.balance -= withdraw;
	}
	
	@Override
	public String toString()
	{
		return ("Account Number: " + getID()
				+ "\nBalance: " + getBalance()
				+ "\nAnnual Interest Rate: " + getAnnualInterestRate() + "%"
				+ "\nDate Created: " + dateCreated());
	}
}
