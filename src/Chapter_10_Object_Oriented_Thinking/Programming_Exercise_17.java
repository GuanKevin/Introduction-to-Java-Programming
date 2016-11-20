package Chapter_10_Object_Oriented_Thinking;
import java.util.Scanner;

import Utilities.SquareNumbers;

/**
 * Square numbers
 * Find the first ten square numbers that are greater than Long.MAX_VALUE. 
 * A square number is a number in the form of n^2. For example, 4, 9, and 16 are square numbers. 
 * Find an efficient approach to run your program fast.
 * 
 * 03/10/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_17 
{
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println(Long.MAX_VALUE);
		System.out.println("Square numbers greater than Long.Max_Value");
		SquareNumbers sn = new SquareNumbers();
		sn.squareNumberGreaterThan(10);
	}
}
