package Chapter_05_Loops;
import java.util.Scanner;

/**
 * Display prime numbers between 2 and 1,000
 * Modify Listing 5.15 to display all the prime numbers between 2 and 1,000, inclusive. 
 * Display eight prime numbers per line. 
 * Numbers are separated by exactly one space.
 * 
 * 02/16/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_20 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		//final int NUMBER_OF_TIMES = 1000; // Number of primes to display
		final int NUMBER_OF_PRIMES_PER_LINE = 8; // Display 10 per line
		int counter = 0; // Count the number of prime numbers
		int number = 2; // A number to be tested for primeness
		
		//System.out.println("The first 50 prime numbers are \n");
		
		// Repeatedly find prime numbers
		while (number <= 1000) 
		{
			// Assume the number is prime
			boolean isPrime = true; // Is the current number prime?
			
			// Test whether number is prime
			//50 -> 26-49
			for (int divisor = 2; divisor <= number / 2; divisor++) 
			{
				if (number % divisor == 0) 
				{ // If true, number is not prime
					isPrime = false; // Set isPrime to false
					break; // Exit the for loop
				}
			}
		
			 // Display the prime number and increase the count
			 if (isPrime) 
			 {
				 counter++; // Increase the count
				
				 if (counter % NUMBER_OF_PRIMES_PER_LINE == 0) 
				 {
					 // Display the number and advance to the new line
					 System.out.println(number);
				 }
				 else
					 System.out.print(number + " ");
			}
		
			 // Check if the next number is prime
			 number++;
		 }
		 	
		input.close();
	}
}
