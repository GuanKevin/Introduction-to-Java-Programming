package Chapter_05_Loops;

import java.util.Scanner;

/**
 * Decimal to octal
 * Write a program that prompts the user to enter a decimal integer and displays its corresponding octal value. 
 * Don’t use Java’s Integer.toOctalString(int) in this program.
 * 
 * 08/27/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_38 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int decimalNumber = input.nextInt();
		String octalNumber = "";
		
		while (decimalNumber != 0)
		{
			octalNumber += (decimalNumber % 8);
			decimalNumber /= 8;
		}
		
		octalNumber = new StringBuilder(octalNumber).reverse().toString();
		
		System.out.print(octalNumber);
		
        input.close();
	}
}
