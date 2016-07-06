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
 * 06/26/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_03
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("Enter two numbers, largest number first: ");
		int largerNum = input.nextInt();
		int smallerNum = input.nextInt();
		
		System.out.print("The GCD of " + largerNum + " and " + smallerNum + " is " + gcdRecursion(largerNum, smallerNum));
	}
	
	/*
	 * Finding GCD using recursion
	 */
	public static int gcdRecursion(int largerNum, int smallerNum)
	{
		if ((largerNum % smallerNum) == 0)
		{
			return smallerNum;
		}
		
		return gcdRecursion(smallerNum, largerNum % smallerNum);
	}
}
