package Chapter_18_Recursion;

import java.util.Scanner;

/**
 * Print the characters in a string reversely
 * Rewrite Programming Exercise 18.9 using a helper method to pass the substring high index to the method. 
 * The helper method header is:
 * public static void reverseDisplay(String value, int high)
 * 
 * 12/19/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_12
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String line = input.nextLine();
		System.out.print("The reverse of \"" + line + "\" is ");
		reverseDisplay(line, line.length() - 1);
		
		input.close();
	}
	
	public static void reverseDisplay(String value, int high)
	{
		if (high == 0)
		{
			System.out.print(value.charAt(high));
			return;
		}
		
		System.out.print(value.charAt(high));
		reverseDisplay(value, --high);
	}
}
