package Chapter_05_Loops;

/**
 * Compute e
 * You can approximate e using the following series
 * 
 * 08/25/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_26 
{
	public static void main(String[] args) 
	{
		double e = 1;
		double factorial = 1;
		
		for (int i = 10000; i >= 1; i--)
		{
			for (int j = i; j >= 1; j--)
				factorial *= j;
			
			e += 1 / factorial;
			factorial = 1;
		}
		
		System.out.print("e: " + e);
	}
}
