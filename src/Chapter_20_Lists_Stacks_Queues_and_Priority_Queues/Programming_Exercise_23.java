package Chapter_20_Lists_Stacks_Queues_and_Priority_Queues;

import java.util.Scanner;
import java.util.Stack;

public class Programming_Exercise_23 {
	public static void main(String [] args)
	{
		System.out.print("Enter an expression: ");
		Scanner scanner = new Scanner(System.in);
		String expression = scanner.nextLine();
		System.out.println(expression + " = " + evalExpression(expression));
		scanner.close();
	}
	
	public static int evalExpression(String expression)
	{
		int value = 0;
		Stack<Integer> stack = new Stack<Integer>();
		
		expression.replaceAll("\\s", "");
		while(expression.contains("^") || expression.contains("*") || expression.contains("/") || 
		expression.contains("%") || expression.contains("+") || expression.contains("-"))
		{
			for(int i = 0; i < expression.length(); i++)
			{
				
				if(expression.charAt(i) == '(')
					stack.push(i);
				if(expression.charAt(i) == ')')
				{
					if(stack.isEmpty())
					{
						System.out.println("Extra parenthesis IDIOT!");
						System.exit(1);
					}
					else
					{
						value += evalExpression(expression.substring(stack.peek(), i));
						stack.pop();
					}
				}
				if(expression.charAt(i) == '^')
					return 0;
			}
		}
		return value;
	}
}
