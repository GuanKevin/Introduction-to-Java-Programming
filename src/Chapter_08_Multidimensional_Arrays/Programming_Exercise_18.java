package Chapter_08_Multidimensional_Arrays;

import java.util.Random;

/**
 * Shuffle rows
 * Write a method that shuffles the rows in a two-dimensional int array using the following header: 
 * public static void shuffle(int[][] m)
 * Write a test program that shuffles the following matrix:
 * int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
 * 
 * 10/21/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_18 
{
	public static void main(String[] args) 
	{
		int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
		
		displayArray(m);
		shuffle(m);
		displayArray(m);
	}

	/**
	 * Shuffles the rows in a two-dimensional int array
	 * 
	 * @param m
	 */
	public static void shuffle(int[][] m)
	{
		Random randomInteger = new Random();
		int shuffleTime = randomInteger.nextInt(10) + 1;
		System.out.print("Shuffling " + shuffleTime + " times.");
		
		for (int i = 0; i < shuffleTime; i++)
		{
			int swapX = randomInteger.nextInt(m.length), swapY = randomInteger.nextInt(m.length);
			int[] tempArray = m[swapX];
			m[swapX] = m[swapY];
			m[swapY] = tempArray;
		}
		System.out.println();
	}
	
	/**
	 * Display the 2-dimensional array
	 * 
	 * @param arrayToSort
	 */
	public static void displayArray(int[][] displayArray)
	{
		for (int i = 0; i < displayArray.length; i++)
		{
			for (int j = 0; j < displayArray[i].length; j++)
				System.out.print(displayArray[i][j] + " ");
			System.out.println();
		}			
	}
}
