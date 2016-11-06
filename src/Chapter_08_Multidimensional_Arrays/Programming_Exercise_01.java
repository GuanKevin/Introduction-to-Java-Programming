package Chapter_08_Multidimensional_Arrays;

import java.util.Random;
import java.util.Scanner;

/**
 * Sum elements column by column
 * Write a method that returns the sum of all the elements in a specified column in a matrix using the following header:
 * public static double sumColumn(double[][] m, int columnIndex)
 * Write a test program that reads a 3-by-4 matrix and displays the sum of each column.
 * 
 * 09/30/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_01 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the row and column: ");
		int row = input.nextInt();
		int column = input.nextInt();
		int[][] sumColumnArray = new int[row][column];
		
		setNumbers(sumColumnArray);
		displayArray(sumColumnArray);
		System.out.print("Sum which index (0 - " + (column - 1) + "): ");
		int index = input.nextInt();
		System.out.print("The sum of index " + index + " is " + sumColumn(sumColumnArray, index));
		
		input.close();
	}
	
	public static void displayArray(int[][] sumColumnArray)
	{
		for (int i = 0; i < sumColumnArray.length; i++)
		{
			for (int j = 0; j < sumColumnArray[i].length; j++)
				System.out.print(sumColumnArray[i][j] + " ");
			System.out.println();
		}
	}
	
	/**
	 * Store numbers into the array
	 * 
	 * @param sumColumnArray
	 */
	public static void setNumbers(int[][] sumColumnArray)
	{
		Random randNumber = new Random();
		
		for (int i = 0; i < sumColumnArray.length; i++)
			for (int j = 0; j < sumColumnArray[i].length; j++)
				sumColumnArray[i][j] = randNumber.nextInt(10);
	}
	
	/**
	 * displays the sum of a specified column
	 * 
	 * @param m
	 * @param columnIndex
	 * @return
	 */
	public static int sumColumn(int[][] m, int columnIndex)
	{
		int sum = 0;
		
		for (int i = 0; i < m.length; i++)
			sum += m[i][columnIndex];
		
		return sum;
	}
}
