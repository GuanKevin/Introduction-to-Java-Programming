package Chapter_07_Single_Dimensional_Arrays;
import java.util.Scanner;
import java.util.Random;

/**
 * Revise selection sort
 * In Section 7.11, you used selection sort to sort an array. 
 * The selection-sort method repeatedly finds the smallest number in the current array and swaps it with the first. 
 * Rewrite this program by finding the largest number and swapping it with the last. 
 * Write a test program that reads in ten double numbers, invokes the method, and displays the sorted numbers.
 * 
 * 02/22/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_20 
{
	static Scanner input = new Scanner(System.in);
	static final int SIZE = 10;
	static Random rand = new Random();
	public static void main(String[] args) 
	{
		double[] myarray = new double[SIZE];
		insertNumbers(myarray);
		System.out.println("Array before sort: ");
		displayArray(myarray);
		selectionSort(myarray);
		System.out.println("Array after sort: ");
		displayArray(myarray);
	}
	
	public static void displayArray(double[] myarray)
	{
		for (int i = 0; i < myarray.length; i++)
		{
			System.out.printf("%.2f %-1s", myarray[i], " ");
		}
		System.out.println();
	}
	
	/**
	 * Uses selection sort to sort the array
	 * Gets the highest number and swap it with the last number in the array
	 * @param myarray
	 */
	public static void selectionSort(double[] myarray)
	{
		int index = 0;
		double temp;
		
		for (int i = 0; i < myarray.length; i++)
		{
			for (int j = myarray.length - 1; j >= 0; j--)
			{
				index = findLargest(myarray, j) ;
				
				temp = myarray[index];
				myarray[index] = myarray[j];
				myarray[j] = temp;
				
			}
		}
	}
	
	/**
	 * Find the largest double number in the array and return it
	 * @param myarray
	 * @return
	 */
	public static int findLargest(double[] myarray, int current)
	{
		int index = 0;
		
		for (int i = 0; i <= current; i++)
		{
			if (myarray[index] < myarray[i])
			{
				index = i;
			}
		}
		
		return index;
	}
	
	/**
	 * Stores numbers inside array
	 * @param myarray
	 */
	public static void insertNumbers(double[] myarray)
	{
		for (int i = 0; i < myarray.length; i++)
		{
			myarray[i] = rand.nextDouble() * 10;
		}
	}
}
