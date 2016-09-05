package Chapter_06_Methods;
import java.util.Scanner;

/**
 * Count the letters in a string
 * Write a method that counts the number of letters in a string using the following header: 
 * public static int countLetters(String s) 
 * Write a test program that prompts the user to enter a string and displays the number of letters in the string.
 *
 * 08/31/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_20 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		System.out.print("Number of letters are " + countLetters(input.nextLine()));
		
		input.close();		
	}
	
	/**
	 * counts the number of letters in a string
	 * 
	 * @param s
	 * @return
	 */
	public static int countLetters(String s) 
	{
		int letterCounter = 0;
		
		for (int i = 0; i < s.length(); i++)
			if (Character.isLetter(s.charAt(i)))
				letterCounter++;
		
		return letterCounter;
	}
}
