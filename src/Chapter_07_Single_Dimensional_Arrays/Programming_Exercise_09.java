package Chapter_07_Single_Dimensional_Arrays;
import java.util.Scanner;

/**
 * Find the smallest element
 * Write a method that finds the smallest element in an array of double values using the following header: 
 * public static double min(double[] array) 
 * Write a test program that prompts the user to enter ten numbers, invokes this method to return the minimum value, 
 * and displays the minimum value.
 * 
 * 09/19/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_09 
{
	public static void main(String[] args) 
	{
		double[] minimumElementArray = new double[10];
		
		insertNumbers(minimumElementArray);
		System.out.print("Smallest element: " + min(minimumElementArray));
	}
	
	/**
	 * prompts the user to enter ten numbers
	 * 
	 * @param minimumElementArray
	 */
	public static void insertNumbers(double[] minimumElementArray)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		
		for (int i = 0; i < 10; i++)
			minimumElementArray[i] = input.nextDouble();
			
		input.close();
	}
	
	/**
	 * Returns the smallest element in the array
	 * 
	 * @param array
	 * @return
	 */
	public static double min(double[] array) 
	{
		double smallestElement = array[0];
		
		for (int i = 1; i < 10; i++)
			if (smallestElement > array[i])
				smallestElement = array[i];
		
		return smallestElement;
	}
}
