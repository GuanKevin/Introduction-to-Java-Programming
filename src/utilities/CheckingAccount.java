package utilities;

import java.util.Date;

public class CheckingAccount extends Account
{
	public CheckingAccount()
	{
		this(06, 1110.15d, 5, new Date());
	}
	
	public CheckingAccount(int accountNumber, double balance, double annualInterestRate, Date dateCreated)
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.dateCreated = dateCreated; 
	}
}
