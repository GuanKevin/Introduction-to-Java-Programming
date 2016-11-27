package Utilities;

public class savingsAccount extends Account 
{
	public savingsAccount()
	{
		this(500);
	}
	
	public savingsAccount(double accountBalance) 
	{
		super();
		setID(++accountNumber);
		setBalance(accountBalance);
	}
	
	@Override
	public void withdraw(double withdraw)
	{
		if ((super.balance - withdraw) < 0)
		{
			System.out.println("Error! Balance Withdraw Limits!");
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
