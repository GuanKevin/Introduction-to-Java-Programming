package Chapter_12_Exception_Handling_and_Text_IO;

import java.util.Scanner;

/**
 * NumberFormatException
 * Listing 7.9, Calculator.java, is a simple command line calculator. 
 * Note that the program terminates if any operand is non-numeric. 
 * Write a program with an exception handler that deals with non-numeric operands; 
 * then write another program without using an exception handler to achieve the same objective. 
 * Your program should display a message that informs the user of the wrong operand type before exiting (see Figure 12.12).
 * 
 * 12/06/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_01 
{
	public static void main(String[] args) 
	{
		if (args.length != 3)
		{
			System.out.print("Operand Operator Operand");
			return;
		}
		
		//calculatorExceptionHandling(args);
		calculator(args);
	}
	
	public static void calculator(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		if (checkOperand(args[0]))
		{
			System.out.print("Operand 1 is not a number, enter another number: ");
			args[0] = input.next();
		}
		if (checkOperand(args[2]))
		{
			System.out.print("Operand 2 is not a number, enter another number: ");
			args[2] = input.next();
		}
		
		input.close();
		
		switch (args[1])
		{
			case "+": System.out.print(args[0] + " + " + args[2]  + " = " + (Integer.parseInt(args[0]) + Integer.parseInt(args[2])));
				break;
			case "-": System.out.print(args[0] + " - " + args[2]  + " = " + (Integer.parseInt(args[0]) - Integer.parseInt(args[2])));
				break;
			case "/": System.out.print(args[0] + " / " + args[2]  + " = " + (Integer.parseInt(args[0]) / Integer.parseInt(args[2])));
				break;
			case "*": System.out.print(args[0] + " * " + args[2]  + " = " + (Integer.parseInt(args[0]) * Integer.parseInt(args[2])));
				break;
			default: System.out.print(args[0] + " " + args[1] + " " + args[2] + " = ?");
		}
	}
	
	public static boolean checkOperand(String operand)
	{
		for (int i = 0; i < operand.length(); i++)
			if (!Character.isDigit(operand.charAt(i)))
				return true;
		return false;
	}
	
	public static void calculatorExceptionHandling(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		try
		{
			Integer.parseInt(args[0]);
		}
		catch (NumberFormatException e)
		{
			System.out.print("Operand 1 not a number, enter a number: ");
			args[0] = input.next();
		}
		try
		{
			Integer.parseInt(args[2]);
		}
		catch (NumberFormatException e)
		{
			System.out.print("Operand 2 not a number, enter a number: ");
			args[2] = input.next();
		}
		 
		input.close();
		
		switch (args[1])
		{
			case "+": System.out.print(args[0] + " + " + args[2]  + " = " + (Integer.parseInt(args[0]) + Integer.parseInt(args[2])));
				break;
			case "-": System.out.print(args[0] + " - " + args[2]  + " = " + (Integer.parseInt(args[0]) - Integer.parseInt(args[2])));
				break;
			case "/": System.out.print(args[0] + " / " + args[2]  + " = " + (Integer.parseInt(args[0]) / Integer.parseInt(args[2])));
				break;
			case "*": System.out.print(args[0] + " * " + args[2]  + " = " + (Integer.parseInt(args[0]) * Integer.parseInt(args[2])));
				break;
			default: System.out.print(args[0] + " " + args[1] + " " + args[2] + " = ?");
		}
	}
}
