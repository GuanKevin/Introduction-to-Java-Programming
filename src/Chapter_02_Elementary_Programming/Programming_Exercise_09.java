package Chapter_02_Elementary_Programming;
import java.util.Scanner;

/**
 * Physics: acceleration
 * Write a program that prompts the user to enter the starting velocity v0 in meters/second, 
 * the ending velocity v1 in meters/second, 
 * and the time span t in seconds, and displays the average acceleration.
 * 
 * 02/03/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_09 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the starting velocity v0, ending velocity v1 in meters/second and time span t in seconds: ");
		double v0, v1, seconds;
		v0 = input.nextDouble();
		v1 = input.nextDouble();
		seconds = input.nextDouble();
		
		System.out.println("The average acceleration is " + (v1 - v0)/seconds);
		input.close();
	}

}
