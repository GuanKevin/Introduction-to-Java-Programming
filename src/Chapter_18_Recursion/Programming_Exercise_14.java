package Chapter_18_Recursion;

import java.util.Scanner;

/**
 * Find the number of uppercase letters in a string
 * Write a recursive method to return the number of uppercase letters in a string. 
 * Write a test program that prompts the user to enter a string and displays the number of uppercase letters in the string.
 * 
 * 12/22/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_14
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String line = input.nextLine();
		System.out.print("Number of uppercases in \"" + line + "\" is " + numUppCase(line, 0) + ".");
		
		input.close();
	}
	
	public static int numUppCase(String line, int helper)
	{
		if ((line.length() - 1) == helper)
			return (Character.isUpperCase(line.charAt(helper)) ? 1 : 0);
		
		return (Character.isUpperCase(line.charAt(helper)) ? 1 : 0) + numUppCase(line, ++helper);
	}
}
