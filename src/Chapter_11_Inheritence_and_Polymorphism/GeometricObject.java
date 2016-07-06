package Chapter_11_Inheritence_and_Polymorphism;
import java.util.Date;
public class GeometricObject 
{
	private String color = "white";
	private boolean filled;
	private Date dateCreated;
	
	public GeometricObject()
	{
		dateCreated = new Date();
	}
	
	public GeometricObject(String color, boolean filled)
	{
		dateCreated = new Date();
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public boolean isFilled()
	{
		return filled;
	}
	
	public void setFilled(boolean filled)
	{
		this.filled = filled;
	}
	
	public Date getDateCreated()
	{
		return dateCreated;
	}
	
	public String toString()
	{
		return "created on " + dateCreated + "\ncolor:" + color + " and filled: " + filled;
	}
}
