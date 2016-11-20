package Utilities;

public class Circle2D 
{
	private double x, y, radius;
	
	public Circle2D()
	{
		this (0, 0, 1);
	}
	
	public Circle2D(double x, double y, double radius)
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public double getArea()
	{
		return Math.pow(getRadius(), 2) * Math.PI;
	}
	
	public double getPerimeter()
	{
		return (2 * Math.PI * getRadius());
	}
	
	public boolean contains(double x, double y)
	{
		MyPoint myPoint = new MyPoint();
		
		if (myPoint.distance(x, y) < getRadius())
			return true;
		return false;
	}
	
	public boolean contains(Circle2D circle)
	{
		MyPoint myPoint = new MyPoint();
		
		if (myPoint.distance(circle.x, circle.y) <= Math.abs(getRadius() - circle.radius))
			return true;
		return false;
	}
	
	public boolean overlaps(Circle2D circle)
	{
		MyPoint myPoint = new MyPoint();
		
		if (myPoint.distance(circle.x, circle.y) <= (getRadius() + circle.radius))
			return true;
		return false;
	}

	public double getX() 
	{
		return x;
	}

	public double getY() 
	{
		return y;
	}

	public double getRadius() 
	{
		return radius;
	}

	
}
