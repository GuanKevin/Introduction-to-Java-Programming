package Chapter_08_Multidimensional_Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Pattern recognition: four consecutive equal numbers
 * Write the following method that tests whether a two-dimensional array has four consecutive numbers of the same value, 
 * either horizontally, vertically, or diagonally. 
 * public static boolean isConsecutiveFour(int[][] values)
 * Write a test program that prompts the user to enter the number of rows and columns of a two-dimensional array 
 * and then the values in the array and displays true if the array contains four consecutive numbers with the same value. 
 * Otherwise, display false.
 * 
 * 10/22/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_19 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter size of array: ");
		int size = input.nextInt();
		
		while (size < 4)
		{
			System.out.print("Enter 4 or up: ");
			size = input.nextInt();
		}
		
		int[][] values = new int[size][size];
		
		fillArray(values);
		displayArray(values);
		
		if (isConsecutiveFour(values))
			System.out.print("Found consecutive four!");
		else
			System.out.print("Did not find consecutive four!");
		
		input.close();
	}
	
	/**
	 * Return true if the two-dimensional array has four consecutive numbers of the same value
	 * 
	 * @param values
	 * @return
	 */
	public static boolean isConsecutiveFour(int[][] values)
	{
		int number;
		
		//Check columns for consecutive fours
		for (int i = 0; i < values.length; i++)
			for (int j = 0; j < values[i].length - 3; j++)
			{
				int consecutiveCounter = 1;
				number = values[j][i];
				
				int k;
				for (k = j + 1; k <= (j + 3); k++)
					if (number == values[k][i])
						consecutiveCounter++;
					else
					{
						j = k - 1;
						break;
					}
				if (consecutiveCounter == 4)
				{
					System.out.println("Column " + i + " Row " + j + " to " + (k - 1));
					return true;
				}
			}
		
		//Check rows for consecutive fours
		for (int i = 0; i < values.length; i++)
			for (int j = 0; j < values[i].length - 3; j++)
			{
				int consecutiveCounter = 1;
				number = values[i][j];
				
				int k;
				for (k = j + 1; k <= (j + 3); k++)
					if (number == values[i][k])
						consecutiveCounter++;
					else
					{
						j = k - 1;
						break;
					}
				if (consecutiveCounter == 4)
				{
					System.out.println("Row " + i + " Column " + j + " to " + (k - 1));
					return true;
				}
			}
		
		//Check Major diagonal for consecutive four
		for (int i = 0; i < values.length - 3; i++)
			for (int j = 0; j < values.length - 3; j++)
			{
				int consecutiveCounter = 1;
				number = values[i][j];

				for (int k = i + 1, l = j + 1; k <= (i + 3); k++, l++)
					if (number == values[k][l])
						consecutiveCounter++;
					else
						break;
				if (consecutiveCounter == 4)
				{
					System.out.println("Major diagonal at row " + i + " column " + j);
					return true;
				}
			}
		
		//Check minor diagonal for consecutive four
		for (int i = 0; i < values.length; i++)
			for (int j = 3; j < values.length; j++)
			{
				int consecutiveCounter = 1;
				number = values[i][j];

				for (int k = i + 1, l = j - 1; k <= (i + 3); k++, l--)
					if (number == values[k][l])
						consecutiveCounter++;
					else
						break;
				if (consecutiveCounter == 4)
				{
					System.out.println("Minor diagonal at row " + i + " column " + j);
					return true;
				}
			}		
		
		return false;
	}
	
	/**
	 * Fill in the numbers for the array
	 * It will insert numbers between 0 to 99 in the 2-dimensional array
	 * 
	 * @param arrayToSort
	 */
	public static void fillArray(int[][] matrixArray)
	{
		Random randomInteger = new Random();
		
		for (int i = 0; i < matrixArray.length; i++)
			for (int j = 0; j < matrixArray[i].length; j++)
				matrixArray[i][j] = randomInteger.nextInt(3);
	}
	
	/**
	 * Display the 2-dimensional array
	 * 
	 * @param arrayToSort
	 */
	public static void displayArray(int[][] matrixArray)
	{
		for (int i = 0; i < matrixArray.length; i++)
		{
			for (int j = 0; j < matrixArray[i].length; j++)
				System.out.print(matrixArray[i][j] + " ");
			System.out.println();
		}			
	}
}
