package Chapter_09_Objects_and_Classes;
import java.util.Random;

/**
 * Use the Random class
 * Write a program that creates a Random object with seed 1000 and displays the first 50 random integers between 0 
 * and 100 using the nextInt(100) method.
 * 
 * 11/06/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_04 
{
	public static void main(String[] args) 
	{
		Random rand = new Random();
		
		for (int i = 1; i <= 50; i++)
		{
			System.out.printf("%2d ", rand.nextInt(99) + 1);
			if (i % 10 == 0)
				System.out.println();			
		}
	}
}