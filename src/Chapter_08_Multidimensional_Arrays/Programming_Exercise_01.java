package Chapter_08_Multidimensional_Arrays;
import java.util.Scanner;
import java.util.Random;

/**
 * Sum elements column by column
 * Write a method that returns the sum of all the elements in a specified column in a matrix using the following header:
 * public static double sumColumn(double[][] m, int columnIndex)
 * Write a test program that reads a 3-by-4 matrix and displays the sum of each column.
 * 
 * 02/25/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_01 
{
	static Scanner input = new Scanner(System.in);
	static final int ROW = 3;
	static final int COLUMN = 4;
	
	public static void main(String[] args) 
	{
		double[][] mymatrix = new double[ROW][COLUMN];
		insertNumbers(mymatrix);
		displayMatrix(mymatrix);
		getColumnSum(mymatrix);
	}
	
	public static double sumColumn(double[][] m, int columnIndex)
	{
		double sum = 0;
		
		for (int i = 0; i < ROW; i++)
		{
			sum += m[i][columnIndex];
		}
		
		return sum;
	}
	
	/**
	 * Print out the sum of each column
	 * @param mymatrx
	 */
	public static void getColumnSum(double[][] mymatrix)
	{
		for (int i = 0; i < COLUMN; i++)
		{
			System.out.printf("%s %s %s %.2f %s", "The sum of column " , i, " is ", sumColumn(mymatrix, i), "\n");
		}
	}
	
	/**
	 * Insert random numbers into the matrix
	 * 3 by 4, Row by Column
	 * x x x x
	 * x x x x
	 * x x x x
	 * @param myarray
	 */
	public static void insertNumbers(double[][] myarray)
	{
		Random rand = new Random();
		
		for (int i = 0; i < ROW; i++)
		{
			for (int j = 0; j < COLUMN; j++)
			{
				myarray[i][j] = rand.nextDouble() * 10;
			}
		}
	}
	
	/**
	 * Display each number in the matrix
	 * @param myarray
	 */
	public static void displayMatrix(double[][] myarray)
	{
		for (int i = 0; i < ROW; i++)
		{
			for (int j = 0; j < COLUMN; j++)
			{
				System.out.printf("%.2f %-1s", myarray[i][j], " ");
			}
			System.out.println();
		}	
	}
}
