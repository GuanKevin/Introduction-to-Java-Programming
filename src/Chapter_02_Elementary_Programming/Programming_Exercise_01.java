package Chapter_02_Elementary_Programming;

import java.util.Scanner;

/**
 * Convert Celsius to Fahrenheit 
 * Write a program that reads a Celsius degree in
 * a double value from the console, then converts it to Fahrenheit and displays the
 * result. The formula for the conversion is as follows:
 * fahrenheit = (9 / 5) * celsius + 32
 * 
 * 07/30/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_01 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter celcius degree: ");
		double celsius = input.nextDouble();
		double fahrenheit = (9.0 / 5) * celsius + 32;
		
		System.out.print("Fahrenheit: " + fahrenheit);
		
		input.close();
	}
}
