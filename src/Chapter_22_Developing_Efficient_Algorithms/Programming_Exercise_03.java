package Chapter_22_Developing_Efficient_Algorithms;

import java.util.Scanner;

/**
 * Pattern matching
 * Write a program that prompts the user to enter two strings and tests whether the second string is a substring of the first string. 
 * Suppose the neighboring characters in the string are distinct. (Don’t use the indexOf method in the String class.) 
 * Analyze the time complexity of your algorithm. 
 * Your algorithm needs to be at least O(n) time.
 * 
 * 01/
 * @author kevgu
 *
 */

public class Programming_Exercise_03 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		System.out.print("Enter a substring: ");
		String subStr = input.nextLine();
		
		int index = patternMatch(str, subStr);
		
		if (index != -1)
			System.out.print("Matched at index " + index);
		else
			System.out.print("No match.");
		
		input.close();
	}
	
	public static int patternMatch(String str, String subStr)
	{
		int index = -1;
		
		for (int i = 0; i <= str.length() - subStr.length() + 1; i++)
			if (str.charAt(i) == subStr.charAt(0))
			{
				index = i;
				int subStrIndex = 1;
				
				for (int j = i + 1; j < subStr.length() + i; j++)
					if (str.charAt(j) != subStr.charAt(subStrIndex++))
						index = -1;
			}
		
		return index;
	}
}
