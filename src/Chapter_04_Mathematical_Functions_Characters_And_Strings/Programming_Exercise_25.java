package Chapter_04_Mathematical_Functions_Characters_And_Strings;

/**
 * Generate vehicle plate numbers
 * Assume a vehicle plate number consists of three uppercase letters followed by four digits. 
 * Write a program to generate a plate number.
 * 
 * 08/18/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_25 
{
	public static void main(String[] args) 
	{
		char c1 = (char) (Math.random() * 26 + 65);
		char c2 = (char) (Math.random() * 26 + 65);
		char c3 = (char) (Math.random() * 26 + 65);
		int digits = (int) (Math.random() * 9000 + 1000);
		
		System.out.print("" + c1 + c2 + c3 + "-" + digits);
	}
}