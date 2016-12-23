package Chapter_18_Recursion;
import java.util.Scanner;

/**
 * Hex to decimal
 * Write a recursive method that parses a hex number as a string into a decimal integer. 
 * The method header is:
 * public static int hex2Dec(String hexString)
 * Write a test program that prompts the user to enter a hex string and displays its decimal equivalent.
 * 
 * 12/23/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_24
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a hexadecimal value: ");
		String hexString = input.next();
		System.out.print("The decimal value of " + hexString + " is " + 	hex2Dec(hexString) + ".");
		
		input.close();
	}
	
	public static int hex2Dec(String hexString)
	{
		return hex2Dec(hexString, 0, hexString.length() - 1);
	}
	
	public static int hex2Dec(String hexString, int low, int high)
	{
		if (high < low)
			return 0;
		
		return hex2Dec(hexString, low, high - 1) * 16 + getHexValue(hexString.charAt(high));
	}

	public static int getHexValue(char ch)
	{
		if (ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		else
			return ch - '0';
	}
}
