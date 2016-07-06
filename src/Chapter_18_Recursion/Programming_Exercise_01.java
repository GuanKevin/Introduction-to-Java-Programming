package Chapter_18_Recursion;
import java.util.Scanner;

/**
 * Factorial
 * Implement the factorial method using recursion. 
 * Write a program that prompts the user to enter an integer and displays its factorial.
 * 
 * 06/25/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_01
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		System.out.print("The factorial of " + number + " is " + factorial(number));
	}
	
	/*
	 * Finds the factorial of the given number 
	 * 4! = 4 * 3 * 2 * 1
	 */
	public static long factorial(int number)
	{
		//base case
		if (number == 1)
		{
			return 1;
		}
		
		return number * factorial(number - 1);
	}
}
