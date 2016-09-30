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
 * 09/09/2016
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
	 * Display emirps, nonpalindromic prime numbers, 10 per line
	 */
	public static void displayEmirp()
	{
		int emirpCounter = 0;
		int emirpNumber = 13;
		
		while (emirpCounter < 100)
		{
			if (checkPrime(emirpNumber))
				if (checkEmirp(emirpNumber))
				{
					emirpCounter++;
					
					if (emirpCounter % 10 == 0)
						System.out.printf("%-6d \n", emirpNumber);
					else
						System.out.printf("%-6d", emirpNumber);
				}
			emirpNumber++;
		}
	}
	
	/**
	 * Return true if the number is an emirp
	 * 
	 * @param emirpNumber
	 * @return
	 */
	public static boolean checkEmirp(int emirpNumber)
	{
		int reversedEmirp = Integer.parseInt(new StringBuilder(Integer.toString(emirpNumber)).reverse().toString());
		
		if (emirpNumber == reversedEmirp)
			return false;
		if (checkPrime(reversedEmirp))
			return true;
		return false;
	}
	
	/**
	 * Return true if the number is a prime
	 * 
	 * @param emirpNumber
	 * @return
	 */
	public static boolean checkPrime(int emirpNumber)
	{
		for (int i = 2; i <= emirpNumber / 2; i++)
			if (emirpNumber % i == 0)
				return false;
		return true;
	}
}
