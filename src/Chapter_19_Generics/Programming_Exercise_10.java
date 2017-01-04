package Chapter_19_Generics;

import java.util.ArrayList;
import java.util.Random;

/**
 * Largest element in ArrayList 
 * Write the following method that returns the largest element in an ArrayList: 
 * public static <E extends Comparable<E>> E max(ArrayList<E> list)
 * 
 * 01/01/2017
 * @author kevgu
 *
 */

public class Programming_Exercise_10 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = generateList(10);
		System.out.println(list.toString());
		System.out.print("Max element: " + max(list));
	}
	
	public static <E extends Comparable<E>> E max(ArrayList<E> list)
	{
		E max = list.get(0);
		
		for (int i = 1; i < list.size(); i++)
			if (max.compareTo(list.get(i)) < 0)
				max = list.get(i);
		
		return max;
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
