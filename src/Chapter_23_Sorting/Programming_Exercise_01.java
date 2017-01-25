package Chapter_23_Sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

import utilities.GeometricObjectComparator;
import utilities.Rectangle;

/**
 * Generic Bubble Sort
 * Write the following two generic methods using bubble sort. 
 * The first method sorts the elements using the Comparable interface and the second uses the Comparator interface
 * public static <E extends Comparable<E>> void bubbleSort(E[] list) 
 * public static <E> void bubbleSort(E[] list, Comparator<? super E> comparator)
 * 
 * 01/24/2017
 * @author kevgu
 *
 */

public class Programming_Exercise_01 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size of list: ");
		Integer[] list = generateList(input.nextInt());
		System.out.println("List before bubble sort: " + Arrays.toString(list));
		bubbleSort(list);
		System.out.println("List after bubble sort: " + Arrays.toString(list));
		
		Rectangle[] rectangle = {new Rectangle(), new Rectangle(5, 10), new Rectangle(10, 10), new Rectangle(10, 5), new Rectangle(5, 5)};
		System.out.println("Objects before bubble sort: ");
		for (int i = 0; i < rectangle.length; i++)
			System.out.println(rectangle[i].toString());
		bubbleSort(rectangle, new GeometricObjectComparator());
		System.out.println("Objects after bubble sort: ");
		for (int i = 0; i < rectangle.length; i++)
			System.out.println(rectangle[i].toString());
		
		input.close();
	}
	
	public static <E> void bubbleSort(E[] list, Comparator<? super E> comparator)
	{
		boolean needNextPass = true;
		
		for (int k = 1; k < list.length && needNextPass; k++)
		{
			needNextPass = false;
			
			for (int i = 0; i < list.length - k; i++)
			{
				if (comparator.compare(list[i], (list[i + 1])) == 1)
				{
					E temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
					needNextPass = true;
				}
			}
		}
	}
	
	public static <E extends Comparable<E>> void bubbleSort(E[] list)
	{
		boolean needNextPass = true;
		
		for (int k = 1; k < list.length && needNextPass; k++)
		{
			needNextPass = false;
			
			for (int i = 0; i < list.length - k; i++)
			{
				if (list[i].compareTo(list[i + 1]) == 1)
				{
					E temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
					needNextPass = true;
				}
			}
		}
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
