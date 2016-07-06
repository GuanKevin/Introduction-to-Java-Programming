package Chapter_11_Inheritence_and_Polymorphism;
import java.util.Scanner;
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
 * 03/14/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_14 
{
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		ArrayList<Integer> listOne = new ArrayList<Integer>();
		ArrayList<Integer> listTwo = new ArrayList<Integer>();
		
		inputIntegers(listOne);
		System.out.println("List one integers " + listOne);
		inputIntegers(listTwo);
		System.out.println("List two integers " + listTwo);
		listOne.addAll(listTwo);
		System.out.println("Union list one and two: " + listOne);
		printList(listOne);
		removeDuplicate(listOne);
		System.out.println("Removed duplicate: " + listOne);
	}
	
	public static void inputIntegers(ArrayList<Integer> list)
	{
		Random rand = new Random();
		
		for (int i = 0; i < 5; i++)
		{
			list.add(rand.nextInt(10));
		}
	}
	
	public static void printList(ArrayList<Integer> list)
	{
		System.out.print("Numbers separated by one space [ ");
		for (int i = 0; i < list.size(); i++)
		{
			System.out.print(list.get(i) + " ");
		}
		System.out.println("]");
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
