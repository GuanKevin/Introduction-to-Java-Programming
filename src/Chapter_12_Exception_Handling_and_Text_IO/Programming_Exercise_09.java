package Chapter_12_Exception_Handling_and_Text_IO;
import java.util.Scanner;

/**
 * BinaryFormatException
 * Exercise 12.7 implements the bin2Dec method to throw a BinaryFormatException if the string is not a binary string. 
 * Define a custom exception called BinaryFormatException. 
 * Implement the bin2Dec method to throw a BinaryFormatException if the string is not a binary string.
 * 
 * 03/22/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_09
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) throws BinaryFormatException
	{
		System.out.println("Enter a binary number: ");
		String binaryNum;
		
		try
		{
			binaryNum = input.next();
			testBinary(binaryNum);
		}
		catch(NumberFormatException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public static void testBinary(String binaryNum) throws BinaryFormatException
	{
		for (int i = 0; i < binaryNum.length(); i++)
		{
			if (!(binaryNum.charAt(i) == '0' || binaryNum.charAt(i) == '1'))
			{
				throw new BinaryFormatException("This is not a binary string!");
			}
		}
	}
}