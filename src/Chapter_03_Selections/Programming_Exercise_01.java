package Chapter_03_Selections;
import java.util.Scanner;

/**
 * Algebra: solve quadratic equations
 * The two roots of a quadratic equation ax^2 + bx + c = 0 can be obtained using the following formula: (SEE BOOK)
 * If it is positive, the equation has two real roots. 
 * If it is zero, the equation has one root. 
 * If it is negative, the equation has no real roots.
 * Write a program that prompts the user to enter values for a, b, and c 
 * and displays the result based on the discriminant. 
 * If the discriminant is positive, display two roots. 
 * If the discriminant is 0, display one root. 
 * Otherwise, display “The equation has no real roots”.
 * 
 * 08/02/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_01 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the values for a, b, and c ");
		double a, b, c, discriminant;
		
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		discriminant = Math.pow((b * b) - (4 * a * c), 0.5);
		
		if (discriminant > 0)
		{
			double r1, r2;
			r1 = (-b + discriminant) / (2 * a);
			r2 = (-b - discriminant) / (2 * a);
			System.out.print("The equation has two real roots " + r1 + ' ' + r2);
		}
		else if (discriminant == 0)
		{
			double r2 = (-b - discriminant) / (2 * a); 
			System.out.print("The equation has one root " + r2);
		}
		else
		{
			System.out.print("The equation has no real roots " + discriminant);
		}
		
		input.close();	
	}
}
