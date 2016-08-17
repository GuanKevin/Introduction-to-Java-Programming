package Chapter_02_Elementary_Programming;

import java.util.Scanner;

/**
 * Geometry: distance of two points
 * Write a program that prompts the user to enter two points (x1, y1) and (x2, y2) and displays their distance between them. 
 * The formula for computing the distance is (Square Root)((x2 - x1)^2 + (y2 - y1)^2). 
 * Note that you can use Math.pow(a, 0.5) to compute 2a.
 * 
 * 08/01/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_15 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter point a: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.print("Enter point b: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double lhs = Math.pow((x2 - x1), 2);
		double rhs = Math.pow((y2 - y1), 2);
		double distance = Math.pow((lhs + rhs), 0.5);
		System.out.print("The distance between the two points is " + distance);
		
		input.close();
	}
}
