package Chapter_11_Inheritence_and_Polymorphism;

public class Triangle extends GeometricObject
{
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle()
	{
		this (1.0, 1.0, 1.0);
	}
	
	public Triangle(double side1, double side2, double side3)
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public Triangle(double side1, double side2, double side3, String color, boolean filled)
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		setColor(color);
		setFilled(filled);
	}
	
	public double getSide1()
	{
		return side1;
	}

	public double getSide2()
	{
		return side2;
	}
	
	public double getSide3()
	{
		return side3;
	}
	
	public double getArea()
	{
		double side = (side1 + side2 + side3) / 2;
		return (Math.sqrt(side * (side - side1) * (side - side2) * (side - side3)));
	}
	
	public double getPerimeter()
	{
		return (side1 * side2 * side3);
	}
	
	//The program should display the area, perimeter, color, and true or false to indicate whether it is filled or not.
	@Override
	public String toString()
	{
		return "Triangle: side1 = " + side1 + " side2 " + side2 + " side3 = " + side3 
				+ "\nArea: " + getArea()
				+ "\nPerimeter: " + getPerimeter()
				+ "\nColor: " + getColor()
				+ "\nFilled: " + isFilled();
	}
}
