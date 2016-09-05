package Chapter_06_Methods;
import java.util.Scanner;

/**
 * Financial application: compute commissions
 * Write a method that computes the commission, using the scheme in Programming Exercise 5.39. 
 * The header of the method is as follows: public static double computeCommission(double salesAmount)
 *
 * 08/30/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_11 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your sales amount: ");
		System.out.print("Your commissions " + computeCommission(input.nextDouble()));
		
		input.close();		
	}
	
	public static double computeCommission(double salesAmount)
	{
		double commission = 0;
		
		if (salesAmount >= 5000)
		{
			commission += 5000 * .08;
			salesAmount -= 5000;
			
			if (salesAmount >= 5000)
			{
				commission += 5000 * .1;
				salesAmount -= 5000;
				commission += salesAmount * .12;
			}			
			else
				commission += salesAmount * .10;
		}
		else
			return (salesAmount * .08);
		
		return commission;
	}
}
