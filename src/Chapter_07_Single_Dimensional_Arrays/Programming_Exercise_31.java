package Chapter_07_Single_Dimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

/** 
 * Merge two sorted lists
 * Write the following method that merges two sorted lists into a new sorted list. 
 * public static int[] merge(int[] list1, int[] list2)
 * Implement the method in a way that takes at most list1.length + list2. length comparisons. 
 * Write a test program that prompts the user to enter two sorted lists and displays the merged list. 
 * Here is a sample run. Note that the first number in the input indicates the number of the elements in the list. 
 * This number is not part of the list.
 * 
 * 09/26/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_31 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{		
		System.out.print("Enter the numbers for list1: ");
		int[] arrayList1 = new int[input.nextInt()];
		inputNumbers(arrayList1);
		
		System.out.print("Enter the numbers for list2: ");
		int[] arrayList2 = new int[input.nextInt()];
		inputNumbers(arrayList2);
		
		int[] mergedArrayList = merge(arrayList1, arrayList2);
		displayList(mergedArrayList);
		
		input.close();
	}
	
	/**
	 * Display every element in the array
	 * 
	 * @param mergedArrayList
	 */
	public static void displayList(int[] mergedArrayList)
	{
		for (int i = 0; i < mergedArrayList.length; i++)
			System.out.print(mergedArrayList[i] + " ");
	}
	
	/**
	 * Prompt the user to enter arrayList.length integers into the array
	 * 
	 * @param arrayList1
	 */
	public static void inputNumbers(int[] arrayList)
	{
		for (int i = 0; i < arrayList.length; i++)
			arrayList[i] = input.nextInt();
	}
	
	/**
	 * Merges two sorted lists into a new sorted list. 
	 * 
	 * @param list1
	 * @param list2
	 * @return
	 */
	public static int[] merge(int[] list1, int[] list2)
	{
		int[] mergedArrayList = new int[list1.length + list2.length];
		int icL1 = 0;							//index counter for array list 1;
		int icL2 = 0;							//index counter for array list 2;
		Arrays.sort(list1);
		Arrays.sort(list2);
		
		for (int i = 0; i < mergedArrayList.length; i++)
			if (icL1 < list1.length && icL2 < list2.length)
			{
				if (list1[icL1] < list2[icL2])
				{
					mergedArrayList[i] = list1[icL1];
					icL1++;
				}
				else
				{
					mergedArrayList[i] = list2[icL2];
					icL2++;
				}
			}
			else if (icL1 >= list1.length)
			{
				mergedArrayList[i] = list2[icL2];
				icL2++;
			}
			else
			{
				mergedArrayList[i] = list1[icL1];
				icL1++;
			}
		
		return mergedArrayList;
	}
}
