package Chapter_12_Exception_Handling_and_Text_IO;
import java.util.Scanner;

/**
 * NumberFormatException
 * Listing 6.8 implements the hex2Dec(String hexString) method, which converts a hex string into a decimal number. 
 * Implement the hex2Dec method to throw a NumberFormatException if the string is not a hex string.
 * 
 * 04/
 * @author kevgu
 *
 */

public class Programming_Exercise_06
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		try
		{
			System.out.print("Enter a hex number: ");
			String hex = input.nextLine();
			Integer.parseInt(hex, 16);
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
}
