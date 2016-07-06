package Chapter_18_Recursion;

import java.util.Random;

/**
 * Find the largest number in an array
 * Write a recursive method that returns the largest integer in an array. 
 * Write a test program that prompts the user to enter a list of eight integers and displays the largest element.
 * 
 * 06/29/2016;
 * @author kevgu
 *
 */

public class Programming_Exercise_13
{
	static final int size = 8;
	static Random rand = new Random();
	
	public static void main(String[] args) 
	{
		int[] myArray = new int[size];
		int index = 0;
		int number = 0;
		
		storeRandNum(myArray);
		
		System.out.print("Numbers in the array: ");
		displayArray(myArray);
		System.out.print("\nLargest number in array: " + findLargestNum(myArray, index, number));
	}
	
	/*
	 * Recursion method using the index to compare numbers through the array
	 * Returns the largest number found in the array
	 */
	public static int findLargestNum(int[] myArray, int index, int number)
	{
		if (index == myArray.length - 1)
		{
			return number;
		}
		
		if (number < myArray[index])
		{
			number = myArray[index];
		}
		
		return findLargestNum(myArray, ++index, number);
	}
	
	/*
	 * Display each integer in the array
	 */
	public static void displayArray(int[] myArray)
	{
		for (int i = 0; i < myArray.length; i++)
		{
			System.out.print(myArray[i] + " ");
		}
	}
	

	/*
	 * Store random numbers between 0 - 99 into the array
	 */
	public static void storeRandNum(int[] myArray)
	{
		for (int i = 0; i < 8; i++)
		{
			myArray[i] = rand.nextInt(100);
		}
	}
}
