package Chapter_18_Recursion;
import java.util.Scanner;

/**
 * Occurrences of a specified character in an array
 * Write a recursive method that finds the number of occurrences of a specified character in an array. 
 * You need to define the following two methods. The second one is a recursive helper method.
 * public static int count(char[] chars, char ch)
 * public static int count(char[] chars, char ch, int high)
 * Write a test program that prompts the user to enter a list of characters in one line, 
 * and a character, and displays the number of occurrences of the character in the list.
 * 
 * 07/03/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_17
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the size of the array: ");
		int size = input.nextInt();
		char[] chars = new char[size];
		inputChar(chars);
		System.out.print("Look for character: ");
		char ch = input.next().charAt(0);
		
		/*System.out.print("Characters found: " + count(chars, ch));*/
		int high = 0;
		System.out.print("Characters found: " + count(chars, ch, high));
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
	 * Looks at the first index of the character array
	 * Compares the index with the character provided in the arguments
	 * Returns the amount of matching characters as an integer value
	 */
	public static int count(char[] chars, char ch)
	{
		int counter = (Character.compare(chars[0], ch) == 0) ? 1 : 0;
		
		if (chars.length == 1)
		{
			return counter;
		}
		
		char[] newchars = new char[chars.length - 1];
		
		for (int i = 0; i < newchars.length; i++)
		{
			newchars[i] = chars[i + 1];
		}
		
		return counter + count(newchars, ch);
	}
	
	/*
	 * Looks at the first index of the character array
	 * Compares the index with the character provided in the arguments
	 * Returns the amount of matching characters as an integer
	 * Done using helper value
	 */
	public static int count(char[] chars, char ch, int high)
	{
		int counter = (Character.compare(chars[high], ch) == 0) ? 1 : 0;
		
		if (chars.length - 1 == high)
		{
			return counter;
		}
		
		return counter + count(chars, ch, ++high);
	}
}
