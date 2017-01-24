package Chapter_10_Object_Oriented_Thinking;

import utilities.MyStringBuilder1;

/**
 * Implement the StringBuilder class
 * The StringBuilder class is provided in the Java library. 
 * Provide your own implementation for the following methods 
 * (name the new class MyStringBuilder1):
 * public MyStringBuilder1(String s);
 * public MyStringBuilder1 append(MyStringBuilder1 s);
 * public MyStringBuilder1 append(int i);
 * public int length();
 * public char charAt(int index);
 * public MyStringBuilder1 toLowerCase();
 * public MyStringBuilder1 substring(int begin, int end);
 * public String toString();
 * 
 * 11/27/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_27 
{
	public static void main(String[] args) 
	{
		MyStringBuilder1 myString = new MyStringBuilder1("Hello World");
		myString.append(100);
		System.out.print(myString.toString());
	}
}
