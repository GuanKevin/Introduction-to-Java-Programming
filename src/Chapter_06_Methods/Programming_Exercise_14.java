package Chapter_06_Methods;

import java.util.Scanner;

/**
 * Estimate pi
 * pi can be computed using the following series: (See book)
 *
 * 08/30/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_14 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		System.out.println("Pi value is " + sumPiTable(input.nextInt()));
		
		input.close();
	}
	
	/**
	 * Estimate pi
	 * returns m(i) for a given i
	 * 
	 * @param number
	 * @return
	 */
	public static double sumPiTable(int number)
	{
		double sumPi = 0;
		double piNum = 0;
		
		System.out.printf("%-3s %s \n%s \n", "i", "m(i)", "----------");
		
		for (int i = 1; i <= 901; i++)
		{
			for (int j = 1; j <= i; j++)
				sumPi += (Math.pow(-1, (j + 1)) / ((2 * j) - 1));
			
			if (i % 100 == 1)
				System.out.printf("%-3d %.4f \n", i, (4 * sumPi));
			if (i == number)
				piNum = (4 * sumPi);
			
			sumPi = 0;
		}
		
		return piNum;
	}
}
