package Chapter_08_Multidimensional_Arrays;
import java.util.Scanner;
import java.util.Random;
/**
 * Explore matrix
 * Write a program that prompts the user to enter the length of a square matrix, randomly fills in 0s and 1s into the matrix, 
 * prints the matrix, and finds the rows, columns, and diagonals with all 0s or 1s.
 * 
 * 10/05/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_14 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{	
		System.out.print("Enter the size of the matrix: ");
		int size = input.nextInt();
		int[][] matrix = new int[size][size];
		setMatrix(matrix);
		displayMatrix(matrix);
		checkRow(matrix);
		checkColumn(matrix);
		checkDiagonal(matrix);
		
		input.close();
	}
	
	/**
	 * If major diagonal or minor diagonal have all 0s or all 1s, display that diagonal with the binary number
	 * 
	 * @param matrix
	 */
	public static void checkDiagonal(int[][] matrix)
	{
		int binaryNumber = matrix[0][0];
		int binaryCounter = 1;
		
		for (int j = 1; j < matrix.length; j++)
			if (binaryNumber == matrix[j][j])
				binaryCounter++;
			else
				break;
		
		if (binaryCounter == matrix.length)
			System.out.println("Major diagonal have all " + binaryNumber + "s.");
		
		binaryNumber = matrix[0][matrix.length - 1];
		binaryCounter = 1;
		
		for (int j = 1; j < matrix.length; j++)
			if (binaryNumber == matrix[j][matrix.length - 1 - j])
				binaryCounter++;
			else
				break;
		
		if (binaryCounter == matrix.length)
			System.out.println("Minor diagonal have all " + binaryNumber + "s.");
	}
	
	/**
	 * If row has all 0s or all 1s, display that row and the binary type
	 * 
	 * @param matrix
	 */
	public static void checkColumn(int[][] matrix)
	{				
		for (int i = 0; i < matrix.length; i++)
		{
			int binaryNumber = matrix[0][i];
			int binaryCounter = 1;
			
			for (int j = 1; j < matrix.length; j++)
				if (binaryNumber == matrix[j][i])
					binaryCounter++;
				else
					break;
			
			if (binaryCounter == matrix.length)
				System.out.println("Column " + i + " have all " + binaryNumber + "s.");
		}
	}
	
	/**
	 * If row has all 0s or all 1s, display that row and the binary type
	 * 
	 * @param matrix
	 */
	public static void checkRow(int[][] matrix)
	{				
		for (int i = 0; i < matrix.length; i++)
		{
			int binaryNumber = matrix[i][0];
			int binaryCounter = 1;
			
			for (int j = 1; j < matrix.length; j++)
				if (binaryNumber == matrix[i][j])
					binaryCounter++;
				else
					break;
			
			if (binaryCounter == matrix.length)
				System.out.println("Row " + i + " have all " + binaryNumber + "s.");
		}
	}
	
	/**
	 * Display all elements in the matrix
	 * 
	 * @param matrix
	 */
	public static void displayMatrix(int[][] matrix)
	{
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[i].length; j++)
				System.out.printf("[ %d ]", matrix[i][j]);
			System.out.println();
		}
	}
	
	/**
	 * Set random 0s or 1s into the matrix
	 * 
	 * @param matrix
	 */
	public static void setMatrix(int[][] matrix)
	{
		Random randomElements = new Random();
		
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[i].length; j++)
				matrix[i][j] = randomElements.nextInt(2);
	}
}
