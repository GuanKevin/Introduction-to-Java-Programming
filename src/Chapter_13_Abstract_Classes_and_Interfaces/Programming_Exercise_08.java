package Chapter_13_Abstract_Classes_and_Interfaces;

import utilities.MyStack;

/**
 * Revise the MyStack class
 * Rewrite the MyStack class in Listing 11.10 to perform a deep copy of the list field.
 * 
 * A class implements the Cloneable interface to indicate to the Object.clone() method 
 * that it is legal for that method to make a field-for-field copy of instances of that class.
 * 
 * Deep copy of an object will have exact copy of all the fields of original object just like shallow copy. 
 * But in additional, if original object has any references to other objects as fields, then copy of those objects are also created by calling clone() method on them. 
 * That means clone object and original object will be 100% disjoint. They will be 100% independent of each other. 
 * Any changes made to clone object will not be reflected in original object or vice-versa.
 * 
 * 12/10/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_08
{
	public static void main(String[] args) 
	{
		MyStack stack1 = new MyStack();
		stack1.push('a');
		stack1.push('b');
		stack1.push('c');
		stack1.push('1');
		
		MyStack stack2 = (MyStack) (stack1.clone());
		stack2.push('2');
		
		System.out.print("Stack1: " + stack1.getSize()
						+ "\nStack2: " + stack2.getSize());
	}
}