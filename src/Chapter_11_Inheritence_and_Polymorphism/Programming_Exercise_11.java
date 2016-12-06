package Chapter_11_Inheritence_and_Polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Sort ArrayList
 * Write the following method that sorts an ArrayList of numbers: 
 * public static void sort(ArrayList<Integer> list) 
 * Write a test program that prompts the user to enter 5 numbers, stores them in an array list, and displays them in increasing order.
 *
 * 12/06/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_11 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 5 numbers: ");
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < 5; i++)
			list.add(input.nextInt());
		
		sort(list);
		
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
		
		input.close();
	}
	
	public static void sort(ArrayList<Integer> list) 
	{
		if (list.isEmpty())
		{
			System.out.println("List is empty, nothing to sort");
			return;
		}
		
		for (int i = 0; i < list.size() - 1; i++)
		{
			int min = i;
			
			for (int j = i + 1; j < list.size(); j++)
				if (list.get(min) > list.get(j))
					min = j;
			
			if (min != i)
				swap(list, min, i);
		}
	}
	
	public static void swap(ArrayList<Integer> list, int minIndex, int curIndex)
	{
		int tempEle = list.get(minIndex);
		list.set(minIndex, list.get(curIndex));
		list.set(curIndex, tempEle);		
	}
}
