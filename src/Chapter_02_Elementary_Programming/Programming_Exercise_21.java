package Chapter_02_Elementary_Programming;

import java.util.Scanner;

/**
 * Financial application: calculate future investment value
 * Write a program that reads in investment amount, annual interest rate, 
 * and number of years, and displays the future investment value using the following formula:
 * futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate) numberOfYears * 12
 * 
 * 08/01/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_21 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double futureInvestmentValue, investmentAmount, monthlyInterestRate;
		int numberOfYears;
		
		System.out.print("Enter investment amount: ");
		investmentAmount = input.nextDouble();
		System.out.print("Enter annual interest rate: ");
		monthlyInterestRate = (input.nextDouble()/100) / 12;
		System.out.print("Enter the number of years: ");
		numberOfYears = input.nextInt();
		futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), (numberOfYears * 12));
		
		System.out.print("The future investment value for " + numberOfYears + " year is " + futureInvestmentValue);
				
		input.close();
	}
}
