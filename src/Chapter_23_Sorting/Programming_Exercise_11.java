package Chapter_23_Sorting;

import utilities.Heap;

/**
 * Heap clone and equals
 * Implement the clone and equals method in the Heap class.
 * 
 * 01/
 * @author kevgu
 *
 */

public class Programming_Exercise_11 
{
	@SuppressWarnings("unchecked")
	public static <E extends Comparable<E>> void main(String[] args) 
	{
		Integer[] list = {15, -5, 4, 65, 12, 75, 0, -34, 6, -63, 3};
		Heap<E> heap1 = new Heap<E>((E[]) list);
		Heap<E> heap2 = heap1.clone(); 
		
		System.out.println("Heap 1: " + heap1.toString());
		System.out.println("Heap 2: " + heap2.toString());
		
		if (heap1.equals(heap2))
			System.out.println("List is the same.");
	}
}
