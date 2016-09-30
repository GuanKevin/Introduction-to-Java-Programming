package Chapter_07_Single_Dimensional_Arrays;
import java.util.Scanner;

/**
 * Average an array
 * Write two overloaded methods that return the average of an array with the following headers: 
 * public static int average(int[] array) 
 * public static double average(double[] array) 
 * Write a test program that prompts the user to enter ten double values, invokes this method, and displays the average value.
 * 
 * 09/19/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_08 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{	
		int[] myarray = new int[10];
		storeValues(myarray);
		System.out.print("Average: " + average(myarray));
		
		input.close();
	}
	
	/**
	 * Store 10 integers into the array
	 * 
	 * @param myarray
	 */
	public static void storeValues(int[] myarray)
	{
		System.out.print("Enter 10 numbers: ");
		
		for (int i = 0; i < 10; i++)
			myarray[i] = input.nextInt();
	}
	
	/**
	 * Return the average of the array
	 * 
	 * @param array
	 * @return
	 */
	public static int average(int[] array) 
	{
		int sum = 0;
		
		for (int i = 0; i < array.length; i++)
			sum += array[i];
		
		return (sum/array.length);
	}
	
	/**
	 * Return the average of the array
	 * 
	 * @param array
	 * @return
	 */
	public static double average(double[] array) 
	{
		double sum = 0;
		
		for (int i = 0; i < array.length; i++)
			sum += array[i];
		
		return (sum/array.length);
	}
}
