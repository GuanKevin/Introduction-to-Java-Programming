package utilities;

public class Square extends GeometricObject
{
	private double side;
	
	public Square()
	{
		this (1.0, "Black");
	}
	
	public Square(double side)
	{
		this (side, "Black");
	}
	
	public Square(double side, String color)
	{
		this.setSide(side);
		this.setColor(color);
	}
	
	public double getArea()
	{
		return Math.pow(side, 2);
	}

	public double getSide() 
	{
		return side;
	}

	public void setSide(double side) 
	{
		this.side = side;
	}

	public String toString()
	{
		return ("Square's area: " + getArea()
				/*+ "\nSquare's color: " + getColor()*/);
	}

	@Override
	public int compareTo(GeometricObject o) 
	{
		if (this.getArea() > o.getArea())
			return 1;
		else if (this.getArea() == o.getArea())
			return 0;
		else
			return -1;
	}

	@Override
	public double getPerimeter() 
	{
		return 4 * this.getSide();
	}

	@Override
	public void howToColor() 
	{
		System.out.println("Square: Color all four sides!");
	}
}
