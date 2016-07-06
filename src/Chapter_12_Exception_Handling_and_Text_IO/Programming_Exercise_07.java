package Chapter_12_Exception_Handling_and_Text_IO;
import java.util.Scanner;

/**
 * NumberFormatException
 * Write the bin2Dec(String binaryString) method to convert a binary string into a decimal number. 
 * Implement the bin2Dec method to throw a NumberFormatException if the string is not a binary string.
 * 
 * 03/17/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_07
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a binary number: ");
		boolean enteredBinary = false;
		
		while (!enteredBinary)
		{
			try
			{
				String binaryString = input.next();
				System.out.println(bin2Dec(binaryString));
				enteredBinary = true;
			}
			catch (NumberFormatException ex)
			{
				input.nextLine();
				System.out.print(ex.getMessage());
				System.out.print("Enter binary string again: ");
			}
		}
		
	}

	/**
	 * 8   7   6  5  4  3 2 1 0
	 * 256 128 64 32 16 8 4 2 1
	 * 0   0   0  0  0  0 1 0 0
	 * 2^8                    2^0
	 * 
	 * @param binaryString
	 * @return
	 */
	public static int bin2Dec(String binaryString)
	{
		int binaryInteger = 0;
		int binaryPower = (int) Math.pow(2, binaryString.length() - 1);
		
		if (!validBinary(binaryString))
		{
			throw new NumberFormatException("This is not a binary!\n");
		}
		else
		{
			for (int i = 0; i < binaryString.length(); i++)
			{
				if (binaryString.charAt(i) == '1')
				{
					binaryInteger += binaryPower;
				}
				binaryPower /= 2;
			}
		}
		return binaryInteger;
	}
	
	public static boolean validBinary(String binaryString)
	{
		for (int i = 0; i < binaryString.length(); i++)
		{
			if ((binaryString.charAt(i) < '0') || (binaryString.charAt(i) > '1'))
			{
				return false;
			}
		}
		
		return true;
	}
}
