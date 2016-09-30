package Chapter_07_Single_Dimensional_Arrays;

import java.util.Random;
import java.util.Scanner;

/**
 * Random number chooser
 * Write a method that returns a random number between 1 and 54, excluding the numbers passed in the argument. 
 * The method header is specified as follows: 
 * public static int getRandom(int... numbers)
 * 
 * 09/20/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_13 
{	
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the size of the array: ");
		int[] excludeNumberArray = new int[input.nextInt()];
		System.out.print("Random number: " + getRandom(excludeNumberArray));
		
		input.close();
	}
	
	/**
	 * Get N amount of numbers and print a number that is not exluded
	 * 
	 * @param numbers
	 * @return
	 */
	public static int getRandom(int... numbers)
	{
		System.out.print("Enter " + numbers.length + " numbers: ");
		
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextInt();
		
		return getNumber(numbers);
	}
	
	/**
	 * Return a number that has not been excluded
	 * 
	 * @param numbers
	 * @return
	 */
	public static int getNumber(int[] numbers)
	{
		Random randomNumber = new Random();
		int number = randomNumber.nextInt(20) + 1;
		boolean foundNumber = false;
		
		System.out.println("Number chosen: " + number);
		
		while (!foundNumber)
		{
			for (int i = 0; i < numbers.length; i++)
			{
				if (number == numbers[i])
				{
					number = randomNumber.nextInt(20) + 1;
					System.out.println("Number chosen: " + number);
					break;
				}
				if (i == numbers.length - 1 && number != numbers[numbers.length - 1])
					foundNumber = true;
			}
		}
			
		return number;
	}
}
