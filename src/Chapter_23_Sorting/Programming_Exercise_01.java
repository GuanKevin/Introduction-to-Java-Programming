package Chapter_23_Sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

/**
 * Generic Bubble Sort
 * Write the following two generic methods using bubble sort. 
 * The first method sorts the elements using the Comparable interface and the second uses the Comparator interface
 * public static <E extends Comparable<E>> void bubbleSort(E[] list) 
 * public static <E> void bubbleSort(E[] list, Comparator<? super E> comparator)
 * 
 * 01/
 * @author kevgu
 *
 */

public class Programming_Exercise_01 
{
	public static <E> void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size of list: ");
		Integer[] list = getIntegerList(input.nextInt());
		System.out.println("Before bubble sort: " + Arrays.toString(list));
		bubbleSort(list);
		System.out.println("Comparable bubble sort: " + Arrays.toString(list));
		
		input.close();
	}
	
	public static Integer[] getIntegerList(int size)
	{
		Random randNum = new Random();
		Integer[] tempList = new Integer[size];
		
		for (int i = 0; i < size; i++)
			tempList[i] = randNum.nextInt(100);
			
		return tempList;
	}
	
	public static <E extends Comparable<E>> void bubbleSort(E[] list) 
	{
		boolean needNextPass = true;
		
		for (int k = 1; k < list.length && needNextPass; k++) 
		{
			needNextPass = false;
			for (int i = 0; i < list.length - k; i++) 
				if (list[i].compareTo(list[i + 1]) == 1) 
				{
					E temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
					needNextPass = true;
				}
		}
	}
	
	public static <E> void bubbleSort(E[] list, Comparator<? super E> comparator)
	{
		
	}
}
