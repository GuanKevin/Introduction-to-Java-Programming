package Chapter_04_Mathematical_Functions_Characters_And_Strings;

/**
 * Random character
 * Write a program that displays a random uppercase letter using the Math.random() method.
 * 
 * 02/14/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_16 
{
	public static void main(String[] args) 
	{
		//a - z
		//A - Z
		//random numbers -> integer
		//ASCII Code 
		int number = ((int)(Math.random() * 26) + 64);
		char letter = (char) number;
		
		System.out.print(letter);
	}
}
