package Chapter_18_Recursion;

import java.util.Scanner;

/**
 * Sum the digits in an integer using recursion
 * Write a recursive method that computes the sum of the digits in an integer. 
 * Use the following method header:
 * public static int sumDigits(long n)
 * For example, sumDigits(234) returns 2 + 3 + 4 = 9. 
 * Write a test program that prompts the user to enter an integer and displays its sum.
 * 
 * 12/19/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_11
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		long number = input.nextLong();
		System.out.print("The sum of " + number + " is " + sumDigits(number));
		
		input.close();
	}
	
	public static int sumDigits(long n)
	{
		if ((n / 10) == 0)
			return (int) n;
		return (int) ((n % 10) + sumDigits(n / 10));
	}
}
