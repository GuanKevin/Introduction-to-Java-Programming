package Chapter_06_Methods;
import java.util.Scanner;

/**
 * Use the isPrime Method
 * Listing 6.7, PrimeNumberMethod.java, provides the isPrime(int number) method for testing whether a number is prime. 
 * Use this method to find the number of prime numbers less than 10000.
 *
 * 02/16/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_10 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		final int NUMBER = 10000;
		printPrimeNumbers(NUMBER);
		
		input.close();		
	}
	
	public static void printPrimeNumbers(int numberOfPrimes)
	{
		final int NUMBERS_PER_LINE = 10;
		int counter = 0;
		int number = 2;
		
		while (number < 10000)
		{
			if (isPrime(number))
			{
				System.out.printf("%-5s", number);
				counter++;
			}
			
			if (counter == NUMBERS_PER_LINE)
			{
				System.out.println();
				counter = 0;
			}
			
			number++;
		}
	}
	
	public static boolean isPrime(int number)
	{
		for (int i = 2; i <= (number / 2); i++)
		{
			if ((number % i) == 0)
			{
				return false;
			}
		}
		return true;
	}
}
