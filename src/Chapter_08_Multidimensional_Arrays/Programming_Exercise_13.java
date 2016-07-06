package Chapter_08_Multidimensional_Arrays;
import java.util.Scanner;
import java.util.Random;

/**
 * Locate the largest element
 * Write the following method that returns the location of the largest element in a two-dimensional array. 
 * public static int[] locateLargest(double[][] a) 
 * The return value is a one-dimensional array that contains two elements. 
 * These two elements indicate the row and column indices of the largest element in the two-dimensional array. 
 * Write a test program that prompts the user to enter a two-dimensional array and displays the location of the largest element in the array.
 * 
 * 02/25/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_13 
{
	static Random rand = new Random();
	static Scanner input = new Scanner(System.in);
	static final int ROW = rand.nextInt(10) + 1;
	static final int COLUMN = rand.nextInt(10) + 1;
	public static void main(String[] args) 
	{
		double[][] mymatrix = new double[ROW][COLUMN];
		insertNumbers(mymatrix);
		printMatrix(mymatrix);
		int[] myarray = new int[2];
		myarray = locateLargest(mymatrix);
		System.out.println("The coordinates of the largest element is: [" + myarray[0] + "][" + myarray[1] +"]");
	}
	
	/**
	 * Returns the coordinates of the largest element in the matrix
	 * Returns X Y coordinates to an array
	 * @param a
	 * @return
	 */
	public static int[] locateLargest(double[][] a)
	{
		double largest = 0;
		int[] myarray = new int[2];
		
		for (int i = 0; i < ROW; i++)
		{
			for (int j = 0; j < COLUMN; j++)
			{
				if (largest < a[i][j])
				{
					largest = a[i][j];
					myarray[0] = i;
					myarray[1] = j;
				}
			}
		}
		
		return myarray;
	}
	
	/**
	 * Input random numbers into the matrix
	 * @param mymatrix
	 */
	public static void insertNumbers(double[][] mymatrix)
	{
		for (int i = 0; i < ROW; i++)
		{
			for (int j = 0; j < COLUMN; j++)
			{
				mymatrix[i][j] = rand.nextDouble() * 100;
			}
		}
	}
	
	/**
	 * Prints out the matrix
	 * @param mymatrix
	 */
	public static void printMatrix(double[][] mymatrix)
	{
		for (int i = 0; i < ROW; i++)
		{
			for (int j = 0; j < COLUMN; j++)
			{
				System.out.printf("%.2f %-1s", mymatrix[i][j], " ");
			}
			System.out.println();
		}
	}
}
