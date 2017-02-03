package utilities;

import java.util.ArrayList;
import java.util.Random;

public class SortMethods 
{
	ArrayList<Integer> list;
	
	public SortMethods(int size)
	{
		this.list = generateList(size);
	}
	
	public ArrayList<Integer> generateList(int size)
	{
		Random randNumbers = new Random();
		ArrayList<Integer> tempList = new ArrayList<>();
		
		for (int i = 0; i < size; i++)
			tempList.add(randNumbers.nextInt(10000));
		
		return tempList;
	}
	
	@SuppressWarnings("unchecked")
	public long selectionSort()
	{
		ArrayList<Integer> tempList = (ArrayList<Integer>) list.clone();
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i < tempList.size() - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < tempList.size(); j++)
                if (tempList.get(j) < tempList.get(index))
                    index = j;
      
            int smallerNumber = tempList.get(index); 
            tempList.set(index, tempList.get(i));
            tempList.set(i, smallerNumber);
        }
		
		return (System.currentTimeMillis() - startTime);
	}
	
	@SuppressWarnings("unchecked")
	public long bubbleSort()
	{
		ArrayList<Integer> tempList = (ArrayList<Integer>) list.clone();
		long startTime = System.currentTimeMillis();
		
		boolean swapped = true;
		
		while (swapped)
		{
			swapped = false;
			for (int i = 1; i < tempList.size(); i++)
			{
				int tempNum = 0;
				if (tempList.get(i - 1) > tempList.get(i))
				{
					tempNum = tempList.get(i - 1);
					tempList.set(i - 1, i);
					tempList.set(i, tempNum);
					swapped = true;
				}
			}
		}
		
		return (System.currentTimeMillis() - startTime);
	}
	
	public long mergeSort()
	{
		Integer[] tempList = new Integer[list.size()];
		
		for (int i = 0; i < tempList.length; i++)
			tempList[i] = list.get(i);
			
		long startTime = System.currentTimeMillis();
		
		mergeSort(tempList);
		
		return (System.currentTimeMillis() - startTime);
	}
	
	private void mergeSort(Integer[] tempList)
	{
		if (tempList.length > 1)
		{
			Integer[] firstHalf = new Integer[tempList.length / 2];
			System.arraycopy(tempList, 0, firstHalf, 0, tempList.length / 2);
			mergeSort(firstHalf);
			
			int secondHalfLength = tempList.length - (tempList.length / 2);
			Integer[] secondHalf = new Integer[secondHalfLength];
			System.arraycopy(tempList, tempList.length / 2, secondHalf, 0, secondHalfLength);
			mergeSort(secondHalf);
			
			Integer[] temp = merge(firstHalf, secondHalf, tempList);
			System.arraycopy(temp, 0, tempList, 0, temp.length);
		}
	}
	
	private Integer[] merge(Integer[] firstHalf, Integer[] secondHalf, Integer[] tempList)
	{
		int firstHalfIndex = 0, secondHalfIndex = 0, listIndex = 0;
		
		while (firstHalfIndex < firstHalf.length && secondHalfIndex < secondHalf.length)
			if (firstHalf[firstHalfIndex].compareTo(secondHalf[secondHalfIndex]) < 0)
				tempList[listIndex++] = firstHalf[firstHalfIndex++];
			else
				tempList[listIndex++] = secondHalf[secondHalfIndex++];
		
		while (firstHalfIndex < firstHalf.length)
			tempList[listIndex++] = firstHalf[firstHalfIndex++];
		
		while (secondHalfIndex < secondHalf.length)
			tempList[listIndex++] = secondHalf[secondHalfIndex++];
		
		return tempList;
	}
	
	public long quickSort()
	{
		Integer[] tempList = new Integer[list.size()];
		
		for (int i = 0; i < tempList.length; i++)
			tempList[i] = list.get(i);
			
		long startTime = System.currentTimeMillis();
		
		quickSort(tempList, 0, tempList.length - 1);
		
		return (System.currentTimeMillis() - startTime);
	}
	
	private void quickSort(Integer[] tempList, int first, int last)
	{
		if (last > first)
		{
			int pivotIndex = partition(tempList, first, last);
			quickSort(tempList, first, pivotIndex - 1);
			quickSort(tempList, pivotIndex + 1, last);
		}
	}
	
	private int partition(Integer[] tempList, int first, int last)
	{
		Integer pivot = tempList[first];
		int low = first + 1;
		int high = last;
		
		while (high > low)
		{
			while (low <= high && tempList[low].compareTo(pivot) <= 0)
				low++;
			while (low <= high && tempList[high].compareTo(pivot) == 1)
				high--;
			
			if (high > low)
			{
				Integer temp = tempList[high];
				tempList[high] = tempList[low];
				tempList[low] = temp;
			}
		}
		
		while (high > first && tempList[high].compareTo(pivot) >= 0)
			high--;
		
		if (pivot.compareTo(tempList[high]) == 1)
		{
			tempList[first] = tempList[high];
			tempList[high] = pivot;
			return high;
		}
		else
			return first;
	}
	
	public long heapSort()
	{
		long startTime = System.currentTimeMillis();
		
		ArrayList<Integer> tempList = new ArrayList<>();
		
		for (int i = 0; i < list.size(); i++)
			addToHeap(list.get(i), tempList);
		
		return (System.currentTimeMillis() - startTime);
	}
	
	public void addToHeap(Integer newObject, ArrayList<Integer> tempList)
	{
		tempList.add(newObject);
		int currentIndex = tempList.size() - 1;
		
		while (currentIndex > 0)
		{
			int parentIndex = (currentIndex - 1) / 2;
			
			if (tempList.get(currentIndex).compareTo(tempList.get(parentIndex)) > 0)
			{
				Integer temp = tempList.get(currentIndex);
				tempList.set(currentIndex, tempList.get(parentIndex));
				tempList.set(parentIndex, temp);
			}
			else
				break;
			currentIndex = parentIndex;
		}
	}
	
	public long radixSort()
	{
		Integer[] tempList = new Integer[list.size()];
		
		for (int i = 0; i < tempList.length; i++)
			tempList[i] = list.get(i);
			
		long startTime = System.currentTimeMillis();
		
		radixSort(tempList);
		
		return (System.currentTimeMillis() - startTime);
	}
	
	public static void radixSort(Integer[] list)
	{
		@SuppressWarnings("unchecked")
		ArrayList<Integer>[] buckets = new ArrayList[list.length];
		
		for (int i = 0; i < buckets.length; i++)
			buckets[i] = new ArrayList<Integer>();
		
		for (int position = 0; position <= 2; position++)
		{
			for (int i = 0; i < buckets.length; i++)
				buckets[i].clear();
		
			for (int i = 0; i < list.length; i++)
			{
				int key = getKey(list[i], position);
				buckets[key].add(list[i]);
			}
			
			int k = 0;
			for (int i = 0; i < buckets.length; i++)
				for (int j = 0; j < buckets[i].size(); j++)
					list[k++] = buckets[i].get(j);
		}
	}
	
	public static int getKey(int number, int position)
	{
		int result = 1;
		for (int i = 0; i < position; i++)
			result *= 100;
		
		return (number / result) % 10;
	}
}
