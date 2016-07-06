package Chapter_12_Exception_Handling_and_Text_IO;
import java.util.Scanner;

/**
 * IllegalArgumentException
 * Modify the Loan class in Listing 10.2 to throw 
 * IllegalArgumentException if the loan amount, interest rate, or number of years is less than or equal to zero.
 * 
 * 04/
 * @author kevgu
 *
 */

public class Programming_Exercise_04
{
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		try
		{
			Loan loan = new Loan(1, 1, 0);
			loan.toString();
		}
		catch (IllegalArgumentException er)
		{
			System.out.print("Illegal Argument Exception Error Found " + er.getMessage());
		}
	}

}
