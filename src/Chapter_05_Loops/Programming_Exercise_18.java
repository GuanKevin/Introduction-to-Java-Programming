package Chapter_05_Loops;

import java.util.Scanner;

/**
 * Display four patterns using loops
 * Use nested loops that display the following patterns in four separate programs:
 * Patter B
 * 
 * 02/15/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_18 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the triangle: ");
		int size = input.nextInt();
		
		for (int i = size; i >= 1; i--)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		input.close();
	}
}
