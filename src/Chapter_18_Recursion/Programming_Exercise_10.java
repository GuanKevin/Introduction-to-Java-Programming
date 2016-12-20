package Chapter_18_Recursion;

import java.util.Scanner;

/**
 * Occurrences of a specified character in a string
 * Write a recursive method that finds the number of occurrences of a specified letter in a string using the following method header:
 * public static int count(String str, char a) 
 * For example, count("Welcome", 'e') returns 2. 
 * Write a test program that prompts the user to enter a string and a character, and displays the number of occurrences for the character in the string.
 * 
 * 12/19/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_10
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String line = input.nextLine();
		System.out.print("Enter the character to check: ");
		char c = input.next().charAt(0);
		System.out.print("The character (" + c + ") appear(s) " + count(line, c) + " time(s).");
		
		input.close();
	}
	
	public static int count(String str, char a)
	{
		if (str.length() == 1)
			return (str.charAt(0) == a ? 1 : 0);
		return (str.charAt(0) == a ? 1 : 0) + count(str.substring(1, str.length()), a);
	}
}
