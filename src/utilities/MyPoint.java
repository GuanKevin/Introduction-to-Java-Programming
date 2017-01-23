package utilities;


/**
 * Design a class named MyPoint to represent a point with x- and y-coordinates. 
 * The class contains: 
 * The data fields x and y that represent the coordinates with getter methods. 
 * A no-arg constructor that creates a point (0, 0). 
 * A constructor that constructs a point with specified coordinates.
 * A method named distance that returns the distance from this point to a specified point of the MyPoint type.
 * A method named distance that returns the distance from this point to another point with specified x- and y-coordinates.
 * 
 * @author kevgu
 *
 */
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
	
	public double distance(MyPoint p2)
	{
		return distance(this, p2);
	}
	
	public double distance(MyPoint p1, MyPoint p2)
	{
		return Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2));
	}
	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	
	
}
