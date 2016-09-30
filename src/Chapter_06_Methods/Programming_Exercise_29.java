package Chapter_06_Methods;

/**
 * Twin primes
 * Twin primes are a pair of prime numbers that differ by 2. 
 * For example, 3 and 5 are twin primes, 5 and 7 are twin primes, and 11 and 13 are twin primes. 
 * Write a program to find all twin primes less than 1,000. Display the output as follows: 
 * (3, 5) 
 * (5, 7) 
 * ...
 *
 * 09/09/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_29 
{
	public static void main(String[] args) 
	{
		displayTwinPrimes();
	}
	
	/**
	 * Print twin primes
	 */
	public static void displayTwinPrimes()
	{
		int twinPrimeNumber = 3;
		
		while (twinPrimeNumber < 1000)
		{
			if (checkPrime(twinPrimeNumber) && checkPrime(twinPrimeNumber + 2))
				System.out.printf("(%d, %d) \n", twinPrimeNumber, (twinPrimeNumber + 2));
			twinPrimeNumber++;
		}
	}
	
	/**
	 * Return true if the number is a prime
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
