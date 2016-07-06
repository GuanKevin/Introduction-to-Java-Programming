package Chapter_02_Elementary_Programming;
import java.util.Scanner;

/**
 * Financial application: calculate interest
 * Write a program that reads the balance and the annual percentage interest rate 
 * and displays the interest for the next month.
 * interest = balance * (annualInterestRate/1200)
 * 
 * 02/04/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_20 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double balance, percentage, interest;
		System.out.print("Enter the balance and the annual percentage interest rate ");
		balance = input.nextDouble();
		percentage = input.nextDouble();
		
		//1200 = 12 month * 100 percentage
		interest = balance * (percentage/1200);
		
		System.out.println("The interest is " + interest);
		System.out.printf("The interest is %.5f", interest);
		input.close();
	}

}
