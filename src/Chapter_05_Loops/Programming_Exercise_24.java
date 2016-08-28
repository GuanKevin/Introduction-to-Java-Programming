package Chapter_05_Loops;

/**
 * Sum a series
 * Write a program to sum the following series
 * 
 * 08/25/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_24 
{
	public static void main(String[] args) 
	{
		int numerator = 1;
		double series = 0;
		
		for (int i = 3; i <= 99; i += 2)
		{
			series += (double) numerator / i; 
			numerator = i;
		}
		
		System.out.print(series);
	}
}
