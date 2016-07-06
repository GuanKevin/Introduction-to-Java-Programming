package Chapter_08_Multidimensional_Arrays;
import java.util.Scanner;
import java.util.Random;

/**
 * Algebra: multiply two matrices
 * Write a method to multiply two matrices. The header of the method is: 
 * public static double[][] multiplyMatrix(double[][] a, double[][] b)
 * To multiply matrix a by matrix b, the number of columns in a must be the same as the number of rows in b, 
 * and the two matrices must have elements of the same or compatible types. 
 * Let c be the result of the multiplication. Assume the column size of matrix a is n. 
 * Each element cij = ai1 * b1j + ai2 * b2j + ai3 * b3j.
 * Write a test program that prompts the user to enter two 3 * 3 matrices and displays their product.
 * 
 * 02/25/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_06 
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
		System.out.println("Matrix A");
		printMatrix(matrixA);
		System.out.println("Matrix B");
		printMatrix(matrixB);
		double[][] matrixC = new double[ROW][COLUMN];
		matrixC = multiplyMatrix(matrixA, matrixB);
		System.out.println("Matrix C");
		printMatrix(matrixC);
	}
	
	/**
	 * cij = ai1 * b1j + ai2 * b2j + ai3 * b3j.
	 * Multiply two matrix and return the new matrix 
	 * @param a
	 * @param b
	 * @return
	 */
	public static double[][] multiplyMatrix(double[][] a, double[][] b)
	{
		double[][] matrix = new double[ROW][COLUMN];
		
		for (int i = 0; i < ROW; i++)
		{
			for (int j = 0; j < COLUMN; j++)
			{
				matrix[i][j] = ((a[i][0] * b[0][j]) + (a[i][1] * b[1][j]) + (a[i][2] * b[2][j]));
			}
		}
		
		return matrix;
	}
	
	/**
	 * Input random double data type numbers into the matrix
	 * @param matrix
	 */
	public static void insertNumbers(double[][] matrix)
	{
		Random rand = new Random();
		
		for (int i = 0; i < ROW; i++)
		{
			for (int j = 0; j < COLUMN; j++)
			{
				matrix[i][j] = rand.nextDouble() * 5;
			}
		}
	}
	
	/**
	 * Print out the matrix
	 * @param matrix
	 */
	public static void printMatrix(double[][] matrix)
	{
		for (int i = 0; i < ROW; i++)
		{
			for (int j = 0; j < COLUMN; j++)
			{
				System.out.printf("%.2f %-1s", matrix[i][j], " ");
			}
			System.out.println();
		}
	}
}
