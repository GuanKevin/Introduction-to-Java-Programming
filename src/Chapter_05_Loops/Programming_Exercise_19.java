package Chapter_05_Loops;

/**
 * Display numbers in a pyramid pattern
 * Write a nested for loop that prints the following output:
 * 
 * 09/29/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_19 
{
	public static void main(String[] args) 
	{
		int counter = 1;
		
		for (int i = 1; i <= 8; i++)
		{
			for (int j = 7; j >= i; j--)
				System.out.print("    ");
			
			for (int k = 1; k <= i; k++)
			{
				System.out.printf("%4d", counter);
				counter *= 2;
			}
			
			counter /= 2;
			
			for (int l = i - 1; l >= 1; l--)
			{
				counter /= 2;
				System.out.printf("%4d", counter);
			}
			
			System.out.println();
		}
	}
}
