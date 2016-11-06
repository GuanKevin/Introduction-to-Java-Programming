package Chapter_09_Objects_and_Classes;

/**
 * The Fan class
 * Design a class named Fan to represent a fan. The class contains: 
 * Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to denote the fan speed. 
 * A private int data field named speed that specifies the speed of the fan (the default is SLOW).
 * A private boolean data field named on that specifies whether the fan is on (the default is false).
 * A private double data field named radius that specifies the radius of the fan (the default is 5).
 * A string data field named color that specifies the color of the fan (the default is blue).
 * The accessor and mutator methods for all four data fields.
 * A no-arg constructor that creates a default fan.
 * A method named toString() that returns a string description for the fan. 
 * If the fan is on, the method returns the fan speed, color, and radius in one combined string. 
 * If the fan is not on, the method returns the fan color and radius along with the string “fan is off” in one combined string.
 * Draw the UML diagram for the class and then implement the class. 
 * Write a test program that creates two Fan objects. 
 * Assign maximum speed, radius 10, color yellow, and turn it on to the first object. 
 * Assign medium speed, radius 5, color blue, and turn it off to the second object. 
 * Display the objects by invoking their toString method.
 * 
 * 03/01/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_08 
{
	public static void main(String[] args) 
	{
		Fan defFan = new Fan();
		System.out.println(defFan.toString());
		Fan maxFan = new Fan(defFan.FAST, 10, true, "yellow");
		System.out.println(maxFan.toString());
		Fan medFan = new Fan(defFan.MEDIUM, 5, false, "blue");
		System.out.println(medFan.toString());
	}
}
class Fan
{
	final int SLOW = 1;
	final int MEDIUM = 2;
	final int FAST = 3;
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	String color = "blue";
	
	//A no-arg constructor that creates a default fan.
	Fan()
	{
		speed = SLOW;
		on = true;
		radius = 1;
		color = "silver";
	}
	
	Fan(int speed, double radius, boolean on, String color)
	{
		this.speed = speed;
		this.on = on;
		this.radius = radius;
		this.color = color;
	}
	
	//The accessor and mutator methods for all four data fields.
	public void setSpeed(int speed)
	{
		this.speed = speed;
	}
	
	public int getSpeed()
	{
		return speed;
	}
	
	public void setStatus(boolean on)
	{
		this.on = on;
	}
	
	public boolean getStatus()
	{
		return on;
	}
	
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public void setSpeed(String color)
	{
		this.color = color;
	}
	
	public String getColor()
	{
		return color;
	}
	
	//A method named toString() that returns a string description for the fan.
	//If the fan is on, the method returns the fan speed, color, and radius in one combined string. 
	//If the fan is not on, the method returns the fan color and radius along with the string “fan is off” in one combined string.
	@Override
	public String toString()
	{
		if (getStatus() == true)
			return ("The fan is currently on." 
					+ "The speed of the fan is " + getSpeed()
					+ "The radius of the fan is " + getRadius()
					+ "The color of the fan is " + getColor());
		else
		return ("The color of the fan is " + getColor() + " fan is off");
	}
}
