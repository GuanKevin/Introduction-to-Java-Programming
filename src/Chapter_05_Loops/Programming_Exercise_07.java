package Chapter_05_Loops;

/**
 * Financial application: compute future tuition
 * Suppose that the tuition for a university is $10,000 this year and increases 5% every year. 
 * In one year, the tuition will be $10,500. 
 * Write a program that computes the tuition in ten years and the total cost of four years’ worth of tuition after the tenth year.
 * 
 * 02/14/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_07 
{
	public static void main(String[] args) 
	{
		int tuition = 10000;
		int sumoffouryears = 0;
		
		for (int i = 0; i < 14; i++)
		{
			System.out.println("Cost of tuition year " + i + ": " + tuition);
			tuition += (tuition * .05);
			
			if (i > 9) //0 - 9 = 10 years, 10 - 13 = (4 years of tuition)
			{
				sumoffouryears += tuition;
			}
		}
		
		System.out.print("Total cost of four years worth of tuition after the tenth year is " + sumoffouryears);
	}

}
