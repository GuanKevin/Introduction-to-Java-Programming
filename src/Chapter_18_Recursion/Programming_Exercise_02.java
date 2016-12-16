package Chapter_18_Recursion;

import java.util.Scanner;

/**
 * Fibonacci numbers
 * Rewrite the fib method in Listing 18.2 using iterations. 
 * Hint: To compute fib(n) without recursion, you need to obtain fib(n - 2) and fib(n - 1) first. 
 * Let f0 and f1 denote the two previous Fibonacci numbers. 
 * The current Fibonacci number would then be f0 + f1.
 * Write a test program that prompts the user to enter an index and displays its Fibonacci number.
 * https://www.mathsisfun.com/numbers/fibonacci-sequence.html
 * 
 * 12/16/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_02
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an index: ");
		int index = input.nextInt();
		System.out.print("The fib(" + index + ") is " + fibonacci(index) + ".");
		
		input.close();
	}
	
	public static long fibonacci(int index)
	{
		long f0 = 0, f1 = 1;
		long fibNum = 0;
		
		if (index == 0)
			return 0;
		if (index == 1)
			return 1;
		
		for (int i = 2; i <= index; i++)
		{
			fibNum = f0 + f1;
			f0 = f1;
			f1 = fibNum;
		}
		
		return fibNum;
	}
}
