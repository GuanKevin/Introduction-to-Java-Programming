package Chapter_13_Abstract_Classes_and_Interfaces;

import utilities.Circle;
import utilities.GeometricObject;

/**
 * The ComparableCircle class
 * Define a class named ComparableCircle that extends Circle and implements Comparable. 
 * Implement the compareTo method to compare the circles on the basis of area. 
 * Write a test class to find the larger of two instances of ComparableCircle objects.
 * 
 * @author kevgu
 *
 */

public class Programming_Exercise_06
{
	public static void main(String[] args) 
	{
		Circle circle1 = new Circle(5);
		Circle circle2 = new Circle(9);
		
		System.out.print(GeometricObject.max(circle1, circle2));
	}
}
