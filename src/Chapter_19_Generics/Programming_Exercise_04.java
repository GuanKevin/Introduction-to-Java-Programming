package Chapter_19_Generics;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Generic linear search 
 * Implement the following generic method for linear search. 
 * public static <E extends Comparable<E>> int linearSearch(E[] list, E key)
 * 
 * 12/23/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_04 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size of list: ");
		Integer[] list = generateList(input.nextInt());
		System.out.print(Arrays.toString(list)
				+ "\nSearch result: " + linearSearch(list, 5));
		
		input.close();
	}
	
	public static <E extends Comparable<E>> int linearSearch(E[] list, E key)
	{
		for (int i = 0; i < list.length; i++)
			if (list[i].equals(key))
				return i;
		
		return -1;
	}
	
	public static Integer[] generateList(int size)
	{
		Random randNum = new Random();
		Integer[] tempList = new Integer[size];
		
		for (int i = 0; i < tempList.length; i++)
			tempList[i] = randNum.nextInt(size);
		
		return tempList;
	}
}
