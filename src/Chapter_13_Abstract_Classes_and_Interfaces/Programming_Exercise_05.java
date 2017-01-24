package Chapter_13_Abstract_Classes_and_Interfaces;

import utilities.Circle;
import utilities.GeometricObject;
import utilities.IllegalTriangleException;
import utilities.Triangle;

/**
 * Enable GeometricObject comparable
 * Modify the GeometricObject class to implement the Comparable interface, 
 * and define a static max method in the GeometricObject class for finding the larger of two GeometricObject objects.
 * Write a test program that uses the max method to find the larger of two circles and the larger of two rectangles.
 * 
 * 12/10/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_05
{
	public static void main(String[] args) throws IllegalTriangleException 
	{
		Triangle triangle1 = new Triangle(9, 4, 7);
		Triangle triangle2 = new Triangle(10, 8, 13);
		
		System.out.println(GeometricObject.max(triangle1, triangle2));
		
		Circle circle1 = new Circle(5);
		Circle circle2 = new Circle(8);
		
		System.out.print(GeometricObject.max(circle1, circle2));
	}
}
