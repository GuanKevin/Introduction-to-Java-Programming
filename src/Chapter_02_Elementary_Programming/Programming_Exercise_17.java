package Chapter_02_Elementary_Programming;

import java.util.Scanner;

/**
 * Science: wind-chill temperature
 * Write a program that prompts the user to enter a temperature between -58 ºF and 41ºF 
 * and a wind speed greater than or equal to 2 and displays the wind-chill temperature.
 * Use Math.pow(a, b) to compute v^(0.16)
 * 
 * 08/01/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_17 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the temperature in fahrenheit: ");
		double fahrenheit = input.nextDouble();
		System.out.print("Enter the wind speed: ");
		double windSpeed = input.nextDouble();
		double wct = (35.74 + (0.6215 * fahrenheit) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * fahrenheit * Math.pow(windSpeed, 0.16)));	//Wind Chill Temperature
		System.out.print("The wind chill temperature is " + wct);
		
		input.close();
	}
}
