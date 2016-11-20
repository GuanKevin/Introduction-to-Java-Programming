package Chapter_10_Object_Oriented_Thinking;
import java.util.Scanner;

import Utilities.primeNumbers;

/**
 * Displaying the prime numbers
 * Write a program that displays all the prime numbers less than 120 in decreasing order. 
 * Use the StackOfIntegers class to store the prime numbers (e.g., 2, 3, 5, ...) and retrieve and display them in reverse order.
 * 
 * 03/10/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_06 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		primeNumbers pn;
		
		if (number <= 0)
		{
			pn = new primeNumbers();
		}
		else
		{
			pn = new primeNumbers(number);
		}
		
		pn.displayPrimeNumbers();
		
	}
}
