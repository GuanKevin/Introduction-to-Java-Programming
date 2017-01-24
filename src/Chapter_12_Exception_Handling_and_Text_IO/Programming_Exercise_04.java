package Chapter_12_Exception_Handling_and_Text_IO;

import utilities.Loan;

/**
 * IllegalArgumentException
 * Modify the Loan class in Listing 10.2 to throw 
 * IllegalArgumentException if the loan amount, interest rate, or number of years is less than or equal to zero.
 * 
 * 12/06/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_04
{
	public static void main(String[] args) 
	{
		try
		{
			Loan loan = new Loan(10, 30, 100000);
			loan.setAnnualInterestRate(-5);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
