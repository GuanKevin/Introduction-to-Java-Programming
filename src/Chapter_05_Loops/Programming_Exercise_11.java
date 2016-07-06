package Chapter_05_Loops;

/**
 * Find numbers divisible by 5 or 6, but not both
 * Write a program that displays all the numbers from 100 to 200, ten per line, that are divisible by 5 or 6, but not both. 
 * Numbers are separated by exactly one space.
 * 
 * 
 * @author kevgu
 *
 */

public class Programming_Exercise_11 
{
	public static void main(String[] args) 
	{
		//Scanner input = new Scanner(System.in);
		
		int counter = 0; //Count amount of numbers, and if it equals 10, I want a new lone
		
		for (int i = 100; i <= 200; i++)
		{
			// (True or True) and Not((True And True) == True) --> False) --> True
			if (((i % 5) == 0) ^ (i % 6) == 0)
			{
				counter++;
				System.out.print(i + " ");
			}
			if (counter == 10)
			{
				counter = 0;
				System.out.print("\n");
			}
		}
		
		//input.close();
	}
}
