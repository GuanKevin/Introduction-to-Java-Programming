package Chapter_18_Recursion;

import java.util.Scanner;

/**
 * Sum series
 * Write a recursive method to compute the following series:
 * Write a test program that displays m(i) for i = 1, 2, . . ., 10.
 * 
 * 12/17/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_06
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		System.out.print(String.format("%.3f", sumSeries(number)));
		
		input.close();
	}
	
	public static double sumSeries(int number)
	{
		if (number <= 1)
		{
			System.out.print(number + "/2 = ");
			return (1.0/2);
		}
		
		System.out.print(number + "/" + "(" + number + " + 1)" + " + ");
		
		return ((number / (number + 1.0)) + sumSeries(--number));
	}
}
