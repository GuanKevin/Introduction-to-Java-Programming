package Chapter_23_Sorting;

import java.util.ArrayList;

import utilities.Heap;

/**
 * Generic heap sort
 * Write the following two generic methods using heap sort. 
 * The first method sorts the elements using the Comparable interface and the second uses the Comparator interface.
 * public static <E extends Comparable<E>> void heapSort(E[] list) 
 * public static <E> void heapSort(E[] list, Comparator<? super E> comparator)
 * 
 * 01/
 * @author kevgu
 *
 */

public class Programming_Exercise_05 
{
	@SuppressWarnings("unchecked")
	public static <E extends Comparable<E>> void main(String[] args) 
	{
		Integer[] list = {1, 2, 4, 5, 53, -44, -5, -3, 3, 3, 1, -4, 0};
		Heap<E> heap = new Heap<E>((E[]) list);
		heap.heapSort();
		ArrayList<E> newList = heap.getList();
		
		for (int i = 0; i < newList.size(); i++)
			System.out.print(newList.get(i) + " ");	
	}
}
