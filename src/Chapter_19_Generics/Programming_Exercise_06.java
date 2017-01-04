package Chapter_19_Generics;

import java.util.Random;
import java.util.Scanner;

/**
 * Maximum element in a two-dimensional array 
 * Write a generic method that 
 * returns the maximum element in a two-dimensional array. 
 * public static <E extends Comparable<E>> E max(E[][] list)
 * 
 * 01/01/2017
 * @author kevgu
 *
 */

public class Programming_Exercise_06 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		Integer[][] list = generate2DList(input.nextInt());
		System.out.print("The largest number in the list is " + max(list));
		
		input.close();
	}
	
	public static <E extends Comparable<E>> E max(E[][] list)
	{
		E max = list[0][0];
		
		for (int i = 0; i < list.length; i++)
			for (int j = 0; j < list.length; j++)
				if (max.compareTo(list[i][j]) == -1)
					max = list[i][j];
		
		return max;
	}
	
	public static Integer[][] generate2DList(int size)
	{
		Integer[][] tempList = new Integer[size][size];
		Random randNum = new Random();
		
		for (int i = 0; i < size; i++)
			for (int j = 0; j < size; j++)
				tempList[i][j] = randNum.nextInt(100);
		
		return tempList;
	}
}
