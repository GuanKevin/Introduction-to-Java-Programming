package Chapter_05_Loops;

/**
 * Find the smallest n such that n^2 > 12,000
 * Use a while loop to find the smallest integer n such that n2 is greater than 12,000.
 * 
 * 02/15/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_12 
{
	public static void main(String[] args) 
	{
		//Scanner input = new Scanner(System.in);
		
		int number = 2;
		
		while (Math.pow(number, 2) < 12000)
		{
			number++;
		}
		
		System.out.print(number + " is greater than 12,000"
				+ "\n" + Math.pow(number, 2) + " is greater than 12,000");
		
		//input.close();
	}
}
