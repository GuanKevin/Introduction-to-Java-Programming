package Chapter_03_Selections;
import java.util.Scanner;

/**
 * Geometry: two circles
 * Write a program that prompts the user to enter the center coordinates and radii of two circles 
 * and determines whether the second circle is inside the first or overlaps with the first, as shown in Figure 3.10. 
 * (Hint: circle2 is inside circle1 if the distance between the two centers 6 = |r1 - r2| 
 * and circle2 overlaps circle1 if the distance between the two centers <= r1 + r2. 
 * Test your program to cover all cases.)
 * 
 * 08/06/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_29 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double x1, y1, x2, y2, radii1,radii2, distance;
		
		System.out.print("Enter the coordinates and the radii for the first circle: ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		radii1 = input.nextDouble();
		
		System.out.print("Enter the coordinates and the radii for the second circle: ");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		radii2 = input.nextDouble();
		
		distance = Math.pow(((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2)), 0.5);
		
		if (distance + radii2 <= radii1)
			System.out.print("Circle 2 inside Circle 1");
		else if (distance <= radii1 + radii2)
			System.out.print("Circle 2 overlaps Circle 1");
		else
			System.out.print("There are no overlaps");
		
		input.close();
	}
}
