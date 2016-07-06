package Chapter_07_Single_Dimensional_Arrays;
import java.util.Scanner;

/**
 * Sorted?
 * Write the following method that returns true if the list is already sorted in increasing order. 
 * public static boolean isSorted(int[] list) 
 * Write a test program that prompts the user to enter a list and displays whether the list is sorted or not. 
 * 
 * 02/18/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_19 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{	
		System.out.print("Enter the size of the array: ");
		int size = input.nextInt();
		int[] myarray = new int[size];
		insertNumbers(myarray);
		if (isSorted(myarray))
		{
			System.out.print("The array is sorted!");
		}
		else
		{
			System.out.print("The array not is sorted!");
		}
		
	}
	
	public static boolean isSorted(int[] list) 
	{
		boolean sorted = true;
		for (int i = 0; i < list.length - 1; i++)
		{
			if (list[i] > list[i + 1])
			{
				sorted = false;
				break;
			}
		}
		
		return sorted;
	}
	
	/**
	 * It inserts user inputed number into the array
	 * @param myarray
	 */
	public static void insertNumbers(int[] myarray)
	{
		System.out.print("Enter " + myarray.length + " numbers: ");
		
		for (int i = 0; i < myarray.length; i++)
		{
			myarray[i] = input.nextInt();
		}
	}
}
