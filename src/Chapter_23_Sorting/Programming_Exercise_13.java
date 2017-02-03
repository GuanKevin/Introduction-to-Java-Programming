package Chapter_23_Sorting;

import utilities.SortMethods;

/**
 * Execution time for sorting
 * Write a program that obtains the execution time of selection sort, bubble sort, merge sort, quick sort, heap sort, 
 * and radix sort for input size 50,000, 100,000, 150,000, 200,000, 250,000, and 300,000.
 * long startTime = System.currentTimeMillis(); 
 * perform the task; 
 * long endTime = System.currentTimeMillis(); 
 * long executionTime = endTime - startTime;
 * The text gives a recursive quick sort. Write a nonrecursive version in this exercise.
 * 
 * 01/
 * @author kevgu
 *
 */

public class Programming_Exercise_13 
{
	public static void main(String[] args) 
	{
		System.out.printf("%5s%5s%10s%10s%10s%10s%10s%10s\n", 
				"Array", "|", "Selection", "Bubble", "Merge", "Quick", "Heap", "Radix");
		System.out.printf("%s%6s%10s%10s%10s%10s%10s%10s\n", 
				"size", "|", "Sort", "Sort", "Sort", "Sort", "Sort", "Sort");
		System.out.println("----------------------------------------------------------------------");
		
		int number = 50000;
		SortMethods sort = new SortMethods(number);
		for (int i = 0; i < 6; i++)
		{
			System.out.printf("%-9d%s%10d%10d%10d%10d%10d%10d\n", 
					number, "|", sort.selectionSort(), sort.bubbleSort(), sort.mergeSort(), sort.quickSort(), sort.heapSort(), sort.radixSort());
			number += 50000;
			sort = new SortMethods(number);
		}
	}
}
