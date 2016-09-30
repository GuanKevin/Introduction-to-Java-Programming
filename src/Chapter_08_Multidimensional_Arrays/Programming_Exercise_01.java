package Chapter_08_Multidimensional_Arrays;

import java.util.Random;
import java.util.Scanner;

/**
 * Sum elements column by column
 * Write a method that returns the sum of all the elements in a specified column in a matrix using the following header:
 * public static double sumColumn(double[][] m, int columnIndex)
 * Write a test program that reads a 3-by-4 matrix and displays the sum of each column.
 * 
 * 09/28/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_01 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the row by column size: ");
		int row = input.nextInt();
		int column = input.nextInt();
		double[][] sumCBCArray = new double[row][column];
		
		fillMatrix(sumCBCArray);
		displayMDArray(sumCBCArray);
		System.out.print("Which column do you want to sum (0 - " + (sumCBCArray[0].length - 1) + "): ");
		int columnIndex = input.nextInt();
		System.out.printf("The sum of column " + columnIndex + " is %.2f", sumColumn(sumCBCArray, columnIndex));
		
		input.close();
	}
	
	public static void displayMDArray(double[][] sumCBCArray)
	{
		System.out.print("       ");
		for (int i = 0; i < sumCBCArray[0].length; i++)
			System.out.printf("%s %-3d", "Column", i);
		System.out.println();
		
		for (int i = 0; i < sumCBCArray.length; i++)
		{
			System.out.print("Row " + i + "  ");
			for (int j = 0; j < sumCBCArray[i].length; j++)
				System.out.printf("%-10.2f", sumCBCArray[i][j]);
			System.out.println();
		}
	}
	
	public static void fillMatrix(double[][] sumCBCArray)
	{
		Random randomNumber = new Random();
		
		for (int i = 0; i < sumCBCArray.length; i++)
			for (int j = 0; j < sumCBCArray[i].length; j++)
				sumCBCArray[i][j] = randomNumber.nextDouble() * 10;
	}
	
	public static double sumColumn(double[][] m, int columnIndex)
	{
		double sum = 0;
		
		for (int i = 0; i < m.length; i++)
			sum += m[i][columnIndex];
		
		return sum;
	}
}
