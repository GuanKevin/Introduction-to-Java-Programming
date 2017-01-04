package Chapter_20_Lists_Stacks_Queues_and_Priority_Queues;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Postfix notation
 * Postfix notation is a way of writing expressions without using parentheses. 
 * For example, the expression (1 + 2) * 3 would be written as 1 2 + 3 *. A postfix expression is evaluated using a stack. 
 * Scan a postfix expression from left to right. A variable or constant is pushed into the stack. 
 * When an operator is encountered, apply the operator with the top two operands in the stack and replace the two operands with the result. 
 * The following diagram shows how to evaluate 1 2 + 3 *.
 * Write a program to evaluate postfix expressions. Pass the expression as a command-line argument in one string.
 * 
 * 01/04/2017
 * @author kevgu
 *
 */

public class Programming_Exercise_14 
{
	public static void main(String[] args) 
	{
		if (args.length != 1)
		{
			System.out.print("Invalid arguments.. terminating program..");
			System.exit(0);
		}
		
		String[] expressions = args[0].split(" ");
		Deque<Integer> stack = new ArrayDeque<>();
		int operand1, operand2;
		
		for (int i = 0; i < expressions.length; i++)
			if (expressions[i].equals("+"))
			{
				operand2 = stack.pop();
				operand1 = stack.pop();
				System.out.println("Operating: " + operand1 + " + " + operand2);
				System.out.println("Pushing result: " + (operand1 + operand2));
				stack.push(operand1 + operand2);
			}
			else if (expressions[i].equals("-"))
			{
				operand2 = stack.pop();
				operand1 = stack.pop();
				System.out.println("Operating: " + operand1 + " - " + operand2);
				System.out.println("Pushing result: " + (operand1 - operand2));
				stack.push(operand1 - operand2);
			}
			else if (expressions[i].equals("*"))
			{
				operand2 = stack.pop();
				operand1 = stack.pop();
				System.out.println("Operating: " + operand1 + " * " + operand2);
				System.out.println("Pushing result: " + (operand1 * operand2));
				stack.push(operand1 * operand2);
			}
			else if (expressions[i].equals("/"))
			{
				operand2 = stack.pop();
				operand1 = stack.pop();
				System.out.println("Operating: " + operand1 + " / " + operand2);
				System.out.println("Pushing result: " + (operand1 / operand2));
				stack.push(operand1 / operand2);
			}
			else if (expressions[i].equals("%"))
			{
				operand2 = stack.pop();
				operand1 = stack.pop();
				System.out.println("Operating: " + operand1 + " / " + operand2);
				System.out.println("Pushing result: " + (operand1 / operand2));
				stack.push(operand1 % operand2);
			}
			else
			{
				System.out.println("Pushed: " + expressions[i]);
				stack.push(Integer.parseInt(expressions[i]));
			}
		System.out.print("The answer is: " + stack.pop());
	}
}
