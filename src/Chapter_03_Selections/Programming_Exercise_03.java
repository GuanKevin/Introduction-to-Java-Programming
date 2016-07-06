package Chapter_03_Selections;
import java.util.Scanner;

/**
 * Algebra: solve 2 x 2 linear equations
 * Write a program that prompts the user to enter a, b, c, d, e, and f and displays the result. 
 * If ad - bc is 0, report that “The equation has no solution.”
 * 
 * 02/05/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_03 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double a, b, c, d, e, f, x, y, solvex, solvey;
		System.out.print("Enter 6 numbers : ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		d = input.nextDouble();
		e = input.nextDouble();
		f = input.nextDouble();
		
		if (((a * d) - (b * c)) == 0)
		{
			System.out.print("The equation has no solution!");
		}
		else
		{
			x = ((e * d) - (b * f)) / ((a * d) - (b * c));
			y = ((a * f) - (e * c)) / ((a * d) - (b * c));
			solvex = (e - (b * y))/a;
			solvey = (e - (a * x))/b;
					
			System.out.println("x is " + solvex);
			System.out.println("y is " + solvey);
		}
		
		input.close();
	}
}
