package Chapter_04_Mathematical_Functions_Characters_And_Strings;
import java.util.Scanner;

/**
 * Phone key pads
 * Write a program that prompts the user to enter a letter and displays its corresponding number.
 * 
 * 08/16/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_15 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		char letter = input.next().charAt(0);
		
		if (letter == 'a' || letter == 'b' || letter == 'c' || 
				letter == 'A' || letter == 'B' || letter == 'C')	
		{
			System.out.print(letter + " is the number 2!");
		}
		else if (letter == 'd' || letter == 'e' || letter == 'F' || 
				letter == 'D' || letter == 'E' || letter == 'F')	
		{
			System.out.print(letter + " is the number 3!");
		}
		else if (letter == 'g' || letter == 'h' || letter == 'i' || 
				letter == 'G' || letter == 'H' || letter == 'I')	
		{
			System.out.print(letter + " is the number 4!");
		}
		else if (letter == 'j' || letter == 'k' || letter == 'l' || 
				letter == 'J' || letter == 'K' || letter == 'L')	
		{
			System.out.print(letter + " is the number 5!");
		}
		else if (letter == 'm' || letter == 'n' || letter == 'o' || 
				letter == 'M' || letter == 'N' || letter == 'O')	
		{
			System.out.print(letter + " is the number 6!");
		}
		else if (letter == 'p' || letter == 'q' || letter == 'r' || letter == 's' || 
				letter == 'P' || letter == 'Q' || letter == 'R' || letter == 'S')	
		{
			System.out.print(letter + " is the number 7!");
		}
		else if (letter == 't' || letter == 'u' || letter == 'v' || 
				letter == 'T' || letter == 'U' || letter == 'V')	
		{
			System.out.print(letter + " is the number 8!");
		}
		else if (letter == 'w' || letter == 'x' || letter == 'y' || letter == 'z' || 
				letter == 'W' || letter == 'X' || letter == 'Y' || letter == 'Z')	
		{
			System.out.print(letter + " is the number 9!");
		}
		else if (letter == ' ')
		{
			System.out.print("White space is the number 0!");
		}
		else
		{
			System.out.print(letter + " could be either a 1 or it does not exist!");
		}
		
		input.close();	
	}
}
