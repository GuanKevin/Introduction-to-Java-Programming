package Chapter_18_Recursion;

import java.util.Scanner;

/**
 * Compute greatest common divisor using recursion
 * The gcd(m, n) can also be defined recursively as follows:
 * If m % n is 0, gcd(m, n) is n.
 * Otherwise, gcd(m, n) is gcd(n, m % n)
 * Write a recursive method to find the GCD. 
 * Write a test program that prompts the user to enter two integers and displays their GCD.
 * 
 * 12/16/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_03
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int num1 = input.nextInt(); 
		int num2 = input.nextInt(); 
		System.out.print("The GCD of " + num1 + " and " + num2 + " is " + gcd(Math.max(num1, num2), Math.min(num1, num2)));
		input.close();
	}
	
	public static int gcd(int max, int min) 
	{
		if ((max % min) == 0)
			return min;
		
		return gcd(min, max % min);
	}
}
