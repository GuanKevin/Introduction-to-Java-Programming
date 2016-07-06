package Chapter_09_Objects_and_Classes;

public class RegularPolygon 
{
	static private final double pi = 3.14;
	private int numOfSides = 3; 				//defines the number of sides in the polygon
	private double lengthOfSide = 1;			//stores the length of the side 
	private double xCoord = 0;					//defines the x-coordinate of the polygon’s center
	private double yCoord = 0; 					//defines the y-coordinate of the polygon’s center
	
	
	public RegularPolygon()
	{
		this (3, 1.0 , 0.0, 0.0);
	}
	
	public RegularPolygon(int numOfSides, double lengthOfSide) 
	{
		this (numOfSides, lengthOfSide, 0.0, 0.0);
	}

	public RegularPolygon(int numOfSides, double lengthOfSide, double xCoord, double yCoord) 
	{
		this.numOfSides = numOfSides;
		this.lengthOfSide = lengthOfSide;
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}
	
	public void setNumOfSides(int numOfSides)
	{
		this.numOfSides = numOfSides;
	}
	
	public void setLengthOfSide(int lengthOfSide)
	{
		this.lengthOfSide = lengthOfSide;
	}
	
	public void setXCoord(int xCoord)
	{
		this.xCoord = xCoord;
	}
	
	public void setYCoord(int yCoord)
	{
		this.yCoord = yCoord;
	}
	
	public int getNumOfSides()
	{
		return numOfSides;
	}
	
	public double getLengthOfSide()
	{
		return lengthOfSide;
	}
	
	public double getXCoord()
	{
		return xCoord;
	}
	
	public double getYCoord()
	{
		return yCoord;
	}
	
	//The method getPerimeter() that returns the perimeter of the polygon.
	public double getPerimeter()
	{
		return (numOfSides * lengthOfSide);
	}
	
	//The method getArea() that returns the area of the polygon.
	public double getArea()
	{		
		return (numOfSides * Math.pow(lengthOfSide, 2)) / (4 * Math.tan(pi / numOfSides));
	}
}
