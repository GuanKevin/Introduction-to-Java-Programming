package Chapter_19_Generics;

import java.util.ArrayList;
import java.util.Random;

/**
 * Sort ArrayList
 * Write the following method that sorts an ArrayList: 
 * public static <E extends Comparable<E>> void sort(ArrayList<E> list)
 * 
 * 01/01/2017
 * @author kevgu
 *
 */

public class Programming_Exercise_09 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = generateList(10);
		System.out.println("List before sort: " + list.toString());
		sort(list);
		System.out.print("List after sort: " + list.toString());
	}
	
	public static <E extends Comparable<E>> void sort(ArrayList<E> list)
	{	
		 E curMin;
		 int curMinIndex;
		 
		 for (int i = 0; i < list.size() - 1; i++)
		 {
			 curMin = list.get(i);
			 curMinIndex = i;
			 
			 for (int j = i + 1; j < list.size(); j++)
				 if (curMin.compareTo(list.get(j)) > 0)
				 {
					 curMin = list.get(j);
					 curMinIndex = j;
				 }
			 
			 if (curMinIndex != i)
			 {
				 list.set(curMinIndex, list.get(i));
				 list.set(i, curMin);
			 }
		 }
	}
	 
	public static ArrayList<Integer> generateList(int size)
	{
		Random randNum = new Random();
		ArrayList<Integer> tempList = new ArrayList<>();
		
		for (int i = 0; i < size; i++)
			tempList.add(randNum.nextInt(100));
		
		return tempList;
	}
}
