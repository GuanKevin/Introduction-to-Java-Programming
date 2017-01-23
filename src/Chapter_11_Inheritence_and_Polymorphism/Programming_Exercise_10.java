package Chapter_11_Inheritence_and_Polymorphism;

import java.util.Scanner;

import utilities.MyStack;

/**
 * Implement MyStack using inheritance
 * In Listing 11.10, MyStack is implemented using composition. 
 * Define a new stack class that extends ArrayList. 
 * Write a test program that prompts the user to enter five strings and displays them in reverse order.
 *
 * 12/05/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_10 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		MyStack stack = new MyStack();
		
		System.out.println("Add to the stack: ");
		for (int i = 0; i < 5; i++)
			stack.push(input.nextLine());
		
		System.out.println("Popping strings in the stack: ");
		
		while(!stack.isEmpty())
			System.out.println(stack.pop());
		
		input.close();
	}
}
