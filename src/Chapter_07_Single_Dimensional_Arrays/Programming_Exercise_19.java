package Chapter_07_Single_Dimensional_Arrays;

import java.util.Random;

/**
 * Sorted?
 * Write the following method that returns true if the list is already sorted in increasing order. 
 * public static boolean isSorted(int[] list) 
 * Write a test program that prompts the user to enter a list and displays whether the list is sorted or not. 
 * 
 * 09/21/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_19 
{
	static final int SIZE = 3;
	public static void main(String[] args) 
	{	
		int[] sortedArray = new int[SIZE];
		insertNumbers(sortedArray);
		displayArray(sortedArray);
		
		if (isSorted(sortedArray))
			System.out.print("Array is sorted.");
		else
			System.out.print("Array is not sorted");
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
	 * returns true if the list is already sorted in increasing order
	 * 
	 * @param list
	 * @return
	 */
	public static boolean isSorted(int[] list) 
	{
		for (int i = 0; i < SIZE - 1; i++)
			for (int j = i + 1; j < SIZE; j++)
				if (list[i] > list[j])
					return false;
		return true;
	}
}
