package Chapter_19_Generics;

import java.util.Scanner;

/**
 * Implement GenericStack using inheritance
 * In Listing 19.1, GenericStack is implemented using composition. 
 * Define a new stack class that extends ArrayList. 
 * Write a test program that prompts the user to enter five strings and displays them in reverse order.
 * 
 * 07/26/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_02 
{
	public static void main(String[] args) 
	{
		GenericStackInheritance<String> myStack = new GenericStackInheritance<>(); 
		System.out.print("Enter size: ");
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		
		for (int i = 0; i < size; i++)
		{
			myStack.push(input.next());
		}
		
		for (int i = 0; i < size; i++)
		{
			System.out.print(myStack.pop() + " ");
		}
		
		input.close();
	}
}
