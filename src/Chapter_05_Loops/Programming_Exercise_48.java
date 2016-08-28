package Chapter_05_Loops;
import java.util.Scanner;

/**
 * Process string
 * Write a program that prompts the user to enter a string and displays the characters at odd positions.
 * Beijing Chicago
 * BiigCiao
 * 
 * 08/27/2016
 * @author kevgu
 *
 *
 */

public class Programming_Exercise_48 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String processString = input.nextLine();
		
		for (int i = 0; i < processString.length(); i++)
			if (i % 2 == 0)
				System.out.print(processString.charAt(i));
		
		input.close();
	}
}
