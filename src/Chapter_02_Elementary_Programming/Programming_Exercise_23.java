package Chapter_02_Elementary_Programming;
import java.util.Scanner;

/**
 * Cost of driving 
 * Write a program that prompts the user to enter the distance to drive, 
 * the fuel efficiency of the car in miles per gallon, and the price per gallon, and displays the cost of the trip.
 * 
 * 02/04/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_23 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double distance, miles, price, cost;
		System.out.print("Enter distance to drive, fuel efficiency of the car in miles per gallon, and the price per gallon: ");
		distance = input.nextDouble();
		miles = input.nextDouble();
		price = input.nextDouble();
		
		cost = (distance/miles) * price;
		
		System.out.println("The cost to drive " + distance + " miles is " + cost + ".");
		System.out.printf("The cost to drive $%.2f", cost);
		
		input.close();
	}
}
