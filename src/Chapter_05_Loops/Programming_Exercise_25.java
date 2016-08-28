package Chapter_05_Loops;

/**
 * Compute pi
 * You can approximate pi by using the following series:
 * 
 * 08/25/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_25 
{
	public static void main(String[] args) 
	{
		double pi = 0;
		
		for (int i = 1; i <= 100000; i++)
			pi += ((Math.pow(-1, (i + 1)) / ((2 * i) - 1)));
			
		System.out.print("Pi: " + (4 * pi));
	}
}
