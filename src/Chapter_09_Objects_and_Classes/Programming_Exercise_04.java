package Chapter_09_Objects_and_Classes;
import java.util.Random;

/**
 * Use the Random class
 * Write a program that creates a Random object with seed 1000 and displays the first 50 random integers between 0 
 * and 100 using the nextInt(100) method.
 * 
 * 03/01/2016
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
			if (i % 10 == 0)
			{
				System.out.println();
			}
			System.out.print(rand.nextInt(100) + " ");
		}
	}

}
