package Chapter_08_Multidimensional_Arrays;
import java.util.Scanner;
import java.util.Random;

/**
 * Algebra: add two matrices
 * Write a method to add two matrices. The header of the method is as follows: 
 * public static double[][] addMatrix(double[][] a, double[][] b)
 * In order to be added, the two matrices must have the same dimensions and the same or compatible types of elements. 
 * Let c be the resulting matrix. Each element cij is aij + bij.
 * Write a test program that prompts the user to enter two 3 * 3 matrices and displays their sum.
 * 
 * 02/25/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_05 
{
	static Scanner input = new Scanner(System.in);
	static final int ROW = 3;
	static final int COLUMN = 3;
	public static void main(String[] args) 
	{
		double[][] matrixA = new double[ROW][COLUMN];
		double[][] matrixB = new double[ROW][COLUMN];
		insertNumbers(matrixA);
		insertNumbers(matrixB);
		System.out.println("Print 1st Matrix:");
		printMatrix(matrixA);
		System.out.println("Print 2nd Matrix:");
		printMatrix(matrixB);
		double[][] matrixC = new double[ROW][COLUMN];
		matrixC = addMatrix(matrixA, matrixB);
		System.out.println("Print 3rd Matrix:");
		printMatrix(matrixC);
	}
	
	/**
	 * Adds two matrix and return it back to a new matrix
	 * @param a
	 * @param b
	 * @return
	 */
	public static double[][] addMatrix(double[][] a, double[][] b)
	{
		double[][] tempmatrix = new double[ROW][COLUMN];
		
		for (int i = 0; i < ROW; i++)
		{
			for (int j = 0; j < COLUMN; j++)
			{
				tempmatrix[i][j] = a[i][j] + b[i][j];
			}
		}
		
		return tempmatrix;
	}
	
	/**
	 * Insert random double data type number into the matrix
	 * @param matrix
	 */
	public static void insertNumbers(double[][] matrix)
	{
		Random rand = new Random();
		
		for (int i = 0; i < ROW; i++)
		{
			for (int j = 0; j < COLUMN; j++)
			{
				matrix[i][j] = rand.nextDouble() * 10;
			}
		}
	}
	
	/**
	 * Prints the matrix
	 * @param matrix
	 */
	public static void printMatrix(double[][] matrix)
	{
		for (int i = 0; i < ROW; i++)
		{
			for (int j = 0; j < COLUMN; j++)
			{
				System.out.printf("%.1f %-1s", matrix[i][j], " ");
			}
			System.out.println();
		}
	}
}
