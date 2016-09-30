package Chapter_07_Single_Dimensional_Arrays;

import java.util.Scanner;

/**
 * Pattern recognition: consecutive four equal numbers
 * Write the following method that tests whether the array has four consecutive numbers with the same value. 
 * public static boolean isConsecutiveFour(int[] values) 
 * Write a test program that prompts the user to enter a series of integers and displays if the series contains four consecutive numbers with the same value. 
 * Your program should first prompt the user to enter the input size—i.e., the number of values in the series. 
 * 
 * 09/26/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_30 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the input size: ");
		int[] consecutiveArray = new int[input.nextInt()];
		inputNumbers(consecutiveArray);
		
		if (isConsecutiveFour(consecutiveArray))
			System.out.print("The list has consecutive fours.");
		else
			System.out.print("The list has no consecutive fours.");
		
		input.close();
	}
	
	/**
	 * Prompt the user to enter integers
	 * 
	 * @param consecutiveArray
	 */
	public static void inputNumbers(int[] consecutiveArray)
	{
		System.out.print("Enter " + consecutiveArray.length + " integers: ");
		
		for (int i = 0; i < consecutiveArray.length; i++)
			consecutiveArray[i] = input.nextInt();
	}
	
	/**
	 * displays if the series contains four consecutive numbers with the same value
	 * 
	 * @param values
	 * @return
	 */
	public static boolean isConsecutiveFour(int[] values) 
	{
		int number = values[0];
		int consecutiveCounter = 1;
		
		for (int i = 1; i < values.length; i++)
			if (values[i] == number)
			{
				consecutiveCounter++;
				if (consecutiveCounter == 4)
					return true;
			}
			else
			{
				number = values[i];
				consecutiveCounter = 1;
			}
		
		return false;
	}
}
