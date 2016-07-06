package Chapter_06_Methods;
import java.util.Scanner;

/**
 * Palindrome integer
 * Write the methods with the following headers 
 * // Return the reversal of an integer, i.e., reverse(456) returns 654 
 * public static int reverse(int number) 
 * // Return true if number is a palindrome
 * public static boolean isPalindrome(int number) 
 * Use the reverse method to implement isPalindrome. 
 * A number is a palindrome if its reversal is the same as itself. 
 * Write a test program that prompts the user to enter an integer and reports whether the integer is a palindrome.
 *
 * 02/16/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_03 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int palindrome = input.nextInt();

		if (isPalindrome(palindrome))
		{
			System.out.print(palindrome + " is a palindrome!");
		}
		else
		{
			System.out.print(palindrome + " is not a palindrome!");
		}
		
		input.close();		
	}
	
	// Return the reversal of an integer, i.e., reverse(456) returns 654 
	public static int reverse(int number)
	{
		int sum = 0;
		int counter = 0;
		
		while (number != 0)
		{
			if (counter == 0)
			{
				sum = number % 10;
				number /= 10; //123 / 10 -> 12
				counter++;
			}
			else
			{
				sum = (sum * 10) + (number % 10); // (3 * 10) + (12 % 10) --> 30 + 2 = 32
				number /= 10; //12 / 10 --> 1
				counter++;
			}
		}
		
		return sum;
	}
	
	public static boolean isPalindrome(int number)
	{
		int reversepalindrome = reverse(number);
		String reversep = Integer.toString(reversepalindrome);
		String num = Integer.toString(number);
		
		for (int i = 0; i < num.length(); i++)
		{
			if (reversep.charAt(i) != num.charAt(i))
			{
				return false;
			}
		}
		
		return true;
	}
}
