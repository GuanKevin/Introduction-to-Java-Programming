package Chapter_07_Single_Dimensional_Arrays;
import java.util.Scanner;

/**
 * Find the index of the smallest element
 * Write a method that returns the index of the smallest element in an array of integers. 
 * If the number of such elements is greater than 1, return the smallest index. 
 * Use the following header: 
 * public static int indexOfSmallestElement(double[] array) 
 * Write a test program that prompts the user to enter ten numbers, invokes this method to return the index of the smallest element, 
 * and displays the index.
 * 
 * 02/18/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_10 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double[] myarray = new double[10];
		storeValues(myarray);
		System.out.print("The index of the smallest integer is: " + indexOfSmallestElement(myarray));
		
		input.close();
	}
	
	public static int indexOfSmallestElement(double[] array) 
	{
		int index = 0;
		double minimum = array[0];
		
		for (int i = 1; i < array.length; i++) //5 1 2 3 4 0 6 7 8 9
		{
			for (int j = i; j >= 0; j--)
			{
				if (minimum > array[j])
				{
					minimum = array[j];
					index = j;
				}
			}
		}
		
		return index;
	}
	
	public static void storeValues(double[] myarray)
	{
		Scanner input = new Scanner(System.in);
		double values;
		System.out.print("Enter 10 numbers: ");
		
		for (int i = 0; i < 10; i++)
		{
			values = input.nextDouble();
			myarray[i] = values;
		}
		
		input.close();
	}
}
