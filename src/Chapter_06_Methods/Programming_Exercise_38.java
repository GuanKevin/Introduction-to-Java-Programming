package Chapter_06_Methods;
import java.util.Scanner;
import java.util.Random;

/**
 * Generate random characters
 * Use the methods in RandomCharacter in Listing 6.10 to print 100 uppercase letters and 
 * then 100 single digits, printing ten per line.
 *
 * 03/24/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_38 
{
	static Random rand = new Random();
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		printUppercaseLetters();
		printSingleDigits();
		
		input.close();		
	}
	
	public static void printSingleDigits()
	{
		for (int i = 1; i <= 100; i++)
		{
			if ((i % 10) == 0)
			{
				System.out.println(rand.nextInt(10) + " ");
			}
			else
			{
				System.out.print(rand.nextInt(10) + " ");
			}
		}
	}
	
	public static void printUppercaseLetters()
	{	
		for (int i = 1; i <= 100; i++)
		{
			if ((i % 10) == 0)
			{
				System.out.println((char)(rand.nextInt(26) % 26 + 65) + " ");
			}
			else
			{
				System.out.print((char)(rand.nextInt(26) % 26 + 65) + " ");
			}
		}
	}
}
