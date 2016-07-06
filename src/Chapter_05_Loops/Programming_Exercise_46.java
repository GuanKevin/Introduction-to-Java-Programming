package Chapter_05_Loops;
import java.util.Scanner;

/**
 * Reverse a string
 * Write a program that prompts the user to enter a string and displays the string in reverse order. 
 * 
 * 03/24/2016
 * @author kevgu
 *
 */


public class Programming_Exercise_46 {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String reverseMe = input.next();
		String tempString = "";
		
		/*
		 * H e l l o
		 * o l l e H
		 */
		
		for (int i = reverseMe.length() - 1; i >= 0 ; i--)
		{
			tempString += reverseMe.charAt(i);
		}
		
		System.out.println("The reverse is " + tempString);
		
		input.close();
	}
}
