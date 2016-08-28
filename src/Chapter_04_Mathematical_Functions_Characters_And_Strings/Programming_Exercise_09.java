package Chapter_04_Mathematical_Functions_Characters_And_Strings;
import java.util.Scanner;

/**
 * Find the Unicode of a character
 * Write a program that receives a character and displays its Unicode.
 * 
 * 08/16/2016
 * @author kevgu
 * 
 */
 
public class Programming_Exercise_09 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);		
		System.out.print("Enter a character: ");
		char unicodeCharacter = input.next().charAt(0);
		int unicodeInteger = unicodeCharacter;
		System.out.print(unicodeInteger);
		
		input.close(); 
	}
}
