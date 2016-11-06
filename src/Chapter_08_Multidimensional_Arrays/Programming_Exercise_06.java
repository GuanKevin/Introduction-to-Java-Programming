package Chapter_08_Multidimensional_Arrays;

import java.util.Random;
import java.util.Scanner;

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
 * 10/03/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_06 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int row = 3, column = 3;
		double[][] matrix1 = new double[row][column], matrix2 = new double[row][column];
		
		setMatrixNumbers(matrix1);
		setMatrixNumbers(matrix2);
		
		if (matrix1[0].length == matrix2.length)
			displayMatrices(matrix1, matrix2, multiplyMatrix(matrix1, matrix2));
		else
			System.out.print("Incompatible dimensions!");
		
		input.close();
	}
	
	/**
	 * Display the matrix
	 * 
	 * @param matrix1
	 * @param matrix2
	 */
	public static void displayMatrices(double[][] matrix1, double[][]matrix2, double[][]matrix3)
	{
		for (int i = 0; i < matrix1.length; i++)
		{
			for (int j = 0; j < matrix1[i].length; j++)
				System.out.printf("[%.2f] ", matrix1[i][j]);
			
			if ((matrix1.length  -1 ) / 2  == i)
				System.out.printf("%-3s", '+');
			else
				System.out.printf("%-3s", "");
			
			for (int j = 0; j < matrix2[i].length; j++)
				System.out.printf("[%.2f] ", matrix2[i][j]);
			
			if ((matrix1.length  -1 ) / 2  == i)
				System.out.printf("%-3s", '=');
			else
				System.out.printf("%-3s", "");
			
			for (int j = 0; j < matrix3[i].length; j++)
				System.out.printf("[%.2f] ", matrix3[i][j]);
			
			System.out.println();
			
		}
	}
	
	/**
	 * Set numbers for matrix
	 * 
	 * @param matrix
	 */
	public static void setMatrixNumbers(double[][] matrix)
	{
		Random randomNumber = new Random();
		
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[i].length; j++)
				matrix[i][j] = randomNumber.nextDouble() * 5;
	}
	
	/**
	 * Multiplying two matrices
	 * cij = ai1 * b1j + ai2 * b2j + ai3 * b3j.
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static double[][] multiplyMatrix(double[][] a, double[][] b)
	{
		double[][] tempMatrix = new double[a.length][a[0].length];
		
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[i].length; j++)
				tempMatrix[i][j] = (a[i][0] * b[0][j]) + (a[i][1] * b[1][j]) + (a[i][2] * b[2][j]);
		
		return tempMatrix;
	}
}
