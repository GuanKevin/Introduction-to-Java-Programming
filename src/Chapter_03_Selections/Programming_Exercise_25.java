package Chapter_03_Selections;
import java.util.Scanner;

/**
 * Geometry: intersecting point
 * Two points on line 1 are given as (x1, y1) and (x2, y2) and on line 2 as (x3, y3) and (x4, y4), as shown in Figure 3.8a–b.
 * Write a program that prompts the user to enter four points and displays the intersecting point.
 * 
 * 08/06/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_25 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter four points: ");
		double x1, y1, x2, y2, x3, y3, x4, y4, a, b, c, d, e, f, checkLinearEquation, x, y;
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		x3 = input.nextDouble();
		y3 = input.nextDouble();
		x4 = input.nextDouble();
		y4 = input.nextDouble();
		
		a = y1 - y2;
		b = -(x1 - x2);
		c = y3 - y4;
		d = -(x3 - x4);
		e = (y1 - y2) * x1 - (x1 - x2) * y1;
		f = (y3 - y4) * x3 - (x3 - x4) * y3;
		
		checkLinearEquation = (a * d) - (b * c);
		x = ((e * d) - (b * f)) / checkLinearEquation;
		y = ((a * f) - (e * c)) / checkLinearEquation;
		
		if (checkLinearEquation == 0)
			System.out.print("The two lines are parallel.");
		else
			System.out.print("(" + x + ", " + y + ")");
	
		input.close();
	}
}
