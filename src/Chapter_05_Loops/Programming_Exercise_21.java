package Chapter_05_Loops;
import java.util.Scanner;

/**
 * Financial application: compare loans with various interest rates
 * Write a program that lets the user enter 
 * the loan amount and 
 * loan period in number of years and 
 * displays the monthly 
 * and total payments for each interest rate starting from 5% to 8%, with an increment of 1/8.
 * 
 * 09/29/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_21 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the loan amount: ");
		double loanAmount = input.nextDouble();
		System.out.print("Enter the loan period: ");
		int loanPeriod = input.nextInt();
		double interestRate = .05;
		double interestIncrement = .03 / 8;
		double monthlyPayments = 0;
		double totalPayments = 0;
		
		System.out.printf("\n%-14s%-15s%s\n", "Time Period", "Interest Rate", "Monthly Payments");
		
		for (int i = 1; i <= (loanPeriod * 12); i++)
		{
			monthlyPayments = loanAmount * interestRate;
			
			System.out.printf("%-4s %-7d %-14.4f %.2f \n" ,"Month", i, interestRate, monthlyPayments);
			
			if (interestRate < .08)
				interestRate += interestIncrement;
			
			loanAmount += (loanAmount * interestRate);
			totalPayments += monthlyPayments;
		}
		
		System.out.printf("%s %.2f", "Total payments: ", totalPayments);
		
		input.close();
	}
}
