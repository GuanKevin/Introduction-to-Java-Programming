package Chapter_10_Object_Oriented_Thinking;

import java.util.Scanner;

import utilities.MyRectangle2D;

/**
 * Geometry: the bounding rectangle
 * A bounding rectangle is the minimum rectangle that encloses a set of points in a two-dimensional plane, 
 * as shown in Figure 10.24d. 
 * Write a method that returns a bounding rectangle for a set of points in a two-dimensional plane, as follows: 
 * public static MyRectangle2D getRectangle(double[][] points) 
 * The Rectangle2D class is defined in Programming Exercise 10.13. 
 * Write a test program that prompts the user to enter five points and 
 * displays the bounding rectangle’s center, width, and height.
 * 
 * 11/25/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_15 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter 5 given points: ");
        Scanner input = new Scanner(System.in);
        
        double[][] points = new double[5][2];
        
        for (int i = 0; i < points.length; i++) 
        {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }
         
        MyRectangle2D r1 = MyRectangle2D.getRectangle(points);
        System.out.println("Center point: " + r1.getX() + " " + r1.getY());
        System.out.println("width = " + r1.getWidth());
        System.out.println("height = " + r1.getHeight());
        
        input.close();
	}
}
