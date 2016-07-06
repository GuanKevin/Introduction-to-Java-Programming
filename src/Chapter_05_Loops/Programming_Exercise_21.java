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
 * 03/24/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_21 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter loan amount: ");
		double loanAmount = input.nextDouble();
		System.out.print("Enter loan period: ");
		int loanPeriod = input.nextInt();
		
		System.out.printf("%s %20s %20s\n", "Interest Rate", "Monthly Payment", "Total Payments");
		for (double interestRate = .05; interestRate < .08; interestRate += .00125)
		{
			double interestPerMonth = interestRate / 12;
			double paymentPerMonth = (loanAmount * interestPerMonth) + (loanAmount / 12);
			double totalPayments = (paymentPerMonth * 12) * loanPeriod;
			
			System.out.printf("%.4f%s%13s%.2f%20s%.2f\n", interestRate, "%", "$", paymentPerMonth,"%", totalPayments);
		}
		
		input.close();
	}
}
