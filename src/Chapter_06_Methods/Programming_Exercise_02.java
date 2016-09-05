package Chapter_06_Methods;
import java.util.Scanner;

/**
 * Sum the digits in an integer
 * Write a method that computes the sum of the digits in an integer. 
 * Use the following method header: 
 * public static int sumDigits(long n) 
 * For example, sumDigits(234) returns 9 (2 + 3 + 4). 
 * (Hint: Use the % operator to extract digits, and the / operator to remove the extracted digit. 
 * For instance, to extract 4 from 234, use 234 % 10 (= 4). To remove 4 from 234, use 234 / 10 (= 23). 
 * Use a loop to repeatedly extract and remove the digit until all the digits are extracted. 
 * Write a test program that prompts the user to enter an integer and displays the sum of all its digits.
 * 
 * 08/28/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_02
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		long digits = input.nextLong();
		System.out.print(sumDigits(digits));
		
		input.close();		
	}
	
	public static int sumDigits(long n) 
	{
		int length = (int) Math.log10(n);
		int sumDigits = 0;
		
		for (int i = 0; i <= length; i++)
		{
			sumDigits += (n % 10);
			n /= 10;
		}
		
		return sumDigits;
	}
}
