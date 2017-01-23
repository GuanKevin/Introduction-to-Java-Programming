package Chapter_12_Exception_Handling_and_Text_IO;

import utilities.IllegalTriangleException;
import utilities.Triangle;

/**
 * IllegalTriangleException
 * Programming Exercise 11.1 defined the Triangle class with three sides. 
 * In a triangle, the sum of any two sides is greater than the other side. 
 * The Triangle class must adhere to this rule. 
 * Create the IllegalTriangleException class, 
 * and modify the constructor of the Triangle class to throw an IllegalTriangleException object 
 * if a triangle is created with sides that violate the rule, as follows:
 * Construct a triangle with the specified sides  
 * public Triangle(double side1, double side2, double side3) throws IllegalTriangleException
 * 
 * 12/06/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_05
{
	public static void main(String[] args)  
	{
		try
		{
			Triangle triangle = new Triangle(1, 1, 1);
			triangle.setSide2(5);
		}
		catch (IllegalTriangleException ex)
		{
			System.out.print(ex.getMessage());
		}
	}
}
