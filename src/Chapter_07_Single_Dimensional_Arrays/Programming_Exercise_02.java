package Chapter_07_Single_Dimensional_Arrays;
import java.util.Scanner;

/**
 * Reverse the numbers entered
 * Write a program that reads ten integers and displays them in the reverse of the order in which they were read.
 * 
 * 09/13/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_02 
{
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		final int SIZE = 10;
		int[] reverseNumbers = new int[SIZE];
		inputIntegers(reverseNumbers);
		displayArray(reverseNumbers);
		
		input.close();
	}
	
	/**
	 * Display the array in reverse order
	 * 
	 * @param reverseNumber
	 */
	public static void displayArray(int[] reverseNumbers)
	{
		for (int i = reverseNumbers.length - 1; i >= 0; i--)
			System.out.print(reverseNumbers[i]);
	}
	
	/**
	 * Stores numbers into each element of the array
	 * 
	 * @param reverseNumbers
	 */
	public static void inputIntegers(int[] reverseNumbers)
	{
		for (int i = 0; i < reverseNumbers.length; i++)
			reverseNumbers[i] = input.nextInt();
	}
}
