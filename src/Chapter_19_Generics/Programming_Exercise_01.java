package Chapter_19_Generics;

import java.util.Scanner;

/**
 * Revising Listing 19.1 GenericStack.java
 * Revise the GenericStack class in Listing 19.1 to implement it using an array rather than an ArrayList. 
 * You should check the array size before adding a new element to the stack. 
 * If the array is full, create a new array that doubles the current array size and copy the elements from the current array to the new array.
 * 
 * 07/26/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_01 
{
	public static void main(String[] args)
	{
		System.out.print("Enter the size of the array: ");
		Scanner input = new Scanner(System.in);
		GenericStack<String> genericStringStack = new GenericStack<>(input.nextInt());
		
		genericStringStack.push("London");
		genericStringStack.push("Paris");
		genericStringStack.push("Berlin");
		genericStringStack.push("New York");
		genericStringStack.push("California");
		genericStringStack.push("Texas");
		
		System.out.print("Enter the size of the array: ");
		GenericStack<Integer> genericIntegerStack = new GenericStack<>(input.nextInt());
		
		genericIntegerStack.push(100);
		genericIntegerStack.push(2134);
		genericIntegerStack.push(6534);
		//In the simplest definition, generic programming is a style of computer programming in which algorithms are written in terms of 
		//types to-be-specified-later that are then instantiated when needed for specific types provided as parameters.
		
		input.close();
	}
}