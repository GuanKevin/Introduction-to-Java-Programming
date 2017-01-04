package Chapter_22_Developing_Efficient_Algorithms;

/**
 * Geometry: Graham’s algorithm for finding a convex hull
 * Section 22.10.2 introduced Graham’s algorithm for finding a convex hull for a set of points. 
 * Assume that the Java’s coordinate system is used for the points. Implement the algorithm using the following method:
 * public static ArrayList<MyPoint> getConvexHull(double[][] s)
 * MyPoint is a static inner class defined as follows: 
 * private static class MyPoint implements Comparable<MyPoint> {
 * double x, y;
 * MyPoint rightMostLowestPoint;
 * MyPoint(double x, double y) {
 * this.x = x; this.y = y;}
 * public void setRightMostLowestPoint(MyPoint p) {rightMostLowestPoint = p;}
 * @Override
 * public int compareTo(MyPoint o)
 * Write a test program that prompts the user to enter the set size and the points
 * and displays the points that form a convex hull.
 * 
 * 01/
 * @author kevgu
 *
 */

public class Programming_Exercise_11 
{
	public static void main(String[] args) 
	{
		
	}
}
