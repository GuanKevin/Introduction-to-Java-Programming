package Chapter_07_Single_Dimensional_Arrays;
import java.util.Scanner;

/**
 * Average an array
 * Write two overloaded methods that return the average of an array with the following headers: 
 * public static int average(int[] array) 
 * public static double average(double[] array) 
 * Write a test program that prompts the user to enter ten double values, invokes this method, and displays the average value.
 * 
 * 02/18/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_08 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int[] myarray = new int[10];
		storeValues(myarray);
		System.out.print(average(myarray));
		
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
	
	public static void storeValues(int[] myarray)
	{
		Scanner input = new Scanner(System.in);
		int values;
		System.out.print("Enter 10 numbers: ");
		
		for (int i = 0; i < 10; i++)
		{
			values = input.nextInt();
			myarray[i] = values;
		}
		
		input.close();
	}
	
	public static int average(int[] array)
	{
		int sum = 0;
		
		for (int i = 0; i < array.length; i++)
		{
			sum += array[i];
		}
		
		return (sum/array.length);
	}
	
	public static double average(double[] array) 
	{
		double sum = 0;
		
		for (int i = 0; i < array.length; i++)
		{
			sum += array[i];
		}
		
		return (sum/array.length);
	}
}
