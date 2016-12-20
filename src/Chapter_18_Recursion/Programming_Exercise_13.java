package Chapter_18_Recursion;

import java.util.Random;
import java.util.Scanner;

/**
 * Find the largest number in an array
 * Write a recursive method that returns the largest integer in an array. 
 * Write a test program that prompts the user to enter a list of eight integers and displays the largest element.
 * 
 * 12/19/2016;
 * @author kevgu
 *
 */

public class Programming_Exercise_13
{	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int[] arr = generateArray(input.nextInt());
		System.out.print("The largest number in the array is " + findLargestNum(arr, 0));
		
		input.close();
	}
	
	public static int findLargestNum(int[] arr, int helper)
	{
		if (arr.length == (helper + 1))
			return arr[helper];
		
		int value = findLargestNum(arr, 1 + helper);
		
		return (arr[helper] > value ? arr[helper] : value);
	}
	
	public static int[] generateArray(int size)
	{
		Random randNum = new Random();
		int[] tempArr = new int[size];
		
		System.out.print("Generating numbers: ");
		for (int i = 0; i < size; i++)
		{
			int num = randNum.nextInt(size);
			System.out.print(num + " ");
			tempArr[i] = num;
		}
		System.out.println();
		
		return tempArr;
	}
}
