package Chapter_13_Abstract_Classes_and_Interfaces;

import utilities.Octagon;

/**
 * The Octagon class
 * Write a class named Octagon that extends GeometricObject and implements the Comparable and Cloneable interfaces. 
 * Assume that all eight sides of the octagon are of equal length. 
 * The area can be computed using the following formula: 
 * area = (2 + 4 / root(2))* side * side
 * Write a test program that creates an Octagon object with side value 5 and displays its area and perimeter. 
 * Create a new object using the clone method and compare the two objects using the compareTo method.
 * 
 * 12/10/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_11
{
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Octagon o1 = new Octagon(8, "Blue");
		Octagon o2 = (Octagon) o1.clone();
		
		System.out.print(o1.compareTo(o2) + " " + o1.getArea());
	}
}
