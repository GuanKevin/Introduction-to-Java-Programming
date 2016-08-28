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
 * 08/27/2016
 * @author kevgu
 *
 */
 
public class Programming_Exercise_41 
{ 
	public static void main(String[] args) 
	{
		Random randNumber = new Random();
		int number = randNumber.nextInt(10) + 1;
		int largestNumber = number;
		int numberCounter = 1;
		
		System.out.print(number + " ");
	 
		while (number != 0)
		{
			number = randNumber.nextInt(10);
			
			if (largestNumber < number)
			{
				largestNumber = number;
				numberCounter = 1;
			}
			else if (largestNumber == number)
				numberCounter++;
			
			System.out.print(number + " ");
		}
		
		System.out.print("\nMax number: " + largestNumber 
				+ "\nCounter for max number: " + numberCounter);
	}
}
