package Chapter_06_Methods;
import java.util.Scanner;

/**
 * Display patterns
 * Write a method to display a pattern as follows: 
 * 1 
 * 2 1 
 * 3 2 1 
 * ... 
 * n n-1 ... 3 2 1 
 * The method header is
 * public static void displayPattern(int n)
 *
 * 08/29/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_06 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		displayPattern(input.nextInt());
		
		input.close();		
	}
	
	public static void displayPattern(int n)
	{
		for (int i = 1; i <= n; i++)
		{
			for (int j = i; j > 0; j--)
				System.out.print(j + " ");
			System.out.println();
		}
	}
}
