package Chapter_04_Mathematical_Functions_Characters_And_Strings;
import java.util.Scanner;

/**
 * Decimal to hex
 * Write a program that prompts the user to enter an integer between 0 and 15 and displays its corresponding hex number.
 * 
 * 08/16/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_11 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		/**
		 * Hex Numbers
		 * 0 - 9 Stay the same
		 * 10 - 15 A to F
		 */
		
		System.out.print("Enter an integer between 0 and 15: ");
		int hex = input.nextInt();
		
		if (hex <= 9)
		{
			System.out.print("The hex value is " + hex);
		}
		else
		{
			System.out.print("The hex value is " + (char) (hex + 55));
		}
		
		input.close(); 
	}
}
