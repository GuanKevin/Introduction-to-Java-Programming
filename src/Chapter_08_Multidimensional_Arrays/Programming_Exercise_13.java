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
 * 10/05/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_13 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		Random randomSize = new Random();
		double[][] matrix = new double[randomSize.nextInt(7) + 1][randomSize.nextInt(7) + 1];
		setMatrix(matrix);
		displayMatrix(matrix);
		int[] points = locateLargest(matrix);
		
		System.out.printf("Largest element is: %.2f \nCoordinates: [%d, %d]",  matrix[points[0]][points[1]], points[0], points[1]);	
		
		input.close();
	}
	
	/**
	 * Display all elements in the matrix
	 * 
	 * @param matrix
	 */
	public static void displayMatrix(double[][] matrix)
	{
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[i].length; j++)
				System.out.printf("[ %.2f ]", matrix[i][j]);
			System.out.println();
		}
	}
	
	/**
	 * Set random double data type numbers into the matrix
	 * 
	 * @param matrix
	 */
	public static void setMatrix(double[][] matrix)
	{
		Random randomElements = new Random();
		
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[i].length; j++)
				matrix[i][j] = randomElements.nextDouble() * 100;
	}
	
	/**
	 * Return value is a one-dimensional array that contains two elements. 
	 * 
	 * @param a
	 * @return
	 */
	public static int[] locateLargest(double[][] matrix) 
	{
		double number = 0;
		int[] tempPoints = new int[2];
		
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[i].length; j++)
				if (number < matrix[i][j])
				{
					number = matrix[i][j];
					tempPoints[0] = i;
					tempPoints[1] = j;
				}
		return tempPoints;
	}
}
