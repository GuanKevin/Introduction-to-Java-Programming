package Chapter_05_Loops;

/**
 * Summation
 * Write a program to compute the following summation.
 * 
 * 08/27/2016
 * @author kevgu
 *
 */


public class Programming_Exercise_35 
{
	public static void main(String[] args) 
	{
		double summation = 0;
		
		for (int i = 1; i <= 624; i++)
			summation += (1 / ((Math.sqrt(i)) + (Math.sqrt(i + 1))));
		
		System.out.print(summation);
	}
}
