package Chapter_07_Single_Dimensional_Arrays;

import java.util.Scanner;

/**
 * Revise Listing 5.15, PrimeNumber.java
 * Listing 5.15 determines whether a number n is prime by checking whether 2, 3, 4, 5, 6, . . . , n/2 is a divisor. 
 * If a divisor is found, n is not prime. 
 * A more efficient approach is to check whether any of the prime numbers less than or equal to (square root)n can divide n evenly. 
 * If not, n is prime. 
 * Rewrite Listing 5.15 to display the first 50 prime numbers using this approach. 
 * You need to use an array to store the prime numbers and later use them to check whether they are possible divisors for n.
 * 
 * 09/30/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_06 
{
	final static int ARRAY_SIZE = 50;
	
	public static void main(String[] args) 
	{
		int[] primeNumberArray = new int[ARRAY_SIZE];
		storePrimes(primeNumberArray);
		//displayPrimes(primeNumberArray);
		
		System.out.print("Enter a number: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		checkDivisibility(primeNumberArray, number);

		
		input.close();
	}
	
	/**
	 * Returns true if numbers is divisible by one of the first 50 prime numbers
	 * 
	 * @return
	 */
	public static void checkDivisibility(int[] primeNumberArray, int number)
	{
		boolean divisible = false;
		for (int i = 0; i < ARRAY_SIZE; i++)
			if (number % primeNumberArray[i] == 0)
			{
				divisible = true;
				System.out.print(number + " is divisible by " + primeNumberArray[i]);
				break;
			}
			
			if (divisible == false)
				System.out.print(number + " is not divisible by the first 50 primes.");
	}
	
	/**
	 * Display the first 50 primes
	 */
	public static void displayPrimes(int[] primeNumberArray)
	{
		for (int i = 0; i < ARRAY_SIZE; i++)
		{
			if ((i + 1) % 10 == 0)
				System.out.printf("%-4d\n",primeNumberArray[i]);
			else
				System.out.printf("%-4d", primeNumberArray[i]);
		}
	}
	
	/**
	 * Store first 50 primes into the array
	 * 
	 * @param primeNumberArray
	 */
	public static void storePrimes(int[] primeNumberArray)
	{
		int primeCounter = 0;
		int number = 2;
		boolean isPrime = true;
		
		while (primeCounter < 50)
		{
			for (int i = 2; i <= Math.sqrt(number); i++)
				if (number % i == 0)
				{
					isPrime = false;
					break;
				}
			
			if (isPrime == true)
			{
				primeNumberArray[primeCounter] = number;
				primeCounter++;
			}
			
			isPrime = true;
			number++;			
		}
	}
}
