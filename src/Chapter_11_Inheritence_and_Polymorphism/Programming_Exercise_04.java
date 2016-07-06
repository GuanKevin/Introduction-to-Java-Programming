package Chapter_11_Inheritence_and_Polymorphism;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

/**
 * Maximum element in ArrayList
 * Write the following method that returns the maximum value in an ArrayList of integers. 
 * The method returns null if the list is null or the list size is 0. 
 * public static Integer max(ArrayList<Integer> list)
 * Write a test program that prompts the user to enter a sequence of numbers ending with 0, 
 * and invokes this method to return the largest number in the input.
 *
 * 03/20/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_04 
{
	static Scanner input = new Scanner(System.in);
	static Random rand = new Random();
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		insertRandomNumbers(list);
		System.out.println(max(list));
	}
	
	public static Integer max(ArrayList<Integer> list)
	{
		Integer maxEle = 0;
		
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i) > maxEle)
			{
				maxEle = list.get(i);
			}
		}
		
		if (list.size() == 0)
		{
			return null;
		}
		
		return maxEle;
	}
	
	public static void insertRandomNumbers(ArrayList<Integer> list)
	{
		int number = rand.nextInt(100);
		int counter = 0;
		
		while (number != 0)
		{
			counter++;
			list.add(number);
			
			if (counter == 10)
			{
				System.out.println(number + " ");
				counter = 1;
			}
			System.out.print(number + " ");
			number = rand.nextInt(100);	
		}
		
		System.out.println();
	}
	
	public static void findMaxElement(ArrayList<Integer> list)
	{
		int maxEle = 0;
		
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i) > maxEle)
			{
				maxEle = list.get(i);
			}
		}
		System.out.println("The max element is: " + maxEle);
	}
	
}
