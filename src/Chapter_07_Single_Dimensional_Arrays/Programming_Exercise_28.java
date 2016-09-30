package Chapter_07_Single_Dimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Math: combinations
 * Write a program that prompts the user to enter 10 integers and displays all combinations of picking two numbers from the 10.
 * 
 * 09/26/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_28 
{
	public static void main(String[] args) 
	{
		int[] combinationArray = new int[10];
		enterCombination(combinationArray);
		displayCombination(combinationArray);
	}
	
	/**
	 * Display all possible combinations of picking two numbers from 10
	 * 
	 * @param combinationArray
	 */
	public static void displayCombination(int[] combinationArray)
	{
		Arrays.sort(combinationArray);
		
		for (int i = 0; i < combinationArray.length - 1; i++)
			for (int j = i + 1; j < combinationArray.length; j++)
				System.out.println(combinationArray[i] + " " + combinationArray[j]);
	}
	
	/**
	 * Ask user to enter 10 integers into array
	 * 
	 * @param combinationArray
	 */
	public static void enterCombination(int[] combinationArray)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter " + combinationArray.length + " integers: ");
		for (int i = 0; i < combinationArray.length; i++)
			combinationArray[i] = input.nextInt();
		
		input.close();
	}
}
