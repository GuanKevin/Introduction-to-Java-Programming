package Chapter_19_Generics;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Generic binary search 
 * Implement the following method using binary search. 
 * public static <E extends Comparable<E>> int binarySearch(E[] list, E key)
 * 
 * 01/01/2017
 * @author kevgu
 *
 */

public class Programming_Exercise_07 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		Integer[] list = generateArr(input.nextInt());
		System.out.print("Look for what number: ");
		int key = input.nextInt();
		Arrays.sort(list);
		System.out.println(Arrays.toString(list));
		System.out.print(key + " is found in index " + binarySearch(list, key));
		
		input.close();
	}
	
	public static <E extends Comparable<E>> int binarySearch(E[] list, E key)
	{
		return binarySearch(list, key, 0, list.length);
	}
	
	public static <E extends Comparable<E>> int binarySearch(E[] list, E key, int low, int high)
	{
		int mid = (low + high) / 2;
		
		if (low > high)
			return -1;
		else if (list[mid].equals(key))
			return mid;
		else if (list[mid].compareTo(key) == -1)
			return binarySearch(list, key, mid + 1, high);
		else
			return binarySearch(list, key, low, mid - 1);
	}
	
	public static Integer[] generateArr(int size)
	{
		Random randNum = new Random();
		Integer[] tempList = new Integer[size];
		
		for (int i = 0; i < size; i++)
			tempList[i] = randNum.nextInt(size);
		
		return tempList;
	}
}
