package Chapter_05_Loops;

/**
 * Find the largest n such that n^3 < 12,000
 * Use a while loop to find the largest integer n such that n3 is less than 12,000.
 * 
 * @author kevgu
 *
 */

public class Programming_Exercise_13 
{
	public static void main(String[] args) 
	{
		int number = 2;
		
		while (Math.pow(number, 3) < 12000)
		{
			number++;
		}
		
		System.out.print(number + " is greater than 12,000"
				+ "\n" + Math.pow(number, 3) + " is greater than 12,000");
		
	}
}
