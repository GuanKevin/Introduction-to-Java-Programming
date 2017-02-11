package utilities;

import java.util.Comparator;

public class Heap<E extends Comparable<E>> implements Cloneable
{
	private java.util.ArrayList<E> list = new java.util.ArrayList<E>();
	private int value;
	
	/**
	 * Default false is set to as minHeap.
	 * Passing true will set heap as maxHeap
	 */
	public Heap() 
	{
		setHeap(false);
	}

	public Heap(E[] objects) 
	{
		setHeap(true);
		
	    for (int i = 0; i < objects.length; i++)
	      add(objects[i]);
	}
	
	public Heap(E[] objects, boolean heap) 
	{
		setHeap(heap);
		
	    for (int i = 0; i < objects.length; i++)
	      add(objects[i]);
	}
	
	/**
	 * maxHeap = 1
	 * minHeap = -1
	 * 
	 * @param maxHeap
	 */
	public void setHeap(boolean maxHeap)
	{
		if (maxHeap)
			value = 1;
		else
			value = -1;
	}
	
	public int getHeap()
	{
		return value;
	}

	public void add(E newObject) 
	{
		list.add(newObject);
	    int currentIndex = list.size() - 1;

	    while (currentIndex > 0) 
	    {
	    	int parentIndex = (currentIndex - 1) / 2;
	    	
	    	if (list.get(currentIndex).compareTo(list.get(parentIndex)) == getHeap()) 
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
	    	{
	    		if (list.get(maxIndex).compareTo(list.get(rightChildIndex)) == -getHeap()) 
	    			maxIndex = rightChildIndex;
	    	}      
	       
	    	if (list.get(currentIndex).compareTo(list.get(maxIndex)) == -getHeap()) 
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
	
	public void add(E newObject, Comparator<E> comparator) 
	{
		list.add(newObject);
	    int currentIndex = list.size() - 1;

	    while (currentIndex > 0) 
	    {
	    	int parentIndex = (currentIndex - 1) / 2;
	    	
	    	if (comparator.compare(list.get(currentIndex), (list.get(parentIndex))) > 0) 
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

	public E remove(Comparator<E> comparator) 
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
	    	{
	    		if (comparator.compare(list.get(maxIndex), (list.get(rightChildIndex))) < 0) 
	    			maxIndex = rightChildIndex;
	    	}      
	       
	    	if (comparator.compare(list.get(currentIndex), (list.get(maxIndex))) < 0) 
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
	
	@Override
	public Object clone() throws CloneNotSupportedException 
	{
		return super.clone();
	}
	
	@SuppressWarnings("hiding")
	public <E extends Comparable<E>> boolean equals(Heap<E> heapList)
	{
		if (this.getSize() != heapList.getSize())
			return false;
		
		for (int i = 0; i < list.size(); i++)
			if (list.get(i) != heapList.list.get(i))
				return false;
		
		return true;
	}
	
	@Override
	public String toString() 
	{
		return "List: " + list.toString();
	}
	
	public int getSize() 
	{
		return list.size();
	}
}