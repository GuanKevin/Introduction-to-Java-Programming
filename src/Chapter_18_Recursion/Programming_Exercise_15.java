package Chapter_18_Recursion;

import java.util.Scanner;

/**
 * Occurrences of a specified character in a string
 * Rewrite Programming Exercise 18.10 using a helper method to pass the substring high index to the method.
 * The helper method header is:
 * public static int count(String str, char a, int high)
 * 
 * 12/22/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_15
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String line = input.nextLine();
		System.out.print("Look for character: ");
		char a = input.next().charAt(0);
		System.out.print("Number of occurrences of " + a + " in \"" + line + "\" is " + count(line, a, 0) + ".");
		
		input.close();
	}
	
	public static int count(String str, char a, int high)
	{
		if (str.length() - 1 == high)
			return (str.charAt(high) == a) ? 1 : 0;
		
		return ((str.charAt(high) == a) ? 1 : 0) + count(str, a, ++high);
	}
}
