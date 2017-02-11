package Chapter_23_Sorting;

import utilities.Heap;

/**
 * Heap clone and equals
 * Implement the clone and equals method in the Heap class.
 * 
 * 02/10/2017
 * @author kevgu
 *
 */

public class Programming_Exercise_11 
{
	public static void main(String[] args) throws CloneNotSupportedException  
	{
		Integer[] list = {3, 1, 2};
		Heap<Integer> heap1 = new Heap<>(list);
		@SuppressWarnings("unchecked")
		Heap<Integer> heap2 = (Heap<Integer>) heap1.clone();
		
		if (heap1.equals(heap2))
			System.out.println("The heaps are equal.");
		else
			System.out.println("The heaps are not equal.");
		
		heap2.add(4);
		
		if (heap1.equals(heap2))
			System.out.println("The heaps are equal.");
		else
			System.out.println("The heaps are not equal.");
		
		System.out.println(heap1.toString());
		System.out.println(heap2.toString());
		
		Integer[] list2 = {3, 1, 2, 4};
		Heap<Integer> heap3 = new Heap<>(list2);
		
		if (heap1.equals(heap3))
			System.out.println("The heaps are equal.");
		else
			System.out.println("The heaps are not equal.");
		
		System.out.println(heap3.toString());
	}
}
