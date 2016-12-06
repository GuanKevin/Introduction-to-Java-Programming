package Chapter_11_Inheritence_and_Polymorphism;

import java.util.ArrayList;
import java.util.Random;

/**
 * Combine two lists
 * Write a method that returns the union of two array lists of integers using the following header: 
 * public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2)
 * For example, the union of two array lists {2, 3, 1, 5} and {3, 4, 6} is {2, 3, 1, 5, 3, 4, 6}. 
 * Write a test program that prompts the user to enter two lists, each with five integers, and displays their union. 
 * The numbers are separated by exactly one space in the output.
 *
 * 12/06/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_14 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list1 = generateList(5);
		ArrayList<Integer> list2 = generateList(5);
		
		list1 = union(list1, list2);
		
		System.out.print("List after union: ");
		for (int i = 0; i < list1.size(); i ++)
			System.out.print(list1.get(i) + " ");
	}
	
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2)
	{
		if (list1.isEmpty() && list2.isEmpty())
		{
			System.out.print("Both list is empty!");
			return list1;
		}
		
		for (int i = 0; i < list2.size(); i++)
			list1.add(list2.get(i));
		
		return list1;
	}
	
	public static ArrayList<Integer> generateList(int size)
	{
		ArrayList<Integer> tempList = new ArrayList<>();
		Random randNum = new Random();
		
		System.out.print("Numbers generated to list: ");
		for (int i = 0; i < size; i++)
		{
			int number = randNum.nextInt(size);
			System.out.print(number + " ");
			tempList.add(number);
		}
		System.out.println();
		
		return tempList;
	}
}
