package Chapter_05_Loops;

/**
 * Conversion from kilograms to pounds
 * Write a program that displays the following table (note that 1 kilogram is 2.2 pounds): 
 * Kilograms Pounds 
 * 1 2.2 
 * 3 6.6 
 * ... 
 * 197 433.4 
 * 199 437.8
 * 
 * 02/14/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_03 
{
	public static void main(String[] args) 
	{
		System.out.printf("%s %8s", "Kilograms", "Pounds");
		System.out.println();

		for (int i = 1; i < 200; i += 2)
		{
			//System.out.println(i + "           " + (i * 2.2));
			System.out.printf(i + "      %.1f", + (i * 2.2));
			System.out.println();
		}
	}

}
