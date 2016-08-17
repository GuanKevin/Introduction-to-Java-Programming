package Chapter_02_Elementary_Programming;

/**
 * Print a table
 * Write a program that displays the following table. Cast floating point numbers into integers.
 * a b pow(a, b)
 * 1 2 1
 * 2 3 8
 * 3 4 81
 * 4 5 1024
 * 5 6 15625
 * 
 * 08/01/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_18 
{
	public static void main(String[] args) 
	{
		float a, b;
		a = 1;
		b = 2;
		
		System.out.print("a b pow(a, b)"
				+ "\n" + (int) a + ' ' + (int) b + ' ' + (int) Math.pow(a, b)
				+ "\n" + (int) ++a + ' ' + (int) ++b + ' ' + (int) Math.pow(a, b)
				+ "\n" + (int) ++a + ' ' + (int) ++b + ' ' + (int) Math.pow(a, b)
				+ "\n" + (int) ++a + ' ' + (int) ++b + ' ' + (int) Math.pow(a, b)
				+ "\n" + (int) ++a + ' ' + (int) ++b + ' ' + (int) Math.pow(a, b));
	}
}
