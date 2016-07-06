package Chapter_03_Selections;
import java.util.Scanner;

/**
 * Geometry: point in a circle?
 * Write a program that prompts the user to enter a point (x, y) 
 * and checks whether the point is within the circle centered at (0, 0) with radius 10.
 * 
 * 02/11/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_22 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		final int radius = 10;
		System.out.print("Enter point (x, y)");
		double x, y, distance;
		x = input.nextDouble();
		y = input.nextDouble();
		
		distance = Math.pow(((x * x) + (y * y)), 0.5);
		
		if (distance < radius)
		{
			System.out.print("Coordinates (" + x + "," + y + ")" + "\nis in the circle");
		}
		else
		{
			System.out.print("Coordinates (" + x + "," + y + ")" + "\nis not in the circle");
		}
		
		input.close();
	}

}
