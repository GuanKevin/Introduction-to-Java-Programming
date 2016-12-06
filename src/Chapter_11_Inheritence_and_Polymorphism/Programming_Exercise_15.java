package Chapter_11_Inheritence_and_Polymorphism;
import java.util.Scanner;
/**
 * Area of a convex polygon
 * A polygon is convex if it contains any line segments that connects two points of the polygon. 
 * Write a program that prompts the user to enter the number of points in a convex polygon, then enter the points clockwise, and display the area of the polygon.
 *
 * 12/06/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_15 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of points in the polygon:");
		int points = input.nextInt();
		double[] xpoints = new double[points];
		double[] ypoints = new double[points];
		
		System.out.println("Enter the " + points + " points in the polygon clockwise:");
		
		for(int i = 0; i < points; i++)
		{
			System.out.print("x-coordinate: ");
			xpoints[i] = input.nextDouble();
			System.out.print("y-coordinate: ");
			ypoints[i] = input.nextDouble();
		}
		
        double sum = 0.0;
        for (int i = 0; i < points; i++) 
        {	
        	if(i == points - 1)
        		sum = sum + (xpoints[i] * ypoints[0]) - (ypoints[i] * xpoints[0]);
        	else
        		sum = sum + (xpoints[i] * ypoints[i+1]) - (ypoints[i] * xpoints[i+1]);
        }
        System.out.println("The area of the polygon is " + (Math.abs(sum) * .5));
		
        input.close();
	}
}
