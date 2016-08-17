package Chapter_02_Elementary_Programming;

import java.util.Scanner;

/**
 * Geometry: area of a triangle
 * Write a program that prompts the user to enter three points 
 * (x1, y1), (x2, y2), (x3, y3) of a triangle and displays its area.
 * s = (side1 + side2 + side3)/2;
 * area = square root of (s(s - side1)(s - side2)(s - side3))
 * 
 * 08/01/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_19 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double x1, x2, x3, y1, y2, y3, side1, side2, side3, s, area;
		System.out.print("Enter the three points ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		x3 = input.nextDouble();
		y3 = input.nextDouble();
		
		side1 = Math.pow(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2), 0.5);
		side2 = Math.pow(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2), 0.5);
		side3 = Math.pow(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2), 0.5);
	
		s = (side1 + side2 + side3) / 2.0;
		area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);
		
		System.out.print("The area of the triangle is " + area);
				
		input.close();
	}
}
