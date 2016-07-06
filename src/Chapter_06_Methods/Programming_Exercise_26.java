package Chapter_06_Methods;
import java.util.Scanner;

/**
 * Palindromic prime
 * A palindromic prime is a prime number and also palindromic.
 * For example, 131 is a prime and also a palindromic prime, as are 313 and 757. 
 * Write a program that displays the first 100 palindromic prime numbers. 
 * Display 10 numbers per line, separated by exactly one space, as follows:
 * 2 3 5 7 11 101 131 151 181 191
 * 313 353 373 383 727 757 787 797 919 929
 * ...
 *
 * 02/16/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_26 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int counter = 0;
		int number = 2;
		
		while (counter < 100)
		{
			if (isPrime(number))
			{
				if (isPalindromic(number))
				{
					System.out.print(number + " ");
					counter++;
					
					if ((counter % 10) == 0)
					{
						System.out.println();
					}
				}
			}
			number++;
		}
		
		input.close();		
	}
	
	public static boolean isPrime(int number)
	{
		for (int i = 2; i <= number/2; i++)
		{
			if ((number % i) == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPalindromic(int number)
	{
		String palindrome = Integer.toString(number);
		boolean status = true;
		
		for (int i = 0; i < (palindrome.length()/2); ++i)
		{
			//1234321 --> 1 == 1
			if ((int)palindrome.charAt(i) != (int)(palindrome.charAt(palindrome.length() - ++i)));
			{
				System.out.println(number + ": " + palindrome.charAt(i) + ":" + (palindrome.charAt(palindrome.length() - ++i)));
				status = false;
			}
		}
		
		return status;
	}
}
