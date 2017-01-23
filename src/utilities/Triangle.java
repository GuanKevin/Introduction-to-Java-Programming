package utilities;

public class Triangle extends GeometricObject
{
	private double side1, side2, side3;
	
	public Triangle() throws IllegalTriangleException    
	{
		this (1.0, 1.0, 1.0, "Blue", true);
	}
	
	public Triangle(double side1, double side2, double side3) throws IllegalTriangleException   
	{		
		if (side1 > (side2 + side3))
			throw new IllegalTriangleException(side1);
		else if (side2 > (side1 + side3))
			throw new IllegalTriangleException(side2);
		else if (side3 > (side1 + side2))
			throw new IllegalTriangleException(side3);
		else
		{
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		}   
	}
	
	public Triangle(double side1, double side2, double side3, String color, boolean filled) throws IllegalTriangleException
	{
		if (side1 > (side2 + side3))
			throw new IllegalTriangleException(side1);
		else if (side2 > (side1 + side3))
			throw new IllegalTriangleException(side2);
		else if (side3 > (side1 + side2))
			throw new IllegalTriangleException(side3);
		else
		{
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		} 
		super.setColor(color);
		super.setFilled(filled);
	}
	
	@Override
	public double getArea() 
	{
		double p = (side1 + side2 + side3) / 2.0;
		
		return Math.sqrt(p * (p - side1) * (p - side2) *  (p - side3));
	}

	@Override
	public double getPerimeter() 
	{
		return (side1 + side2 + side3);
	}

	public double getSide1() 
	{
		return side1;
	}

	public void setSide1(double side1) throws IllegalTriangleException   
	{
		if (side1 > (side2 + side3))
			throw new IllegalTriangleException(side1);
		else
			this.side1 = side1;
	}

	public double getSide2() 
	{
		return side2;
	}

	public void setSide2(double side2) throws IllegalTriangleException   
	{
		if (side2 > (side1 + side3))
			throw new IllegalTriangleException(side2);
		else
			this.side2 = side2;
	}

	public double getSide3() 
	{
		return side3;
	}

	public void setSide3(double side3) throws IllegalTriangleException   
	{
		if (side3 > (side2 + side1))
			throw new IllegalTriangleException(side3);
		else
			this.side3 = side3;
	}
	
	public String toString()
	{
		return "Triangle: side1 = " + side1 + " side2 = " + side2 +" side3 = " + side3; 
	}

	@Override
	public int compareTo(GeometricObject o) 
	{
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() == o.getArea())
			return 0;
		else
			return -1;
	}

	@Override
	public void howToColor() 
	{
		System.out.println("Triangle: Color all 3 sides.");
	}
}
