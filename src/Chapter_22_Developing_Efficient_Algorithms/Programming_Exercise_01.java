package Chapter_22_Developing_Efficient_Algorithms;

import java.util.Scanner;

/**
 * Maximum consecutive increasingly ordered substring
 * Write a program that prompts the user to enter a string 
 * and displays the maximum consecutive increasingly ordered substring. 
 * Analyze the time complexity of your program.
 * 
 * 01/
 * @author kevgu
 *
 */

public class Programming_Exercise_01 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = input.next();
		
		System.out.print(maxConsecSubStr(str));
		
		input.close();
	}
	
	public static String maxConsecSubStr(String str)
	{
		StringBuilder subStr = new StringBuilder(str.substring(0, 1));
		String max = "";
		str += " ";
		
		for (int i = 1; i < str.length(); i++)
			if (subStr.charAt(subStr.length() - 1) < str.charAt(i))
				subStr.append(str.charAt(i));
			else
			{
				if (max.length() < subStr.length())
					max = subStr.toString();
				if ((str.length() - i) < max.length())
					break;
				subStr = new StringBuilder(str.substring(i, i + 1));
			}
		
		return max;
	}
}
