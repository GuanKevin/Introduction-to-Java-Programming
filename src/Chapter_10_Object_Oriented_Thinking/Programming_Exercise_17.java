package Chapter_10_Object_Oriented_Thinking;

import java.math.BigDecimal;

/**
 * Square numbers
 * Find the first ten square numbers that are greater than Long.MAX_VALUE. 
 * A square number is a number in the form of n^2. For example, 4, 9, and 16 are square numbers. 
 * Find an efficient approach to run your program fast.
 * 
 * 11/26/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_17 
{
	public static void main(String[] args) 
	{
		BigDecimal bigNum = new BigDecimal(Math.round(Math.sqrt(Long.MAX_VALUE)));
		
		System.out.println("Squre Root of Long.MAX_VALUE: " + Math.sqrt(Long.MAX_VALUE) 
		+ "\nLong.MAX_VALUE: " + Long.MAX_VALUE);
		
		for (int i = 1; i <= 10; i++)
		{
			System.out.println(bigNum.multiply(bigNum));
			bigNum = bigNum.add(BigDecimal.ONE);
		}
	}
}
