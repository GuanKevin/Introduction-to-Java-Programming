package Chapter_11_Inheritence_and_Polymorphism;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Sort ArrayList
 * Write the following method that sorts an ArrayList of numbers: 
 * public static void sort(ArrayList<Integer> list) 
 * Write a test program that prompts the user to enter 5 numbers, stores them in an array list, and displays them in increasing order.
 *
 * 03/13/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_11 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		insertNumbers(list);
	}
	
	public static void insertNumbers(ArrayList<Integer> list)
	{
		System.out.print("Enter five numbers : ");
		
		for (int i = 0; i < 5; i++)
		{
			list.add(input.nextInt());
		}
		System.out.println(list.toString());
		sort(list);
	}

	//  2 3 4 5 7
	public static void sort(ArrayList<Integer> list)
	{
		int smallestNum = Integer.MAX_VALUE;
		int index = 0;
		for (int i = list.size(); i >= 0; i--)
		{
			for (int j = 0; j < i; j++)
			{
				if (smallestNum > list.get(j))
				{
					smallestNum = list.get(j);
					index = j;
				}
			}
			if (smallestNum != Integer.MAX_VALUE)
			{
				list.add(smallestNum);
				list.remove(index);
				System.out.println(list.toString());
				smallestNum = Integer.MAX_VALUE;
			}			
		}
	}
	
	/*public static void sortArrayList(ArrayList<Integer> integerList)
	{
		int minimum;
		
		for (int i = 0; i < integerList.size() - 1; i++)
		{
			minimum = integerList.get(i);
			for (int j = 1; j < integerList.size(); j++)
			{
				if (minimum > integerList.get(j))
				{
					swapNumbers(integerList, i, j);
				}
			}
		}
	}
	
	public static void swapNumbers(ArrayList<Integer> integerList, int minimumIndex, int swapIndex)
	{
		int temp = integerList.get(minimumIndex);
		integerList.set(minimumIndex, integerList.get(swapIndex));
		integerList.set(swapIndex, temp);
	}
	*/
}
