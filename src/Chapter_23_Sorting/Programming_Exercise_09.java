package Chapter_23_Sorting;

import utilities.GeometricObjectComparator;
import utilities.Rectangle;
import utilities.HeapSort;

/**
 * Generic Heap using Comparator
 * Revise Heap in Listing 23.9, using a generic parameter and a Comparator for comparing objects. 
 * Define a new constructor with a Comparator as its argument as follows: 
 * Heap(Comparator<? super E> comparator)
 * 
 * 02/10/2017
 * @author kevgu
 *
 */

public class Programming_Exercise_09 
{
	public static void main(String[] args) 
	{
		Rectangle[] recList = {new Rectangle(10, 10), new Rectangle(), new Rectangle(5, 4), new Rectangle(4, 5), 
				new Rectangle(1, 7), new Rectangle(9, 3), new Rectangle(1, 10), new Rectangle(5, 15)};
		HeapSort.heapSort(recList, new GeometricObjectComparator());
		
		for (int i = 0; i < recList.length; i++) 
	    	System.out.println(recList[i] + " ");
	}
}
