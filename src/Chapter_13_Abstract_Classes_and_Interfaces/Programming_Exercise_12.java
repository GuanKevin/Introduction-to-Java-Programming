package Chapter_13_Abstract_Classes_and_Interfaces;

import utilities.Circle;
import utilities.GeometricObject;
import utilities.Rectangle;

/**
 * Sum the areas of geometric objects
 * Write a method that sums the areas of all the geometric objects in an array. 
 * The method signature is:
 * public static double sumArea(GeometricObject[] a)
 * Write a test program that creates an array of four objects (two circles and two rectangles) and computes their total area using the sumArea method.
 * 
 * 12/11/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_12
{
	public static void main(String[] args) 
	{
		GeometricObject[] a = {new Circle(5), new Circle(9.4), new Rectangle(6.5, 8.4), new Rectangle(4.5, 6.4)};
	
		System.out.print("The area of the " + a.length + " objects is " + String.format("%.2f", GeometricObject.sumArea(a)));
	}
}
