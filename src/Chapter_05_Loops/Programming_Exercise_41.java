package Chapter_05_Loops;
import java.util.Random;

/**
 * Occurrence of max numbers
 * Write a program that reads integers, finds the largest of them, and counts its occurrences. 
 * Assume that the input ends with number 0. 
 * Suppose that you entered 3 5 2 5 5 5 0; the program finds that the largest is 5 and the occurrence count for 5 is 4.
 * (Hint: Maintain two variables, max and count. max stores the current max number, and count stores its occurrences. 
 * Initially, assign the first number to max and 1 to count. 
 * Compare each subsequent number with max. 
 * If the number is greater than max, assign it to max and reset count to 1. 
 * If the number is equal to max, increment count by 1.)
 * 
 * 03/24/2016
 * @author kevgu
 *
 */


public class Programming_Exercise_41 
{
	static Random rand = new Random();
	public static void main(String[] args) 
	{
		int randomNumber = rand.nextInt(10);
		System.out.print(randomNumber + " ");
		int maxNumber = randomNumber;
		int maxCounter = 1;
		
		while (randomNumber != 0)
		{
			if (maxNumber < randomNumber)
			{
				maxNumber = randomNumber;
				maxCounter = 1;
			}
			else if (maxNumber == randomNumber)
			{
				maxCounter++;
			}
			randomNumber = rand.nextInt(25);
			System.out.print(randomNumber + " ");
		}
		
		System.out.print("\nMax number: " + maxNumber 
				+ "\nCounter for max number: " + maxCounter);
	}
}
