package Chapter_10_Object_Oriented_Thinking;

import utilities.MyStringBuilder2;

/**
 * Implement the StringBuilder class
 * The StringBuilder class is provided in the Java library. 
 * Provide your own implementation for the following methods 
 * (name the new class MyStringBuilder2):
 * public MyStringBuilder2();
 * public MyStringBuilder2(char[] chars);
 * public MyStringBuilder2(String s);
 * public MyStringBuilder2 insert(int offset, MyStringBuilder2 s);
 * public MyStringBuilder2 reverse();
 * public MyStringBuilder2 substring(int begin);
 * public MyStringBuilder2 toUpperCase();
 * 
 * 11/27/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_28 
{
	public static void main(String[] args) 
	{
		MyStringBuilder2 string1 = new MyStringBuilder2("Hello");
		MyStringBuilder2 string2 = new MyStringBuilder2("World");
		string1 = string1.insert(3, string2);
		string1 = string1.reverse();
		string1 = string1.substring(5);
		string1 = string1.toUpperCase();
		System.out.print(string1.toString());
	}
}
