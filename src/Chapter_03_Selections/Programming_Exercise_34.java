package Chapter_03_Selections;

import java.util.Scanner;

/**
 * Geometry: point on line segment
 * Programming Exercise 3.32 shows how to test whether a point is on an unbounded line. 
 * Revise Programming Exercise 3.32 to test whether a point is on a line segment. 
 * Write a program that prompts the user to enter the three points for p0, p1, and p2 
 * and displays whether p2 is on the line segment from p0 to p1.
 * 
 * 08/06/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_34 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double x0, y0, x1, y1, x2, y2, condition;
		System.out.print("Enter the three points: ");
		x0 = input.nextDouble();
		y0 = input.nextDouble();
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		condition = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		
		if ((condition < 0.01) && (x0 <= x2) && (x2 <= x1))
			System.out.print("It is on the line segment!");
		
		input.close();
	}
}
