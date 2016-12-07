package Chapter_12_Exception_Handling_and_Text_IO;

import java.util.Scanner;

/**
 * NumberFormatException
 * Listing 6.8 implements the hex2Dec(String hexString) method, which converts a hex string into a decimal number. 
 * Implement the hex2Dec method to throw a NumberFormatException if the string is not a hex string.
 * 
 * 12/07/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_06
{
	public static void main(String[] args) 
	{
		try
		{
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a hexadecimal number: ");
			String hex = input.next().toUpperCase();
			System.out.println("The decimal value of " + hex + " is " + hexToDec(hex));
			
			input.close();
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public static int hexToDec(String hexString)
	{
		int value = convertHexToDec(hexString.charAt(0));
		
		for (int i = 1; i < hexString.length(); i++)
			value = value * 16 + convertHexToDec(hexString.charAt(i));
		
		return value;
	}
	
	public static int convertHexToDec(char ch)
	{
		if (ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		else if (ch >= '0' && ch <= '9')
			return ch - '0';
		else
			throw new NumberFormatException("Illegal character " + ch);
	}
}