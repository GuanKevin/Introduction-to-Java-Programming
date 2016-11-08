package Chapter_09_Objects_and_Classes;

import java.util.Random;
import java.util.Scanner;

/**
 * The Location class
 * Design a class named Location for locating a maximal value and its location in a two-dimensional array. 
 * The class contains public data fields row, column, and maxValue that store the maximal value 
 * and its indices in a two-dimensional array with row and column as int types and maxValue as a double type. 
 * Write the following method that returns the location of the largest element in a two-dimensional array:
 * public static Location locateLargest(double[][] a)
 * The return value is an instance of Location. 
 * Write a test program that prompts the user to enter a two-dimensional array and displays the location of the largest element in the array.
 * 
 * 11/07/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_13 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter row and column of matrix: ");
		double[][] matrix = generateMatrix(input.nextInt(), input.nextInt());
		displayMatrix(matrix);
		Location location = Location.locateLargest(matrix);
		System.out.println("(" + location.row + "," + location.column + ") " + location.maxValue);
		
		input.close();
	}
	
	public static void displayMatrix(double[][] matrix)
	{
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[i].length; j++)
				System.out.printf("%3.1f ", matrix[i][j]);
			System.out.println();
		}
	}
	
	public static double[][] generateMatrix(int row, int column)
	{
		Random randomDouble = new Random();
		double[][] matrix = new double[row][column];
		
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[i].length; j++)
				matrix[i][j] = randomDouble.nextDouble() * 10;
		
		return matrix;
	}
}

class Location
{
	int row, column;
	double maxValue;
	
	public static Location locateLargest(double[][] matrix)
	{
		Location location = new Location();
		location.maxValue = 0;
		
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[i].length; j++)
				if (location.maxValue < matrix[i][j])
				{
					location.maxValue = matrix[i][j];
					location.row = i;
					location.column = j;
				}
		return location;
	}
}