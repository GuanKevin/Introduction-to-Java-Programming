package Chapter_06_Methods;
import java.util.Scanner;

/**
 * Financial application: compute the future investment value
 * Write a method that computes future investment value at a given interest rate for a specified number of years. 
 * The future investment is determined using the formula in Programming Exercise 2.21. 
 * Use the following method header: 
 * public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) 
 * For example, futureInvestmentValue(10000, 0.05/12, 5) returns 12833.59. 
 * Write a test program that prompts the user to enter the investment amount (e.g., 1000) and the interest rate (e.g., 9%) 
 * and prints a table that displays future value for the years from 1 to 30, as shown below:
 *
 * 02/16/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_07 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		final int YEARS = 30;
		System.out.print("Enter the investment amount and interest rate ");
		double investment = futureInvestmentValue(input.nextDouble(), (input.nextDouble()/100)/12, YEARS);
		
		System.out.print("The future investment will be: " + investment);
		
		input.close();		
	}

	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years)
	{
		System.out.printf("%s %15s", "Year", "Future Year");
		System.out.println();
		double investment = investmentAmount;
		
		for (int i = 1; i <= years; i++)
		{		
			for (int j = 0; j < 12; j++)
			{
				investment += (investment * monthlyInterestRate);
			}
			System.out.println(i + "       " + investment);
			
		}
		
		return investment;
	}
}
