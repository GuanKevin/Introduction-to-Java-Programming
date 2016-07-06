package Chapter_01_Introduction_to_Computers_Programs;

/**
 * Average speed in kilometers 
 * Assume a runner runs 24 miles in 1 hour, 40 minutes,and 35 seconds. 
 * Write a program that displays the average speed in kilometers per hour. 
 * (Note that 1 mile is 1.6 kilometers.)
 * 
 * 02/02/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_12 
{
	public static void main(String[] args)
	{
		int mile = 24;
		double kilometer = mile * 1.6;
		//6035 is seconds in 1 hour, 40 minutes and 35 seconds. 3600 is seconds in an hour
		double time = (6035.0/3600);
		
		System.out.print("The average speed in kilometers per hour is " + kilometer/time);
	}

}
