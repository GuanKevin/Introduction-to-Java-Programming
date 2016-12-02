package Chapter_11_Inheritence_and_Polymorphism;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Maximum element in ArrayList
 * Write the following method that returns the maximum value in an ArrayList of integers. 
 * The method returns null if the list is null or the list size is 0. 
 * public static Integer max(ArrayList<Integer> list)
 * Write a test program that prompts the user to enter a sequence of numbers ending with 0, 
 * and invokes this method to return the largest number in the input.
 *
 * 12/02/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_04 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter size ofd the list: ");
		ArrayList<Integer> list = fillList(input.nextInt()); 
		System.out.println("The largest number in the list is " + max(list) + ".");
		
		input.close();
	}
	
	public static Integer max(ArrayList<Integer> list)
	{
		if (list.size() == 0)
			return null;
		
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < list.size(); i++)
			if (max < list.get(i))
				max = list.get(i);
		
		return max;
	}
	
	public static ArrayList<Integer> fillList(int size)
	{
		Random randNum = new Random();
		ArrayList<Integer> tempList = new ArrayList<Integer>();
		
		System.out.print("Adding numbers: ");
		for (int i = 0; i <size; i++)
		{
			int number = randNum.nextInt(100) * 10;
			System.out.print(number + " ");
			tempList.add(number);
		}
		System.out.println();
		
		return tempList;
	}
}
