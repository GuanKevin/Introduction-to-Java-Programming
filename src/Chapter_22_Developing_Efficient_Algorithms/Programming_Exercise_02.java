package Chapter_22_Developing_Efficient_Algorithms;

import java.util.Scanner;

/**
 * Maximum increasingly ordered subsequence
 * Write a program that prompts the user to enter a string and displays the maximum increasingly ordered subsequence of characters. 
 * Analyze the time complexity of your program.
 * 
 * 01/
 * @author kevgu
 *
 */

public class Programming_Exercise_02 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = input.next();
		
		System.out.print(maxOrderedSubseq(str));
		
		input.close();
	}
	
	public static String maxOrderedSubseq(String str)
	{
		StringBuilder sb = new StringBuilder(str.substring(0, 1));
		
		for (int i = 1; i < str.length(); i++)
			if (sb.charAt(sb.length() - 1) < str.charAt(i))
				sb.append(str.charAt(i));
		
		return sb.toString();
	}
}
