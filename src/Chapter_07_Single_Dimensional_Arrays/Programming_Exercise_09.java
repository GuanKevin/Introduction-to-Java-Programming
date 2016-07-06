package Chapter_07_Single_Dimensional_Arrays;
import java.util.Scanner;

/**
 * Find the smallest element
 * Write a method that finds the smallest element in an array of double values using the following header: 
 * public static double min(double[] array) 
 * Write a test program that prompts the user to enter ten numbers, invokes this method to return the minimum value, 
 * and displays the minimum value.
 * 
 * 02/18/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_09 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double[] myarray = new double[10];
		storeValues(myarray);
		double minimum = min(myarray);
		System.out.print("The minimum value is: " + minimum);
		
		input.close();
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
	
	public static double min(double[] array) 
	{
		double minimum = array[0];
		
		for (int i = 1; i < array.length; i++)
		{
			for (int j = i; j >= 0; j--)
			{
				if (minimum > array[j])
				{
					minimum = array[j];
				}
			}
		}
		
		return minimum;
	}
}
