package Chapter_06_Methods;

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
 * 09/02/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_26 
{
	public static void main(String[] args) 
	{
		displayPalindromicPrime();
	}
	
	/**
	 * Display prime numbers that are also palindromic
	 */
	public static void displayPalindromicPrime()
	{
		int primeCounter = 0;
		int number = 2;
		
		while (primeCounter != 100)
		{
			if (checkPrime(number))
				if (checkPalindrome(number))
				{
					primeCounter++;
					if (primeCounter % 10 == 0)
						System.out.printf("%-6d \n", number);
					else
						System.out.printf("%-6d", number);
				}
			number++;
		}
	}
	
	/**
	 * returns true if the number is a palindrome
	 * 
	 * @param number
	 * @return
	 */
	public static boolean checkPalindrome(int number)
	{
		String reverse = new StringBuilder(Integer.toString(number)).reverse().toString();
		int reversedNumber = Integer.parseInt(reverse);
		
		if (number == reversedNumber)
			return true;
		return false;
	}
	
	/**
	 * Return true if the number is prime
	 * 
	 * @param number
	 * @return
	 */
	public static boolean checkPrime(int number)
	{
		for (int i = 2; i <=  number / 2; i++)
			if (number % i == 0)
				return false;
		return true;
	}
}
