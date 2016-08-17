package Chapter_02_Elementary_Programming;

import java.util.Scanner;

/**
 * Health application: computing BMI 
 * Body Mass Index (BMI) is a measure of health on weight. 
 * It can be calculated by taking your weight in kilograms and dividing by the square of your height in meters. 
 * Write a program that prompts the user to enter a weight in pounds and height in inches and displays the BMI. 
 * Note that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
 * BMI = kg / (m * m);
 * 
 * 08/01/2016
 * @author kevgu
 *
 */
public class Programming_Exercise_14 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your weight in pounds: ");
		double weightlb = input.nextDouble();
		System.out.print("Enter your height in inches: ");
		double heightin = input.nextDouble();
		double weightkg = weightlb * 0.45359237;
		double heightm = heightin * 0.0254;
		double bmi = (weightkg / (heightm * heightm));
		System.out.println("Your BMI is " + bmi);
		
		input.close();
	}
}
