package Chapter_07_Single_Dimensional_Arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Eliminate duplicates
 * Write a method that returns a new array by eliminating the duplicate values in the array using the following method header: 
 * public static int[] eliminateDuplicates(int[] list) 
 * Write a test program that reads in ten integers, invokes the method, and displays the result.
 * 
 * 09/20/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_15 
{
	static final int SIZE = 20;
	public static void main(String[] args) 
	{
		int[] duplicateArray = new int[SIZE];
		insertNumbers(duplicateArray);
		displayArray(duplicateArray);
		duplicateArray = eliminateDuplicates(duplicateArray);
		displayArray(duplicateArray);
	}
	
	/**
	 * Display every element in the array
	 * 
	 * @param duplicateArray
	 */
	public static void displayArray(int[] duplicateArray)
	{
		for (int i = 0; i < duplicateArray.length; i++)
			System.out.print(duplicateArray[i] + " ");
		System.out.println();
	}
	
	/**
	 * Display every element in the array
	 * 
	 * @param duplicateArray
	 */
	public static void displayArray(boolean[] duplicateArray)
	{
		for (int i = 0; i < duplicateArray.length; i++)
			System.out.print(duplicateArray[i] + " ");
		System.out.println();
	}
	
	/**
	 * Insert elements into the array
	 * 
	 * @param displicateArray
	 */
	public static void insertNumbers(int[] duplicateArray)
	{
		Random randomNumber = new Random();
		
		for (int i = 0; i < duplicateArray.length; i++)
			duplicateArray[i] = randomNumber.nextInt(10) + 1;
	}
	
	/**
	 * Return an array without any duplicates
	 * 
	 * @param list
	 * @return
	 */
	public static int[] eliminateDuplicates(int[] list)
	{
		boolean[] checkArray = new boolean[SIZE];
		Arrays.fill(checkArray, Boolean.TRUE);
		
		for (int i = 0; i < SIZE - 1; i++)
		{
			if (checkArray[i] == false)
				continue;
			for (int j = i + 1; j < SIZE; j++)
				if (list[i] == list[j])
					checkArray[j] = false;
		}
		
		int[] tempArray = new int[getCount(checkArray)];
		
		int counter = 0;
		int trueCounter = 0;
		
		while (counter != tempArray.length)
		{
			if (checkArray[trueCounter] == true)
			{
				tempArray[counter] = list[trueCounter];
				counter++;
				trueCounter++;
			}
			else
				trueCounter++;
		}
		
		return tempArray;
	}
	
	/**
	 * Returns the numbers of true boolean values from the array
	 * 
	 * @param checkArray
	 * @return
	 */
	public static int getCount(boolean[] checkArray)
	{
		int trueCounter = 0;
		
		for (int i = 0; i < SIZE; i++)
			if (checkArray[i] == true)
				trueCounter++;
		
		return trueCounter;
	}
}
