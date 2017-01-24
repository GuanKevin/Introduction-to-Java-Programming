package Chapter_10_Object_Oriented_Thinking;
import java.util.Scanner;

import utilities.StackOfIntegers;

/**
 * Displaying the prime factors
 * Write a program that prompts the user to enter a positive integer and displays all its smallest factors in decreasing order. 
 * For example, if the integer is 120, the smallest factors are displayed as 5, 3, 2, 2, 2. 
 * Use the StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3, 5) and retrieve and display them in reverse order.
 * 
 * 11/23/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_05 
{
	public static void main(String[] args) 
	{
		StackOfIntegers primeFactors = new StackOfIntegers(8);
		System.out.print("Enter an integer: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int factor = 2;
		
		while (number != 1)
		{
			if ((number % factor) == 0)
			{
				primeFactors.push(factor);
				number /= factor;
			}
			else
				factor++;
		}
		
		while (primeFactors.getSize() != 0)
			System.out.print(primeFactors.pop() + " ");
		
		input.close();
	}
}