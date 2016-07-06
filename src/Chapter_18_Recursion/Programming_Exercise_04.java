package Chapter_18_Recursion;
import java.util.Scanner;

/**
 * Sum series
 * Write a recursive method to compute the following series:
 * Write a test program that displays m(i) for i = 1, 2, . . ., 10.
 * 
 * 06/27/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_04
{
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 10; i++)
		{
			System.out.println(i + " = " + sumSeries(i));
		}
	}
	
	public static double sumSeries(int i)
	{
		if (i <= 0)
		{
			return 0;
		}
		if (i == 1)
		{
			return 1;
		}
		return sumSeries(i - 1) + 1.0 / i;	
	}
}
