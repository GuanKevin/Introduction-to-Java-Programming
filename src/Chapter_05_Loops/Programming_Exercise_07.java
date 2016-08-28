package Chapter_05_Loops;

/**
 * Financial application: compute future tuition
 * Suppose that the tuition for a university is $10,000 this year and increases 5% every year. 
 * In one year, the tuition will be $10,500. 
 * Write a program that computes the tuition in ten years and the total cost of four years’ worth of tuition after the tenth year.
 * 
 * 08/20/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_07 
{
	public static void main(String[] args) 
	{
		double tuitionPerYear = 10000;
		double tuitionIncrease = .05;
		double lastFourYearsTuition = 0;
		
		System.out.printf("%-7s %s \n", "Year", "Cost");
		
		for (int i = 0; i <= 14; i++)
		{
			if (i <= 10)
			{
				System.out.printf("%-7d %.2f \n", i, tuitionPerYear);
				tuitionPerYear += (tuitionPerYear * tuitionIncrease);
			}
			else
				lastFourYearsTuition += tuitionPerYear + (tuitionPerYear * tuitionIncrease);
		}
		
		System.out.printf("%s %.2f", "Tuition after four years is $", lastFourYearsTuition);
	}
}
