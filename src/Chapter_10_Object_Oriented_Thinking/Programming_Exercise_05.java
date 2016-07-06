package Chapter_10_Object_Oriented_Thinking;
import java.util.Scanner;

/**
 * Displaying the prime factors
 * Write a program that prompts the user to enter a positive integer and displays all its smallest factors in decreasing order. 
 * For example, if the integer is 120, the smallest factors are displayed as 5, 3, 2, 2, 2. 
 * Use the StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3, 5) and retrieve and display them in reverse order.
 * 
 * 03/10/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_05 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		primeFactors pf;
		if (number <= 0)
		{
			pf = new primeFactors();
		}
		else
		{
			pf = new primeFactors(number);
		}
		
		pf.printReversePrimeFactors();
	}
}
