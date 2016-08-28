package Chapter_05_Loops;

/**
 * Display leap years
 * Write a program that displays all the leap years, ten per line, from 101 to 2100, separated by exactly one space. 
 * Also display the number of leap years in this period.
 * 
 * 08/25/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_27 
{
	public static void main(String[] args) 
	{
		int leapYearCounter = 0;
		
		for (int i = 101; i <= 2100; i++)
		{
			if (i % 4 == 0)
			{
				if (i % 100 == 0 && i % 400 == 0 || i % 100 != 0)
				{
					leapYearCounter++;
					
					if (leapYearCounter % 25 == 0)
						System.out.println(i + " ");
					else
						System.out.print(i + " ");
					
				}
			}
		}
	}
}
