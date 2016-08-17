package Chapter_02_Elementary_Programming;

import java.util.Scanner;

/**
 * Compute the volume of a cylinder 
 * Write a program that reads in the radius and length of a cylinder and computes the area and volume using the following formulas: 
 * area = radius * radius * pi 
 * volume = area * length
 * 
 * 07/31/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_02 
{
	public static void main(String[] args)
	{
		double pi = 3.14159; 
		double area, radius, volume, length;
		
		System.out.print("Enter the radius of the cylinder: ");
		Scanner input = new Scanner(System.in);
		radius = input.nextDouble();
		System.out.print("Enter the length of the cylinder: ");
		length = input.nextDouble();
		area = radius * radius * pi;
		volume = area * length;
		
		System.out.println("The area of the cylinder is: " + area);
		System.out.print("The volume of the cylinder is: " + volume);
		
		input.close();
	}
}
