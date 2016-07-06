package Chapter_18_Recursion;
import java.util.Scanner;

/**
 * Binary to decimal
 * Write a recursive method that parses a binary number as a string into a decimal integer. 
 * The method header is:
 * public static int bin2Dec(String binaryString)
 * Write a test program that prompts the user to enter a binary string and displays its decimal equivalent.
 * 
 * 07/05/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_23
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter binary string: ");
		String binaryString = input.next();

		System.out.print("Decimal value is " + bin2Dec(binaryString));
	}
	
	/**
	 * Uses recursion to find the decimal value of the
	 * binary string
	 * 
	 * @param binaryString
	 * @return
	 */
	public static int bin2Dec(String binaryString)
	{
		if (binaryString.length() == 1)
		{
			return Character.digit(binaryString.charAt(0), 10);
		}
		
		return (Character.digit(binaryString.charAt(0), 10) * (int) Math.pow(2, binaryString.length() - 1)) + bin2Dec(binaryString.substring(1));
	}
}
