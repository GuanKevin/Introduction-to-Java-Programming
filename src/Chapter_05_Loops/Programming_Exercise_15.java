package Chapter_05_Loops;

import java.util.Scanner;

/**
 * Display the ASCII character table
 * Write a program that prints the characters in the ASCII character table from ! to ~. 
 * Display ten characters per line. 
 * The ASCII table is shown in Appendix B. 
 * Characters are separated by exactly one space.
 * 
 * 02/15/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_15 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int number = 0;
		int counter = 0;
		boolean unknown = true;
		
		while (unknown)
		{
			number++;
			if (((char) number) == '!');
			{
				while((char) number != '~')
				{
					System.out.print(number + " " + (char) number + " ");
					
					if (counter == 10)
					{
						counter = 0;
						System.out.println();
					}
					counter++;
					number++;
				}
			}
			number++;
		}
		
		input.close();
	}
}
