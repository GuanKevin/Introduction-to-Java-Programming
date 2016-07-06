package Chapter_11_Inheritence_and_Polymorphism;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

/**
 * Remove duplicates
 * Write a method that removes the duplicate elements from an array list of integers using the following header: 
 * public static void removeDuplicate(ArrayList<Integer> list)
 * Write a test program that prompts the user to enter 10 integers to a list 
 * and displays the distinct integers separated by exactly one space.
 *
 * 03/14/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_13 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		inputToList(list);
		System.out.println(list);
		removeDuplicate(list);
		System.out.println(list);
	}
	
	public static void inputToList(ArrayList<Integer> list)
	{
		Random rand = new Random();
		System.out.print("Enter the size of your list: ");
		int size = input.nextInt();
		
		for (int i = 0; i < size; i++)
		{
			list.add(rand.nextInt(10));
		}
	}
	
	public static void removeDuplicate(ArrayList<Integer> list)
	{
		ArrayList<Integer> tempList = new ArrayList<Integer>();
		
		for (int i = 0; i < list.size(); i++)
		{
			if (!tempList.contains(list.get(i)))
			{
				tempList.add(list.get(i));
			}
		}
		
		list.clear();
		list.addAll(tempList);	
	}
}
