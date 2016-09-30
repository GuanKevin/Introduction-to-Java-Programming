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
 * 09/13/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_37 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number and a width: ");
		System.out.print(format(input.nextInt(), input.nextInt()));
		
		input.close();		
	}
	
	/**
	 * returns a string for the number with one or more prefix 0s
	 * 
	 * @param number
	 * @param width
	 * @return
	 */
	public static String format(int number, int width)
	{
		if ((Integer.toString(number).length() >= width))
			return Integer.toString(number);
		
		String formatNumber = "";
		
		for (int i = 0; i < (width - Integer.toString(number).length()); i++)
				formatNumber += 0;
		
		return formatNumber + number;
	}
}
