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
 * 02/16/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_12 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		final int CHAR_PER_LINE = 10;
		System.out.print("Enter the characters: ");
		char ch1 = input.next().charAt(0);
		char ch2 = input.next().charAt(0);
		
		printChars(ch1, ch2, CHAR_PER_LINE);
		
		input.close();		
	}
	
	public static void printChars(char ch1, char ch2, int numberPerLine) 
	{
		int counter = 0;
		
		for (int i = (int) ch1; i <= (int) ch2; i++)
		{
			System.out.printf("%-3s", (char) i);
			counter++;
			if (counter == 10)
			{
				counter = 0;
				System.out.println();
			}
		}
	}
}
