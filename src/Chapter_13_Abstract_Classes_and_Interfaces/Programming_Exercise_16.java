package Chapter_13_Abstract_Classes_and_Interfaces;

import java.math.BigInteger;

import utilities.Rational;

/**
 * Create a rational-number calculator
 * Write a program similar to Listing 7.9, Calculator.java. Instead of using integers, use rationals, as shown in Figure 13.10a. 
 * You will need to use the split method in the String class, introduced in Section 10.10.3, Replacing and Splitting Strings, 
 * to retrieve the numerator string and denominator string, and convert strings into integers using the Integer.parseInt method.
 * 
 * 12/14/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_16
{
	public static void main(String[] args) 
	{
		if (args.length != 1)
		{
			System.out.print("\"Operand1 Operator Operand2\"");
			System.exit(0);
		}
		
		String[] tokens = args[0].split(" ");
		
		switch (tokens[1].charAt(0))
		{
			case '+': System.out.println(tokens[0] + " " + tokens[1] + " " + tokens[2] + " = " + 
					getRational(tokens[0]).add(getRational(tokens[2])));
					break;
			case '-': System.out.println(tokens[0] + " " + tokens[1] + " " + tokens[2] + " = " + 
					getRational(tokens[0]).subtract(getRational(tokens[2])));
					break;
			case '*': System.out.println(tokens[0] + " " + tokens[1] + " " + tokens[2] + " = " + 
					getRational(tokens[0]).multiply(getRational(tokens[2])));
					break;
			case '/': System.out.println(tokens[0] + " " + tokens[1] + " " + tokens[2] + " = " + 
					getRational(tokens[0]).divide(getRational(tokens[2])));
					break;
			default: System.out.print("Invalid operator!");
					break;
		}
	}
	
	public static Rational getRational(String s)
	{
		String[] str = s.split("/");
		BigInteger numerator = new BigInteger(str[0]);
		BigInteger demoninator = new BigInteger(str[1]);
		return new Rational(numerator, demoninator);
	}
}