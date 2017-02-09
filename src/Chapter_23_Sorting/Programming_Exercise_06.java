package Chapter_23_Sorting;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Check order
 * Write the following overloaded methods that check whether an array is ordered in ascending order or descending order. 
 * By default, the method checks ascending order. To check descending order, pass false to the ascending argument in the method. 
 * public static boolean ordered(int[] list) 
 * public static boolean ordered(int[] list, boolean ascending) 
 * public static boolean ordered(double[] list) 
 * public static boolean ordered (double[] list, boolean ascending) 
 * public static <E extends Comparable<E>> boolean ordered(E[] list) 
 * public static <E extends Comparable<E>> boolean ordered (E[] list, boolean ascending)
 * public static <E> boolean ordered(E[] list Comparator<? super E> comparator) 
 * public static <E> boolean ordered(E[] list, Comparator<? super E> comparator, boolean ascending)
 * 
 * 02/09/2017
 * @author kevgu
 *
 */

public class Programming_Exercise_06 
{
	public static void main(String[] args) 
	{
		Integer[] list = {1, 2, 3};
		if (ordered(list))
			System.out.print(Arrays.toString(list) + " is ordered");
	}
	
	public static boolean ordered(int[] list) 
	{
		for (int i = 0; i < list.length - 1; i++)
			if (list[i] > list[i + 1])
				return false;
		return true;
	}
	
	public static boolean ordered(int[] list, boolean ascending) 
	{
		if (ascending)
			return ordered(list);
		
		for (int i = 0; i < list.length - 1; i++)
			if (list[i] < list[i + 1])
				return false;
		return true;
	}
	
	public static boolean ordered(double[] list) 
	{
		for (int i = 0; i < list.length - 1; i++)
			if (list[i] > list[i + 1])
				return false;
		return true;
	}
	
	public static boolean ordered(double[] list, boolean ascending) 
	{
		if (ascending)
			return ordered(list);
		
		for (int i = 0; i < list.length - 1; i++)
			if (list[i] < list[i + 1])
				return false;
		return true;
	}
	
	public static <E extends Comparable<E>> boolean ordered(E[] list) 
	{
		for (int i = 0; i < list.length - 1; i++)
			if (list[i].compareTo(list[i + 1]) == 1)
				return false;
		return true;
	}
	
	public static <E extends Comparable<E>> boolean ordered (E[] list, boolean ascending)
	{
		if (ascending)
			return ordered(list);
		
		for (int i = 0; i < list.length - 1; i++)
			if (list[i].compareTo(list[i + 1]) == -1)
				return false;
		return true;
	}
	
	public static <E> boolean ordered(E[] list, Comparator<? super E> comparator)
	{
		for (int i = 0; i < list.length - 1; i++)
			if (comparator.compare(list[i], (list[i + 1])) == 1)
				return false;
		return true;
	}
	
	public static <E> boolean ordered(E[] list, Comparator<? super E> comparator, boolean ascending)
	{
		if (ascending)
			return ordered(list, comparator);
		
		for (int i = 0; i < list.length - 1; i++)
			if (comparator.compare(list[i], (list[i + 1])) == 0)
				return false;
		return true;
	}
}
