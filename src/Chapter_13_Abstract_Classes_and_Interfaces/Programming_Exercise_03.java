package Chapter_13_Abstract_Classes_and_Interfaces;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Sort ArrayList
 * Write the following method that sorts an ArrayList of numbers. 
 * public static void sort(ArrayList<Number> list)
 * 
 * 12/10/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_03
{
	public static void main(String[] args) 
	{
		ArrayList<Number> list = new ArrayList<>();
		
		System.out.print("Enter size of list: ");
		Scanner input = new Scanner(System.in);
		list = generateNumbers(input.nextInt());
		
		System.out.println(list.toString());
		sort(list);
		System.out.println(list.toString());
		
		input.close();
	}
	
	public static void sort(ArrayList<Number> list)
	{
		int minNum;
		
		for (int i = 0; i < list.size() - 1; i++)
		{
			minNum = i;
			
			for (int j = i + 1; j < list.size(); j++)
				if (list.get(minNum).intValue() > list.get(j).intValue())
					minNum = j;
			
			if (minNum != i)
			{
				Number tempNum = list.get(minNum);
				list.set(minNum, list.get(i));
				list.set(i, tempNum);
			}
		}
	}
	
	public static ArrayList<Number> generateNumbers(int size)
	{
		Random randNum = new Random();
		
		ArrayList<Number> tempList = new ArrayList<>();
		
		for (int i = 0; i < size; i++)
			tempList.add(randNum.nextInt(size));
		
		return tempList;
	}
}
