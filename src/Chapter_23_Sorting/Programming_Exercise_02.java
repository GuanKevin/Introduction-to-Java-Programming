package Chapter_23_Sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

import utilities.Circle;
import utilities.GeometricObjectComparator;

/**
 * Generic merge sort
 * Write the following two generic methods using merge sort. 
 * The first method sorts the elements using the Comparable interface and the second uses the Comparator interface. 
 * public static <E extends Comparable<E>> void mergeSort(E[] list) 
 * public static <E> void mergeSort(E[] list, Comparator<? super E> comparator)
 * 
 * 01/24/2017
 * @author kevgu
 *
 */

public class Programming_Exercise_02 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		Integer[] list = generateList(input.nextInt());
		System.out.println("List before merge sort: " + Arrays.toString(list));
		mergeSort(list);
		System.out.println("List after merge sort: " + Arrays.toString(list));
		
		Circle[] circle = {new Circle(5), new Circle(8), new Circle(5), new Circle(15), new Circle(7), new Circle(10)};
		System.out.println("Objects before merge sort: ");
		for (int i = 0; i < circle.length; i++)
			System.out.println(circle[i].toString());
		mergeSort(circle, new GeometricObjectComparator());
		System.out.println("Objects after merge sort: ");
		for (int i = 0; i < circle.length; i++)
			System.out.println(circle[i].toString());
		
		input.close();
	}
	
	@SuppressWarnings("unchecked")
	public static <E> void mergeSort(E[] list, Comparator<? super E> comparator)
	{
		if (list.length > 1)
		{
			E[] firstHalf = (E[]) new Comparable[list.length / 2];
			System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
			mergeSort(firstHalf, comparator);
			
			int secondHalfLength = list.length - (list.length / 2);
			E[] secondHalf = (E[]) new Comparable[secondHalfLength];
			System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
			mergeSort(secondHalf, comparator);
			
			E[] temp = merge(firstHalf, secondHalf, list, comparator);
			System.arraycopy(temp, 0, list, 0, temp.length);
		}
	}
	
	private static <E> E[] merge(E[] firstHalf, E[] secondHalf, E[] list, Comparator<? super E> comparator)
	{
		int firstHalfIndex = 0, secondHalfIndex = 0, listIndex = 0;
		
		while (firstHalfIndex < firstHalf.length && secondHalfIndex < secondHalf.length)
			if (comparator.compare(firstHalf[firstHalfIndex], (secondHalf[secondHalfIndex])) < 0)
				list[listIndex++] = firstHalf[firstHalfIndex++];
			else
				list[listIndex++] = secondHalf[secondHalfIndex++];
		
		while (firstHalfIndex < firstHalf.length)
			list[listIndex++] = firstHalf[firstHalfIndex++];
		
		while (secondHalfIndex < secondHalf.length)
			list[listIndex++] = secondHalf[secondHalfIndex++];
		
		return list;
	}
	
	@SuppressWarnings("unchecked")
	public static <E extends Comparable<E>> void mergeSort(E[] list)
	{
		if (list.length > 1)
		{
			E[] firstHalf = (E[]) new Comparable[list.length / 2];
			System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
			mergeSort(firstHalf);
			
			int secondHalfLength = list.length - (list.length / 2);
			E[] secondHalf = (E[]) new Comparable[secondHalfLength];
			System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
			mergeSort(secondHalf);
			
			E[] temp = merge(firstHalf, secondHalf, list);
			System.arraycopy(temp, 0, list, 0, temp.length);
		}
	}
	
	private static <E extends Comparable<E>> E[] merge(E[] firstHalf, E[] secondHalf, E[] list)
	{
		int firstHalfIndex = 0, secondHalfIndex = 0, listIndex = 0;
		
		while (firstHalfIndex < firstHalf.length && secondHalfIndex < secondHalf.length)
			if (firstHalf[firstHalfIndex].compareTo(secondHalf[secondHalfIndex]) < 0)
				list[listIndex++] = firstHalf[firstHalfIndex++];
			else
				list[listIndex++] = secondHalf[secondHalfIndex++];
		
		while (firstHalfIndex < firstHalf.length)
			list[listIndex++] = firstHalf[firstHalfIndex++];
		
		while (secondHalfIndex < secondHalf.length)
			list[listIndex++] = secondHalf[secondHalfIndex++];
		
		return list;
	}
	
	public static Integer[] generateList(int size)
	{
		Integer[] tempList = new Integer[size];
		Random randNum = new Random();
		
		for (int i = 0; i < size; i++)
			tempList[i] = randNum.nextInt(100);
		
		return tempList;
	}
}
