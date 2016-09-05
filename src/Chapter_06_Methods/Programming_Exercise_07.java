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
 * 08/29/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_07 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		final int YEARS = 5;
		
		System.out.print("Input investment amount and annual interest rate: ");
		System.out.printf("Investment value is $%.2f", futureInvestmentValue(input.nextDouble(), (input.nextDouble() / 1200), YEARS));
		
		input.close();		
	}	
	
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years)
	{
		System.out.printf("%-5s %s \n", "YEAR", "Investment Value");
		
		for (int i = 1; i <= years; i++)
		{
			for (int j = 1; j <= 12; j++)
				investmentAmount += (investmentAmount * monthlyInterestRate);
			System.out.printf("%-5d %.2f \n", i, investmentAmount);
		}
		
		return investmentAmount;
	}
}
