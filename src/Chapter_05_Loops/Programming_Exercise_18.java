package Chapter_05_Loops;

/**
 * Display four patterns using loops
 * Use nested loops that display the following patterns in four separate programs
 * 
 * 08/22/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_18 
{
	public static void main(String[] args) 
	{
		System.out.println("Pattern A");
		
		for (int i = 1; i <= 6; i++)
		{
			for (int j = 1; j <= i; j++)
				System.out.print(j + " ");
			System.out.println();
		}
		
		System.out.println("\nPattern B");
		
		for (int i = 6; i >= 1; i--)
		{
			for (int j = 1; j <= i; j++)
				System.out.print(j + " ");
			System.out.println();
		}
		
		System.out.println("\nPattern C");
		
		for (int i = 1; i <= 6; i++)
		{
			for (int j = i; j <= 5; j++)
				System.out.print("  ");
			for (int k = i; k >= 1; k--)
				System.out.print(k + " ");
			System.out.println();
		}
		
		System.out.println("\nPattern D");
		
		for (int i = 6; i >= 1; i--)
		{
			for (int j = 5; j >= i; j--)
				System.out.print("  ");
			for (int k = 1; k <= i; k++)
				System.out.print(k + " ");
			System.out.println();
		}
	}
}
