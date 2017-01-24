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
 * 01/
 * @author kevgu
 *
 */

public class Programming_Exercise_02 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size of list: ");
		Integer[] integerList = generateIntList(input.nextInt());
		System.out.println("List before merge sort: " + Arrays.toString(integerList));
		mergeSort(integerList);
		System.out.println("List after merge sort: " + Arrays.toString(integerList));
		
		Circle[] circle = {new Circle(5), new Circle(8), new Circle(5), new Circle(15), new Circle(7), new Circle(10)};
		System.out.println("Objects before merge sort: ");
		for (int i = 0; i < circle.length; i++)
			System.out.println(circle[i].toString());
		
		System.out.println("Objects after merge sort: ");
		mergeSort(circle, new GeometricObjectComparator());
		for (int i = 0; i < circle.length; i++)
			System.out.println(circle[i].toString());
		
		input.close();
	}
	
	public static Integer[] generateIntList(int size)
	{
		Integer[] tempList = new Integer[size];
		Random randNumbers = new Random();
		
		for (int i = 0; i < size; i++)
			tempList[i] = randNumbers.nextInt(100);
		
		return tempList;
	}
	
	@SuppressWarnings("unchecked")
	public static <E extends Comparable<E>> void mergeSort(E[] list)
	{
		if (list.length > 1) 
		{
		      E[] firstHalf = (E[])new Comparable[list.length / 2];
		      System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
		      mergeSort(firstHalf);

		      int secondHalfLength = list.length - list.length / 2;
		      E[] secondHalf = (E[])new Comparable[secondHalfLength];
		      System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
		      mergeSort(secondHalf);

		      E[] temp = merge(firstHalf, secondHalf, list);
		      System.arraycopy(temp, 0, list, 0, temp.length);
		}
	}
	
	public static<E extends Comparable<E>> E[] merge(E[] list1, E[] list2, E[] temp) 
	{
		int current1 = 0;
	    int current2 = 0; 
	    int current3 = 0; 

	    while (current1 < list1.length && current2 < list2.length) 
	    {
	    	if (list1[current1].compareTo(list2[current2]) < 0) 
		        temp[current3++] = list1[current1++];
	    	else 	
	    		temp[current3++] = list2[current2++];
    	}

	    while (current1 < list1.length) 
	    {
	    	temp[current3++] = list1[current1++];
	    }

	    while (current2 < list2.length) 
	    {
	    	temp[current3++] = list2[current2++];
    	}

	    return temp;
	}
		
	@SuppressWarnings("unchecked")
	public static <E> void mergeSort(E[] list, Comparator<? super E> comparator)
	{
		if (list.length > 1) 
		{
		      E[] firstHalf = (E[])new Comparable[list.length / 2];
		      System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
		      mergeSort(firstHalf, comparator);

		      int secondHalfLength = list.length - list.length / 2;
		      E[] secondHalf = (E[])new Comparable[secondHalfLength];
		      System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
		      mergeSort(secondHalf, comparator);

		      E[] temp = merge(firstHalf, secondHalf, list, comparator);
		      System.arraycopy(temp, 0, list, 0, temp.length);
		}
	}
	
	private static <E> E[] merge(E[] firstHalf, E[] secondHalf, E[] list, Comparator<? super E> comparator) 
	{
		int current1 = 0;
	    int current2 = 0; 
	    int current3 = 0; 

	    while (current1 < firstHalf.length && current2 < secondHalf.length) 
	    {
	    	if (comparator.compare(firstHalf[current1], secondHalf[current2]) < 0) 
		        list[current3++] = firstHalf[current1++];
	    	else 	
	    		list[current3++] = secondHalf[current2++];
    	}

	    while (current1 < firstHalf.length) 
	    {
	    	list[current3++] = firstHalf[current1++];
	    }

	    while (current2 < secondHalf.length) 
	    {
	    	list[current3++] = secondHalf[current2++];
    	}

	    return list;
	}
}
