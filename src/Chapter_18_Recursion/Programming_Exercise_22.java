package Chapter_18_Recursion;
import java.util.Scanner;

/**
 * Decimal to hex
 * Write a recursive method that converts a decimal number into a hex number as a string. 
 * The method header is:
 * public static String dec2Hex(int value) 
 * Write a test program that prompts the user to enter a decimal number and displays its hex equivalent.
 * 
 * 07/05/206
 * @author kevgu
 *
 */

public class Programming_Exercise_22
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a decimal: ");
		int value = input.nextInt();
		
		System.out.print("The hexadecimal value is " + dec2Hex(value));
	}
	
	/**
	 * Uses recursion to return the hexadecimal 
	 * string from the given decimal value
	 * 
	 * @param value
	 * @return
	 */
	public static String dec2Hex(int value) 
	{
		String hex = null;
		
		if (value < 10)
		{
			return Integer.toString(value);
		}
		else if (value < 16)
		{
			return checkHexValue(value);
		}
		else
		{
			hex = (value % 16 == 0) ? "0" : ((value % 16 < 10) ? Integer.toString(value % 16) : checkHexValue(value % 16));
		}
		
		return dec2Hex(value / 16) + hex;
	}
	
	/**
	 * Decimal to Hexadecimal
	 * 10 -> A
	 * 11 -> B
	 * 12 -> C
	 * 13 -> D
	 * 14 -> E
	 * 15 -> F
	 * @param value
	 * @return
	 */
	public static String checkHexValue(int value)
	{
		if (value == 10)
		{
			return "A";
		}
		else if (value == 11)
		{
			return "B";
		}
		else if (value == 12)
		{
			return "C";
		}
		else if (value == 13)
		{
			return "D";
		}
		else if (value == 14)
		{
			return "E";
		}
		else
		{
			return "F";
		}
	}
}
