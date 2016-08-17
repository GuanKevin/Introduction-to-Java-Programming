package Chapter_02_Elementary_Programming;

import java.util.Scanner;

/**
 * Cost of driving 
 * Write a program that prompts the user to enter the distance to drive, 
 * the fuel efficiency of the car in miles per gallon, and the price per gallon, and displays the cost of the trip.
 * 
 * 08/01/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_23 
{
	public static void main(String[] args) 
	{
		double distance, milesPerGallon, pricePerGallon, cost;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the distance: ");
		distance = input.nextDouble();
		System.out.print("Enter the miles per gallon: ");
		milesPerGallon = input.nextDouble();
		System.out.print("Enter the price per gallon: ");
		pricePerGallon = input.nextDouble(); 
		cost = (distance/milesPerGallon) * pricePerGallon;
		
		System.out.print("The cost will be " + cost);
		
		input.close();
	}
}
