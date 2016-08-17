package Chapter_01_Introduction_to_Computers_Programs_and_Java;

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
 * 
 * 07/30/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_13 
{
	public static void main(String[] args)
	{
		double a = 3.4;
		double b = 50.2;
		double c = 2.1;
		double d = .55;
		double e = 44.5;
		double f = 5.9;
		double x = ((e * d) - (b * f))/((a * d) - (b * c));
		double y = ((a * f) - (e * c))/((a * d) - (b * c));
		
		System.out.println("x = " + x
				+ "\ny = " + y);
		
		System.out.print((3.4 * 2.623901496861419) + (50.2 * 0.7087397392563978));
	}
}
