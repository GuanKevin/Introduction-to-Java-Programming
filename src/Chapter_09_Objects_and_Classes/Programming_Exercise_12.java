package Chapter_09_Objects_and_Classes;

import java.util.Scanner;

/**
 * Geometry: intersecting point
 * Suppose two line segments intersect. 
 * The two endpoints for the first line segment are (x1, y1) and (x2, y2) and for the second line segment are (x3, y3) and (x4, y4). 
 * Write a program that prompts the user to enter these four endpoints and displays the intersecting point. 
 * As discussed in Programming Exercise 3.25, the intersecting point can be found by solving a linear equation. 
 * Use the LinearEquation class in Programming Exercise 9.11 to solve this equation.
 * 
 * 11/07/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_12 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter for a, b, c, d, e, f: ");
		LinearEquation equation = new LinearEquation(input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble());
		
		if (equation.isSolvable())
			System.out.println("(" + equation.getX() + "," + equation.getY() + ")");
		else
			System.out.println("The equation has no solution.");
		
		input.close();
	}
}