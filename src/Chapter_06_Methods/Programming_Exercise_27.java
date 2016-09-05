package Chapter_06_Methods;

/**
 * Emirp
 * An emirp (prime spelled backward) is a nonpalindromic prime number whose reversal is also a prime. 
 * For example, 17 is a prime and 71 is a prime, so 17 and 71 are emirps. 
 * Write a program that displays the first 100 emirps. 
 * Display 10 numbers per line, separated by exactly one space, as follows: 
 * 13 17 31 37 71 73 79 97 107 113 
 * 149 157 167 179 199 311 337 347 359 389 
 * ...
 *
 * 02/16/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_27 
{
	public static void main(String[] args) 
	{
		displayEmirp();		
	}
	
	/**
	 * Displays the first 100 emirps
	 */
	public static void displayEmirp()
	{
		int counter = 0;
		int number = 10;
		
		while (counter != 100)
		{
			if (checkPrime(number))
				if (checkEmirp(number))
				{
					counter++;
					
					if (counter % 10 == 0)
						System.out.printf("%-6d \n", number);
					else
						System.out.printf("%-6d", number);
				}
			
			number++;
		}
	}
	
	/**
	 * returns true if prime number whose reversal is also a prime
	 * 
	 * @param number
	 * @return
	 */
	public static boolean checkEmirp(int number)
	{
		int reverseNumber = Integer.parseInt(new StringBuilder(Integer.toString(number)).reverse().toString());
		
		if (number == reverseNumber)
			return false;
		if (checkPrime(reverseNumber))
			return true;
		return false;
	}
	
	/**
	 * returns true if number is prime
	 * 
	 * @param number
	 * @return
	 */
	public static boolean checkPrime(int number)
	{
		for (int i = 2; i <= number / 2; i++)
			if (number % i == 0)
				return false;
		return true;
	}
}
