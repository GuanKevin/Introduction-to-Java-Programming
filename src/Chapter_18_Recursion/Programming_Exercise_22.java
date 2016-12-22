package Chapter_18_Recursion;

import java.util.Scanner;

/**
 * Decimal to hex
 * Write a recursive method that converts a decimal number into a hex number as a string. 
 * The method header is:
 * public static String dec2Hex(int value) 
 * Write a test program that prompts the user to enter a decimal number and displays its hex equivalent.
 * 
 * 12/22/206
 * @author kevgu
 *
 */

public class Programming_Exercise_22
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal: ");
		int value = input.nextInt();
		System.out.print("The hexdecimal of " + value + " is " + dec2Hex(value) + ".");
		
		input.close();
	}
	
	public static String dec2Hex(int value) 
	{
		if (value < 10)
			return value + "";
		else if (value < 16)
			return hexValue(value);
		
		return dec2Hex(value / 16) + ((value % 16 < 10) ? (value % 16 + "") : hexValue(value % 16));
	}
	
	public static String hexValue(int value)
	{
		switch (value)
		{
		case 10: return "A";
		case 11: return "B";
		case 12: return "C";
		case 13: return "D";
		case 14: return "E";
		case 15: return "F";
		default: return "X";
		}
	}
}
