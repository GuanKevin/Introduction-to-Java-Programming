package Chapter_12_Exception_Handling_and_Text_IO;

import java.util.Scanner;

import utilities.HexFormatException;

/**
 * HexFormatException
 * Exercise 12.6 implements the hex2Dec method to throw a NumberFormatException if the string is not a hex string. 
 * Define a custom exception called HexFormatException. 
 * Implement the hex2Dec method to throw a HexFormatException if the string is not a hex string.
 * 
 * 12/07/2015
 * @author kevgu
 *
 */

public class Programming_Exercise_08
{
	public static void main(String[] args) throws HexFormatException 
	{
		try 
		{
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a hexadecimal value: ");
			String hex = input.next().toUpperCase();
			System.out.print("The hexadecimal value of " + hex + " is " + hex2Dec(hex) + ".");
			
			input.close();
		}
		catch (Exception ex)
		{
			System.out.print(ex.getMessage());
		}
	}
	
	public static int hex2Dec(String hexString) throws HexFormatException 
	{
		int value = convertHexToDec(hexString.charAt(0));
		
	    for (int i = 1; i < hexString.length(); i++) 
	      value = value * 16 + convertHexToDec(hexString.charAt(i));

	    return value;
	  }

	  static int convertHexToDec(char ch) throws HexFormatException 
	  { 
		  if (ch >= 'A' && ch <= 'F')
				return 10 + ch - 'A';
			else if (ch >= '0' && ch <= '9')
				return ch - '0';
			else
				throw new HexFormatException(ch + " is not a hexadecimal value.");    
	  }
}

