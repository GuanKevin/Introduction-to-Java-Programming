package Chapter_06_Methods;
import java.util.Scanner;

/**
 * Count the letters in a string
 * Write a method that counts the number of letters in a string using the following header: 
 * public static int countLetters(String s) 
 * Write a test program that prompts the user to enter a string and displays the number of letters in the string.
 *
 * 02/16/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_20 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string ");
		String countletters = input.nextLine();
		
		System.out.print(countletters + " has " + countLetters(countletters) + " of letters.");
		
		input.close();		
	}
	
	public static int countLetters(String s) 
	{
		int counter = 0;
		
		for (int i = 0; i < s.length(); i++)
		{
			if (Character.isLetter(s.charAt(i)))
			{
				counter++;
			}
		}
		
		return counter;
	}
}
