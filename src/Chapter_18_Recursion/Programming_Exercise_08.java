package Chapter_18_Recursion;

import java.util.Scanner;

/**
 * Print the digits in an integer reversely
 * Write a recursive method that displays an int value reversely on the console using the following header: 
 * public static void reverseDisplay(int value) 
 * For example, reverseDisplay(12345) displays 54321. 
 * Write a test program that prompts the user to enter an integer and displays its reversal.
 * 
 * 12/17/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_08
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = input.nextInt();
		System.out.print("The reverse of " + number + " is ");
		reverseDisplay(number);
		
		input.close();
	}
	
	public static void reverseDisplay(int value) 
	{
		if (value != 0)
		{
			System.out.print(value % 10);
			reverseDisplay(value / 10);
		}
	}
	
	public static int reverseValue(int value) 
	{
		if (value <= 10)
			return value;
		
		return (int) (((value % 10) * Math.pow(10, (Integer.toString(value)).length() - 1)) + reverseValue(value / 10));
	}
}
