package Chapter_05_Loops;
import java.util.Scanner;

/**
 * Business: check ISBN-13
 * ISBN-13 is a new standard for identifying books. 
 * It uses 13 digits d1d2d3d4d5d6d7d8d9d10d11d12d13. 
 * The last digit d13 is a checksum, which is calculated from the other digits using the following formula:
 * 10 - (d1 + 3d2 + d3 + 3d4 + d5 + 3d6 + d7 + 3d8 + d9 + 3d10 + d11 + 3d12) % 10
 * If the checksum is 10, replace it with 0. Your program should read the input as a string.
 * 
 * 08/27/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_47 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
		String isbn13 = input.next();
		int checkSum = 0;
		
		for (int i = 0; i < isbn13.length(); i++)
		{
			if ((i + 1) % 2 == 0)
				checkSum += (3 * Character.getNumericValue(isbn13.charAt(i)));
			else
				checkSum += Character.getNumericValue(isbn13.charAt(i));
		}
		
		checkSum = 10 - (checkSum % 10);
		
		if (checkSum == 10)
			System.out.println("ISBN-13: " + isbn13 + '0');
		else
			System.out.println("ISBN-13: " + isbn13 + checkSum);
		
		input.close();
	}
}
