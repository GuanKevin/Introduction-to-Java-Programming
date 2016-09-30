package Chapter_09_Objects_and_Classes;
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
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		Location location = null;
		System.out.print("Enter the number of rows and columns in the array: ");
		location = new Location(input.nextInt(), input.nextInt());
		System.out.println("The location of the largest element is value " + location.maxValue + " at (" + location.row + ", " + location.column + ")");
	}

}
