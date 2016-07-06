package Chapter_05_Loops;
import java.util.Scanner;

/**
 * Process string
 * Write a program that prompts the user to enter a string and displays the characters at odd positions.
 * Beijing Chicago
 * BiigCiao
 * 
 * 03/24/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_48 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: " );
		String userStringInput = input.nextLine();
		String myTempString = "";
		
		for (int i = 0; i < userStringInput.length(); i++)
		{
			if (((i + 1) % 2) == 1)
			{
				myTempString += userStringInput.charAt(i);
			}
		}
		
		System.out.println("Characters at odd positions: " + myTempString);
		
		input.close();
	}
}
