package Chapter_02_Elementary_Programming;
import java.util.Scanner;

/**
 * Physics: finding runway length
 * Write a program that prompts the user to enter v in meters/second (m/s) 
 * and the acceleration a in meters/second squared (m/s2), 
 * and displays the minimum runway length.
 * 
 * 02/03/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_12 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter speed and acceleration: ");
		double speed, acceleration;
		speed = input.nextDouble();
		acceleration = input.nextDouble();
		double length = (speed * speed) / (2 * acceleration);
		System.out.print("The minimum runway length for this airplane is " + length);
		input.close();
	}

}
