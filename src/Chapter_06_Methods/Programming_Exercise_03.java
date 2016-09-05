package Chapter_06_Methods;
import java.util.Scanner;

/**
 * Palindrome integer
 * Write the methods with the following headers 	 
 * public static int reverse(int number)   			// Return the reversal of an integer, i.e., reverse(456) returns 654
 * public static boolean isPalindrome(int number) 	// Return true if number is a palindrome
 * Use the reverse method to implement isPalindrome. 
 * A number is a palindrome if its reversal is the same as itself. 
 * Write a test program that prompts the user to enter an integer and reports whether the integer is a palindrome.
 *
 * 08/29/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_03 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int palindromeNumber = input.nextInt();
		
		if (isPalindrome(palindromeNumber))
			System.out.print(palindromeNumber + " is a palindrome!");
		else
			System.out.print(palindromeNumber + " is not a palindrome!");
		
		input.close();		
	}
	
	/**
	 * Return the reversal of an integer, i.e., reverse(456) returns 654
	 * 
	 * @param number
	 * @return
	 */
	public static int reverse(int number)
	{
		int reversedNumber = 0;
		
		while (number != 0)
		{
			reversedNumber *= 10;
			reversedNumber += (number % 10);
			number /= 10;
		}
		
		return reversedNumber;
	}
	
	/**
	 * Return true if number is a palindrome
	 * 
	 * @param number
	 * @return
	 */
	public static boolean isPalindrome(int number)
	{
		return (number == reverse(number));
	}
}