package Chapter_13_Abstract_Classes_and_Interfaces;

import utilities.Rectangle;

/**
 * Enable Rectangle comparable
 * Rewrite the Rectangle class in Listing 13.3 to extend GeometricObject and implement the Comparable interface. 
 * Override the equals method in the Object class. 
 * Two Rectangle objects are equal if their areas are the same. 
 * 
 * 12/10/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_10
{
	public static void main(String[] args) 
	{
		Rectangle r1 = new Rectangle(4, 4);
		Rectangle r2 = new Rectangle(4, 3);
		
		System.out.print(r1.equals(r2));
	}
}
