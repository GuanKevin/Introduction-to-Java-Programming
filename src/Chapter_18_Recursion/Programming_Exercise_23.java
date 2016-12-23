package Chapter_18_Recursion;

import java.util.Scanner;

/**
 * Binary to decimal
 * Write a recursive method that parses a binary number as a string into a decimal integer. 
 * The method header is:
 * public static int bin2Dec(String binaryString)
 * Write a test program that prompts the user to enter a binary string and displays its decimal equivalent.
 * 
 * 12/23/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_23
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a binary number: ");
		String binaryString = input.next();
		System.out.print("The decimal of " + binaryString + " is " + bin2Dec(binaryString) + ".");
		
		input.close();
	}
	/**
	 * Takes in a binary string and does a recursive call 
	 * to return the decimal value
	 * 
	 * @param binaryString
	 * @return
	 */
	public static int bin2Dec(String binaryString)
	{
		if (binaryString.length() == 1)
			return binaryString.equals("1") ? 1 : 0;
		
		return (int) ((binaryString.charAt(0) == '1') ? Math.pow(2, binaryString.length() - 1) : 0) + bin2Dec(binaryString.substring(1));
	}
}