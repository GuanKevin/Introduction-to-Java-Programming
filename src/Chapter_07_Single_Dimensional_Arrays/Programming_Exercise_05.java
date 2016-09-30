package Chapter_07_Single_Dimensional_Arrays;

import java.util.Random;

/**
 * Print distinct numbers
 * Write a program that reads in ten numbers and displays the number of distinct numbers 
 * and the distinct numbers separated by exactly one space (i.e., if a number appears multiple times, it is displayed only once). 
 * (Hint: Read a number and store it to an array if it is new. If the number is already in the array, ignore it.) 
 * After the input, the array contains the distinct numbers.
 * 
 * 09/14/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_05 
{	
	final static int ARRAY_SIZE = 10;
	
	public static void main(String[] args) 
	{
		int[] distinctNumberArray = new int[ARRAY_SIZE];
		
		inputDistinctNumbers(distinctNumberArray);
		displayArray(distinctNumberArray);
	}
	
	/**
	 * Display distinct numbers from the array
	 */
	public static void displayArray(int[] distinctNumberArray)
	{
		System.out.println();
		for (int i = 0; i < ARRAY_SIZE; i++)
			if (distinctNumberArray[i] == 1)
				System.out.print(i + " ");
	}
	
	/**
	 * Stores distinct numbers into the array
	 */
	public static void inputDistinctNumbers(int[] distinctNumberArray)
	{
		Random random = new Random();
		int randomNumber = random.nextInt(10);
		
		for (int i = 0; i < ARRAY_SIZE; i++)
		{
			System.out.print(randomNumber + " ");
			distinctNumberArray[randomNumber] = 1;
			randomNumber = random.nextInt(10);
		}
	}
}
