package Chapter_09_Objects_and_Classes;

/**
 * The Rectangle class
 * Following the example of the Circle class in Section 9.2, design a class named Rectangle to represent a rectangle. 
 * The class contains:
 * Two double data fields named width and height that specify the width and height of the rectangle. 
 * The default values are 1 for both width and height.
 * A no-arg constructor that creates a default rectangle.
 * A constructor that creates a rectangle with the specified width and height.
 * A method named getArea() that returns the area of this rectangle.
 * A method named getPerimeter() that returns the perimeter.
 * Write a test program that creates two Rectangle objects—one with width 4 and height 40 and the other with width 3.5 and height 35.9. 
 * Display the width, height, area, and perimeter of each rectangle in this order.
 * 
 * 10/29/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_01 
{
	public static void main(String[] args) 
	{
		RectangleClass defaultRectangle = new RectangleClass();
		System.out.println("\nsWidth " + defaultRectangle.width
				+ "\nHeight " + defaultRectangle.height
				+ "\nArea " + defaultRectangle.getArea()
				+ "\nPerimeter " + defaultRectangle.getPerimeter());
		
		RectangleClass uniqueRectangle = new RectangleClass(4, 40);
		System.out.println("\nWidth " + uniqueRectangle.width
				+ "\nHeight " + uniqueRectangle.height
				+ "\nArea " + uniqueRectangle.getArea()
				+ "\nPerimeter " + uniqueRectangle.getPerimeter());
		
		uniqueRectangle = new RectangleClass(3.5, 35.9);
		System.out.println("\nWidth " + uniqueRectangle.width
				+ "\nHeight " + uniqueRectangle.height
				+ "\nArea " + uniqueRectangle.getArea()
				+ "\nPerimeter " + uniqueRectangle.getPerimeter());
	}
}

class RectangleClass
{
	double width, height;
	
	RectangleClass()
	{
		width = 1;
		height = 1;
	}
	
	RectangleClass(double width, double height)
	{
		this.width = width;
		this.height = height;
	}
	
	double getArea()
	{
		return (width * height);
	}
	
	double getPerimeter()
	{
		return (2 * (width + height));
	}
}


