package Chapter_23_Sorting;

import java.util.Arrays;

import utilities.MergeSortRecursive;

/**
 * Modify merge sort
 * Rewrite the mergeSort method to recursively sort the first half of the array and the second half of the array without creating new temporary 
 * arrays, and then merge the two into a temporary array and copy its contents to the original array, as shown in Figure 23.6b.
 * 
 * 01/
 * @author kevgu
 *
 */

public class Programming_Exercise_20 
{
	public static void main(String[] args) 
	{
		int[] list = {10, 3, 5, 1, 2, 0}; 
		list = new MergeSortRecursive(list).mergeSort();
		System.out.println(Arrays.toString(list));
	}
}
