package Chapter_18_Recursion;
import java.util.Scanner;

/**
 * Occurrences of a specified character in a string
 * Rewrite Programming Exercise 18.10 using a helper method to pass the substring high index to the method.
 * The helper method header is:
 * public static int count(String str, char a, int high)
 * 
 * 07/02/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_15
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		System.out.print("Enter a char: ");
		char a = input.next().charAt(0);
		int high = 0;
		
		System.out.print("There are " + count(str, a, high) + " " + a + " character in the string: " + str);
	}

	/*
	 * Looks through a string and 
	 * increment counter variable when matching
	 * character is found
	 */
	public static int count(String str, char a, int high)
	{
		int counter = (str.charAt(high) == a) ? 1 : 0;
		
		if (high == str.length() - 1)
		{
			return counter;
		}
		
		return counter + count(str, a, ++high);
	}
}
