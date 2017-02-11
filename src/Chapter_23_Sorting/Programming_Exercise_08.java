package Chapter_23_Sorting;

/**
 * Sort using a heap
 * Implement the following sort method using a heap. 
 * public static <E extends Comparable<E>> void sort(E[] list)
 * 
 * 02/10/2017
 * @author kevgu
 *
 */

public class Programming_Exercise_08 
{
	public static void main(String[] args) 
	{
		Integer[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
	    heapSort(list);
	    
	    for (int i = 0; i < list.length; i++) 
	    	System.out.print(list[i] + " ");
	}
	
	public static void heapSort(Integer[] list) 
	{
		Heap<Integer> heap = new Heap<>();

	    for (int i = 0; i < list.length; i++)
	    	heap.add(list[i]);

	    for (int i = list.length - 1; i >= 0; i--)
	    	list[i] = heap.remove();
	}

	public static class Heap<E extends Comparable<E>> 
	{
		private java.util.ArrayList<E> list = new java.util.ArrayList<E>();
		
	    public Heap() {}

	    public Heap(E[] objects) 
	    {
	    	for (int i = 0; i < objects.length; i++)
	    		add(objects[i]);
	    }

	    public void add(E newObject) 
	    {
	    	list.add(newObject);
	    	int currentIndex = list.size() - 1;

	    	while (currentIndex > 0) 
	    	{
	    		int parentIndex = (currentIndex - 1) / 2;

	    		if (list.get(currentIndex).compareTo(list.get(parentIndex)) > 0) 
	    		{
	    			E temp = list.get(currentIndex);
	    			list.set(currentIndex, list.get(parentIndex));
	    			list.set(parentIndex, temp);
	    		}
	    		else
	    			break; 

	    		currentIndex = parentIndex;
	    	}
	    }

	    public E remove() 
	    {
	    	if (list.size() == 0) return null;

	    	E removedObject = list.get(0);
	    	list.set(0, list.get(list.size() - 1));
	    	list.remove(list.size() - 1);

	    	int currentIndex = 0;
	    	while (currentIndex < list.size()) 
	    	{
	    		int leftChildIndex = 2 * currentIndex + 1;
	    		int rightChildIndex = 2 * currentIndex + 2;

	    		if (leftChildIndex >= list.size()) break; 
	    		int maxIndex = leftChildIndex;
	    		if (rightChildIndex < list.size()) 
	    			if (list.get(maxIndex).compareTo(list.get(rightChildIndex)) < 0) 
	    				maxIndex = rightChildIndex;
	    			
	    		if (list.get(currentIndex).compareTo(list.get(maxIndex)) < 0) 
	    		{
	    			E temp = list.get(maxIndex);
	    			list.set(maxIndex, list.get(currentIndex));
	    			list.set(currentIndex, temp);
	    			currentIndex = maxIndex;
	    		}
	    		else
	    			break;
	    	}

	    	return removedObject;
		}

	    public int getSize() 
	    {
	    	return list.size();
	    }
	}
}
