package Chapter_05_Loops;

/**
 * Find the largest n such that n^3 < 12,000
 * Use a while loop to find the largest integer n such that n3 is less than 12,000.
 * 
 * 08/20/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_13 
{
	public static void main(String[] args) 
	{
		int n = 1;
		
		while ((int) Math.pow(n, 3) < 12000)
		{
			++n;
		}
		
		System.out.print(n);
	}
}
