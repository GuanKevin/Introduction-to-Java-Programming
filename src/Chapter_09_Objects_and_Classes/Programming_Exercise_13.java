package Chapter_09_Objects_and_Classes;
import java.util.Random;
import java.util.Scanner;

/**
 * The Location class
 * Design a class named Location for locating a maximal value and its location in a two-dimensional array. 
 * The class contains public data fields row, column, and maxValue that store the maximal value and its indices in a two-dimensional array with row and column as int types and maxValue as a double type. 
 * Write the following method that returns the location of the largest element in a two-dimensional array:
 * public static Location locateLargest(double[][] a)
 * The return value is an instance of Location. 
 * Write a test program that prompts the user to enter a two-dimensional array and displays the location of the largest element in the array.
 * 
 * 03/01/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_13 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of rows and columns in the array: ");
		System.out.println("The location of the largest element is value " + Location.maxValue + " at (" + Location.row + ", " + Location.column + ")");
		
		input.close();
	}
}

class Location 
{
	public static int row, column = 0;
	public static  double maxValue = 0;
	public static double[][] values = null;
	
	Location(int row, int column)
	{
		values = new double[row][column];
		insert();
		display();
		search();
	}
	
	public static void insert()
	{
		Random randNumber = new Random();
		
		for (int i = 0; i < values.length; i++)
			for (int j = 0; j < values[i].length; j++)
				values[i][j] = randNumber.nextInt(100); 
	}
	
	public static void display()
	{
		Random randNumber = new Random();
		
		for (int i = 0; i < values.length; i++)
		{
			for (int j = 0; j < values[i].length; j++)
				System.out.print(values[i][j] + " ");
			System.out.println();
		}
	}
	
	public static void search()
	{
		for (int i = 0; i < values.length; i++)
			for (int j = 0; j < values[i].length; j++)
				if(values[i][j] > maxValue)
				{
					row = i;
					column = j;
					maxValue = values[i][j];
				}
	}
}
