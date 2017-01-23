package utilities;

public class IllegalTriangleException extends Exception  
{
	private static final long serialVersionUID = 1L;
	private double side = 1.0;
	
	public IllegalTriangleException(double side)
	{
		super (side + " is greater than the sum of the other two sides.");
	}

	public double getSide() 
	{
		return side;
	}
}
