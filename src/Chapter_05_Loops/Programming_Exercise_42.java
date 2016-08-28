package Chapter_05_Loops;
import java.util.Scanner;

/**
 * Financial application: find the sales amount
 * Rewrite Programming Exercise 5.39 as follows:
 * Use a for loop instead of a do-while loop.
 * Let the user enter COMMISSION_SOUGHT instead of fixing it as a constant.
 * 
 * 08/27/2016
 * @author kevgu
 *
 */


public class Programming_Exercise_42 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter commision sought: ");
		final double COMMISSION_SOUGHT = input.nextInt();
		
		for (int i = 10000; ; i++)
		{
			if ((i * .12) >= (COMMISSION_SOUGHT  - ((5000 * .08) + (5000 * .10))))
			{
				 System.out.printf("You need to sell %d \n", (i + 10000));
				 break;
			}
		}
		
		input.close();
	}
}
