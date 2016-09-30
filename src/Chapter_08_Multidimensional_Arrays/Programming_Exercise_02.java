package Chapter_08_Multidimensional_Arrays;
import java.util.Scanner;
import java.util.Random;

/**
 * Sum the major diagonal in a matrix
 * Write a method that sums all the numbers in the major diagonal in an n * n matrix of double values using the following header: 
 * public static double sumMajorDiagonal(double[][] m) 
 * Write a test program that reads a 4-by-4 matrix and displays the sum of all its elements on the major diagonal. 
 * 
 * 09/29/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_02 
{
	static Scanner input = new Scanner(System.in);
	static int ROW = 4;
	static int COLUMN = 4;
	
	public static void main(String[] args) 
	{
		double[][] mymatrix = new double[ROW][COLUMN];
		insertNumbers(mymatrix);
		printMatrix(mymatrix);
		System.out.printf("%s %.2f", "The sum major diagonal of the matrix is ", sumMajorDiagonal(mymatrix));
	}
	
	/**
	 * Return the sum of the major diagonal
	 * ? x x x
	 * x ? x x
	 * x x ? x
	 * x x x ?
	 * @param m
	 * @return
	 */
	public static double sumMajorDiagonal(double[][] m)
	{
		double sum = 0;
		for (int i = 0; i < ROW; i++)
		{
			for (int j = 0; j < COLUMN; j++)
			{
				if (i == j)
				{
					sum += m[i][j];
				}
			}
		}
		
		return sum;
	}
	
	/**
	 * Insert random double data type numbers into the matrix
	 * @param mymatrix
	 */
	public static void insertNumbers(double[][] mymatrix)
	{
		Random rand = new Random();
		for (int i = 0; i < ROW; i++)
		{
			for (int j = 0; j < COLUMN; j++)
			{
				mymatrix[i][j] = rand.nextDouble() * 10;
			}
		}
	}
	
	/**
	 * Prints out the numbers in the matrix row by row
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
