package Chapter_23_Sorting;

import java.util.ArrayList;
import java.util.Random;

/**
 * Radix sort
 * Write a program that randomly generates 1,000,000 integers and sorts them using radix sort.
 * 
 * 02/11/2017
 * @author kevgu
 *
 */

public class Programming_Exercise_12 
{
	public static void main(String[] args) 
	{
		int[] list = generateNumbers(100);
		radixSort(list);
		
		for (int i = 0; i < list.length; i++)
			if ((i + 1) % 10 == 0)
				System.out.println(list[i] + " ");
			else
				System.out.print(list[i] + " ");
	}
	
	public static void radixSort(int[] list)
	{
		@SuppressWarnings("unchecked")
		ArrayList<Integer>[] buckets = new ArrayList[10];
		
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
	
	public static int[] generateNumbers(int size)
	{
		int[] tempList = new int[size];
		Random randNum = new Random();
		
		for (int i = 0; i < tempList.length; i++)
			tempList[i] = randNum.nextInt(10000);
		
		return tempList;		
	}
}
