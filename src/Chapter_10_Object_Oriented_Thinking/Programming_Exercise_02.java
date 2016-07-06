package Chapter_10_Object_Oriented_Thinking;
import java.util.Scanner;

/**
 * The BMI class
 * Add the following new constructor in the BMI class: 
 * /** Construct a BMI with the specified name, age, weight, feet, and inches/
 * public BMI(String name, int age, double weight, double feet, double inches) 
 *  
 * 02/29/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_02 
{
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		BMI bmi = new BMI("Kevin", 20, 160, 5, 10);
		System.out.printf(bmi.name + " BMI is %.2f \n", bmi.calcBMI());
		bmi.setFeet(10);
		System.out.printf(bmi.name + " BMI is %.2f \n", bmi.calcBMI());		
	}
}
