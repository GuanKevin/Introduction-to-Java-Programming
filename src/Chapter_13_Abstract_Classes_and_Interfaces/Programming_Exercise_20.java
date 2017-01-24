package Chapter_13_Abstract_Classes_and_Interfaces;

import utilities.Complex;

/**
 * Algebra: solve quadratic equations
 * Rewrite Programming Exercise 3.1 to obtain imaginary roots if the determinant is less than 0 using the Complex class in Programming Exercise 13.17.
 * 
 * 12/14/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_20
{
	public static void main(String[] args) 
	{
		double a = 1, b = 2, c = 3;
		double discriminant = Math.pow(b, 2) - 4 * a * c;
		
		if (discriminant < 0)
		{
			Complex r1 = new Complex(-b / (2 * a), Math.sqrt(-discriminant) / (2 * a));
			Complex r2 = new Complex(-b / (2 * a), -Math.sqrt(-discriminant) / (2 * a));
			System.out.println("The root is " + r1 + " and " + r2);
		}
		else if (discriminant == 0)
		{
			double r1 = -b / (2 * a);
			System.out.println("The root is " + r1);
		}
		else
		{
			double r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
			double r2 = (-b - Math.sqrt(discriminant)) / (2 * a);
			System.out.println("The root is " + r1 + " and " + r2);
		}
	}
}
