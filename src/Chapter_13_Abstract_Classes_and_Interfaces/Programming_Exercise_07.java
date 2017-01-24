package Chapter_13_Abstract_Classes_and_Interfaces;

import utilities.Circle;
import utilities.GeometricObject;
import utilities.IllegalTriangleException;
import utilities.Square;
import utilities.Triangle;

/**
 * The Colorable interface
 * Design an interface named Colorable with a void method named howToColor(). 
 * Every class of a colorable object must implement the Colorable interface. 
 * Design a class named Square that extends GeometricObject and implements Colorable. 
 * Implement howToColor to display the message Color all four sides. 
 * Write a test program that creates an array of five GeometricObjects. 
 * For each object in the array, display its area and invoke its howToColor method if it is colorable.
 * 
 * 12/10/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_07
{
	public static void main(String[] args) throws IllegalTriangleException 
	{
		GeometricObject[] objects = new GeometricObject[3];
		objects[0] = new Triangle(6, 4, 8);
		objects[1] = new Circle(5);
		objects[2] = new Square(8, "blue");
		
		for (int i = 0; i < objects.length; i++)
			objects[i].howToColor();
	}
}
