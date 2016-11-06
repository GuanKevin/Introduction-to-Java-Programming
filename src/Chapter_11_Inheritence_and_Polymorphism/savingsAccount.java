package Chapter_11_Inheritence_and_Polymorphism;

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
		if ((super.accountBalance - withdraw) < 0)
		{
			System.out.println("Error! Balance Withdraw Limits!");
		}
		else
			super.accountBalance -= withdraw;
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
