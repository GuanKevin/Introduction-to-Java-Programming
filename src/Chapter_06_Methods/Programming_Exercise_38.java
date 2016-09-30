package Chapter_06_Methods;

import java.util.Random;

/**
 * Generate random characters
 * Use the methods in RandomCharacter in Listing 6.10 to print 100 uppercase letters and 
 * then 100 single digits, printing ten per line.
 *
 * 09/13/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_38 
{
	static Random random = new Random();
	
	public static void main(String[] args) 
	{
		printUppercase();
		printNumbers();
	}
	
	/**
	 * Print random single digit numbers, 10 per line
	 */
	public static void printNumbers()
	{
		for (int i = 1; i <= 100; i++)
			if (i % 10 == 0)
				System.out.println((random.nextInt(10)) + " ");
			else
				System.out.print((random.nextInt(10)) + " ");
	}
	
	/**
	 * Print random uppercase letters, 10 per line
	 */
	public static void printUppercase()
	{
		for (int i = 1; i <= 100; i++)
			if (i % 10 == 0)
				System.out.println((char) (random.nextInt(26) + 65) + " ");
			else
				System.out.print((char) (random.nextInt(26) + 65) + " ");
	}
}
