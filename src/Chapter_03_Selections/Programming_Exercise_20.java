package Chapter_03_Selections;
import java.util.Scanner;

/**
 * Science: wind-chill temperature
 * Programming Exercise 2.17 gives a formula to compute the wind-chill temperature. 
 * The formula is valid for temperatures in the range between -58ºF and 41ºF and wind speed greater than or equal to 2. 
 * Write a program that prompts the user to enter a temperature and a wind speed. 
 * The program displays the wind-chill temperature if the input is valid; otherwise, 
 * it displays a message indicating whether the temperature and/or wind speed is invalid.
 * 
 * 08/06/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_20 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a temperature: ");
		double temperature = input.nextDouble();
		
		if (temperature >= -58 && temperature <= 41)
		{
			System.out.print("Enter the wind speed: ");
			double windSpeed = input.nextDouble();
			
			if (windSpeed >= 2)
			{
				double wct = (35.74 + (0.6215 * temperature) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * temperature * Math.pow(windSpeed, 0.16)));
				System.out.print("Wind chill temperature: " + wct);
			}
			else
				System.out.println("Invalid input!");
		}
		else
			System.out.println("Invalid input!");
		
		input.close();
	}
}
