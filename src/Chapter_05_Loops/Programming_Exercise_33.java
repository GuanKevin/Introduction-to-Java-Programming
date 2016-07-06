package Chapter_05_Loops;

/**
 * Perfect number
 * A positive integer is called a perfect number if it is equal to the sum of all of its positive divisors, excluding itself. 
 * For example, 6 is the first perfect number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2 + 1. 
 * There are four perfect numbers less than 10,000. Write a program to find all these four numbers.
 * 
 * 02/15/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_33 
{
	public static void main(String[] args) 
	{
		int tempnum = 1;
		
		
		//10 --> 5 (6->9)
		//i = 6
		//j % i --> 6 % 2 == 0
		for (int i = 6; i <= 10000; i++)
		{
			for (int j = 2; j <= (i / 2); j++)
			{
				if ((i % j) == 0)
				{
					tempnum += j;
				}
			}
			
			if (tempnum == i)
			{
				System.out.print(i + " ");
			}
			tempnum = 1;
		}
	}
}
