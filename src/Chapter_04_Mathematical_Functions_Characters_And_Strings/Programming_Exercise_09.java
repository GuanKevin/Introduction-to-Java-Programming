package Chapter_04_Mathematical_Functions_Characters_And_Strings;
import java.util.Scanner;

/**
 * Find the Unicode of a character
 * Write a program that receives a character and displays its Unicode.
 * 
 * 02/11/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_09 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char mychar = input.next().charAt(0);
		int unicode = mychar;
		
		System.out.print("The unicode of " + mychar + " is " + unicode);
		
		input.close();
	}

}
