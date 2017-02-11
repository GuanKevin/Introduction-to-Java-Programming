package utilities;

public class Rectangle extends GeometricObject 
{
	private double width;
	private double height;

	public Rectangle() 
	{
		this (0, 0);
	}

	public Rectangle(double width, double height) 
	{
		this.width = width;
	    this.height = height;
	}

	/** Return width */
	public double getWidth() 
	{
		return width;
	}

	/** Set a new width */
	public void setWidth(double width) 
	{
		this.width = width;
	}

	/** Return height */
	public double getHeight() 
	{
		return height;
	}

	/** Set a new height */
	public void setHeight(double height) 
	{
		this.height = height;
	}

	/** Return area */
	public double getArea() 
	{
		return width * height;
	}

	/** Return perimeter */
	public double getPerimeter() 
	{
		return 2 * (width + height);
	}

	@Override
	public int compareTo(GeometricObject o) 
	{
		if (this.getArea() > o.getArea())
			return 1;
		else if (this.getArea() < o.getArea())
			return -1;
		return 0;
	}
	
	public boolean equals (GeometricObject o)
	{
		return this.getArea() == ((Rectangle) o).getArea();
	}

	@Override
	public void howToColor() 
	{
		System.out.println("Rectangle: Draw around it!");
	}
	
	@Override
	public String toString()
	{
		return ("[Rectangle] Area: " + getArea());
	}
}
