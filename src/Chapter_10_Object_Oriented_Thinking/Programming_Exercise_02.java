package Chapter_10_Object_Oriented_Thinking;
import utilities.BMI;

/**
 * The BMI class
 * Add the following new constructor in the BMI class: 
 * /** Construct a BMI with the specified name, age, weight, feet, and inches/
 * public BMI(String name, int age, double weight, double feet, double inches) 
 *  
 * 11/19/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_02 
{
	public static void main(String[] args) 
	{
		BMI bmi = new BMI("Really Hungry", 21, 180.0d, 6.0d, 3.0d);
		System.out.println(bmi.getName() + " age " + bmi.getAge() + " BMI: " + bmi.getBMI());
	}
}
