package Chapter_05_Loops;

/**
 * Conversion from miles to kilometers
 * Write a program that displays the following two tables side by side:
 * Miles Kilometers | Kilometers Miles 
 * 1 1.609 | 20 12.430 
 * 2 3.218 | 25 15.538 
 * ... 
 * 9 14.481 | 60 37.290 
 * 10 16.090 | 65 40.398
 * 
 * @author kevgu
 *
 */

public class Programming_Exercise_06 
{
	public static void main(String[] args) 
	{
		System.out.printf("%s %8s", "Miles", "Kilometers");
		System.out.println();

		for (int i = 1; i < 10; i++)
		{
			//System.out.println(i + "           " + (i * 1.609));
			System.out.printf(i + "      %.1f", + (i * 1.609));
			System.out.println();
		}
	}

}
