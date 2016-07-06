package Chapter_12_Exception_Handling_and_Text_IO;
import java.util.Scanner;

/**
 * HexFormatException
 * Exercise 12.6 implements the hex2Dec method to throw a NumberFormatException if the string is not a hex string. 
 * Define a custom exception called HexFormatException. 
 * Implement the hex2Dec method to throw a HexFormatException if the string is not a hex string.
 * 
 * 03/18/2015
 * @author kevgu
 *
 */

public class Programming_Exercise_08
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) throws HexFormatException 
	{
		try
		{
			System.out.print("Enter a hex number: ");
			String hex = input.nextLine();
			//Integer.parseInt(hex, 16);
			checkHex(hex);
			System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
		}
		catch (NumberFormatException ex)
		{
			System.out.println("Number Format Exception! Not a hexadecimal input!");
		}
	}

	public static int hexToDecimal(String hex) 
	{		
		int decimalValue = 0;
		
		for (int i = 0; i < hex.length(); i++) 
		{
			char hexChar = hex.charAt(i);
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
		}
		
		return decimalValue;
	}
	
	public static int hexCharToDecimal(char ch) 
	{
		if (ch >= 'A' && ch <= 'F')
		{
			return 10 + ch - 'A';
		}
		else // ch is '0', '1', ..., or '9'
		{
			return ch - '0';
		}
	}
	
	/*
	 * Hexadecimal has a base of 16
	 * 0 - 9
	 * A - F
	 */
	public static void checkHex(String Hex) throws HexFormatException
	{
		for (int i = 0; i < Hex.length(); i++)
		{
			if ((Hex.charAt(Character.toUpperCase(i)) < '0' || Hex.charAt(Character.toUpperCase(i)) > '9')
					&& (Hex.charAt(Character.toUpperCase(i)) < 'A' || Hex.charAt(Character.toUpperCase(i)) > 'F'))
			{
				throw new HexFormatException("This is not a Hexadecimal!");
			}
		}
	}
}
