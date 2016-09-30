package Chapter_07_Single_Dimensional_Arrays;

import java.util.Random;

/**
 * Count occurrence of numbers
 * Write a program that reads the integers between 1 and 100 and counts the occurrences of each. 
 * Assume the input ends with 0.
 * 
 * 09/14/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_03 
{
	public static void main(String[] args) 
	{
		int[] occurrenceArray = new int[101];
		
		numberInput(occurrenceArray);
		displayOccurrences(occurrenceArray);
	}
	
	/**
	 * Display numbers that have occurred more than 0 times
	 * 
	 * @param occurrenceArray
	 */
	public static void displayOccurrences(int[] occurrenceArray)
	{
		System.out.printf("%-7s%s\n", "Number", "Occurences");
		
		for (int i = 1; i < occurrenceArray.length; i++)
			if (occurrenceArray[i] > 0)
				System.out.printf("%-7d%d\n", i, occurrenceArray[i]);
	}
	
	/**
	 * Stores numbers between 1 and 100 and ends the input when it reads a 0
	 * 
	 * @param occurrenceArray
	 */
	public static void numberInput(int[] occurrenceArray)
	{
		Random randomNumber = new Random();
		int number = randomNumber.nextInt(101);
		
		while (number != 0)
		{
			occurrenceArray[number]++;
			number = randomNumber.nextInt(101);
		}
	}
}
