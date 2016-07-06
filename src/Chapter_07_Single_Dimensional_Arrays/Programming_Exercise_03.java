package Chapter_07_Single_Dimensional_Arrays;
import java.util.Scanner;

/**
 * Count occurrence of numbers
 * Write a program that reads the integers between 1 and 100 and counts the occurrences of each. 
 * Assume the input ends with 0.
 * 
 * 02/18/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_03 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		final int SIZE = 101; //0 - 100
		
		int[] myarray = new int[SIZE];
		myarray = readIntegers(SIZE);
		displayCounts(myarray);
		
		input.close();
	}
	
	public static int[] readIntegers(int SIZE)
	{
		Scanner input = new Scanner(System.in);
		int[] myarray = new int[SIZE];
		
		System.out.print("Enter 0 to end, else enter a number between 1 - 100: ");
		int number = input.nextInt();
		
		while (number != 0)
		{
			myarray[number]++;
			number = input.nextInt();
		}
		
		input.close();
		return myarray;
	}
	
	public static void displayCounts(int[] myarray)
	{
		for (int i = 0; i < myarray.length; i++)
		{
			if (myarray[i] != 0)
			{
				System.out.println("Number: " + i + "   Entered: " + myarray[i] + " times!");
			}
		}
	}
}
