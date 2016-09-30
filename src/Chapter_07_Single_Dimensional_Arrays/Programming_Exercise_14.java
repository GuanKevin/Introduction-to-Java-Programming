package Chapter_07_Single_Dimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Computing gcd
 * Write a method that returns the gcd of an unspecified number of integers. 
 * The method header is specified as follows: 
 * public static int gcd(int... numbers) 
 * Write a test program that prompts the user to enter five numbers, invokes the method to find the gcd of these numbers, 
 * and displays the gcd.
 * 
 * 09/20/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_14 
{
	static final int SIZE = 5;
	public static void main(String[] args) 
	{		
		int[] gcdArray = new int[SIZE];
		System.out.print("GCD is " + gcd(gcdArray) + " of " + Arrays.toString(gcdArray));
	}
	
	/**
	 * Returns the gcd of unspecified number of integers
	 * 
	 * @param numbers
	 * @return
	 */
	public static int gcd(int... numbers) 
	{
		System.out.print("Enter " + SIZE + " numbers: ");
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < SIZE; i++)
			numbers[i] = input.nextInt();
		
		input.close();
		int smallestElement = getSmallestElement(numbers);
		boolean foundNumber = false;
		
		while (!foundNumber)
		{
			for (int i = 0; i < SIZE; i++)
			{
				if (numbers[i] % smallestElement != 0)
				{
					smallestElement--;
					break;
				}
				if (i == SIZE - 1)
					foundNumber = true;
			}
		}
		
		return smallestElement;	
	}
	
	/**
	 * Returns the smallest element from the array
	 * 
	 * @param numbers
	 * @return
	 */
	public static int getSmallestElement(int[] numbers)
	{
		int number = numbers[0];
		
		for (int i = 1; i < SIZE; i++)
			if (number > numbers[i])
				number = numbers[i];
		
		return number;			
	}
}
