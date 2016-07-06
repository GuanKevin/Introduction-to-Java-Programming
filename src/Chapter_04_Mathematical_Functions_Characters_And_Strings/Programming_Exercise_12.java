package Chapter_04_Mathematical_Functions_Characters_And_Strings;
import java.util.Scanner;

/**
 * Hex to binary
 * Write a program that prompts the user to enter a hex digit 
 * and displays its corresponding binary number.
 * 
 * 02/13/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_12 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a hex digit: ");
		//Hexidecimal -> 0 - 9, A - F 
		String hex = input.nextLine();
		
		//B -> 66
		//B in Hexidecimal is 11 --> 8 + 0 + 2 + 1 --> 1011
		//String -- > First Char --> Convert into an integer --> Binary String
		//w(0)o(1)r(2)d(3)
		
		char chex = hex.charAt(0);
		int ihex = (int) chex;
		
		if (chex == 'A')
		{
			ihex = 10;
		}
		if (chex == 'B')
		{
			ihex = 11;
		}
		if (chex == 'C')
		{
			ihex = 12;
		}
		if (chex == 'D')
		{
			ihex = 13;
		}
		if (chex == 'E')
		{
			ihex = 14;
		}
		if (chex == 'F')
		{
			ihex = 16;
		}
		
		String shex = Integer.toBinaryString(ihex);	
		System.out.print("The binary of " + hex + " is " + shex);

		input.close();		
	}

}
