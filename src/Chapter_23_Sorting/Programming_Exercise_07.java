package Chapter_23_Sorting;

import utilities.Heap;
import utilities.HeapSort;

/**
 * Min-heap
 * The heap presented in the text is also known as a max-heap, in which each node is greater than or equal to any of its children. 
 * A min-heap is a heap in which each node is less than or equal to any of its children. 
 * Min-heaps are often used to implement priority queues. 
 * Revise the Heap class in Listing 23.9 to implement a min-heap.
 * 
 * 02/09/2017
 * @author kevgu
 *
 */

public class Programming_Exercise_07 
{
	public static void main(String[] args) 
	{
		Integer[] list = {-44, -5, -3, 3, 3, 1, -4, 0, 1, 2, 4, 5, 53};
		Heap<Integer> heap = new Heap<>(list, false);
		System.out.println(heap.toString());
		
		HeapSort.heapSort(list, true);
		
		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
	}
}
