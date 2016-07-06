package Chapter_18_Recursion;
import java.util.Scanner;

/**
 * Find the number of uppercase letters in a string
 * Write a recursive method to return the number of uppercase letters in a string. 
 * Write a test program that prompts the user to enter a string and displays the number of uppercase letters in the string.
 * 
 * 06/30/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_14
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int counter = 0;
		
		System.out.print("Enter a string: ");
		String myString = input.nextLine();
		
		System.out.print("The number of uppercase in the string \n" + myString + " is " + findUppercase(myString, counter));
	}
	
	/*
	 * Counts the uppercase characters in the string
	 * Returns the amount of uppercase when the string is null
	 */
	public static int findUppercase(String myString, int counter)
	{
		if (myString.length() == 0)
		{
			return counter;
		}
		
		if (myString.charAt(0) >= 65 && myString.charAt(0) <= 90)
		{
			++counter;
		}
		
		return findUppercase(myString.substring(1), counter);
	}
}
