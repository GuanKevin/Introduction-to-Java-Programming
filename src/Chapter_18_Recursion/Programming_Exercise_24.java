package Chapter_18_Recursion;
import java.util.Scanner;

/**
 * Hex to decimal
 * Write a recursive method that parses a hex number as a string into a decimal integer. 
 * The method header is:
 * public static int hex2Dec(String hexString)
 * Write a test program that prompts the user to enter a hex string and displays its decimal equivalent.
 * 
 * 07/06/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_24
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a hexadecimal value: ");
		String hexString = input.next();

		System.out.print("Decimal value is " + hex2Dec(hexString));
	}
	
	/**
	 * Takes in a hexadecimal string and uses recursion
	 * to return its decimal value
	 * 
	 * @param hexString
	 * @return
	 */
	public static int hex2Dec(String hexString)
	{
		if (hexString.length() == 1)
		{
			return checkHexValue(hexString.charAt(0));
		}

		return (checkHexValue(hexString.charAt(0)) * (int) Math.pow(16, hexString.length() - 1)) + hex2Dec(hexString.substring(1));
	}
	
	/**
	 * Returns the digit value of 0 to 9 as 0 to 9
	 * and A to F as 10 to 15
	 * 
	 * @param hexValue
	 * @return
	 */
	public static int checkHexValue(int hexValue)
	{
		if (hexValue - '0' < 10)
		{
			return (hexValue - '0');
		}

		return (hexValue - 'A' + 10);
	}
}
