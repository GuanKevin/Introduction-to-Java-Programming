package Chapter_06_Methods;
import java.util.Scanner;

/**
 * Format an integer
 * Write a method with the following header to format the integer with the specified width. 
 * public static String format(int number, int width) 
 * The method returns a string for the number with one or more prefix 0s. 
 * The size of the string is the width. 
 * For example, format(34, 4) returns 0034 and format(34, 5) returns 00034. 
 * If the number is longer than the width, the method returns the string representation for the number. 
 * For example, format(34, 1) returns 34. 
 * Write a test program that prompts the user to enter a number 
 * and its width and displays a string returned by invoking format(number, width).
 *
 * 03/24/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_37 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number and the width: ");
		int number = input.nextInt();
		int width = input.nextInt();
		System.out.print("The new format is: " + format(number, width));
		
		input.close();		
	}
	
	public static String format(int number, int width) 
	{
		String numStr = "" + number;
		int strLength = numStr.length();
		
		if (numStr.length() > width)
		{
			return numStr;
		}
		else
		{
			for (int i = 0; i < (width - strLength); i++)
			{
				numStr = "0" + numStr;
			}
		}
		
		return numStr;
	}
}
