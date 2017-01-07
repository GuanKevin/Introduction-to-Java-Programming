package Chapter_22_Developing_Efficient_Algorithms;

import java.util.Scanner;

/**
 * Pattern matching
 * Write a program that prompts the user to enter two strings and tests whether the second string is a substring of the first string. 
 * (Don’t use the indexOf method in the String class.) Analyze the time complexity of your algorithm.
 * 
 * 01/
 * @author kevgu
 *
 */

public class Programming_Exercise_04 
{
	public static void main(String[] args) 
	{
		Scanner input = new java.util.Scanner(System.in);
	    System.out.print("Enter a string s1: ");
	    String s1 = input.nextLine();
	    System.out.print("Enter a string s2: ");
	    String s2 = input.nextLine();
	    
	    int index = match(s1, s2);
	    if (index >= 0)
	      System.out.println("matched at index " + index);
	    else
	      System.out.println("unmatched");   

	    input.close();
	}

	/**
	 * The worst-case complexity is O(nk), where n is s.length() and k
	 * is pattern.length()
	 *
	 * @param s String
	 * @param pattern String
	 * @return int
	 */
	public static int match(String s, String pattern) 
	{
		for (int p = 0; p < s.length(); p++) 
		{
			int k = 0;
			for (int i = p; i < s.length(); i++) 
			{
				if (k == pattern.length())
					return i - pattern.length();
				else 
				{
					if (s.charAt(i) == pattern.charAt(k))
						k++;
					else
						break;
				}
			}
		
			if (k == pattern.length())
			  return s.length() - pattern.length();
		}

		return -1;
	}
}

