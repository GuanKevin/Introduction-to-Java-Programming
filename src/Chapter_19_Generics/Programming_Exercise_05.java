package Chapter_19_Generics;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Maximum element in an array
 * Implement the following method that returns the maximum element in an array. 
 * public static <E extends Comparable<E>> E max(E[] list)
 * 
 * 12/23/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_05 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size of list: ");
		Integer[] list = generateList(input.nextInt());
		System.out.print(Arrays.toString(list)
				+ "\nSearch result: " + max(list));
		
		input.close();
	}
	
	public static <E extends Comparable<E>> E max(E[] list)
	{
		E variable = list[0];
		
		for (int i = 1; i < list.length; i++)
			if (variable.compareTo(list[i]) < 0)
				variable = list[i];
		
		return variable;
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
