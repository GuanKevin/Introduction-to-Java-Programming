package Chapter_23_Sorting;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Improve quick sort
 * The quick sort algorithm presented in the book selects the first element in the list as the pivot. 
 * Revise it by selecting the median among the first, middle, and last elements in the list.
 * 
 * 02/09/2017
 * @author kevgu
 *
 */

public class Programming_Exercise_04 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size of list: ");
		Integer[] integerList = generateList(input.nextInt());
		System.out.println("List before quick sort: " + Arrays.toString(integerList));
		quickSort(integerList);
		System.out.println("List after quick sort: " + Arrays.toString(integerList));
		
		input.close();
	}
	
	public static <E extends Comparable<E>> void setMedianIndex(E[] list, int start, int last)
	{
		if (list[start].compareTo(list[(last + start) / 2]) == 1)
		{
			if (list[(last + start) / 2].compareTo(list[last]) == 1)
				swap(list, start, (last + start) / 2);
			else if (list[start].compareTo(list[last]) == 1)
				swap(list, start, last);
		}
		else
		{
			if (list[start].compareTo(list[last]) == 1)
				return;
			else if (list[(last + start) / 2].compareTo(list[last]) == 1)
				swap(list, 0, last);
		}
	}
	
	public static <E extends Comparable<E>> void swap(E[] list, int first, int median)
	{
		E tempObj = list[first];
		list[first] = list[median];
		list[median] = tempObj;
	}

	public static <E extends Comparable<E>> void quickSort(E[] list)
	{
		quickSort(list, 0, list.length - 1);
	}
	
	private static <E extends Comparable<E>> void quickSort(E[] list, int first, int last)
	{
		if (last > first)
		{
			int pivotIndex = partition(list, first, last);
			quickSort(list, first, pivotIndex - 1);
			quickSort(list, pivotIndex + 1, last);
		}
	}
	
	public static <E extends Comparable<E>> int partition(E[] list, int first, int last)
	{
		setMedianIndex(list, first, last);
		E pivot = list[first];
		int low = first + 1;
		int high = last;
		
		while (high > low)
		{
			while (low <= high && list[low].compareTo(pivot) <= 0)
				low++;
			while (low <= high && list[high].compareTo(pivot) == 1)
				high--;
			
			if (high > low)
			{
				E temp = list[high];
				list[high] = list[low];
				list[low] = temp;
			}
		}
		
		while (high > first && list[high].compareTo(pivot) >= 0)
			high--;
		
		if (pivot.compareTo(list[high]) == 1)
		{
			list[first] = list[high];
			list[high] = pivot;
			return high;
		}
		else
			return first;
	}
	
	public static Integer[] generateList(int size)
	{
		Integer[] tempList = new Integer[size];
		Random randNum = new Random();
		
		for (int i = 0; i < tempList.length; i++)
			tempList[i] = randNum.nextInt(100);
		
		return tempList;
	}
}