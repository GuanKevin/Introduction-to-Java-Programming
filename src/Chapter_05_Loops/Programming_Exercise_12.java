package Chapter_05_Loops;

/**
 * Find the smallest n such that n^2 > 12,000
 * Use a while loop to find the smallest integer n such that n2 is greater than 12,000.
 * 
 * 08/20/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_12 
{
	public static void main(String[] args) 
	{	
		int n = 1;
		
		while ((int) Math.pow(n, 2) < 12000)
		{
			++n;
		}
		
		System.out.print(n);
	}
}
