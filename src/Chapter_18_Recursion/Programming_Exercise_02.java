package Chapter_18_Recursion;
import java.util.Scanner;

/**
 * Fibonacci numbers
 * Rewrite the fib method in Listing 18.2 using iterations. 
 * Hint: To compute fib(n) without recursion, you need to obtain fib(n - 2) and fib(n - 1) first. 
 * Let f0 and f1 denote the two previous Fibonacci numbers. 
 * The current Fibonacci number would then be f0 + f1.
 * Write a test program that prompts the user to enter an index and displays its Fibonacci number.
 * 
 * 06/25/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_02
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter an index: ");
		int index = input.nextInt();
		
		System.out.print("The series of " + index + " is " + fibUsingIter(index));
	}
	
	public static long fibUsingIter(int index)
	{
		int f0 = 0;
		int f1 = 1; 
		int series = 0;
		
		for (int i = 2; i <= index; i++)
		{
			series = f0 + f1;
			f0 = f1;
			f1 = series;
		}
		
		return series;
	}
}
