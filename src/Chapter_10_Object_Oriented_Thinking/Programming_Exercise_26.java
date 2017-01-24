package Chapter_10_Object_Oriented_Thinking;

import utilities.Calculator;
import utilities.MyString2;

/**
 * Calculator
 * Revise Listing 7.9, Calculator.java, 
 * to accept an expression as a string in which the operands and operator are separated by zero or more spaces.
 * 
 * 11/27/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_26 
{
	public static void main(String[] args) 
	{
		if (args.length != 1) 
		{
		      System.out.println("operand1 operator operand2");
		      System.exit(1);
	    }
		
		String s = args[0];
		s = removeBlanks(s);
		args = MyString2.split(s, "[+-/*]");

		Calculator calculate = new Calculator(args);
		calculate.Calculate();
		calculate.printResult();
	}
	
	public static String removeBlanks(String s) 
	{
		String temp = "";
		
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) != ' ')
				temp += s.charAt(i);
		return temp;
	}
}
