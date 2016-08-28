package Chapter_05_Loops;

import java.util.Scanner;

/**
 * Financial application: compute CD value
 * Suppose you put $10,000 into a CD
 * with an annual percentage yield of 5.75%
 * Write a program that prompts the user to enter an amount (e.g., 10000), 
 * the annual percentage yield (e.g., 5.75), and the number of months (e.g., 18) 
 * and displays a table as
 * 
 * 08/27/2016
 * @author kevgu
 *
 */


public class Programming_Exercise_31 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount: ");
		double amount = input.nextDouble();
		
		System.out.print("Enter annual percentage: ");
		double monthlyIR = input.nextDouble() / 1200;
		
		System.out.print("Enter number of months: ");
		int nMonths = input.nextInt();
		
		for (int i = 1; i <= nMonths; i++)
		{
			amount += (amount * monthlyIR);
			
			System.out.printf("Month %d Value: %.2f \n", i,  amount);
		}
		
		input.close();
	}
}
