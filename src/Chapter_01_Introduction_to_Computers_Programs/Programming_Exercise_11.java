package Chapter_01_Introduction_to_Computers_Programs;

/**
 * Population projection 
 * The U.S. Census Bureau projects population based on the following assumptions:
 *  One birth every 7 seconds
 *  One death every 13 seconds
 *  One new immigrant every 45 seconds 
 * Write a program to display the population for each of the next five years. Assume the current population is 312,032,486 and one year has 365 days. 
 * Hint: In Java, if two integers perform division, the result is an integer. The fractional part is truncated. 
 * For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). 
 * To get an accurate result with the fractional part, one of the values involved in the division must be a number with a decimal point. 
 * For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
 * 
 * 02/02/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_11 
{
	public static void main(String[] args)
	{
		int population = 312032486;
		/*
		 * Days x Hours x Seconds
		 * Gets total amount of seconds in a year
		 * Divided by amount of birth, death, and new immigrant at specific seconds
		 */
		System.out.println("Year Population");
		System.out.println("0    " + population);
		population += (365 * 24 * 60 * 60)/7.0 - (1 * 365 * 24 * 60 * 60)/13.0 + (1 * 365 * 24 * 60 * 60)/45.0;
		System.out.println("1    " + population);
		population += (365 * 24 * 60 * 60)/7.0 - (1 * 365 * 24 * 60 * 60)/13.0 + (1 * 365 * 24 * 60 * 60)/45.0;
		System.out.println("2    " + population);
		population += (365 * 24 * 60 * 60)/7.0 - (1 * 365 * 24 * 60 * 60)/13.0 + (1 * 365 * 24 * 60 * 60)/45.0;
		System.out.println("3    " + population);
		population += (365 * 24 * 60 * 60)/7.0 - (1 * 365 * 24 * 60 * 60)/13.0 + (1 * 365 * 24 * 60 * 60)/45.0;
		System.out.println("4    " + population);
		population += (365 * 24 * 60 * 60)/7.0 - (1 * 365 * 24 * 60 * 60)/13.0 + (1 * 365 * 24 * 60 * 60)/45.0;
		System.out.println("5    " + population);
	}
}
