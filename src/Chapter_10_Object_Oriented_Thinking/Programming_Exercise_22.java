package Chapter_10_Object_Oriented_Thinking;

import utilities.MyString1;

/**
 * Implement the String class
 * The String class is provided in the Java library. 
 * Provide your own implementation for the following methods (name the new class MyString1):
 * public MyString1(char[] chars);
 * public char charAt(int index);
 * public int length();
 * public MyString1 substring(int begin, int end);
 * public MyString1 toLowerCase();
 * public boolean equals(MyString1 s);
 * public static MyString1 valueOf(int i);
 * 
 * 11/26/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_22 
{
	public static void main(String[] args) 
	{
		System.out.print(MyString1.valueOf(123).charAt(0));
	}
}
