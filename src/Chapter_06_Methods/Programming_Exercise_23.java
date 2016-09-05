package Chapter_06_Methods;
import java.util.Scanner;

/**
 * Occurrences of a specified character
 * Write a method that finds the number of occurrences of a specified character in a string using the following header: 
 * public static int count(String str, char a)
 * For example, count("Welcome", 'e') returns 2. 
 * Write a test program that prompts the user to enter a string followed by a character 
 * and displays the number of occurrences of the character in the string.
 *
 * 09/02/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_23 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string and a character: ");
		String myStr = input.nextLine();
		char myChar = input.next().charAt(0);
		
		System.out.print('"' + myStr + '"' + " has " + count(myStr, myChar) + " character(s).");
		
		input.close();		
	}

	/**
	 * finds the number of occurrences of a specified character in a string
	 * 
	 * @param str
	 * @param a
	 * @return
	 */
	public static int count(String str, char a)
	{
		int charCounter = 0;
		
		for (int i = 0; i < str.length(); i++)
			if (str.charAt(i) == a)
				charCounter++;
		
		return charCounter;
	}
}
