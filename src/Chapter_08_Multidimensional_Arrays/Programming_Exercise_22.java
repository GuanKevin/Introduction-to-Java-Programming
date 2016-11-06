package Chapter_08_Multidimensional_Arrays;

import java.util.Random;

/**
 * Even number of 1s
 * Write a program that generates a 6-by-6 two-dimensional matrix filled with 0s and 1s, displays the matrix, 
 * and checks if every row and every column have an even number of 1s.
 * 
 * 10/26/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_22 
{
	public static void main(String[] args) 
	{
		int[][] binaryMatrix = new int[6][6];
		
		fillMatrix(binaryMatrix);
		displayMatrix(binaryMatrix);
		checkRowColumn(binaryMatrix);
	}
	
	/**
	 * Display columns and rows that have an even number of 1s
	 * 
	 * @param binaryMatrix
	 */
	public static void checkRowColumn(int[][] binaryMatrix)
	{
		int evenCounter = 0;
		
		System.out.print("Row ");
		for (int i = 0; i < binaryMatrix.length; i++)
		{
			for (int j = 0; j < binaryMatrix[i].length; j++)
				if (binaryMatrix[i][j] == 1)
					evenCounter++;
			
			if ((evenCounter % 2) == 0)
				System.out.print(i + " ");
			evenCounter = 0;
		}
		System.out.println("has an even number of 1s.");
		
		System.out.print("Column ");
		for (int i = 0; i < binaryMatrix.length; i++)
		{
			for (int j = 0; j < binaryMatrix[i].length; j++)
				if (binaryMatrix[j][i] == 1)
					evenCounter++;
			
			if ((evenCounter % 2) == 0)
				System.out.print(i + " ");
			evenCounter = 0;
		}
		System.out.println("has an even number of 1s.");
	}
	
	/**
	 * Displays the matrix
	 * 
	 * @param binaryMatrix
	 */
	public static void displayMatrix(int[][] binaryMatrix)
	{
		for (int i = 0; i < binaryMatrix.length; i++)
		{
			for (int j = 0; j < binaryMatrix[i].length; j++)
				System.out.print(binaryMatrix[i][j] + " ");
			System.out.println();
		}
	}
	
	/**
	 * Randomly fill matric with 0s or with 1s
	 * @param binaryMatrix
	 */
	public static void fillMatrix(int[][] binaryMatrix)
	{
		Random binaryNumber = new Random();
		
		for (int i = 0; i < binaryMatrix.length; i++)
			for (int j = 0; j < binaryMatrix[i].length; j++)
				binaryMatrix[i][j] = binaryNumber.nextInt(2);
	}
}
