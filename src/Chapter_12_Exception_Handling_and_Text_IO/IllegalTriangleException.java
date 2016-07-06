package Chapter_12_Exception_Handling_and_Text_IO;

@SuppressWarnings("serial")
public class IllegalTriangleException extends Exception
{
	double side1;
	double side2;
	double side3;
	
	public IllegalTriangleException(double side1, double side2, double side3)
	{
		super("Not a real triangle:" + " side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
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
}
