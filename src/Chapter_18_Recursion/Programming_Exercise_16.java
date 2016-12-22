package Chapter_18_Recursion;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Find the number of uppercase letters in an array
 * Write a recursive method to return the number of uppercase letters in an array of characters. 
 * You need to define the following two methods. 
 * The second one is a recursive helper method.
 * public static int count(char[] chars)
 * public static int count(char[] chars, int high)
 * Write a test program that prompts the user to enter a list of characters in one line and displays the number of 
 * uppercase letters in the list.
 * 
 * 12/22/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_16
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		char[] list = generateList(input.nextInt());
		System.out.print("Numbers of uppercase in " + Arrays.toString(list) + " is " + count(list) + ".");
		
		input.close();
	}
	
	public static int count(char[] chars)
	{
		return count(chars, 0);
	}
	
	public static int count(char[] chars, int high)
	{
		if ((chars.length - 1) == high)
			return (Character.isUpperCase(chars[high]) ? 1 : 0);
		
		return (Character.isUpperCase(chars[high]) ? 1 : 0) + count(chars, ++high);
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
