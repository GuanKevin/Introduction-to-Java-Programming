package Chapter_02_Elementary_Programming;

import java.util.Scanner;

/**
 * Physics: acceleration
 * Write a program that prompts the user to enter the starting velocity v0 in meters/second, 
 * the ending velocity v1 in meters/second, 
 * and the time span t in seconds, and displays the average acceleration.
 * a = (v1 - v0) / t
 * 
 * 07/31/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_09 
{
	public static void main(String[] args) 
	{
		double a, v1, v0, t;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the starting velocity, ending velocity, and the time: ");
		v0 = input.nextDouble();
		v1 = input.nextDouble();
		t = input.nextDouble();
		a = (v1 - v0) / t;
		
		System.out.print("The average acceleration is " + a);
		
		input.close();
	}
}
