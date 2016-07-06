package Chapter_08_Multidimensional_Arrays;
import java.util.Scanner;
import java.util.Random;

/**
 * Largest row and column
 * Write a program that randomly fills in 0s and 1s into a 4-by-4 matrix, prints the matrix, 
 * and finds the first row and column with the most 1s.
 * 
 * 02/25/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_10 
{
	static Scanner input = new Scanner(System.in);
	static final int ROW = 4;
	static final int COLUMN = 4;
	public static void main(String[] args) 
	{
		int[][] mymatrix = new int[ROW][COLUMN];		
		binaryFillIn(mymatrix);
		printMatrix(mymatrix);
		int row = largestRow(mymatrix);
		int column = largestCol(mymatrix);
		
		System.out.println("The column with the most 1s is " + column);
		System.out.println("The row with the most 1s is " + row);
	}
	
	/**
	 * Return the index of the row with the most 1s
	 * @param mymatrix
	 */
	public static int largestRow(int[][] mymatrix)
	{
		int counter = 0;
		int index = 0;
		int sum = 0;
		
		for (int i = 0; i < ROW; i++)
		{
			for (int j = 0; j < COLUMN; j++)
			{
				if (mymatrix[i][j] == 1)
				{
					counter++;
				}
			}
			if (counter > sum)
			{
				sum = counter;
				index = i;
			}
			counter = 0;
		}
		
		return index;
	}
	
	/**
	 * Return the index of the column with the most 1s
	 * @param mymatrix
	 */
	public static int largestCol(int[][] mymatrix)
	{
		int counter = 0;
		int index = 0;
		int sum = 0;
		
		for (int i = 0; i < ROW; i++)
		{
			for (int j = 0; j < COLUMN; j++)
			{
				if (mymatrix[j][i] == 1)
				{
					counter++;
				}
			}
			if (counter > sum)
			{
				sum = counter;
				index = i;
			}
			counter = 0;
		}
		
		return index;
	}
	
	/**
	 * Print out the matrix
	 * @param mymatrix
	 */
	public static void printMatrix(int[][] mymatrix)
	{
		for (int i = 0; i < ROW; i++)
		{
			for (int j = 0; j < COLUMN; j++)
			{
				System.out.print(mymatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	/**
	 * Fills in 2-dimensional array with random 0s or 1s
	 * @param mymatrix
	 */
	public static void binaryFillIn(int[][] mymatrix)
	{
		Random rand = new Random();
		
		for (int i = 0; i < ROW; i++)
		{
			for (int j = 0; j < COLUMN; j++)
			{
				mymatrix[i][j] = rand.nextInt(2);
			}
		}
	}
}
