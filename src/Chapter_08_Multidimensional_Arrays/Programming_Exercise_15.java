package Chapter_08_Multidimensional_Arrays;
import java.util.Scanner;

/**
 * Geometry: same line?
 * Programming Exercise 6.39 gives a method for testing whether three points are on the same line.
 * Write the following method to test whether all the points in the array points are on the same line.
 * public static boolean sameLine(double[][] points)
 * Write a program that prompts the user to enter five points and displays whether they are on the same line.
 * 
 * 10/21/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_15 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		double [][] testLine = new double[5][2];
		getPoints(testLine);
		
		if (sameLine(testLine))
			System.out.print("The points are on the same line.");
		else
			System.out.print("The points are not on the same line.");
	}
	
	/**
	 * Ask the user to enter the five points
	 * The five points are stored in the variable testLine
	 * 
	 * @param testLine
	 */
	public static void getPoints(double[][] testLine)
	{
		System.out.print("Enter 5 points: ");
		
		for (int i = 0; i < testLine.length; i++)
		{
			testLine[i][0] = input.nextDouble();
			testLine[i][1] = input.nextDouble();
		}
	}
	
	/**
	 * Return true if the points are on the same line
	 * 
	 * @param points
	 * @return
	 */
	public static boolean sameLine(double[][] points)
	{
		double x0 = points[0][0];
		double y0 = points[0][1];
		double x1 = points[1][0];
		double y1 = points[1][0];
		  
		for (int i = 2; i < points.length; i++) 
		{
			double c = (x1 - x0) * (points[i][1] - y0) - (points[i][0] - x0) * (y1 - y0);
		   
			if (c != 0) 
				return false;
		} 
		return true;
	}
}
