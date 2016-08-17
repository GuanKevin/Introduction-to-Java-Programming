package Chapter_03_Selections;
import java.util.Scanner;

/**
 * Geometry: point in a rectangle?
 * Write a program that prompts the user to enter a point (x, y) 
 * and checks whether the point is within the rectangle centered at (0, 0) with width 10 and height 5. 
 * For example, (2, 2) is inside the rectangle 
 * and (6, 4) is outside the rectangle, as shown in Figure 3.7b. 
 * (Hint: A point is in the rectangle if its horizontal distance to (0, 0) is less than or equal to 10 / 2 
 * and its vertical distance to (0, 0) is less than or equal to 5.0 / 2. Test your program to cover all cases.)
 * 
 * 08/06/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_23 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the coordinates: ");
		double x, y, xDistance, yDistance;
		x = input.nextDouble();
		y = input.nextDouble();
		xDistance = Math.pow(x * x, 0.5);
		yDistance = Math.pow(y * y, 0.5);
		
		if ((xDistance < (5.0 / 2)) && (yDistance < (10 / 2)))
			System.out.print("(" + x + ", " + y + ") is in the rectangle");
		else
			System.out.print("(" + x + ", " + y + ") is not in the rectangle");
		
		input.close();
	}
}
