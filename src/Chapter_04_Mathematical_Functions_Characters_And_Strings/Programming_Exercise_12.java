package Chapter_04_Mathematical_Functions_Characters_And_Strings;
import java.util.Scanner;

/**
 * Hex to binary
 * Write a program that prompts the user to enter a hex digit 
 * and displays its corresponding binary number.
 * 
 * 08/16/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_12 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a hex digit: ");
		int hex = input.nextInt();
		
		if (hex <= 1)
			System.out.print("Binary value is " + hex);
		else if (hex == 2)
			System.out.print("Binary value is 10");
		else if (hex == 3)
			System.out.print("Binary value is 11");
		else if (hex == 4)
			System.out.print("Binary value is 100");
		else if (hex == 5)
			System.out.print("Binary value is 101");
		else if (hex == 6)
			System.out.print("Binary value is 110");
		else if (hex == 7)
			System.out.print("Binary value is 111");
		else if (hex == 8)
			System.out.print("Binary value is 1000");
		else if (hex == 9)
			System.out.print("Binary value is 1001");
		else if (hex == 10)
			System.out.print("Binary value is 1010");
		else if (hex == 11)
			System.out.print("Binary value is 1011");
		else if (hex == 12)
			System.out.print("Binary value is 1100");
		else if (hex == 13)
			System.out.print("Binary value is 1101");
		else if (hex == 14)
			System.out.print("Binary value is 1110");
		else if (hex == 15)
			System.out.print("Binary value is 1111");
		input.close();		
	}
}
