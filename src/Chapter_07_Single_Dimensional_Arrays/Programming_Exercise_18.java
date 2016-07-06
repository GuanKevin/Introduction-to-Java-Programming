package Chapter_07_Single_Dimensional_Arrays;
import java.util.Scanner;
import java.util.Random;

/**
 * Bubble sort
 * Write a sort method that uses the bubble-sort algorithm. 
 * The bubblesort algorithm makes several passes through the array. 
 * On each pass, successive neighboring pairs are compared. 
 * If a pair is not in order, its values are swapped; otherwise, the values remain unchanged. 
 * The technique is called a bubble sort or sinking sort because the smaller values gradually “bubble” their way to the top 
 * and the larger values “sink” to the bottom. 
 * Write a test program that reads in ten double numbers, invokes the method, and displays the sorted numbers.
 * 
 * 02/21/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_18 
{
	static Scanner input = new Scanner(System.in);
	static final int SIZE = 10;
	
	public static void main(String[] args) 
	{
		double[] myarray = new double[SIZE];
		insertRandomNumbers(myarray);
		System.out.print("My array before being sorted: ");
		printArray(myarray);
		bubbleSort(myarray);
		System.out.print("My array after bubble sort: ");
		printArray(myarray);
	}
	
	/**
	 * Sort the array using bubble sort. Takes o(n^2) run time
	 * @param myarray
	 */
	public static void bubbleSort(double[] myarray)
	{
		double temp;
		
		for (int i = 0; i < myarray.length - 1; i++)
		{
			for (int j = 0; j < myarray.length - 1; j++)
			{
				if (myarray[j] > myarray[j + 1])
				{
					temp = myarray[j];
					myarray[j] = myarray[j + 1];
					myarray[j + 1] = temp;
				}
			}
		}
	}
	
	/**
	 * Insert random double numbers into the array
	 * @param myarray
	 */
	public static void insertRandomNumbers(double[] myarray)
	{
		Random rand = new Random();
		
		for (int i = 0; i < myarray.length; i++)
		{
			myarray[i] = rand.nextDouble() * 10;
		}
	}
	
	/**
	 * Prints out the numbers in the array
	 * @param myarray
	 */
	public static void printArray(double[] myarray)
	{
		for (int i = 0; i < myarray.length; i++)
		{
			System.out.printf("%.2f %-1s", myarray[i], " ");
		}
		System.out.println();
	}
}
