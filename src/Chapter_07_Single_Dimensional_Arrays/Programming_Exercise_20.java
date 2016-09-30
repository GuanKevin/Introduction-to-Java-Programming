package Chapter_07_Single_Dimensional_Arrays;

import java.util.Random;

/**
 * Revise selection sort
 * In Section 7.11, you used selection sort to sort an array. 
 * The selection-sort method repeatedly finds the smallest number in the current array and swaps it with the first. 
 * Rewrite this program by finding the largest number and swapping it with the last. 
 * Write a test program that reads in ten double numbers, invokes the method, and displays the sorted numbers.
 * 
 * 09/21/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_20 
{
	static final int SIZE = 10;
	public static void main(String[] args) 
	{
		int[] sortedArray = new int[SIZE];
		insertNumbers(sortedArray);
		System.out.println("Before selection sort");
		displayArray(sortedArray);
		System.out.println("After selection sort");
		selectionSort(sortedArray);
		displayArray(sortedArray);
	}
	
	/**
	 * Display every element in the array
	 * 
	 * @param sortedArray
	 */
	public static void displayArray(int[] sortedArray)
	{
		for (int i = 0; i < SIZE; i++)
			System.out.printf("%-3d", sortedArray[i]);
		System.out.println();
	}
	
	/**
	 * Insert elements into the array
	 * 
	 * @param sortedArray
	 */
	public static void insertNumbers(int[] sortedArray)
	{
		Random randomNumber = new Random();
		
		for (int i = 0; i < SIZE; i++)
			sortedArray[i] = randomNumber.nextInt(10);
	}
	
	/**
	 * Finds the largest number and swaps it with the last.
	 *  
	 * @param list
	 */
	public static void selectionSort(int[] list)
	{
		for (int i = list.length - 1; i > 0; i--)
		{
			int currentMax = list[i];
			int currentMaxIndex = i;
			
			for (int j = i - 1; j >= 0; j--)
			{
				if (currentMax < list[j])
				{
					currentMax = list[j];
					currentMaxIndex = j;
				}
			}
			
			if (currentMaxIndex != i)
			{
				list[currentMaxIndex] = list[i];
				list[i] = currentMax;
			}
		}
	}
}
