package Chapter_02_Elementary_Programming;
import java.util.Scanner;

/**
 * Financial application: calculate future investment value
 * Write a program that reads in investment amount, annual interest rate, 
 * and number of years, and displays the future investment value using the following formula:
 * futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate) numberOfYears * 12
 * 
 * 02/04/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_21 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double investment, interest, years, value;
		System.out.print("Input investment amount, annual interest rate, and number of years: ");
		investment = input.nextDouble();
		//3.5 --> divide 100 to get it be .035%
		interest = input.nextDouble()/100;
		years = input.nextDouble();
		
		//Calculating future investment value with given formula
		value = investment * Math.pow((1 + interest/12), (years * 12));
		
		System.out.printf("Your investment value is: %.5f", value);
		
		input.close();
	}

}
