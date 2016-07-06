package Chapter_02_Elementary_Programming;
import java.util.Scanner;

/**
 * Geometry: distance of two points
 * Write a program that prompts the user to enter two points (x1, y1) and (x2, y2) and displays their distance between them. 
 * The formula for computing the distance is (Square Root)((x2 - x1)^2 + (y2 - y1)^2). 
 * Note that you can use Math.pow(a, 0.5) to compute 2a.
 * 
 * 02/04/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_15 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double x1, x2, y1, y2, distance;
		System.out.print("Enter x1, y1: ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		System.out.print("Enter x2, y2: ");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		
		distance = Math.pow((((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1))), 0.5);
		
		System.out.print("The distance between the two points is " + distance);
		
		input.close();
	}

}
