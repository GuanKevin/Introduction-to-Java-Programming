package Chapter_23_Sorting;
import utilities.HeapSort;

/**
 * Generic heap sort
 * Write the following two generic methods using heap sort. 
 * The first method sorts the elements using the Comparable interface and the second uses the Comparator interface.
 * public static <E extends Comparable<E>> void heapSort(E[] list) 
 * public static <E> void heapSort(E[] list, Comparator<? super E> comparator)
 * 
 * 02/09/2017
 * @author kevgu
 *
 */

public class Programming_Exercise_05 
{
	public static void main(String[] args) 
	{
		Integer[] list = {-44, -5, -3, 3, 3, 1, -4, 0, 1, 2, 4, 5, 53};
		HeapSort.heapSort(list);
		
		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
	}
}
