package Chapter_07_Single_Dimensional_Arrays;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Partition of a list
 * Write the following method that partitions the list using the first element, called a pivot. 
 * public static int partition(int[] list) 
 * After the partition, the elements in the list are rearranged so that all the elements before the pivot are less than or equal to the pivot 
 * and the elements after the pivot are greater than the pivot. 
 * The method returns the index where the pivot is located in the new list. 
 * For example, suppose the list is {5, 2, 9, 3, 6, 8}. 
 * After the partition, the list becomes {3, 2, 5, 9, 6, 8}. 
 * Implement the method in a way that takes at most list.length comparisons. 
 * Write a test program that prompts the user to enter a list and displays the list after the partition. 
 * Here is a sample run. Note that the first number in the input indicates the number of the elements in the list.
 * 
 * 09/27/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_32 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the list: ");
		int[] pivotArray = new int[input.nextInt()];
		
		insertNumber(pivotArray);
		System.out.print(Arrays.toString(pivotArray) + 
				"\nPivot index:" + partition(pivotArray) + 
				"\n" + Arrays.toString(pivotArray));
		
		input.close();
	}
	
	/**
	 * Passes random integers into the array
	 * 
	 * @param pivotArray
	 */
	public static void insertNumber(int[] pivotArray)
	{
		Random randNumber = new Random();
		
		for (int i = 0; i < pivotArray.length; i++)
			pivotArray[i] = randNumber.nextInt(100) + 1;
	}
	
	/**
	 * Method returns the index where the pivot is located in the new list. 
	 *  {2, 3, 5, 9, 6, 8}
	 *  pivot = 5;
	 *  pivotIndex = 0;
	 *  low = 1
	 *  
	 * @param list
	 * @return
	 */
	public static int partition(int[] list)
	{
		int pivot = list[0], pivotIndex = 0;
		
		for (int i = 1; i < list.length; i++)
		{
			int low = i;
			int tempNum;
			
			while (list[low] < pivot && pivotIndex < low)
			{
				tempNum = list[low];
				list[low] = list[low - 1];
				list[low - 1] = tempNum;
				low--;
				
			     if (low == pivotIndex)
			    	 pivotIndex = low + 1;
			}
		}
		
		return pivotIndex;
	}
}
