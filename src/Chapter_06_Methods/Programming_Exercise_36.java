package Chapter_06_Methods;
import java.util.Scanner;

/**
 * (Geometry: area of a regular polygon) 
 * A regular polygon is an n-sided polygon in which all sides are of the same length and all angles have the same degree 
 * (i.e., the polygon is both equilateral and equiangular). 
 * The formula for computing the area of a regular polygon is (SEE BOOK)
 * Write a method that returns the area of a regular polygon using the following header: 
 * public static double area(int n, double side) 
 * Write a main method that prompts the user to enter the number of sides and the 
 * side of a regular polygon and displays its area.
 *
 * 08/25/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_36 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of sides to the polygon: ");
		int n = input.nextInt();
		System.out.print("Enter the length of the side: ");
		double side = input.nextDouble();
		System.out.print("The area of the polygon is: " + area(n, side));
		
		input.close();		
	}
	
	public static double area (int n, double side) 
	{
		return ((n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n)));
	}
}
