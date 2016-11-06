package Chapter_08_Multidimensional_Arrays;

import java.util.Random;
import java.util.Scanner;

/**
 * Algebra: add two matrices
 * Write a method to add two matrices. The header of the method is as follows: 
 * public static double[][] addMatrix(double[][] a, double[][] b)
 * In order to be added, the two matrices must have the same dimensions and the same or compatible types of elements. 
 * Let c be the resulting matrix. Each element cij is aij + bij.
 * Write a test program that prompts the user to enter two 3 * 3 matrices and displays their sum.
 * 
 * 10/03/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_05 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int row = 3, column = 3;
		double[][] matrix1 = new double[row][column], matrix2 = new double[row][column];
		
		setMatrixNumbers(matrix1);
		setMatrixNumbers(matrix2);
		
		if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length)
			displayMatrices(matrix1, matrix2, addMatrix(matrix1, matrix2));
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
	
	public static double[][] addMatrix(double[][] a, double[][] b)
	{
		double[][] tempMatrix = new double[a.length][a[0].length];
		
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[i].length; j++)
				tempMatrix[i][j] = a[i][j] + b[i][j];
		
		return tempMatrix;
	}
}
