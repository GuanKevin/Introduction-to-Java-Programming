package Chapter_18_Recursion;
import java.util.Scanner;

/**
 * Occurrences of a specified character in a string
 * Write a recursive method that finds the number of occurrences of a specified letter in a string using the following method header:
 * public static int count(String str, char a) 
 * For example, count("Welcome", 'e') returns 2. 
 * Write a test program that prompts the user to enter a string and a character, and displays the number of occurrences for the character in the string.
 * 
 * 06/28/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_10
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a string: ");
		String str = input.next();
		System.out.print("Enter a char: ");
		char a = input.next().charAt(0);
		
		System.out.print("There are " + count(str, a) + " in the string: " + str);
	}

	/*
	 * Takes in a string and character as arguments 
	 * and returns the amount of occurrences of that character in that string
	 */
	public static int count(String str, char a)
	{
		int counter = (str.charAt(0) == a) ? 1 : 0;
		if (str.length() == 1)
		{
			return counter;
		}
		else
		{
			return counter + count(str.substring(1, str.length()), a);
		}
	}
}
