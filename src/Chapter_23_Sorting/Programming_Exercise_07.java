package Chapter_23_Sorting;

import java.util.ArrayList;
import utilities.MinHeap;

/**
 * Min-heap
 * The heap presented in the text is also known as a max-heap, in which each node is greater than or equal to any of its children. 
 * A min-heap is a heap in which each node is less than or equal to any of its children. Min-heaps are often used to implement priority queues. 
 * Revise the Heap class in Listing 23.9 to implement a min-heap.
 * 
 * 01/
 * @author kevgu
 *
 */

public class Programming_Exercise_07 
{
	@SuppressWarnings("unchecked")
	public static <E extends Comparable<E>> void main(String[] args) 
	{
		Integer[] list = {1, 2, 4, 5, 53, -44, -5, -3, 3, 3, 1, -4, 0};
		MinHeap<E> minHeap = new MinHeap<E>((E[]) list);
		minHeap .heapSort();
		ArrayList<E> newList = minHeap.getList();
		
		for (int i = 0; i < newList.size(); i++)
			System.out.print(newList.get(i) + " ");	
	}
}
