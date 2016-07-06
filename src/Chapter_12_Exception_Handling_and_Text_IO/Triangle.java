package Chapter_12_Exception_Handling_and_Text_IO;

public class Triangle
{
	private double side1;
	private double side2;
	private double side3;

	public Triangle () throws IllegalTriangleException
	{
		this (3, 4, 5);
	}
	
	public Triangle(double side1, double side2, double side3) throws IllegalTriangleException
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		
		checkTriangle();
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
	
	public void setSide1(double side1) throws IllegalTriangleException 
	{
		this.side1 = side1;
		checkValidTriangle();
	}
	
	public void setSide2(double side2) throws IllegalTriangleException 
	{
		this.side2 = side2;
		checkValidTriangle();
	}
	
	public void setSide3(double side3) throws IllegalTriangleException 
	{
		this.side3 = side3;
		checkValidTriangle();
	}
	
	public boolean checkTriangle() throws IllegalTriangleException
	{
		return ((side1 + side2 > side3) && (side1 + side3 > side2) && (side3 + side2 > side1));
	}
	
	public void checkValidTriangle() throws IllegalTriangleException
	{
		if (!checkTriangle()) 
		{
			throw new IllegalTriangleException(side1, side2, side3);
		}
	}
}
