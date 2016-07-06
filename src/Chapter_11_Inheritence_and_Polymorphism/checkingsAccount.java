package Chapter_11_Inheritence_and_Polymorphism;

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
	public void withdraw(double withdraw)
	{
		if ((super.accountBalance - withdraw) < -1000)
		{
			System.out.println("Error! Overdraft Limit!");
		}
		else
			super.accountBalance -= withdraw;
	}
	
	public String toString()
	{
		return ("Account Number: " + getID()
				+ "\nBalance: " + getBalance()
				+ "\nAnnual Interest Rate: " + getAnnualInterestRate() + "%"
				+ "\nDate Created: " + dateCreated());
	}
}
