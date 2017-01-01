package Chapter_18_Recursion;

import java.util.Scanner;

/**
 * Decimal to binary
 * Write a recursive method that converts a decimal number into a binary number as a string. 
 * The method header is: 
 * public static String dec2Bin(int value)
 * Write a test program that prompts the user to enter a decimal number and displays its binary equivalent.
 * 
 * 12/22/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_21
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		int decimal = input.nextInt();
		System.out.print("The binary of " + decimal + " is " + dec2Bin(decimal) + '.');
		
		input.close();
	}
	
	public static String dec2Bin(int value)
	{
		if (value < 2)
			return value + "";
		
		return dec2Bin(value / 2) + (((value % 2) == 0) ? "0" : "1");
	}
}
