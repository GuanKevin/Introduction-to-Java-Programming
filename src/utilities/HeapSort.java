package utilities;

import java.util.Comparator;

public class HeapSort 
{
	public HeapSort() {}
	
	public static <E extends Comparable<E>> void heapSort(E[] list)
	{
		Heap<E> heap = new Heap<>();
		
		for (int i = 0; i < list.length; i++)
			heap.add(list[i]);
		
		for (int i = list.length - 1; i >= 0; i--)
			list[i] = heap.remove();
	}
	
	public static <E extends Comparable<E>> void heapSort(E[] list, boolean heapType)
	{
		Heap<E> heap = new Heap<>(list, heapType);
		
		for (int i = list.length - 1; i >= 0; i--)
			list[i] = heap.remove();
	}
	
	public static <E extends Comparable<E>> void heapSort(E[] list, Comparator<E> comparator)
	{
		Heap<E> heap = new Heap<>();
		
		for (int i = 0; i < list.length; i++)
			heap.add(list[i], comparator);
		
		for (int i = list.length - 1; i >= 0; i--)
			list[i] = heap.remove(comparator);
	}
}	
