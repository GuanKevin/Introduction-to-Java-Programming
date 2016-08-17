package Chapter_02_Elementary_Programming;

import java.util.Scanner;

/**
 * Physics: finding runway length
 * Given an airplane’s acceleration a and take-off speed v, 
 * you can compute the minimum runway length needed for an airplane to take off using the following formula:
 * length = v^2 / 2a
 * Write a program that prompts the user to enter v in meters/second (m/s) 
 * and the acceleration a in meters/second squared (m/s2), and displays the minimum runway length.
 * 
 * 07/31/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_12 
{
	public static void main(String[] args) 
	{
		double length, v, a;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the airplane's acceleration and enter the take-off speed: ");
		a = input.nextDouble();
		v = input.nextDouble();
		length = (v * v) / (2 * a);
		System.out.print("The minimum runway length is " + length);
		
		input.close();
	}
}
