package Chapter_07_Single_Dimensional_Arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Execution time
 * Write a program that randomly generates an array of 100,000 integers and a key. 
 * Estimate the execution time of invoking the linearSearch method in Listing 7.6. 
 * Sort the array and estimate the execution time of invoking the binarySearch method in Listing 7.7. 
 * You can use the following code template to obtain the execution time: 
 * long startTime = System.currentTimeMillis(); 
 * long endTime = System.currentTimeMillis(); 
 * long executionTime = endTime - startTime;
 * 
 * 09/20/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_16 
{
	static Random randomNumber = new Random();
	static final int SIZE = 1000000;
	public static void main(String[] args) 
	{
		int[] executionArray = new int[SIZE];
		insertNumbers(executionArray);
		int key = randomNumber.nextInt(SIZE);
		linearSearchTime(executionArray, key);
		Arrays.sort(executionArray);
		binarySearchTime(executionArray, key);
	}
	
	/**
	 * Return the amount of milliseconds required for binary search
	 * 
	 * @param executionArray
	 * @param key
	 */
	public static void binarySearchTime(int[] executionArray, int key)
	{
		int low = 0;
		int high = executionArray.length - 1;
		long startTime = System.currentTimeMillis();
		boolean keyFound = false;

		while (high >= low)
		{
			int mid = (low + high) / 2;
			if (key < executionArray[mid])
				high = mid - 1;
			else if (key == executionArray[mid])
			{
				keyFound = true;
				long endTime = System.currentTimeMillis() - startTime;
				System.out.print("Key " + key + " found at index " + mid 
						+ "\nTime: " + endTime + " milliseconds\n");
				break;
			}
			else
				low = mid + 1;
		}
		
		if (keyFound == false)
		{
			long endTime = System.currentTimeMillis() - startTime;
			System.out.print("Key not found." 
					+ "\nTime: " + endTime + " milliseconds\n");
		}
	}
	
	/**
	 * Return the amount of milliseconds required for linear search
	 * 
	 * @param executionArray
	 */
	public static void linearSearchTime(int[] executionArray, int key)
	{
		long startTime = System.currentTimeMillis(); 
		boolean keyFound = false;
		
		for (int i = 0; i < SIZE; i++)
			if (key == executionArray[i])
			{
				long executionTime = System.currentTimeMillis() - startTime;
				System.out.print("Key " + key + " found at index " + i
						+ "\nTime: " + executionTime + " milliseconds\n");
				keyFound = true;
				break;
			}
		
		if (keyFound == false)
		{
			long executionTime = System.currentTimeMillis() - startTime;
			System.out.print("Key not found." 
					+ "\nTime: " + executionTime + " milliseconds\n");
		}
	}
	
	/**
	 * Insert elements into the array
	 * 
	 * @param executionArray
	 */
	public static void insertNumbers(int[] executionArray)
	{	
		for (int i = 0; i < SIZE; i++)
			executionArray[i] = randomNumber.nextInt(SIZE);
	}
}
