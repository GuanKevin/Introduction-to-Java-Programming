package Chapter_08_Multidimensional_Arrays;
import java.util.Scanner;
import java.util.Random;

/**
 * Sum the major diagonal in a matrix
 * Write a method that sums all the numbers in the major diagonal in an n * n matrix of double values using the following header: 
 * public static double sumMajorDiagonal(double[][] m) 
 * Write a test program that reads a 4-by-4 matrix and displays the sum of all its elements on the major diagonal. 
 * 
 * 09/30/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_02 
{	
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a size: ");
		int size = input.nextInt();
		int[][] majorDiagonalArray = new int[size][size];
		
		inputNumbers(majorDiagonalArray);
		displayMatrix(majorDiagonalArray);
		sumMajorDiagonal(majorDiagonalArray);
	}
	
	/**
	 * Display matrix
	 * 
	 * @param majorDiagonalArray
	 */
	public static void displayMatrix(int[][] majorDiagonalArray)
	{
		for (int i = 0; i < majorDiagonalArray.length; i++)
		{
			for (int j = 0; j < majorDiagonalArray[i].length; j++)
				System.out.print(majorDiagonalArray[i][j] + " ");
			System.out.println();
		}
	}
	
	/**
	 * Find the sum of the major diagonal of the matrix
	 * 
	 * @param majorDiagonalArray
	 */
	public static void sumMajorDiagonal(int[][] majorDiagonalArray)
	{
		int sum = 0;
		
		for (int i = 0; i < majorDiagonalArray.length; i++)
			sum += majorDiagonalArray[i][i];
		
		System.out.print("The major diagonal is " + sum);
	}
	
	/**
	 * Store numbers into the array
	 * @param majorDiagonalArray
	 */
	public static void inputNumbers(int[][] majorDiagonalArray)
	{
		Random randNumber = new Random();
		
		for (int i = 0; i < majorDiagonalArray.length; i++)
			for (int j = 0; j < majorDiagonalArray[i].length; j++)
				majorDiagonalArray[i][j] = randNumber.nextInt(10);
	}
}
