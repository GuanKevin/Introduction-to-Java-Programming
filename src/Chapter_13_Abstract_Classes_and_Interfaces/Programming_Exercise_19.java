package Chapter_13_Abstract_Classes_and_Interfaces;

import java.math.BigInteger;

import utilities.Rational;

/**
 * Convert decimals to fractions
 * Write a program that prompts the user to enter a decimal number and displays the number in a fraction. 
 * Hint: read the decimal number as a string, extract the integer part and fractional part from the string, 
 * and use the BigInteger implementation of the Rational class in Programming Exercise 13.15 to obtain a rational number for the decimal number.
 * 
 * 12/14/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_19
{
	public static void main(String[] args) 
	{
		String number = "12.75";
		int wholeNum = (int) Double.parseDouble(number);
		double decimal = Double.parseDouble(number.substring(number.indexOf('.'), number.length()));
		
		Rational rational;
		for (int i = 2; i <= 10000; i++)
			for (int j = 1; j < i; j++)
				if (new Rational(new BigInteger(Integer.toString(j)), new BigInteger(Integer.toString(i))).doubleValue() == decimal)
				{
					rational = new Rational(new BigInteger(Integer.toString(j)), new BigInteger(Integer.toString(i)));
					System.out.print(number + " = " + wholeNum + " " + rational);
					System.exit(0);
				}
	}
}
