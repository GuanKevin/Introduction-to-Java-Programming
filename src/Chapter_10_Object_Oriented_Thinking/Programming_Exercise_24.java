package Chapter_10_Object_Oriented_Thinking;

import utilities.MyCharacter;

/**
 * Implement the Character class
 * The Character class is provided in the Java library. 
 * Provide your own implementation for this class. Name the new class MyCharacter.
 * 
 * 11/26/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_24 
{
	public static void main(String[] args) 
	{
		MyCharacter anotherCharacter = new MyCharacter('a');
		System.out.print(anotherCharacter.charValue());
	}
}
