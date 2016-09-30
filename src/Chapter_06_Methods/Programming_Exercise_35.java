package Chapter_06_Methods;
import java.util.Scanner;

/**
 * Geometry: area of a pentagon
 * A regular polygon is an n-sided polygon in which all sides are of the same length and all angles have the same degree 
 * (i.e., the polygon is both equilateral and equiangular). 
 * Write a method that returns the area of a regular polygon using the following header: 
 * public static double area(int n, double side) 
 * Write a main method that prompts the user to enter the number of sides and the side of a regular polygon and displays its area.
 * 09/13/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_35 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter polygon sides and the size of the sides: ");
		System.out.print("The area of the polygon is " + area(input.nextInt(), input.nextDouble()));
		
		input.close();		
	}
	
	/**
	 * Return the area of a regular polygon
	 * 
	 * @param n
	 * @param side
	 * @return
	 */
	public static double area(int n, double side) 
	{
		return ((n * Math.pow(side, 2)) / ( 4 * Math.tan(Math.PI / n)));
	}
}
