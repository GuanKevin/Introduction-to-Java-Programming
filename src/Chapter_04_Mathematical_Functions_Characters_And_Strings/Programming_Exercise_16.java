package Chapter_04_Mathematical_Functions_Characters_And_Strings;

/**
 * Random character
 * Write a program that displays a random uppercase letter using the Math.random() method.
 * 
 * 08/16/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_16 
{
	public static void main(String[] args) 
	{
		int number = (int) (Math.random() * 26) + 65;
		
		System.out.print((char) number);
	}
}
