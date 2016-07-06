package Chapter_05_Loops;

import java.util.Scanner;

/**
 * Find the factors of an integer
 * Write a program that reads an integer and displays all its smallest factors in increasing order. 
 * For example, if the input integer is 120, the output should be as follows: 2, 2, 2, 3, 5.
 * 
 * 02/15/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_16 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		//120
		int number = input.nextInt();
		int tempnum = number;
		int temp = 1;
		int counter = 2;
		
		//120 % 2 -> 60 % 2 -> 30 % 2 -> 15 % 3 -> 5 % 4 != 0 -> 5 % 5 - > 0
		while (temp != number)
		{
			if ((tempnum % counter) == 0)
			{
				tempnum /= counter;
				System.out.print(counter + ", ");
				temp *= counter;
			}
			else
			{
				counter++;
			}
		}
		
		
		input.close();
	}
}
