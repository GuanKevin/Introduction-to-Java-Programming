package Chapter_08_Multidimensional_Arrays;

import java.util.Scanner;

/**
 * All closest pairs of points
 * Revise Listing 8.3, FindNearestPoints.java, to display all closest pairs of points with the same minimum distance.
 * 
 * 10/03/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_08 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of points: ");
	    int numberOfPoints = input.nextInt();
	     
	    double[][] points = new double[numberOfPoints][2];
	    System.out.print("Enter " + numberOfPoints + " points: ");
	    for (int i = 0; i < points.length; i++) 
	    {
	    	points[i][0] = input.nextDouble();
	    	points[i][1] = input.nextDouble();
	    }
	    
	    int p1 = 0, p2 = 1;
	    double shortestDistances = distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]); 
	    
	    int[][] closestPoints = new int[points.length][2];
	    int point = 0;
	    
	    for (int i = 0; i < points.length; i++) 
	    {
	    	for (int j = i + 1; j < points.length; j++) 
		    {
		        double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]); 

		        if (distance < shortestDistances) 
		        {
		        	point = 0; 
		        	closestPoints[point][0] = i;
		        	closestPoints[point][1] = j;
		        	shortestDistances = distance; 
		        }
		        else if (distance == shortestDistances) 
		        {
		        	closestPoints[point][0] = i;
		        	closestPoints[point][1] = j;
		        	point++;
		        }
		    }
    	}		    
		
	    for (int i = 0; i < point; i++) 
	    {
	    	p1 = closestPoints[i][0]; p2 = closestPoints[i][1];
	    	System.out.println("The closest two points are " + "(" + points[p1][0] + ", " + points[p1][1] + ") and (" + points[p2][0] + ", " + points[p2][1] + ")");
		}
	    
	    System.out.println("Their distance is " + shortestDistances);
		
		input.close();
	}
	
	/**
	 * Return the distance using the given points
	 * 
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @return
	 */
	public static double distance(double x1, double y1, double x2, double y2) 
	{
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}
}
