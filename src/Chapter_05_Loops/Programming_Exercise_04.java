package Chapter_05_Loops;

/**
 * Conversion from miles to kilometers
 * Write a program that displays the following table (note that 1 mile is 1.609 kilometers): 
 * Miles 	Kilometers 
 * 1 		1.609 
 * 2 		3.218 
 * ... 
 * 9 		14.481 
 * 10 		16.090
 *  
 * 08/20/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_04 
{
	public static void main(String[] args) 
	{
		System.out.printf("%s %15s \n", "Miles", "Kilometers");
		
		for (int i = 1; i <= 10; i++)
		{
			System.out.printf("%-10d %.3f \n", i, (i * 1.609));
		}
	}
}
