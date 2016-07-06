package Chapter_04_Mathematical_Functions_Characters_And_Strings;
import java.util.Scanner;

/**
 * Check SSN
 * Write a program that prompts the user to enter a Social Security number in the format DDD-DD-DDDD, where D is a digit. 
 * Your program should check whether the input is valid.
 * 
 * 02/14/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_21 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your social security number in the format DDD-DD-DDDD, where D is a digit: ");
		String ssn = input.next(); //Social Security Number
		
		//1st -> Check the length of the input
		//Input length should be the length of this: DDD-DD-DDDD
		if (ssn.length() == 11)
		{
			//Check if index 3 and index 6 is -
			//DDD-DD-DDDD
			System.out.println("The SSN has a length of 11!");
			
			if (ssn.charAt(3) == '-' && ssn.charAt(6) == '-')
			{
				//DDD-DD-DDDD
				//012-45-789 10
				//Is it an integer?
				System.out.println("The SSN has a - at index 3 or 6.");
				
				if (Character.isDigit(ssn.charAt(0)) && Character.isDigit(ssn.charAt(1)) && 
						Character.isDigit(ssn.charAt(2)) && Character.isDigit(ssn.charAt(4)) && Character.isDigit(ssn.charAt(5)) &&
						Character.isDigit(ssn.charAt(7)) && Character.isDigit(ssn.charAt(8)) && Character.isDigit(ssn.charAt(9)) &&
						Character.isDigit(ssn.charAt(10)))
				{
					System.out.println("The input is valid!");
				}
				else
				{
					System.out.println("There may be a non-digit input at index 0 or 1 or 2 or 4 or 5 or 7 or 8 or 9 or 10");
					System.out.println("The input is invalid!");
				}
			}
			else
			{
				System.out.println("The SSN does not have a - at index 3 or 6.");
				System.out.println("The input is invalid!");
			}
		}
		else
		{
			System.out.println("The SSN does not have a length of 11!");
			System.out.println("The input is valid!");
		}
		
		
		input.close();
	}

}