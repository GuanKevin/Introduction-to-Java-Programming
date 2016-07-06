package Chapter_02_Elementary_Programming;
import java.util.Scanner;

/**
 * Health application: computing BMI 
 * Body Mass Index (BMI) is a measure of health on weight. 
 * It can be calculated by taking your weight in kilograms and dividing by the square of your height in meters. 
 * Write a program that prompts the user to enter a weight in pounds and height in inches and displays the BMI. 
 * Note that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
 * 
 * 02/04/2016
 * @author kevgu
 *
 */
public class Programming_Exercise_14 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double weight, height, bmi;
		System.out.print("Enter weight in pounds: ");
		weight = input.nextDouble();
		System.out.print("Enter height in inches: ");
		height = input.nextDouble();
		
		//Pound to kilogram conversion is pound * 0.45359237
		//Inch to meter conversion is inch * 0.0254
		bmi = (weight * 0.45359237)/((height * 0.0254) * (height * 0.0254));
		
		System.out.println("BMI is " + bmi);
		System.out.printf("BMI is %.4f", bmi);

		input.close();
		
	}

}
