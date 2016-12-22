package Chapter_18_Recursion;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Occurrences of a specified character in an array
 * Write a recursive method that finds the number of occurrences of a specified character in an array. 
 * You need to define the following two methods. The second one is a recursive helper method.
 * public static int count(char[] chars, char ch)
 * public static int count(char[] chars, char ch, int high)
 * Write a test program that prompts the user to enter a list of characters in one line, 
 * and a character, and displays the number of occurrences of the character in the list.
 * 
 * 12/22/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_17
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		char[] list = generateList(input.nextInt());
		System.out.print("Enter a character: ");
		char a = input.next().charAt(0);
		System.out.print("Numbers of " + a + " appearances is/are in " + Arrays.toString(list) + " is " + count(list, a) + ".");
		
		input.close();
	}
	
	public static int count(char[] chars, char ch)
	{
		return count(chars, ch, 0);
	}
	
	public static int count(char[] chars, char ch, int high)
	{
		if ((chars.length - 1) == high)
			return chars[high] == ch ? 1 : 0;
		
		return (chars[high] == ch ? 1 : 0) + count(chars, ch, ++high);
	}
	
	public static char[] generateList(int size)
	{
		char[] tempList = new char[size];
		Random randChar = new Random();
		
		for (int i = 0; i < size; i++)
			if (randChar.nextInt(2) == 0)
				tempList[i] = (char) (randChar.nextInt(26) + 65);
			else
				tempList[i] = (char) (randChar.nextInt(26) + 97);
		
		return tempList;
	}
}
