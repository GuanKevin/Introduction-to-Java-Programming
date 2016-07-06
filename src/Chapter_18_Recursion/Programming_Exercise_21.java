package Chapter_18_Recursion;
import java.util.Scanner;

/**
 * Decimal to binary
 * Write a recursive method that converts a decimal number into a binary number as a string. 
 * The method header is: 
 * public static String dec2Bin(int value)
 * Write a test program that prompts the user to enter a decimal number and displays its binary equivalent.
 * 
 * 07/04/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_21
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter an integer: ");
		int value = input.nextInt();
		
		System.out.print("Binary: " + dec2Bin(value));
	}
	
	/**
	 * Returns the binary value of the given integer as a string
	 * 
	 * @param value
	 * @return
	 */
	public static String dec2Bin(int value)
	{
		String binaryString = ((value % 2) == 0) ? "0" : "1";
		
		if (value < 2)
		{
			return Integer.toString(value);
		}
		
		return dec2Bin(value / 2) + binaryString;
	}
}
