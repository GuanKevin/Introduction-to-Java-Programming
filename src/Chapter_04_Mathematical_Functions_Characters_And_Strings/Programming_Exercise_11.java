package Chapter_04_Mathematical_Functions_Characters_And_Strings;
import java.util.Scanner;

/**
 * Decimal to hex
 * Write a program that prompts the user to enter an integer between 0 and 15 and displays its corresponding hex number.
 * 
 * 02/11/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_11 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer between 0 and 15: ");
		int number = input.nextInt();
		
		String hex = Integer.toHexString(number);
		
		if (number < 0 || number > 15)
		{
			System.out.println(number + " is not a valid input");
		}
		else
			System.out.println("The hex of " + number + " is " + hex);
		
		input.close();
	}

}
