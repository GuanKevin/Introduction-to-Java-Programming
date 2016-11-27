package Chapter_11_Inheritence_and_Polymorphism;
import java.util.Scanner;

import Utilities.myStack;

/**
 * Implement MyStack using inheritance
 * In Listing 11.10, MyStack is implemented using composition. 
 * Define a new stack class that extends ArrayList. 
 * Write a test program that prompts the user to enter five strings and displays them in reverse order.
 *
 * 03/20/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_10 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		myStack mystack = new myStack();
		System.out.println("Enter 5 strings: ");
		inputStrings(mystack);
	}
	
	public static void inputStrings(myStack mystack)
	{
		for (int i = 0; i < 5; i++)
		{
			mystack.push(input.nextLine());
		}
		System.out.println(mystack.toString());
		displayReverse(mystack);
	}
	
	public static void displayReverse(myStack mystack)
	{
		while (mystack.size() > 0)
		{
			System.out.print(mystack.pop() + " ");
		}
	}
}
