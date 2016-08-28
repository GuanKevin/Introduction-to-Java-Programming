package Chapter_04_Mathematical_Functions_Characters_And_Strings;
import java.util.Scanner;

/**
 * Find the character of an ASCII code
 * Write a program that receives an ASCII code (an integer between 0 and 127) and displays its character.
 * 
 *  08/16/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_08 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer between 0 and 127: ");
		int asciiCode = input.nextInt();
		
		System.out.println((char) asciiCode); 
		
		char asciiChar = (char) asciiCode;
		
		System.out.print(asciiChar);
		input.close();
	}
}
