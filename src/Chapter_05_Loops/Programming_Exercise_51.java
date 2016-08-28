package Chapter_05_Loops;
import java.util.Scanner;

/**
 * Longest common prefix
 * Write a program that prompts the user to enter two strings and displays the largest common prefix of the two strings.
 * 
 * 08/27/2016
 * @author kevgu
 *
 */


public class Programming_Exercise_51 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 1st string: ");
		String s1 = input.nextLine();
		
		System.out.print("Enter 2nd string: ");
		String s2 = input.nextLine();
		
		int length = Math.min(s1.length(), s2.length());
		
		int counter = 0;
		
		for (int i = 0; i < length; i++)
		{
			if (s1.charAt(i) == s2.charAt(i))
				counter++;
			else
				break;
		}
		
		if (counter > 0)
			for (int i = 0; i < counter; i++)
				System.out.print(s1.charAt(i));
		
		input.close();
	}
	
}
