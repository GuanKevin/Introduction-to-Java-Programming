package Chapter_19_Generics;

import java.util.ArrayList;
import java.util.Random;

/**
 * Shuffle ArrayList 
 * Write the following method that shuffles an ArrayList: 
 * public static <E> void shuffle(ArrayList<E> list)
 * 
 * 01/01/2017
 * @author kevgu
 *
 */

public class Programming_Exercise_08 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = generateList(10);
		
		for (int i = 0; i < 5; i++)
		{
			System.out.println(list.toString());
			shuffle(list);
		}
	}
	
	public static <E> void shuffle(ArrayList<E> list)
	{
		Random randIndex = new Random();
		
		for (int i = 0; i < list.size(); i++)
			swap(list, i, randIndex.nextInt(list.size()));
	}
	
	public static <E> void swap(ArrayList<E> list, int curIndex, int swapIndex)
	{
		E tempEle = list.get(curIndex);
		list.set(curIndex, list.get(swapIndex));
		list.set(swapIndex, tempEle);
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
