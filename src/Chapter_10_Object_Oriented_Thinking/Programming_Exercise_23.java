package Chapter_10_Object_Oriented_Thinking;

import utilities.MyString2;

/**
 * Implement the String class
 * The String class is provided in the Java library. 
 * Provide your own implementation for the following methods (name the new class MyString2): 
 * public MyString2(String s);
 * public int compare(String s);
 * public MyString2 substring(int begin);
 * public MyString2 toUpperCase();
 * public char[] toChars();
 * public static MyString2 valueOf(boolean b);
 * 
 * 11/25/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_23 
{
	public static void main(String[] args) 
	{
		MyString2 obj = new MyString2("Hello World!");
		obj = obj.substring(3);
		System.out.println(obj.getString());
	}
}
