package Chapter_07_Single_Dimensional_Arrays;

import java.util.Scanner;

/**
 * Find the index of the smallest element
 * Write a method that returns the index of the smallest element in an array of integers. 
 * If the number of such elements is greater than 1, return the smallest index. 
 * Use the following header: 
 * public static int indexOfSmallestElement(double[] array) 
 * Write a test program that prompts the user to enter ten numbers, invokes this method to return the index of the smallest element, 
 * and displays the index.
 * 
 * 09/19/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_10 
{
	public static void main(String[] args) 
	{
		double[]  smallestIndexArray = new double[10];
		insertNumbers(smallestIndexArray);
		System.out.print("Index: " + indexOfSmallestElement(smallestIndexArray) 
							+ "\nElement: " + smallestIndexArray[indexOfSmallestElement(smallestIndexArray)]);
		
	}
	
	public static void insertNumbers(double[] smallestIndexArray)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		
		for (int i = 0; i < 10; i++)
			smallestIndexArray[i] = input.nextDouble();
			
		input.close();
	}
	
	/**
	 * returns the index of the smallest element in an array of integers
	 * 
	 * @param array
	 * @return
	 */
	public static int indexOfSmallestElement(double[] array) 
	{
		int smallestIndex = 0;
		
		for (int i = 1; i < 10; i++)
			if (array[smallestIndex] > array[i])
				smallestIndex = i;
		
		return smallestIndex;
	}
}
