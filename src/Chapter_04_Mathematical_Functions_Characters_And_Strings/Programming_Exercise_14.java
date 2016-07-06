package Chapter_04_Mathematical_Functions_Characters_And_Strings;
import java.util.Scanner;

/**
 * Convert letter grade to number
 * Write a program that prompts the user to enter a letter grade A, B, C, D, or F 
 * and displays its corresponding numeric value 4, 3, 2, 1, or 0
 * 
 * 02/14/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_14 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter grade A, B, C, D, or F: ");
		char grade = input.nextLine().charAt(0);
		
		if (grade == 'A' || grade == 'a')
		{
			System.out.print("The numeric value for " + grade + " is 4");
		}
		else if (grade == 'B')
		{
			System.out.print("The numeric value for " + grade + " is 3");
		}
		else if (grade == 'C')
		{
			System.out.print("The numeric value for " + grade + " is 2");
		}
		else if (grade == 'D')
		{
			System.out.print("The numeric value for " + grade + " is 1");
		}
		else if (grade == 'F')
		{
			System.out.print("The numeric value for " + grade + " is 0");
		}
		else
		{
			System.out.print(grade + " is not a valid grade!");
		}
		
		input.close();
	}

}
