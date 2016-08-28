package Chapter_05_Loops;
import java.util.Scanner;

/**
 * Decimal to binary 
 * Write a program that prompts the user to enter a decimal integer and displays its corresponding binary value. 
 * Don’t use Java’s Integer.toBinaryString(int) in this program.
 * 
 * 08/27/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_37 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		int decimalNumber = input.nextInt();
		System.out.println("The correct answer should be: " + Integer.toBinaryString(decimalNumber));
		
		int powerCounter = 0;
		
		while (Math.pow(2, powerCounter) < decimalNumber)
			powerCounter++;
		
		String binaryStr = "";
		
		for (int i = powerCounter; i >= 0; i--)
		{
			if (decimalNumber / (Math.pow(2, i)) >= 1)
			{
				binaryStr += '1';
				decimalNumber %= Math.pow(2, i);
			}
			else
				binaryStr += '0';
		}
		
		System.out.println("The answer that I got: " + binaryStr);
		
		input.close();
	}
}
