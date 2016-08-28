package Chapter_05_Loops;

/**
 * Demonstrate cancellation errors
 * A cancellation error occurs when you are manipulating a very large number with a very small number. 
 * The large number may cancel out the smaller number. 
 * For example, the result of 100000000.0 + 0.000000001 is equal to 100000000.0. 
 * To avoid cancellation errors and obtain more accurate results, carefully select the order of computation.
 * Write a program that compares the results of the summation of the preceding series, 
 * computing from left to right and from right to left with n = 50000.
 * 
 * 08/23/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_23 
{
	public static void main(String[] args) 
	{
		double ltr = 0;
		double rtl = 0;
		
		for (int i = 1; i <= 100000; i++)
			ltr += (1.0 / i);
		
		for (int i = 100000; i >= 1; i--)
			rtl += (1.0 / i);
		
		System.out.print("Right to left: " + rtl
				+ "\nLeft to Right: " + ltr);
	}
}
