package Chapter_18_Recursion;
import java.util.Scanner;

/**
 * Find the number of uppercase letters in an array
 * Write a recursive method to return the number of uppercase letters in an array of characters. 
 * You need to define the following two methods. 
 * The second one is a recursive helper method.
 * public static int count(char[] chars)
 * public static int count(char[] chars, int high)
 * Write a test program that prompts the user to enter a list of characters in one line and displays the number of uppercase letters in the list.
 * 
 * 07/03/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_16
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the size of the array: ");
		char[] chars = new char[input.nextInt()];
		inputChar(chars);
		int high = 0;
		System.out.print("Uppercase: " + count(chars, high));
	}

	/*
	 * Loops through character array index to
	 * input characters into the array
	 */
	public static void inputChar(char[] chars)
	{
		for (int i = 0; i < chars.length; i++)
		{
			System.out.print("Enter a character: ");
			chars[i] = input.next().charAt(0);
		}
	}
	
	/*
	 * Counts uppercase characters in the array
	 */
	public static int count(char[] chars)
	{
		int counter = (chars[0] >= 65 && chars[0] <= 90) ? 1 : 0;
		
		if (chars.length == 1)
		{
			return counter;
		}
		
		char[] newchars = new char[chars.length - 1];
		
		for (int i = 0; i < newchars.length; i++)
		{
			newchars[i] = chars[i + 1];
		}
		
		return counter + count(newchars);
	}
	
	/*
	 * Counts uppercase characters in the array with a helper value
	 */
	public static int count(char[] chars, int high)
	{
		int counter = (chars[high] >= 65 && chars[high] <= 90) ? 1 : 0;
		
		if (chars.length - 1 == high)
		{
			return counter;
		}
		
		return counter + count(chars, ++high);
	}
}
