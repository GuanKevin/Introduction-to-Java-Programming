package Chapter_04_Mathematical_Functions_Characters_And_Strings;
import java.util.Scanner;

/**
 * Convert letter grade to number
 * Write a program that prompts the user to enter a letter grade A, B, C, D, or F 
 * and displays its corresponding numeric value 4, 3, 2, 1, or 0
 * 
 * 08/16/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_14 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter between A to F: ");
		char grade = input.next().charAt(0);
		
		if (grade == 'A')
			System.out.print("4");
		else if (grade == 'B')
			System.out.print("3");
		else if (grade == 'C')
			System.out.print("2");
		else if (grade == 'D')
			System.out.print("1");
		else 
			System.out.print("0");

		input.close();
	}
}
