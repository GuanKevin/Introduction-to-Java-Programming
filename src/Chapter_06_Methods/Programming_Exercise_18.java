package Chapter_06_Methods;
import java.util.Scanner;

/**
 * Check password
 * Some websites impose certain rules for passwords. 
 * Write a method that checks whether a string is a valid password. Suppose the password rules are as follows:
 * A password must have at least eight characters.
 * A password consists of only letters and digits.
 * A password must contain at least two digits. 
 * Write a program that prompts the user to enter a password and displays Valid 
 * Password if the rules are followed or Invalid Password otherwise.
 *
 * 02/16/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_18 
{
	public static void main(String[] args) 
	{	
		checkPassword();				
	}
	
	public static void checkPassword()
	{
		Scanner input = new Scanner(System.in);	
		System.out.print("Enter your password: ");
		String password = input.nextLine();
		
		if (checkPasswordLength(password))
		{
			if (checkLettersDigits(password))
			{
				if (checkMinDigits(password))
				{
					System.out.println(password + " is valid!");
				}
				else
				{
					System.out.println(password + " is invalid! Password does not contain a minimum of 2 digits!");
				}
			}
			else
			{
				System.out.println(password + " is invalid! Password contains characters that are not digits or letters!");
			}
		}	
		else
		{
			System.out.println(password + " is invalid! Password length is not at least 8!");
		}
		
		input.close();	
	}
	
	public static boolean checkPasswordLength(String password)
	{
		if (password.length() < 8)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public static boolean checkLettersDigits(String password)
	{
		for (int i = 0; i < password.length(); i++)
		{	
			if (((int) password.charAt(i) >= 48 && (int) password.charAt(i) <= 57)  //Check ASCII Code of 0 - 9
					|| ((int) password.charAt(i) >= 65 && (int) password.charAt(i) <= 90) //Check ASCII Code of A - Z
					|| ((int) password.charAt(i) >= 97 && (int) password.charAt(i) <= 122)) // Check ASCII Code of a - z
			{
				return true;
			}
		}
		return false;
	}
	
	public static boolean checkMinDigits(String password)
	{
		int counter = 0;
		
		for (int i = 0; i < password.length(); i++)
		{
			if ((int) password.charAt(i) >= 48 && (int) password.charAt(i) <= 57)
			{
				counter++;
			}
		}
		if (counter < 2)	
		{
			return false;
		}
		return true;
	}
}
