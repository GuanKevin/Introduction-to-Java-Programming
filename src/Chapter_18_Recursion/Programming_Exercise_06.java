package Chapter_18_Recursion;
import java.util.Scanner;

/**
 * Sum series
 * Write a recursive method to compute the following series:
 * Write a test program that displays m(i) for i = 1, 2, . . ., 10.
 * 
 * 
 * @author kevgu
 *
 */

public class Programming_Exercise_06
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter i: ");
		System.out.print(series(input.nextDouble()));
	}
	public static double series(double i)
	{
		if(i == 1)
			return 1.0 / 2;
		return (i / (i + 1.0)) + series(i - 1);
	}
}
