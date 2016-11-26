package Chapter_10_Object_Oriented_Thinking;

import java.math.BigDecimal;

/**
 * Approximate e
 * Exercise 5.26 approximates e using the following series:
 * In order to get better precision, use BigDecimal with 25 digits of precision in the computation. 
 * Write a program that displays the e value for i = 100, 200, . . . , and 1000.
 * 
 * 11/26/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_20 
{
	public static void main(String[] args) 
	{
		BigDecimal e = BigDecimal.ONE;
	    BigDecimal item = BigDecimal.ONE; 

	    for (int i = 1; i <= 1000; i++) 
	    {
	    	item = item.divide(new BigDecimal(i + ""), 25, BigDecimal.ROUND_UP);
	    	e = e.add(item);
		  
	    	if (i % 100 == 0)
	    		System.out.println("The e is " + e + " for i = " + i);
	    }
	}
}
