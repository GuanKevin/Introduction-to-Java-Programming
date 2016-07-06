package Chapter_03_Selections;
import java.util.Scanner;

/**
 * Algebra: solve quadratic equations
 * Write a program that prompts the user to enter values for a, b, and c 
 * and displays the result based on the discriminant. 
 * If the discriminant is positive, display two roots. 
 * If the discriminant is 0, display one root. 
 * Otherwise, display “The equation has no real roots”.
 * 
 * 02/04/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_01 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double a, b, c, root1, root2, discriminant;
		System.out.print("Enter 3 values ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		root1 = (-b - Math.pow(((b * b) - (4 * a * c)), 0.5)) / (2 * a);
		root2 = (-b + Math.pow(((b * b) - (4 * a * c)), 0.5)) / (2 * a);
		
		
		discriminant = (b * b) - (4 * a * c);
		
		if (discriminant > 1)
		{
			System.out.print("The equation has two roots " + root1 + " and " + root2);
		}
		else if (discriminant == 0)
		{

			System.out.print("The equation has one root " + root1);
		}
		else
		{
			System.out.print("The equation has no real roots ");
		}
		
		input.close();	
	}
}
