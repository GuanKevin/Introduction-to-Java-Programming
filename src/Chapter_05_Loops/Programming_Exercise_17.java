package Chapter_05_Loops;

import java.util.Scanner;

/**
 * Display pyramid
 * Write a program that prompts the user to enter an integer from 1 to 15 and displays a pyramid, as shown in the following sample run:
 * 
 * 08/20/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_17 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number from 1 to 15: ");
		int number = input.nextInt();
		
		for (int i = 1; i <= number; i++) 
		{
			for (int j = number; j > i; j--)
				System.out.print("  ");
			
			for (int k = i; k > 0; k--)
				System.out.print(k + " ");
			
			for (int l = 2; l <= i; l++)
				System.out.print(l + " ");
			
			System.out.println();
		}
		
		input.close();
	}
}
