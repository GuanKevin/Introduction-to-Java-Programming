package Chapter_08_Multidimensional_Arrays;

import java.util.Random;

/**
 * Game: find the flipped cell
 * Suppose you are given a 6-by-6 matrix filled with 0s and 1s. 
 * All rows and all columns have an even number of 1s. Let the user flip one cell (i.e., flip from 1 to 0 or from 0 to 1) 
 * and write a program to find which cell was flipped. 
 * Your program should prompt the user to enter a 6-by-6 array with 0s and 1s and find the first row r 
 * and first column c where the even number of the 1s property is violated (i.e., the number of 1s is not even). 
 * The flipped cell is at (r, c).
 * 
 * 10/26/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_23 
{
	public static void main(String[] args) 
	{
		int[][] binaryMatrix = new int[6][6];
		
		fillMatrix(binaryMatrix);
		displayMatrix(binaryMatrix);
		checkRowColumn(binaryMatrix);
	}
	
	/**
	 * Find the flipped cell
	 * find the first row r and first column c where the even number of the 1s property is violated
	 * 
	 * @param binaryMatrix
	 */
	public static void checkRowColumn(int[][] binaryMatrix)
	{
		int oneCounter = 0;
		
		System.out.print("The flipped cell is at (");
		
		for (int i = 0; i < binaryMatrix.length; i++)
		{
			for (int j = 0; j < binaryMatrix.length; j++)
				if (binaryMatrix[i][j] == 1)
					oneCounter++;
			if ((oneCounter % 2) != 0)
				{
					System.out.print(i);
					break;
				}
		}
		
		for (int i = 0; i < binaryMatrix.length; i++)
		{
			for (int j = 0; j < binaryMatrix.length; j++)
				if (binaryMatrix[j][i] == 1)
					oneCounter++;
			if ((oneCounter % 2) != 0)
				{
					System.out.print("," + i + ")");
					break;
				}
		}
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
