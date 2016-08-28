package Chapter_05_Loops;

import java.util.Scanner;

/**
 * Financial application: loan amortization schedule
 * The monthly payment for a given loan pays the principal and the interest. 
 * The monthly interest is computed by multiplying the monthly interest rate and the balance (the remaining principal). 
 * The principal paid for the month is therefore the monthly payment minus the monthly interest. 
 * Write a program that lets the user enter the loan amount, number of years, and interest rate and displays the amortization schedule for the loan.
 * 
 * 08/23/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_22 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter loan amount: ");
		double loanAmount = input.nextDouble();
		
		System.out.print("Enter loan years: ");
		int loanYears = input.nextInt() * 12;
		
		System.out.print("Enter interest rate: ");
		double interestRate = input.nextDouble() / 1200;
		
		double monthlyPayments = (loanAmount * interestRate) / (1 - (1 / (Math.pow(1 + interestRate, loanYears))));
		double totalPayments = monthlyPayments * loanYears;
		double principal, interest;
		
		System.out.printf("%-10s %-10s %-10s %s \n", "Payment#", "Interest", "Principal", "Balance");
		
		for (int i = 1; i <= loanYears; i++)
		{
			interest = interestRate * loanAmount;
			principal = monthlyPayments - interest;
			loanAmount -= principal;
			
			System.out.printf("%-10d %-10.2f %-10.2f %.2f \n", i, interest, principal, loanAmount);
		}
			
		System.out.print("Total payments: " + totalPayments);
		
		input.close();
	}
}
