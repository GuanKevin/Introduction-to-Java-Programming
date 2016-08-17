package Chapter_03_Selections;
import java.util.Scanner;

/**
 * Compute the perimeter of a triangle
 * Write a program that reads three edges for a triangle and computes the perimeter if the input is valid. 
 * Otherwise, display that the input is invalid. 
 * The input is valid if the sum of every pair of two edges is greater than the remaining edge.
 * 
 * 08/06/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_19 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the three edges: ");
		double edge1, edge2, edge3, perimeter;
		edge1 = input.nextDouble();
		edge2 = input.nextDouble();
		edge3 = input.nextDouble();
		perimeter = edge1 + edge2 + edge3;
		
		if ((edge1 + edge2 > edge3)
				&& (edge1 + edge3 > edge2) 
				&& (edge2 + edge3 > edge1))
		{
			System.out.print("The perimeter of the triangle is " + perimeter);
		}
		else
		{
			System.out.print("The input is invalid!");
		}
		
		input.close();
	}
}
