package utilities;
import utilities.Heap;

public class MinHeap<E extends Comparable<E>> extends Heap<E>
{
	public MinHeap() {}
	
	public MinHeap(E[] objects) 
	{
		for (int i = 0; i < objects.length; i++)
			add(objects[i]);
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
			
			if (list.get(currentIndex).compareTo(list.get(parentIndex)) < 1)
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
}
