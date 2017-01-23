package Chapter_13_Abstract_Classes_and_Interfaces;

import utilities.Circle;

/**
 * Enable Circle comparable
 * Rewrite the Circle class in Listing 13.2 to extend GeometricObject and implement the Comparable interface. 
 * Override the equals method in the Object class. Two Circle objects are equal if their radii are the same. 
 * 
 * 12/10/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_09
{
	public static void main(String[] args) 
	{
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(15);
		
		System.out.print(c1.equals(c2));
	}
}
