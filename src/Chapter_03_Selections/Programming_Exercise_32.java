package Chapter_03_Selections;
import java.util.Scanner;

/**
 * Geometry: point position
 * Write a program that prompts the user to enter the three points for p0, p1, and p2 
 * and displays whether p2 is on the left of the line from p0 to p1, on the right, or on the same line.
 * 
 * 08/06/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_32 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double x0, y0, x1, y1, x2, y2, condition;
		System.out.print("Enter the three points: ");
		x0 = input.nextDouble();
		y0 = input.nextDouble();
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		condition = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		
		if (condition > 0)
			System.out.print("p2 is on the left side of the line");
		else if (condition == 0)
			System.out.print("p2 is on the same line");
		else
			System.out.print("p2 is on the right side of the line");
		
		input.close();
	}
}
