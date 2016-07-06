package Chapter_01_Introduction_to_Computers_Programs;

/**
 * Average speed in miles 
 * Assume a runner runs 14 kilometers in 45 minutes and 30
 * seconds. Write a program that displays the average speed in miles per hour. 
 * (Note that 1 mile is 1.6 kilometers.)
 * 
 * 02/02/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_10 
{
	public static void main(String[] args)
	{
		int kilometer = 14;
		double mile = kilometer * 1.6;
		
		System.out.print("Average speed in miles per hour is " + ((double)(mile/(60/45.5))));
	}

}
