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
 * 03/01/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_01 
{
	public static void main(String[] args) 
	{
		Rectangle defRec = new Rectangle();
		Rectangle intRec = new Rectangle(4, 40);
		Rectangle douRec = new Rectangle(3.5, 35.9);
		
		System.out.println("The default Rectangle has a \nwidth of " + defRec.getWidth() + 
				"\nheight of " + defRec.getHeight() +
				"\narea of " + defRec.getArea() + 
				"\nperimeter of " + defRec.getPerimeter());
		System.out.println("The integer Rectangle has a \nwidth of " + intRec.getWidth() + 
				"\nheight of " + intRec.getHeight() +
				"\narea of " + intRec.getArea() + 
				"\nperimeter of " + intRec.getPerimeter());
		System.out.println("The double Rectangle has a \nwidth of " + douRec.getWidth() + 
				"\nheight of " + douRec.getHeight() +
				"\narea of " + douRec.getArea() + 
				"\nperimeter of " + douRec.getPerimeter());
	}
}

class Rectangle
{
	double width;
	double height;
	double area;
	double perimeter;
	
	Rectangle()
	{
		setWidth(1);
		setHeight(1);
	}
	
	Rectangle(double width, double height)
	{
		setWidth(width);
		setHeight(height);
	}
	
	public void setWidth(double width)
	{
		this.width = width;
	}
	
	public void setHeight(double height)
	{
		this.height = height;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public double getArea()
	{
		area = width * height;
		return area;
	}
	
	public double getPerimeter()
	{
		perimeter = 2 * (width + height);
		return perimeter;
	}
}