package Chapter_22_Developing_Efficient_Algorithms;

import java.util.Random;
import java.util.Scanner;

/**
 * Find the smallest number
 * Write a method that uses the divide-and-conquer 
 * approach to find the smallest number in a list.
 * 
 * 02/
 * @author kevgu
 *
 */

public class Programming_Exercise_24 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size of the list: ");
		int[] list = generateList(input.nextInt());
		displayList(list);
		System.out.println("The smallest number in the list is: " + findLowestNum(list, 0, list.length - 1));
		
		input.close();
	}
	
	public static void displayList(int[] list)
	{
		for (int i = 0; i < list.length; i++)
			if ((i + 1) % ((list.length <= 10) ? (10) : (list.length % 10)) == 0)
				System.out.printf("%-5d\n", list[i]);
			else
				System.out.printf("%-5d", list[i]);
	}
	
	public static int[] generateList(int size)
	{
		Random randNumber = new Random();
		int[] tempList = new int[size];
		
		for (int i = 0; i < size; i++)
			tempList[i] = randNumber.nextInt(1000);
		
		return tempList;
	}
	
	public static int findLowestNum(int[] list, int start, int end)
	{
		if (start == end)
			return list[start];
		else if(end - start == 1)
			return Math.min(list[start], list[end]);	
		
		return Math.min(findLowestNum(list, start, ((start + end) / 2)), findLowestNum(list, ((start + end) / 2) + 1, end));
	}
}
