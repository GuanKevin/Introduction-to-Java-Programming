package utilities;

import java.util.Date;

public class SavingsAccount extends Account
{
	public SavingsAccount()
	{
		this(05, 40.15d, 5, new Date());
	}
	
	public SavingsAccount(int accountNumber, double balance, double annualInterestRate, Date dateCreated)
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.dateCreated = dateCreated; 
	}
	
	@Override
	public double withdraw(double withdraw) 
	{		
		if (0 > (balance - withdraw))
		{
			System.out.println("Overdraft Prevention! \nCurrent balance is ");
			return getBalance();
		}
		else
			return (balance -= withdraw);
	}
}
