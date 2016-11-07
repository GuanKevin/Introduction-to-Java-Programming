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
 * Write a test program that creates two Fan objects. 
 * Assign maximum speed, radius 10, color yellow, and turn it on to the first object. 
 * Assign medium speed, radius 5, color blue, and turn it off to the second object. 
 * Display the objects by invoking their toString method.
 * 
 * 11/07/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_08 
{
	public static void main(String[] args) 
	{
		Fan myFan = new Fan();
		System.out.println(myFan.toString());
		
		myFan.setSpeed(myFan.FAST);
		myFan.setRadius(10);
		myFan.setColor("yellow");
		myFan.setOn(true);
		System.out.print(myFan.toString());
	}
}

class Fan
{
	final int SLOW = 1, MEDIUM = 2, FAST = 3;
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	String color = "blue";
	
	public Fan()
	{
		setSpeed(FAST);
		setOn(true);
		setRadius(1000);
		setColor("See Through");
	}
	
	public String toString()
	{
		if (isOn())
			return ("Speed:" + getSpeed() + "\nColor: " + getColor() + "\nRadius: " + getRadius());
		else
			return ( "\nColor: " + getColor() + "\nRadius: " + getRadius() + "\nFan is off.");
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isOn() {
		return on;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
}