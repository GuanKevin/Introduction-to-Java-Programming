package Chapter_06_Methods;
import java.util.Scanner;

/**
 * Display characters
 * Write a method that prints characters using the following header: 
 * public static void printChars(char ch1, char ch2, int numberPerLine) 
 * This method prints the characters between ch1 and ch2 with the specified numbers per line. 
 * Write a test program that prints ten characters per line from 1 to Z. 
 * Characters are separated by exactly one space.
 *
 * 08/30/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_12 
{
	public static void main(String[] args) 
	{
		final int CHARACTERS_PER_LINE = 10;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter character to print: ");
		printChars(input.next().charAt(0), input.next().charAt(0), CHARACTERS_PER_LINE);
		
		input.close();		
	}
	
	/**
	 * prints characters
	 * prints the characters between ch1 and ch2 with the specified numbers per line
	 * 
	 * @param ch1
	 * @param ch2
	 * @param numberPerLine
	 */
	public static void printChars(char ch1, char ch2, int numberPerLine) 
	{
		int counter = 0;
		
		for (int i = ch1; i <= ch2; i++)
		{
			counter++;
			
			if (counter % 10 == 0)
				System.out.printf("%-2s \n", ((char) i));
			else
				System.out.printf("%-2s", ((char) i));
		}
	}
}
