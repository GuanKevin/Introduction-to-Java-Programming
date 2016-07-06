package Chapter_01_Introduction_to_Computers_Programs;

/**
 * Algebra: solve 2 * 2 linear equations 
 * You can use Cramer’s rule to solve the following 2 * 2 system of linear equation:
 * Write a program that solves the following equation and displays the value for x and y:
 * 3.4x + 50.2y = 44.5
 * 2.1x + .55y = 5.9
 * ax + by = e
 * cx + dy = f
 * x = (ed - bf)/(ad - bc)
 * y = (af - ec)/(ad - bc)
 * 02/02/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_13 
{
	public static void main(String[] args)
	{
		//Using Cramer's rule
		double x = ((44.5 * .55) - (50.2 * 5.9))/((3.4 * .55) - (50.2 * 2.1));
		double y = ((3.4 * 5.9) - (44.5 * 2.1))/((3.4 * .55) - (50.2 * 2.1));
		
		System.out.println("x is " + (44.5 - (50.2 * y))/3.4);
		System.out.println("y is " + (5.9 - (2.1 * x))/.55);
	}
}
