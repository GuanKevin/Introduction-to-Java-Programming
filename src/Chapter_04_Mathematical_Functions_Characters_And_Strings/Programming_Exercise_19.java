package Chapter_04_Mathematical_Functions_Characters_And_Strings;
import java.util.Scanner;

/**
 * Business: check ISBN-10
 * Rewrite the Programming Exercise 3.9 by entering the ISBN number as a string.
 * 
 * 02/14/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_19 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int number, d1, d2, d3, d4, d5, d6, d7, d8, d9, checksum;
		System.out.print("Enter 9 digit number: ");
		number = input.nextInt();
		String isbn = Integer.toString(number);
		
		//123456789 % 10 = 9
		//123456789 / 10 = 12345678
		d9 = number % 10;
		number = number / 10;
		d8 = number % 10;
		number = number / 10;
		d7 = number % 10;
		number = number / 10;
		d6 = number % 10;
		number = number / 10;
		d5 = number % 10;
		number = number / 10;
		d4 = number % 10;
		number = number / 10;
		d3 = number % 10;
		number = number / 10;
		d2 = number % 10;
		number = number / 10;
		d1 = number % 10;
		
		// checksum formula
		checksum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
		if (checksum == 10)
		{
			isbn = isbn + "X";
			System.out.print("This is my new string: " + isbn);
		}
		else
		{
			isbn = isbn + checksum;
			System.out.print("This is my new string: " + isbn);
		}
		input.close();
	}

}