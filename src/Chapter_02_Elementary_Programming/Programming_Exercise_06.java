package Chapter_02_Elementary_Programming;

import java.util.Scanner;

/**
 * Sum the digits in an integer 
 * Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer. 
 * For example, if an integer is 932, the sum of all its digits is 14.
 * Hint: Use the % operator to extract digits, and use the / operator to remove the extracted digit.
 * 
 * 07/31/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_06 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer between 0 and 1000: ");			//1 - 999
		int digit = input.nextInt();
		int sum = digit % 10;
		digit /= 10;
		sum += (digit % 10) + (digit /= 10);
		System.out.print("The sum is " + sum);
			
		input.close();
	}
}
