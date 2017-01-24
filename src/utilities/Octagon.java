package utilities;

public class Octagon extends GeometricObject implements Cloneable
{
	private double sides;
	
	public Octagon()
	{
		this (5, "Blue");
	}
	
	public Octagon(double sides, String color)
	{
		this.getSide(sides);
		this.setColor(color);
	}
	
	public double getSide()
	{
		return sides;
	}
	
	public void getSide(double sides)
	{
		this.sides = sides;
	}

	@Override
	public int compareTo(GeometricObject o) 
	{
		if (this.getArea() > o.getArea())
			return 1;
		else if (this.getArea() < o.getArea())
			return -1;
		else
			return 0;
	}
	
	public boolean equals(GeometricObject o)
	{
		return this.getArea() == ((Octagon) o).getArea(); 
	}

	@Override
	public void howToColor() 
	{
		System.out.println("Pentagon: Color 8 times!");
	}

	@Override
	public double getArea() 
	{
		return (2 + (4 / Math.sqrt(2)) * Math.pow(sides, 2));
	}

	@Override
	public double getPerimeter() 
	{
		return 8 * sides;
	}
	
	public Object clone() throws CloneNotSupportedException 
	{
		return super.clone();
	}
}
