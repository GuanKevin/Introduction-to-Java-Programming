package Chapter_03_Selections;
import java.util.Scanner;

/**
 * Geometry: two rectangles
 * Write a program that prompts the user to enter the center x-, y-coordinates, width, 
 * and height of two rectangles and determines whether the second rectangle is inside the first or overlaps with the first, 
 * as shown in Figure 3.9.
 * 
 * 08/06/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_28 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double x1, y1, x2, y2, width1, width2, height1, height2, xDistance, yDistance;
		
		System.out.print("Enter the x y coordinates and the width and height: ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		width1 = input.nextDouble();
		height1 = input.nextDouble();
		
		System.out.print("Enter the x y coordinates and the width and height: ");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		width2 = input.nextDouble();
		height2 = input.nextDouble();
		
		if (x1 > x2)
			xDistance = x1 - x2;
		else
			xDistance = x2 - x1;
		if (y1 > y2)
			yDistance = y1 - y2;
		else
			yDistance = y2 - y1;
		
		if ((xDistance <= (width1 - width2) / 2) && (yDistance <= (height1 - height2) / 2))
			System.out.print("Rectangle 1 overlaps Rectangle 2");
		else if ((xDistance <= (width1 + width2) / 2) && (yDistance <= (height1 + height2) / 2))
			System.out.print("Rectangle 2 overlaps Rectangle 1");
		else
			System.out.print("There are no overlaps.");
		input.close();
	}
}
