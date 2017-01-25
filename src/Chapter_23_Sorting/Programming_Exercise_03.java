package Chapter_23_Sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

import utilities.GeometricObjectComparator;
import utilities.Square;

/**
 * Generic quick sort
 * Write the following two generic methods using quick sort. 
 * The first method sorts the elements using the Comparable interface and the second uses the Comparator interface. 
 * public static <E extends Comparable<E>> void quickSort(E[] list) 
 * public static <E> void quickSort(E[] list, Comparator<? super E> comparator)
 * 
 * 01/24/2017
 * @author kevgu
 *
 */

public class Programming_Exercise_03 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size of list: ");
		Integer[] integerList = generateList(input.nextInt());
		System.out.println("List before quick sort: " + Arrays.toString(integerList));
		quickSort(integerList);
		System.out.println("List after quick sort: " + Arrays.toString(integerList));
		
		Square[] square = {new Square(2.5), new Square(), new Square(5), new Square(5), new Square(2.9), new Square(9.5)};
		System.out.println("Objects before quick sort: ");
		for (int i = 0; i < square.length; i++)
			System.out.println(square[i].toString());
		System.out.println("Objects after quick sort: ");
		quickSort(square, new GeometricObjectComparator());
		for (int i = 0; i < square.length; i++)
			System.out.println(square[i].toString());
		
		input.close();
	}
	
	public static <E> void quickSort(E[] list, Comparator<? super E> comparator)
	{
		quickSort(list, 0, list.length - 1, comparator);
	}
	
	private static <E> void quickSort(E[] list, int first, int last, Comparator<? super E> comparator) 
	{
		if (last > first)
		{
			int pivotIndex = partition(list, first, last, comparator);
			quickSort(list, first, pivotIndex - 1, comparator);
			quickSort(list, pivotIndex + 1, last, comparator);
		}
	}

	public static <E> int partition(E[] list, int first, int last, Comparator<? super E> comparator)
	{
		E pivot = list[first];
		int low = first + 1;
		int high = last;
		
		while (high > low)
		{
			while (low <= high && comparator.compare(list[low], (pivot)) <= 0)
				low++;
			while (low <= high && comparator.compare(list[high], (pivot)) == 1)
				high--;
			
			if (high > low)
			{
				E temp = list[high];
				list[high] = list[low];
				list[low] = temp;
			}
		}
		
		while (high > first && comparator.compare(list[high], (pivot)) >= 0)
			high--;
		
		if (comparator.compare(pivot, (list[high])) == 1)
		{
			list[first] = list[high];
			list[high] = pivot;
			return high;
		}
		else
			return first;
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
