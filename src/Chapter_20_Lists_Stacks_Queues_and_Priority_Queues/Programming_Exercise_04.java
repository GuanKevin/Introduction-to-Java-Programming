package Chapter_20_Lists_Stacks_Queues_and_Priority_Queues;

import java.util.Arrays;

import utilities.CompareY;
import utilities.Point;

/**
 * Sort points in a plane
 * Write a program that meets the following requirements:
 * -Define a class named Point with two data fields x and y to represent a point’s x- and y-coordinates. 
 * Implement the Comparable interface for comparing the points on x-coordinates. 
 * If two points have the same x-coordinates, compare their y-coordinates.
 * -Define a class named CompareY that implements Comparator<Point>.
 * Implement the compare method to compare two points on their y-coordinates.
 * If two points have the same y-coordinates, compare their x-coordinates.
 * -Randomly create 100 points and apply the Arrays.sort method to display the points 
 * in increasing order of their x-coordinates and in increasing order of their y-coordinates, respectively
 * 
 * 01/03/2017
 * @author kevgu
 *
 */

public class Programming_Exercise_04 
{
	public static void main(String[] args) 
	{
		Point[] points = new Point[5];
	 
		for (int i = 0; i < points.length; i++) 
			points[i] = new Point(Math.random() * 100, Math.random() * 100);
		
		System.out.println("Sort on x-coordinates");
	    Arrays.sort(points);
	    for (int i = 0; i < points.length; i++) 
	    	System.out.println(points[i]);
	    
	    System.out.println("Sort on y-coordinates");
	    Arrays.sort(points, new CompareY());
	    for (int i = 0; i < points.length; i++)
    		System.out.println(points[i]);
	}
}
