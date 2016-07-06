package Chapter_18_Recursion;
import java.util.Scanner;

/**
 * Fibonacci series
 * Modify Listing 18.2, ComputeFibonacci.java, so that the program finds the number of times the fib method is called. 
 * (Hint: Use a static variable and increment it every time the method is called.)
 * 
 * 06/27/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_07
{
	static int counter = 0;
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the index: ");
		int index = input.nextInt();
		
		System.out.print("The series of index " + index + " is " + fibonacci(index)
							+ "\nCounter: " + counter);
	}
	
	/*
	 * Grabs the index and finds out the fibonacci series
	 * Increment the counter value to the amount of time the recursion method is called
	 */
	public static long fibonacci(int index)
	{
		counter++;
		if (index == 0)
		{
			return 0;
		}
		if (index == 1)
		{
			return 1;
		}
		return fibonacci(index - 2) + fibonacci(index - 1);
	}
}
