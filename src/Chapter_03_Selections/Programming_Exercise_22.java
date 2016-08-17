package Chapter_03_Selections;
import java.util.Scanner;

/**
 * Geometry: point in a circle?
 * Write a program that prompts the user to enter a point (x, y) 
 * and checks whether the point is within the circle centered at (0, 0) with radius 10.
 * 
 * 08/06/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_22
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the coordinates: ");
		double x , y, distance;
		x = input.nextDouble();
		y = input.nextDouble();
		distance = Math.pow((x * x) + (y * y), 0.5);
		
		if (distance <= 10)
			System.out.print("(" + x + ", " + y + ") is in the circle");
		else
			System.out.print("(" + x + ", " + y + ") is not in the circle");
		
		
		input.close();
	}
}
