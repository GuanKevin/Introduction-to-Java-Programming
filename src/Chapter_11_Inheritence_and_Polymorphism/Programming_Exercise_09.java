package Chapter_11_Inheritence_and_Polymorphism;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Largest rows and columns
 * Write a program that randomly fills in 0s and 1s into an n-by-n matrix, prints the matrix, 
 * and finds the rows and columns with the most 1s. 
 * (Hint: Use two ArrayLists to store the row and column indices with the most 1s.)
 *
 * 12/05/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_09 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the size of the matrix: ");
		int[][] binaryMatrix = createMatrix(input.nextInt());
		displayMatrix(binaryMatrix);
		ArrayList<Integer> largestRowList = findLargestRow(binaryMatrix);
		ArrayList<Integer> largestColList = findLargestCol(binaryMatrix);
		
		System.out.println("Largest row is " + largestRowList.toString()
							+ "\nLargest column is " + largestColList.toString());
		
		input.close();
	}
	
	public static ArrayList<Integer> findLargestRow(int[][] binaryMatrix)
	{
		if (binaryMatrix.length == 0)
		{
			System.out.println("Matyrix is empty!");
			return new ArrayList<Integer>();
		}
		
		ArrayList<Integer> tempLargestRowList = new ArrayList<>();
		int largest = 0;
		
		for (int i = 0; i < binaryMatrix.length; i++)
		{
			int counter = 0;
			
			for (int j = 0; j < binaryMatrix[i].length; j++)
				if (binaryMatrix[i][j] == 1)
					counter++;
			
			if (counter > largest)
			{
				largest = counter;
				tempLargestRowList.clear();
				tempLargestRowList.add(i);
			}
			else if (counter == largest)
				tempLargestRowList.add(i);			
		}
		
		return tempLargestRowList;
	}
	
	public static ArrayList<Integer> findLargestCol(int[][] binaryMatrix)
	{
		if (binaryMatrix.length == 0)
		{
			System.out.println("Matyrix is empty!");
			return new ArrayList<Integer>();
		}
		
		ArrayList<Integer> tempLargestRowList = new ArrayList<>();
		int largest = 0;
		
		for (int i = 0; i < binaryMatrix.length; i++)
		{
			int counter = 0;
			
			for (int j = 0; j < binaryMatrix[i].length; j++)
				if (binaryMatrix[j][i] == 1)
					counter++;
			
			if (counter > largest)
			{
				largest = counter;
				tempLargestRowList.clear();
				tempLargestRowList.add(i);
			}
			else if (counter == largest)
				tempLargestRowList.add(i);			
		}
		
		return tempLargestRowList;
	}
	
	/**
	 * Display the matrix
	 * 
	 * @param binaryMatrix
	 */
	public static void displayMatrix(int[][] binaryMatrix)
	{
		for (int i = 0; i < binaryMatrix.length; i++)
		{
			for (int j = 0; j < binaryMatrix[i].length; j++)
				System.out.print(binaryMatrix[i][j] + " ");
			System.out.println();
		}
	}
	
	/**
	 * Create a n by n 2 dimensional array filled with 0s and 1s
	 * 
	 * @param size
	 * @return
	 */
	public static int[][] createMatrix(int size)
	{
		int[][] tempBinaryMatrix = new int[size][size];
		Random randBinary = new Random();
		
		for (int i = 0; i < tempBinaryMatrix.length; i++)
			for (int j = 0; j < tempBinaryMatrix[i].length; j++)
				tempBinaryMatrix[i][j] = randBinary.nextInt(2);
		
		return tempBinaryMatrix;
	}
}
