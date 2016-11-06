package Chapter_08_Multidimensional_Arrays;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Column sorting
 * Implement the following method to sort the columns in a two-dimensional array. 
 * A new array is returned and the original array is intact. 
 * public static double[][] sortColumns(double[][] m)
 * Write a test program that prompts the user to enter a 3 * 3 matrix of double values and displays a new column-sorted matrix.
 * 
 * 10/27/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_27 
{
	public static void main(String[] args) 
	{
		double[][] matrix = enterMatrix();
		System.out.println("After sort: ");
		displayMatrix(sortColumns(matrix));
	}
	
	/**
	 * Sort the columns in a two-dimensional array
	 * A new array is returned and the original array is intact.
	 * 
	 * @param m
	 * @return
	 */
	public static double[][] sortColumns(double[][] m)
	{
		double[][] tempMatrix = new double[m.length][m.length];
		System.arraycopy(m, 0, tempMatrix, 0, m.length);
		
		for (int i = 0; i < m.length; i++)
		{
			double[] tempArray = new double[m[i].length];
			
			for (int j = 0; j < m[i].length; j++)
				tempArray[j] = m[j][i];
			
			Arrays.sort(tempArray);
			
			for (int j = 0; j < m[i].length; j++)
				m[j][i] = tempArray[j];
		}
		
		return tempMatrix;
	}
	
	/**
	 * Display the matrix
	 * 
	 * @param matrix
	 */
	public static void displayMatrix(double[][] matrix)
	{
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[i].length; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
				
	}
	
	/**
	 * Prompts the user to enter a 3 * 3 matrix of double values
	 * 
	 * @return
	 */
	public static double[][] enterMatrix()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter matrix: ");
		double[][] matrix = new double[3][3];
		
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[i].length; j++)
				matrix[i][j] = input.nextDouble(); 
		
		input.close();
		return matrix;
	}
}
