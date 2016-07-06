package Chapter_02_Elementary_Programming;
import java.util.Scanner;

/**
 * Science: wind-chill temperature
 * Write a program that prompts the user to enter a temperature between -58 ºF and 41ºF 
 * and a wind speed greater than or equal to 2 and displays the wind-chill temperature.
 * Use Math.pow(a, b) to compute v^(0.16)
 * 
 * 02/04/2016
 * @author kevgu
 *
 */
public class Programming_Exercise_17 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		//wct = wind chill temperature
		//speed is wind speed
		double temperature, speed, wct;			
		System.out.print("Enter the temperature between -58 ºF and 41ºF: ");
		temperature = input.nextDouble();
		System.out.print("Enter a wind speed greater than or equal to 2: ");
		speed = input.nextDouble();
		
		//Calculating Wind Chill temperature
		wct = 35.74 + (.6215 * temperature) - (35.75 * Math.pow(speed, 0.16)) + (0.4275 * temperature * Math.pow(speed, 0.16)); 
		
		System.out.println("The wind chill temperature is " + wct);
		System.out.printf("The wind chill temperature is %.5f", wct);
		
		input.close();
	}

}
