package Chapter_18_Recursion;
import java.util.Scanner;

/**
 * Sum series
 * Write a recursive method to compute the following series:
 * Write a test program that displays m(i) for i = 1, 2, . . ., 10.
 * 
 * @author kevgu
 *
 */

public class Programming_Exercise_05
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter i: ");
		System.out.println(series(input.nextInt()));
	}
	
	public static double series(double i)
	{
		if(i == 1)
			return (1.0 / 3);
		return (i / (2.0 * i + 1)) + series(i - 1);
	}
}
