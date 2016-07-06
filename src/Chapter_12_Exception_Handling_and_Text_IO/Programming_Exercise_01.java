package Chapter_12_Exception_Handling_and_Text_IO;

/**
 * NumberFormatException
 * Listing 7.9, Calculator.java, is a simple command line calculator. 
 * Note that the program terminates if any operand is non-numeric. 
 * Write a program with an exception handler that deals with non-numeric operands; 
 * then write another program without using an exception handler to achieve the same objective. 
 * Your program should display a message that informs the user of the wrong operand type before exiting (see Figure 12.12).
 * 
 * 03/16/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_01 
{
	public static void main(String[] args) 
	{
		if (args.length != 3)
		{
			System.out.println("Usage: java Calculator operand1 operator operand2");
			System.exit(0);
		}
		
		int result = 0;
		
		/*try
		{
			switch (args[1].charAt(0)) 
			{
				case '+': result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
				{
					break;
				}
				case '-': result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
				{
					break;
				}
				case 'x': result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
				{
					break;
				}
				case '/': result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
			}
			
			System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
		}
		catch (NumberFormatException ex)
		{
			System.out.println("Number format Exception Error! " + ex.getMessage());
			System.exit(0);
		}*/
		
		if (isDigit(args[0]) && isDigit(args[2]))
		{			
			if (args[1].charAt(0) == '+')
			{
				result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
			}
			else if (args[1].charAt(0) == '-')
			{
				result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
			}
			else if (args[1].charAt(0) == 'x')
			{
				result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
			}
			else
			{
				result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
			}
		}
		else
		{
			System.out.println("The operand inputs are not integers!");
			System.exit(0);
		}
		
		System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
	}
	
	public static boolean isDigit(String digit)
	{
		//Checks if the string passed over --> 0 to 9, a
		if (digit.length() == 1 && (digit.charAt(0) < '0' || digit.charAt(0) > '9'))
		{
			return true;
		}
		//Checks if the digits 22, 1000, a, 10q, 10.05
		else
		{
			for (int i = 0; i < digit.length(); i++)
			{
				if (digit.charAt(i) < '0' || digit.charAt(i) > '9')
				{
					return false;
				}
			}
		}
		
		return true;
	}
}
