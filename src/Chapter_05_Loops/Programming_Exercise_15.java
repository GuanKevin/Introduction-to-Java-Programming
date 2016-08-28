package Chapter_05_Loops;

/**
 * Display the ASCII character table
 * Write a program that prints the characters in the ASCII character table from ! to ~. 
 * Display ten characters per line. 
 * The ASCII table is shown in Appendix B. 
 * Characters are separated by exactly one space.
 * 
 * 08/20/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_15 
{
	public static void main(String[] args) 
	{
		int counter = 0;
		
		for (int i = 33; i <= 126; i++)
		{
			++counter;
			
			if (counter % 10 == 0)
				System.out.println((char) i + " ");
			else
				System.out.print((char) i + " ");
		}
	}
}
