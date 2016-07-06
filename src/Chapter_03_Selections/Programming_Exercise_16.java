package Chapter_03_Selections;
import java.util.Random;

/**
 * Random point
 * Write a program that displays a random coordinate in a rectangle. 
 * The rectangle is centered at (0, 0) with width 100 and height 200.
 * 
 * 02/ 
 * @author kevgu
 *
 */

public class Programming_Exercise_16 
{
	public static void main(String[] args) 
	{
		Random rand = new Random();
		int pointx = rand.nextInt(201);
		int pointy = rand.nextInt(101);
		
		System.out.print("The random coordinates of the rectrangle are: " + pointx + " and " + pointy);
	}
}
