package Chapter_19_Generics;

import utilities.GenericStack;

/**
 * Revising Listing 19.1 GenericStack.java
 * Revise the GenericStack class in Listing 19.1 to implement it using an array rather than an ArrayList. 
 * You should check the array size before adding a new element to the stack. 
 * If the array is full, create a new array that doubles the current array size 
 * and copy the elements from the current array to the new array.
 * 
 * 12/23/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_01 
{
	public static void main(String[] args)
	{
		GenericStack<Integer> stack = new GenericStack<Integer>(2);
		System.out.println("Push: 5");
		stack.push(5);
		System.out.println("Pop: " + stack.pop());
		System.out.println("Size: " + stack.getSize());
		System.out.println("Peek: " + stack.peek());
		System.out.println(stack.isEmpty() ? "Stack is empty." : "Stack is not empty.");
		System.out.println("Push: 8");
		stack.push(8);
		System.out.println("Push: 17");
		stack.push(17);
		System.out.println("Push: 7");
		stack.push(7);
		System.out.println(stack.toString());
	}
}