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
 * 02/
 * @author kevgu
 *
 */

public class Programming_Exercise_20 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the temperature in F: ");
		double temperature = input.nextDouble();
		System.out.print("Enter the wind speed: ");
		double windspeed = input.nextDouble();
		
		if (temperature < -58 || temperature > 41)
		{
			System.out.println("The temperature inputed is invalid!");
		}
		if (windspeed < 2)
		{
			System.out.println("The wind speed is invalid!");
		}
		else
		{
			double windchilltemp = 35.74 + (.6215 * temperature) 
					- (35.75 * Math.pow(windspeed, 0.16)) 
					+ (0.4275 * temperature * Math.pow(windspeed, 0.16));
			
			System.out.println("The wind chill temperature is: " + windchilltemp);
		}
		
		input.close();
	}

}
