package Chapter_05_Loops;

/**
 * Display numbers in a pyramid pattern
 * Write a nested for loop that prints the following output:
 * 
 * 08/23/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_19 
{
	public static void main(String[] args) 
	{
		int counter;
		
		for (int i = 1; i <= 8; i++)
		{
			counter = 1;
			
			//Printing the white space
			for (int j = 7; j >= i; j--)
				System.out.print("    ");
			
			//Printing lhs triangle
			for (int k = 1; k <= i; k++)
			{
				System.out.printf("%-4d", counter);
				counter *= 2;
			}
			
			counter /= 2;
			
			//Printing rhs triangle
			for (int l = i - 1; l >= 1; l--)
			{
				counter /= 2;
				System.out.printf("%-4d", counter);
			}
			
			System.out.println();
		}
	}
}
