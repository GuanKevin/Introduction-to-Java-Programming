package Chapter_03_Selections;
import java.util.Scanner;

/**
 * Algebra: solve 2 x 2 linear equations
 * Write a program that prompts the user to enter a, b, c, d, e, and f and displays the result. 
 * If ad - bc is 0, report that “The equation has no solution.”
 * ax + by = e
 * cx + dy = f
 * x = (ed - bf)/(ad - bc)
 * y = (af - ec)/(ad - bc)
 * 
 * 08/02/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_03 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double a, b, c, d, e, f, x, y, checkSolution;
		System.out.print("Enter the values for a, b, c, d, e, and f: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		d = input.nextDouble();
		e = input.nextDouble();
		f = input.nextDouble();
		x = ((e * d) - (b * f)) / ((a * d) - (b * c));
		y = ((a * f) - (e * c)) / ((a * d) - (b * c));
		checkSolution = (a * d) - (b * c);
		
		if (checkSolution == 0)
		{
			System.out.print("The equation has no solution.");
		}
		else
		{
			System.out.print(x + " " + y);
		}
		
		input.close();
	}
}
