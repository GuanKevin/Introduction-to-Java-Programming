package Chapter_03_Selections;

/**
 * Random point
 * Write a program that displays a random coordinate in a rectangle. 
 * The rectangle is centered at (0, 0) with width 100 and height 200.
 * 
 * 08/06/2016 
 * @author kevgu
 *
 */

public class Programming_Exercise_16 
{
	public static void main(String[] args) 
	{
		int x = (int) (Math.random() * 51 * 2 - 50);
		int y = (int) (Math.random() * 101 * 2 - 100);
		
		System.out.print("Random rectangle coordinates: (" + x + ", " + y +").");
	}
}
