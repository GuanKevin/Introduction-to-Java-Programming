package utilities;

import java.util.Comparator;

public class HeapComparator<E extends Comparable<E>> extends Heap<E> 
{
	protected Comparator<? super E> comparator;
	
	public HeapComparator()
	{
		
	}
	
	public HeapComparator(Comparator<? super E> comparator)
	{
		this.comparator = comparator;
	}
	
	public HeapComparator(Comparator<? super E> comparator, E[] o)
	{
		this.comparator = comparator;
		
		for (int i = 0; i < o.length; i++)
			add(o[i]);
	}
	
	@Override
	public void add(E newObject)
	{
		System.out.println("Adding: " + newObject);
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
		
		System.out.println("Heap: " + list.toString());
	}
	
	@Override
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
				if (comparator.compare(list.get(maxIndex), (list.get(rightChildIndex))) < 0)
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
}
