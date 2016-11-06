package Chapter_08_Multidimensional_Arrays;
import java.util.Scanner;
import java.util.Random;

/**
 * Largest row and column
 * Write a program that randomly fills in 0s and 1s into a 4-by-4 matrix, prints the matrix, 
 * and finds the first row and column with the most 1s.
 * 
 * 10/05/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_10 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int[][] binaryMatrix = new int[4][4];
		fillBinary(binaryMatrix);
		displayMatrix(binaryMatrix);
		countHorizontal(binaryMatrix);
		countVertical(binaryMatrix);
		
		input.close();
	}
	
	/**
	 * Display column with the most 1's and display how many1s are in that column
	 * 
	 * @param binaryMatrix
	 */
	public static void countVertical(int[][] binaryMatrix)
	{
		int[] mostOne = new int[2];
		int oneCounter = 0;
		
		for (int i = 0; i < binaryMatrix.length; i++)
		{
			for(int j = 0; j < binaryMatrix[i].length; j++)
				if (binaryMatrix[j][i] == 1)
					oneCounter++;
			
			if (mostOne[0] < oneCounter)
			{
				mostOne[0] = oneCounter;
				mostOne[1] = i;
			}
			oneCounter = 0;
		}
		
		System.out.println("Column " + mostOne[1] + " have " + mostOne[0] + " 1s.");
	}
	
	/**
	 * Display the row with the most 1's and display how many 1s are in that row
	 * @param binaryMatrix
	 */
	public static void countHorizontal(int[][] binaryMatrix)
	{
		int[] mostOne = new int[2];
		int oneCounter = 0;
		
		for (int i = 0; i < binaryMatrix.length; i++)
		{
			for(int j = 0; j < binaryMatrix[i].length; j++)
				if (binaryMatrix[i][j] == 1)
					oneCounter++;
			
			if (mostOne[0] < oneCounter)
			{
				mostOne[0] = oneCounter;
				mostOne[1] = i;
			}
			oneCounter = 0;
		}
		
		System.out.println("Row " + mostOne[1] + " have " + mostOne[0] + " 1s.");
	}
	
	/**
	 * Display the 2d array
	 * 
	 * @param binaryMatrix
	 */
	public static void displayMatrix(int[][] binaryMatrix)
	{
		for (int i = 0; i < binaryMatrix.length; i++)
		{
			for(int j = 0; j < binaryMatrix[i].length; j++)
				System.out.printf("[ %d ]", binaryMatrix[i][j]);
			System.out.println();
		}
	}
	
	/**
	 * Fill matrix with 0s and 1s
	 * 
	 * @param binaryMatrix
	 */
	public static void fillBinary(int[][] binaryMatrix)
	{
		Random randomBinary = new Random();
		
		for (int i = 0; i < binaryMatrix.length; i++)
			for(int j = 0; j < binaryMatrix[i].length; j++)
				binaryMatrix[i][j] = randomBinary.nextInt(2); 
	}
}
