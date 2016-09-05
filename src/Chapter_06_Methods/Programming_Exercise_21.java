package Chapter_06_Methods;
import java.util.Scanner;

/**
 * Phone keypads
 * The international standard letter/number mapping for telephones is shown in Programming Exercise 4.15. 
 * Write a method that returns a number, given an uppercase letter, as follows: 
 * public static int getNumber(char uppercaseLetter) 
 * Write a test program that prompts the user to enter a phone number as a string. 
 * The input number may contain letters. 
 * The program translates a letter (uppercase or lowercase) to a digit and leaves all other characters intact. 
 * Here is a sample run of the program:
 *
 * 09/02/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_21 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a phone number: ");
		displayNumber(input.next());
		
		input.close();		
	}
	
	/**
	 * return the numerical phone number value and
	 * keeps the - with the number
	 * 
	 * @param phoneNumber
	 */
	public static void displayNumber(String phoneNumber)
	{
		String number = phoneNumber.toUpperCase();
		
		for (int i = 0; i < number.length(); i++)
			if (number.charAt(i) == '-')
				System.out.print('-');
			else if (Character.isDigit(number.charAt(i)))
				System.out.print(number.charAt(i));
			else if (Character.isLetter(number.charAt(i)))
				System.out.print(getNumber(number.charAt(i)));
	}
	
	/**
	 * returns a number, given an uppercase letter
	 * 
	 * @param uppercaseLetter
	 * @return
	 */
	public static int getNumber(char uppercaseLetter) 
	{
		if (uppercaseLetter >= 'A' && uppercaseLetter <= 'C')
			return 2;
		else if (uppercaseLetter >= 'D' && uppercaseLetter <= 'F')
			return 3;
		else if (uppercaseLetter >= 'G' && uppercaseLetter <= 'I')
			return 4;
		else if (uppercaseLetter >= 'J' && uppercaseLetter <= 'L')
			return 5;
		else if (uppercaseLetter >= 'M' && uppercaseLetter <= 'O')
			return 6;
		else if (uppercaseLetter >= 'P' && uppercaseLetter <= 'S')
			return 7;
		else if (uppercaseLetter >= 'T' && uppercaseLetter <= 'V')
			return 8;
		else
			return 9;
	}
}
