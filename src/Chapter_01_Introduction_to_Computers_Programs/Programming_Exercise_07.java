package Chapter_01_Introduction_to_Computers_Programs;

/**
 * Approximate pi
 * Write a program that displays the result of 
 * 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11)
 * 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13)
 * 
 * 02/02/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_07 
{
	public static void main(String[] args)
	{
		System.out.println("4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11) = " + (4 * (1.0 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11)));
		System.out.println("4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13) = " + (4 * (1.0 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13)));
	}
}
