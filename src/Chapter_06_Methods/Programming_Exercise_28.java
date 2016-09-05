package Chapter_06_Methods;
/**
 * Mersenne prime
 * A prime number is called a Mersenne prime if it can be written in the form 2p - 1 for some positive integer p. 
 * Write a program that finds all Mersenne primes with p <= 31 and displays the output as follows:
 *
 * 09/03/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_28 
{
	public static void main(String[] args) 
	{
		displayMersennePrime();	
	}
	
	/**
	 * Displays primes in the form 2^p - 1 for some positive integer p
	 */
	public static void displayMersennePrime()
	{
		System.out.printf("%-2s %s \n%s \n", 'p', "(2^p - 1)", "------------");
		
		for (int i = 2; i <= 31; i++)
		{
			if (checkMersennePrime(i))
				System.out.printf("%-2d %.0f \n", i, (Math.pow(2, i) - 1));
		}
	}
	
	/**
	 * Returns true if number returns a mersenne prime in the
	 * the form 2^p - 1
	 * 
	 * @param number
	 * @return
	 */
	public static boolean checkMersennePrime(int number)
	{
		if (checkPrime((long) Math.pow(2, number) - 1))
			return true;
		return false;
	}
	
	/**
	 * returns true if number is a prime
	 * 
	 * @param number
	 * @return
	 */
	public static boolean checkPrime(long number)
	{
		for (int i = 2; i <= number / 2; i++)
			if (number % i == 0)
				return false;
		return true;
	}
}
