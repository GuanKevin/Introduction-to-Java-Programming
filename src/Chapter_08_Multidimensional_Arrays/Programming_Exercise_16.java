package Chapter_08_Multidimensional_Arrays;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Sort two-dimensional array
 * Write a method to sort a two-dimensional array using the following header: 
 * public static void sort(int m[][]) 
 * The method performs a primary sort on rows and a secondary sort on columns.
 * 
 * 10/21/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_16 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter size of array: ");
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[][] arrayToSort = new int[size][size];
		
		fillArray(arrayToSort);
		displayArray(arrayToSort);
		sort(arrayToSort);
		System.out.println();
		displayArray(arrayToSort);
		
		input.close();
	}
	
	/**
	 * Sort 2 dimensional array
	 * It first sorts the row
	 * Then it sorts the column
	 * 
	 * @param m
	 */
	public static void sort(int m[][])
	{
		for (int i = 0; i < m.length; i++)
			Arrays.sort(m[i]);
		
		for (int i = 0; i < m.length - 1; i++)
			for (int j = i + 1; j < m.length; j++)
				if (m[i][0] > m[j][0])
				{
					int[] tempArray = m[i];
					m[i] = m[j];
					m[j] = tempArray;
				}
	}
	
	/**
	 * Fill in the numbers for the array
	 * It will insert numbers between 0 to 99 in the 2-dimensional array
	 * 
	 * @param arrayToSort
	 */
	public static void fillArray(int[][] arrayToSort)
	{
		Random randomInteger = new Random();
		
		for (int i = 0; i < arrayToSort.length; i++)
			for (int j = 0; j < arrayToSort[i].length; j++)
				arrayToSort[i][j] = randomInteger.nextInt(100);
	}
	
	/**
	 * Display the 2-dimensional array
	 * 
	 * @param arrayToSort
	 */
	public static void displayArray(int[][] arrayToSort)
	{
		for (int i = 0; i < arrayToSort.length; i++)
		{
			for (int j = 0; j < arrayToSort[i].length; j++)
				System.out.print(arrayToSort[i][j] + " ");
			System.out.println();
		}			
	}
}
