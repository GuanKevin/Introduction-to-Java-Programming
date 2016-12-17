package Chapter_18_Recursion;

import java.util.Scanner;

/**
 * Print the characters in a string reversely
 * Write a recursive method that displays a string reversely on the console using the following header:
 * public static void reverseDisplay(String value)
 * For example, reverseDisplay("abcd") displays dcba. 
 * Write a test program that prompts the user to enter a string and displays its reversal.
 * 
 * 12/17/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_09
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String value = input.nextLine();
		System.out.print("The reverse of " + "\"" + value + "\" is ");
		reverseDisplay(value);
		
		input.close();
	}
	
	public static void reverseDisplay(String value)
	{
		if (value.length() != 0)
		{
			System.out.print(value.charAt(value.length() - 1));
			reverseDisplay(value.substring(0, value.length() - 1));
		}
	}
}
