package Chapter_18_Recursion;

import java.util.Scanner;

/**
 * Fibonacci series
 * Modify Listing 18.2, ComputeFibonacci.java, so that the program finds the number of times the fib method is called. 
 * (Hint: Use a static variable and increment it every time the method is called.)
 * 
 * 12/17/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_07
{
	static int fibCount = 0;
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an index: ");
		int index = input.nextInt();
		System.out.print("Fib(" + index + ") = " + fibonacci(index) + ".\nFibonacci called " + fibCount + " times.");
		
		input.close();
	}
	
	public static int fibonacci(int index)
	{
		++fibCount;
		
		if (index == 1)
			return 1;
		if (index == 0)
			return 0;
		
		return fibonacci(index - 2) + fibonacci(index - 1);
	}
}
