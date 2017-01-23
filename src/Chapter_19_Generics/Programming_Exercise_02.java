package Chapter_19_Generics;

import java.util.Scanner;

import utilities.GenericStackInheritance;

/**
 * Implement GenericStack using inheritance
 * In Listing 19.1, GenericStack is implemented using composition. 
 * Define a new stack class that extends ArrayList. 
 * Write a test program that prompts the user to enter five strings and displays them in reverse order.
 * 
 * 12/23/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_02 
{
	public static void main(String[] args) 
	{
		GenericStackInheritance<String> stack = new GenericStackInheritance<>();
		System.out.print("Push: " + stack.push("Show me the money.")
				+ "\nSearch: " + stack.search("Show me the money.")
				+ "\nSize: " + stack.size()
				+ "\nString: " + stack.toString()
				+ "\nPop: " + stack.pop()
				+ "\nPeek: " + stack.peek() + "\n");
		
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 5; i++)
		{
			System.out.print("Enter string " + i + ": ");
			stack.push(input.nextLine());
		}
		
		for (int i = 0; i < 5; i++)
			System.out.print(stack.pop());
		
		input.close();
	}
}

