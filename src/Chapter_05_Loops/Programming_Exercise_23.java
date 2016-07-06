package Chapter_05_Loops;

import java.util.Scanner;

/**
 * Demonstrate cancellation errors
 * A cancellation error occurs when you are manipulating a very large number with a very small number. 
 * The large number may cancel out the smaller number. 
 * For example, the result of 100000000.0 + 0.000000001 is equal to 100000000.0. 
 * To avoid cancellation errors and obtain more accurate results, carefully select the order of computation.
 * Write a program that compares the results of the summation of the preceding series, computing from left to right and from right to left with n = 50000.\
 * 
 * 
 * @author kevgu
 *
 */

public class Programming_Exercise_23 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		input.close();
	}
}
