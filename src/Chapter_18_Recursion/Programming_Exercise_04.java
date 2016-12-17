package Chapter_18_Recursion;

import java.util.Scanner;

/**
 * Sum series
 * Write a recursive method to compute the following series:
 * Write a test program that displays m(i) for i = 1, 2, . . ., 10.
 * 
 * 12/16/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_04
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		System.out.print("The sum is: " + String.format("%.2f", sumSeries(number)));
		
		input.close();
	}
	
	public static double sumSeries(int number)
	{
		if (number <= 1)
		{
			System.out.print(1 + "/" + number + " = ");
			return 1;
		}
		
		System.out.print(1 + "/" + number + " + ");
		
		return ((1.0 / number) + sumSeries(--number));
	}
}
