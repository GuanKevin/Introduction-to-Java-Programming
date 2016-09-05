package Chapter_06_Methods;
import java.util.Scanner;

/**
 * Conversions between Celsius and Fahrenheit
 * Write a class that contains the following two methods.
 * Convert from Celsius to Fahrenheit  
 * public static double celsiusToFahrenheit(double celsius) 
 * Convert from Fahrenheit to Celsius  
 * public static double fahrenheitToCelsius(double fahrenheit)
 * The formula for the conversion is:
 * fahrenheit = (9.0 / 5) * celsius + 32
 * celsius = (5.0 / 9) * (fahrenheit – 32)
 *
 * 08/29/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_08 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the temperature: ");
		double temperature = input.nextDouble();
		
		System.out.println("Temperature if celcius, converted to fahrenheit: " + celsiusToFahrenheit(temperature));
		System.out.println("Temperature if fahrenheit, converted to celcius: " + fahrenheitToCelsius(temperature));
		
		input.close();		
	}
	
	/**
	 * Convert from Celsius to Fahrenheit  
	 * 
	 * @param celsius
	 * @return
	 */
	public static double celsiusToFahrenheit(double celsius) 
	{
		return ((9.0 / 5) * (celsius + 32));
	}
	
	/**
	 * Convert from Fahrenheit to Celsius  
	 * 
	 * @param fahrenheit
	 * @return
	 */
	public static double fahrenheitToCelsius(double fahrenheit)
	{
		return ((5.0 / 9) * (fahrenheit - 32));
	}
}
