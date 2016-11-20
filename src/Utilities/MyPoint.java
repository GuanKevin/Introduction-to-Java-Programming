package Utilities;

public class MyPoint 
{
	private double x, y;

	public MyPoint()
	{
		this(0, 0);
	}
	
	public MyPoint(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public double distance(MyPoint myPoint)
	{
		return distance(myPoint.x, myPoint.y);
	}
	
	public double distance(double x2, double y2)
	{
		return Math.sqrt((getX() - x2) * (getX() - x2) + (getY() - y2) * (getY() - y2));
	}
	
	public double getX() 
	{
		return x;
	}

	public double getY() 
	{
		return y;
	}
	
	
}
