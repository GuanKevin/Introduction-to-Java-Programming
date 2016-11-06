package Chapter_08_Multidimensional_Arrays;
import java.util.Scanner;

/**
 * Geometry: area of a triangle
 * Write a method that returns the area of a triangle using the following header: 
 * public static double getTriangleArea(double[][] points) 
 * The points are stored in a 3-by-2 two-dimensional array points with points[0][0] and points[0][1] for (x1, y1). 
 * The triangle area can be computed using the formula in Programming Exercise 2.19. 
 * The method returns 0 if the three points are on the same line. 
 * Write a program that prompts the user to enter three points of a triangle and displays the triangle's area.
 * s = (side1 + side2 + side3)/2;
 * area = square root of (s(s - side1)(s - side2)(s - side3))
 * 
 * 10/28/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_32 
{
	public static void main(String[] args) 
	{
		double[][] triangleArray = enterPoints();
		
		System.out.println("The area of the triangle is " + getTriangleArea(triangleArray));
	}
	
	public static double[][] enterPoints()
	{
		Scanner input = new Scanner(System.in);
		double[][] triangleArray = new double[3][2];
		System.out.print("Enter x1, y1, x2, y2. x3, y3: ");
		
		for(int i = 0; i < 3; i++)
		{
			triangleArray[i][0] = input.nextDouble();
			triangleArray[i][1] = input.nextDouble();
		}
		
		input.close();
		return triangleArray;
	}
	
	public static double getTriangleArea(double[][] points)
	{
		double side1 = Math.sqrt(Math.pow((points[0][0] - points[1][0]), 2) + Math.pow((points[0][1] - points[1][1]), 2));
		double side2 = Math.sqrt(Math.pow((points[1][0] - points[2][0]), 2) + Math.pow((points[1][1] - points[2][1]), 2));
		double side3 = Math.sqrt(Math.pow((points[2][0] - points[0][0]), 2) + Math.pow((points[2][1] - points[0][1]), 2));
		
		double s = (side1 + side2 + side3) / 2;
		
		return Math.sqrt((s * (s - side1) * (s - side2) * (s - side3))); 
	}
}
