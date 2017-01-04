package Chapter_20_Lists_Stacks_Queues_and_Priority_Queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

/**
 * Convert infix to postfix
 * Write a method that converts an infix expression into a postfix expression using the following header: 
 * public static String infixToPostfix(String expression) 
 * For example, the method should convert the infix expression 
 * (1 + 2) * 3 to 1 2 + 3 * and 2 * (1 + 3) to 2 1 3 + *.
 * 
 * 01/
 * @author kevgu
 *
 */

public class Programming_Exercise_16 
{
	public static void main(String[] args) 
	{
		if (args.length < 1)
		{
			System.out.print("Invalid arguments.. terminating program..");
			System.exit(0);
		}
		
		String expression = "";
		for (int i = 0; i < args.length; i++)
			expression += args[i];
		
		try 
		{
			System.out.print(inflixToPostfix(expression));
		}
		catch (Exception ex)
		{
			System.out.print(ex.getMessage());
		}
	}
	
	public static String inflixToPostfix(String expressions)
	{
		Deque<Character> operatorStack = new ArrayDeque<>();
		StringTokenizer tokens = new StringTokenizer(expressions, "()+-/*%", true);
		String s = "";
		
		while (tokens.hasMoreTokens())
		{
			String token = tokens.nextToken().trim();
			if (token.length() == 0)
				continue;
			else if (token.charAt(0) == '+' || token.charAt(0) == '-')
			{	
				while (!operatorStack.isEmpty() &&
					(operatorStack.peek().equals('+') ||
							operatorStack.peek().equals('-') ||
							operatorStack.peek().equals('*') ||
							operatorStack.peek().equals('/'))) 
				{
					s += operatorStack.pop() + " ";
				}
				operatorStack.push(new Character(token.charAt(0)));
			}
			else if (token.charAt(0) == '*' || token.charAt(0) == '/') 
			{
				while (!operatorStack.isEmpty() && (operatorStack.peek().equals('*') || operatorStack.peek().equals('/'))) 
							s += operatorStack.pop() + " ";

		        operatorStack.push(new Character(token.charAt(0)));
			}
			else if (token.trim().charAt(0) == '(') 
		        operatorStack.push(new Character('('));
			else if (token.trim().charAt(0) == ')') 
			{
				while (!operatorStack.peek().equals('(')) 
							s += operatorStack.pop() + " ";
				operatorStack.pop(); 
			}
			else 
				s += token + " ";
	    }
		while (!operatorStack.isEmpty()) 
			s += operatorStack.pop() + " ";

	    return s;	
	}
}
