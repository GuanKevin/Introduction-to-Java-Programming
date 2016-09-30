package Chapter_08_Multidimensional_Arrays;
import java.util.Scanner;

/**
 * Geometry: intersecting point
 * Write a method that returns the intersecting point of two lines. 
 * The intersecting point of the two lines can be found by using the formula shown in Programming Exercise 3.25. 
 * Assume that (x1, y1) and (x2, y2) are the two points on line 1 and (x3, y3) and (x4, y4) are on line 2. 
 * The method header is public static double[] getIntersectingPoint(double[][] points) 
 * The points are stored in a 4-by-2 two-dimensional array points with (points[0][0], points[0][1]) for (x1, y1). 
 * The method returns the intersecting point or null if the two lines are parallel. 
 * Write a program that prompts the user to enter four points and displays the intersecting point.
 * 
 * 02/25/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_31 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		double[][] points = new double[4][2];
		System.out.print("Enter two points in a line x1, y1, x2, y2: ");
		System.out.print("Enter another two points in a line x3, y3, x4, y4: ");
		for(int i = 0; i < 4; i++)
		{
			points[i][0] = input.nextDouble();
			points[i][1] = input.nextDouble();
		}
		//System.out.print("The intersecting point is (" + getIntersectingPoint(points) + ")");
	}
/*	public static double[] getIntersectingPoint(double[][] points)
	{
		double slope1 = (points[0][1] - points[1][1]) / (points[0][0] - points[1][0]);
		double slope2 = (points[2][1] - points[3][1]) / (points[2][0] - points[3][0]);
		double b1 = points[0][1] - slope1 * points[0][0];
		double b2 = points[3][1] - slope2 * points[3][0];
		return double[]{0, 0, 0};
	}*/
}
