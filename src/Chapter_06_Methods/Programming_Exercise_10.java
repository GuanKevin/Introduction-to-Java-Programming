package Chapter_06_Methods;

/**
 * Use the isPrime Method
 * Listing 6.7, PrimeNumberMethod.java, provides the isPrime(int number) method for testing whether a number is prime. 
 * Use this method to find the number of prime numbers less than 10000.
 *
 * 08/29/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_10 
{
	public static void main(String[] args) 
	{
		final int CHECK_FOR_PRIME = 10000;
		
		System.out.print("Number of primes under " + CHECK_FOR_PRIME + " is " + primeCounter(CHECK_FOR_PRIME));
	}
	
	/**
	 * Counts how many prime under a specified number
	 * 
	 * @param number
	 * @return
	 */
	public static int primeCounter(int number)
	{
		int counter = 0;
		
		while (number != 1)
		{
			if (isPrime(number))
				counter++;
			
			--number;
		}
		
		return counter;
	}
	
	/**
	 * Returns true if it is a prime number
	 * 
	 * @param number
	 * @return
	 */
	public static boolean isPrime(int number)
	{
		for (int i = 2; i <= (number / 2); i++)
			if ((number % i) == 0)
				return false;
		
		return true;
	}
}
