package Utilities;

public abstract class GeometricObject implements Comparable<GeometricObject>
{
	  private String color = "blue";
	  private boolean filled;

	  /**Default construct*/
	  protected GeometricObject() 
	  {
		  
	  }

	  /**Construct a geometric object*/
	  protected GeometricObject(String color, boolean filled) 
	  {
		  this.color = color;
		  this.filled = filled;
	  }

	  /**Getter method for color*/
	  public String getColor() 
	  {
		  return color;
	  }

	  /**Setter method for color*/
	  public void setColor(String color) 
	  {
		  this.color = color;
	  }

	  /**Getter method for filled. Since filled is boolean,
	     so, the get method name is isFilled*/
	  public boolean isFilled() 
	  {
		  return filled;
	  }

	  /**Setter method for filled*/
	  public void setFilled(boolean filled) 
	  {
		  this.filled = filled;
	  }
	  
	  public static GeometricObject max(GeometricObject o1, GeometricObject o2)
	  {
		  return o1.compareTo(o2) == 1 ? o1 : o2;
	  }

	  /**Abstract method findArea*/
	  public abstract double getArea();

	  /**Abstract method getPerimeter*/
	  public abstract double getPerimeter();
	}
