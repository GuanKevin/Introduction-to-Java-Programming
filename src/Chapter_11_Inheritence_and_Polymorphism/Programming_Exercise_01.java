package Chapter_11_Inheritence_and_Polymorphism;
import java.util.Scanner;

import Utilities.GeometricObject;
import Utilities.Triangle;

/**
 * The Triangle class
 * Design a class named Triangle that extends GeometricObject. 
 * The class contains:
 * Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of the triangle. 
 * A no-arg constructor that creates a default triangle.  
 * A constructor that creates a triangle with the specified side1, side2, and side3. 
 * The accessor methods for all three data fields.
 * A method named getArea() that returns the area of this triangle. 
 * A method named getPerimeter() that returns the perimeter of this triangle.
 * A method named toString() that returns a string description for the triangle.
 * The toString() method is implemented as follows: 
 * return "Triangle: side1 = " + side1 + " side2 = " + side2 +" side3 = " + side3; 
 * Write a test program that prompts the user to enter three sides of the triangle, a color, 
 * and a Boolean value to indicate whether the triangle is filled. 
 * The program should create a Triangle object with these sides and set the color and filled properties using the input. 
 * The program should display the area, perimeter, color, and true or false to indicate whether it is filled or not.
 * 
 * 03/15/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_01
{
	static Scanner input = new Scanner(System.in);
	static double side1, side2, side3;
	static String color;
	static boolean isFilled;
	
	public static void main(String[] args) 
	{
		requestUserInputs();
		
		GeometricObject myTriangle = new Triangle(side1, side2, side3, color, isFilled);
		System.out.println(myTriangle.toString());
	}
	
	public static void requestUserInputs()
	{
		System.out.println("Enter 3 sides of the triangle: ");
		side1 = input.nextDouble();
		side2 = input.nextDouble();
		side3 = input.nextDouble();
		System.out.println("Enter the color of the triangle: ");
		color = input.next();
		System.out.println("Enter boolean value for whether the triangle is filled: ");
		isFilled = input.nextBoolean();
	}
}
