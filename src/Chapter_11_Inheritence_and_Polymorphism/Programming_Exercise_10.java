package Chapter_11_Inheritence_and_Polymorphism;
import Utilities.MyStack;
import java.util.Scanner;

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
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		MyStack stack = new MyStack(scanner.next());
		stack.display();
	}

}
