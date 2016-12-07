package Chapter_12_Exception_Handling_and_Text_IO;

import java.util.Scanner;

/**
 * NumberFormatException
 * Write the bin2Dec(String binaryString) method to convert a binary string into a decimal number. 
 * Implement the bin2Dec method to throw a NumberFormatException if the string is not a binary string.
 * 
 * 12/07/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_07
{
	public static void main(String[] args) 
	{
		try
		{
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a binary string: ");
			String binaryStr = input.next();
			System.out.print("The decimal of " + binaryStr + " is " + bin2Dec(binaryStr));
			
			input.close();
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public static int bin2Dec(String binaryString)
	{
		int value = convertBin2Dec(Character.getNumericValue(binaryString.charAt(binaryString.length() - 1)), 0);
		
		for (int i = binaryString.length() - 2; i >= 0; i--)
			value += convertBin2Dec(Character.getNumericValue(binaryString.charAt(i)), binaryString.length() - i - 1);
		
		return value;
	}
	
	public static int convertBin2Dec(int binary, int pow)
	{
		if (binary == 0)
			return 0;
		else if (binary == 1)
			return (int) Math.pow(2, pow);
		else
			throw new NumberFormatException(binary + " is not a binary.");
	}
}
