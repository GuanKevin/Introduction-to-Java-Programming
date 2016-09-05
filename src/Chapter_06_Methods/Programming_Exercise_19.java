package Chapter_06_Methods;
import java.util.Scanner;

/**
 * The MyTriangle class
 * Create a class named MyTriangle that contains the following two methods:
 * Return true if the sum of any two sides is greater than the third side. 
 * public static boolean isValid(double side1, double side2, double side3)
 * public static double area(double side1, double side2, double side3) 
 * Write a test program that reads three sides for a triangle and computes the area if the input is valid. 
 * Otherwise, it displays that the input is invalid. 
 * The formula for computing the area of a triangle is given in Programming Exercise 2.19.
 *
 * 08/31/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_19 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three sides of a triangle: ");
		double s1, s2, s3;
		s1 = input.nextDouble();
		s2 = input.nextDouble();
		s3 = input.nextDouble();
		
		if (isValid(s1, s2, s3))
			System.out.printf("Area of triangle: %.2f" + area(s1, s2, s3));
		else
			System.out.print("Invalid triangle");
		
		input.close();		
	}
	
	/**
	 * Return true if the sum of any two sides is greater than the third side.
	 * 
	 * @param side1
	 * @param side2
	 * @param side3
	 * @return
	 */
	public static boolean isValid(double side1, double side2, double side3)
	{
		if (((side1 + side2) > side3) && ((side1 + side3) > side2) && ((side1 + side3) > side2))
			return true;
		
		return false;
	}
	
	/**
	 * Calculate for the perimeter of the triangle
	 * Returns the area of the triangle
	 * 
	 * @param side1
	 * @param side2
	 * @param side3
	 * @return
	 */
	public static double area(double side1, double side2, double side3) 
	{
		double perimeter = (side1 + side2 + side3) / 2.0;
		
		return Math.sqrt(perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3));
	}
}
