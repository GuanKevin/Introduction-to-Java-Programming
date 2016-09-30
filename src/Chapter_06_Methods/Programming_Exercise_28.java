package Chapter_06_Methods;
/**
 * Mersenne prime
 * A prime number is called a Mersenne prime if it can be written in the form 2^p - 1 for some positive integer p. 
 * Write a program that finds all Mersenne primes with p <= 31 and displays the output as follows:
 *
 * 09/09/2016
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
	 * Display mersenne prime and its form
	 */
	public static void displayMersennePrime()
	{
		System.out.printf("%-2s %s \n%s \n", 'p', "(2^p - 1)", "------------");
		
		for (int i = 2; i <= 31; i++)
			if (checkMersennePrime(i))
				System.out.printf("%-2d %.0f \n", i, (Math.pow(2, i) - 1));
	}
	
	/**
	 * Returns true if the number is a persenne prime
	 * 
	 * @param number
	 * @return
	 */
	public static boolean checkMersennePrime(int number)
	{
		return checkPrime((long) Math.pow(2, number) - 1);
	}
	
	/**
	 * Return true if the number is a prime
	 * 
	 * @param number
	 */
	public static boolean checkPrime(long number)
	{
		for (int i = 2; i < Math.sqrt(number); i++)
			if (number % i == 0)
				return false;
		return true;
	}
}
