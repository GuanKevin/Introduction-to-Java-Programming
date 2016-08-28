package Chapter_05_Loops;

/**
 * Display prime numbers between 2 and 1,000
 * Modify Listing 5.15 to display all the prime numbers between 2 and 1,000, inclusive. 
 * Display eight prime numbers per line. 
 * Numbers are separated by exactly one space.
 * 
 * 08/23/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_20 
{
	public static void main(String[] args) 
	{
		boolean isPrime = true;
		int primeCounter = 0;
		
		for (int i = 2; i <= 1000; i++)
		{
			for (int j = i - 1; j > 1; j--)
			{
				if (i % j == 0)
				{
					isPrime = false;
					break;
				}
			}
			
			if (isPrime == true)
			{
				primeCounter++;
				
				if (primeCounter % 8 == 0)
					System.out.printf("%-4d \n", i);
				else
					System.out.printf("%-4d", i);
			}
			
			isPrime = true;
		}
	}
}
