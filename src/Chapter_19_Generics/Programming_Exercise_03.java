package Chapter_19_Generics;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Distinct elements in ArrayList
 * Write the following method that returns a new ArrayList. 
 * The new list contains the non-duplicate elements from the original list.
 * public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
 * 
 * 12/23/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_03 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size of list: ");
		int size = input.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.print("Enter " + size + " numbers: ");
		for (int i = 0; i < size; i++)
			list.add(input.nextInt());
		list = removeDuplicates(list);
		System.out.print(list.toString());
			
		input.close();
	}
	
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
	{
		ArrayList<E> tempList = new ArrayList<>();
		
		for (int i = 0; i < list.size(); i++)
			if (!tempList.contains(list.get(i)))
				tempList.add(list.get(i));
		
		return tempList;
	}
}
