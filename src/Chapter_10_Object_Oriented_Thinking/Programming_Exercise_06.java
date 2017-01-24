package Chapter_10_Object_Oriented_Thinking;
import utilities.StackOfIntegers;

/**
 * Displaying the prime numbers
 * Write a program that displays all the prime numbers less than 120 in decreasing order. 
 * Use the StackOfIntegers class to store the prime numbers (e.g., 2, 3, 5, ...) and retrieve and display them in reverse order.
 * 
 * 11/23/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_06 
{
	public static void main(String[] args) 
	{
		final int LIMIT = 120;
		StackOfIntegers primeNumStack = new StackOfIntegers();
		
		for (int i = 2; i <= LIMIT; i++)
			if (isPrime(i))
				primeNumStack.push(i);
		
		while (primeNumStack.getSize() != 0)
			System.out.print(primeNumStack.pop() + " ");
	}
	
	public static boolean isPrime(int number)
	{
		for (int i = 2; i <= Math.sqrt(number); i++)
			if ((number % i) == 0)
				return false;
		
		return true;
	}
}
