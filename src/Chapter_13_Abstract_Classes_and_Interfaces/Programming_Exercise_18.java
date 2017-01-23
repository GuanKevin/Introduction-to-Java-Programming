package Chapter_13_Abstract_Classes_and_Interfaces;

import java.math.BigInteger;

import utilities.Rational;

/**
 * Use the Rational class
 * Write a program that computes the following summation series using the Rational class: (SEE BOOK)
 * You will discover that the output is incorrect because of integer overflow (too large). 
 * To fix this problem, see Programming Exercise 13.15.
 * 
 * 12/14/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_18
{
	public static void main(String[] args) 
	{
		Rational rational = new Rational(BigInteger.ONE, new BigInteger("2"));
		System.out.print(rational + " + ");
		
		for (int i = 2; i <= 99; i++)
		{		
			if (i % 10 == 0)
				System.out.println((i + "/" + (i + 1)) + " + ");
			else if (i != 99)
				System.out.print((i + "/" + (i + 1)) + " + ");
			else
				System.out.println((i + "/" + (i + 1)) + " = ");
			
			rational = rational.add(new Rational(new BigInteger(Integer.toString(i)), new BigInteger(Integer.toString(i + 1))));
		}
		
		System.out.print(rational);
	}
}
