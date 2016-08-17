package Chapter_04_Mathematical_Functions_Characters_And_Strings;

import java.util.Scanner;

/**
 * Geometry: great circle distance
 * The great circle distance is the distance between two points on the surface of a sphere. 
 * Let (x1, y1) and (x2, y2) be the geographical latitude and longitude of two points.
 * Write a program that prompts the user to enter the latitude and longitude of two points on the earth in degrees 
 * and displays its great circle distance. The average earth radius is 6,371.01 km. 
 * Note that you need to convert the degrees into radians using the Math.toRadians method 
 * since the Java trigonometric methods use radians. The latitude and longitude degrees in the formula are for north and west. 
 * Use negative to indicate south and east degrees.
 * 
 * 08/15/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_02 
{
	public static void main(String[] args) 
	{
		final double AVERAGE_EARTH_RADIUS = 6371.01;
		Scanner input = new Scanner(System.in);
		double x1, y1, x2, y2, d;
		System.out.print("Enter the coordinates for the first point: ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		
		System.out.print("Enter the coordinates for the second point: ");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		
		d = AVERAGE_EARTH_RADIUS * 
				Math.acos(
						Math.sin(Math.toRadians(x1)) * 
						Math.sin(Math.toRadians(x2)) * 
						Math.cos(Math.toRadians(x1)) * 
						Math.cos(Math.toRadians(x2)) * 
						Math.cos(Math.toRadians(y1 - y2))
						);
		
		System.out.print("The distance is " + d);
		
		input.close();
	}
}
