package Chapter_13_Abstract_Classes_and_Interfaces;

import utilities.IllegalTriangleException;
import utilities.Triangle;

/**
 * Triangle class
 * Design a new Triangle class that extends the abstract GeometricObject class.
 * Implement the Triangle class. 
 * Write a test program that prompts the user to enter three sides of the triangle, a color, and a Boolean value to indicate whether the triangle is filled. 
 * The program should create a Triangle object with these sides and set the color and filled properties using the input. 
 * The program should display the area, perimeter, color, and true or false to indicate whether it is filled or not.
 * 
 * 12/11/2012
 * @author kevgu
 *
 */

public class Programming_Exercise_01 
{
	public static void main(String[] args) throws IllegalTriangleException 
	{
		Triangle triangle = new Triangle(12, 6, 8, "Blue", true);
		System.out.print(triangle.getColor() + " triangle with area of " + triangle.getArea());
	}
}
