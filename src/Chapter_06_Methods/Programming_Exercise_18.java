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
 * 08/31/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_18 
{
	public static void main(String[] args) 
	{	
		Scanner input = new Scanner(System.in);
		System.out.println("A password must have at least eight characters."
				+ "\nA password consists of only letters and digits."
				+ "\nA password must contain at least two digits. ");
		System.out.print("Check password: ");
		
		if (checkPassword(input.next()))
			System.out.print("Valid Password");
		else
			System.out.print("Invalid Password");
		
		input.close();
	}
	
	/**
	 * Returns true if it satisfy all password
	 * requirement conditions
	 * 
	 * @param password
	 * @return
	 */
	public static boolean checkPassword(String password)
	{
		if (checkLength(password))
			if (onlyLettersDigits(password))
				if (atLeast2Digits(password))
					return true;
				else return false;
			else return false;
		else return false;
	}
	
	/**
	 * Return true if the string contains two digits
	 * 
	 * @param password
	 * @return
	 */
	public static boolean atLeast2Digits(String password)
	{
		int digitCounter = 0;
		
		for (int i = 0; i < password.length(); i++)
			if (Character.isDigit(password.charAt(i)))
					digitCounter++;
			
		if (digitCounter >= 2)
			return true;
		
		return false;
	}
	
	/**
	 * Returns true if it consists of only letters and digits
	 * 
	 * @param password
	 * @return
	 */
	public static boolean onlyLettersDigits(String password)
	{
		for (int i = 0; i < password.length(); i++)
			if (!(Character.isDigit(password.charAt(i)) || Character.isLetter(password.charAt(i))))
				return false;
		
		return true;
	}
	
	/**
	 * Returns true if string has at least eight characters
	 * 
	 * @param password
	 * @return
	 */
	public static boolean checkLength(String password)
	{
		if (password.length() <= 7)
			return false;
		
		return true;
	}
}
