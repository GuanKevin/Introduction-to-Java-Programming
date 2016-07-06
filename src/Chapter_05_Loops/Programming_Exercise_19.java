package Chapter_05_Loops;

import java.util.Scanner;

/**
 * Display numbers in a pyramid pattern
 * Write a nested for loop that prints the following output:
 * 
 * 02/15/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_19 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = input.nextInt();
		int counter = 2;
		
		for (int i = 1; i <= size; i++)
		{
			for (int j = size; j > i; j--)
			{
				System.out.print("   ");
			}
			for (int k = 1; k <= i; k++)
			{
				if (k <= 2)
				{
					System.out.print(k + " ");
				}
				else
				{
					System.out.print((counter * 2) + " ");
					counter = counter * 2;
				}
			}
			for (int l = i - 1; l >= 1; l--)
			{
				System.out.print(l + " ");
			}
			System.out.println();
		}
		
		input.close();
	}
}
