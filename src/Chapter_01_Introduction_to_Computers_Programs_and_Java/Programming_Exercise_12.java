package Chapter_01_Introduction_to_Computers_Programs_and_Java;

/**
 * Average speed in kilometers 
 * Assume a runner runs 24 miles in 1 hour, 40 minutes,and 35 seconds. 
 * Write a program that displays the average speed in kilometers per hour. 
 * (Note that 1 mile is 1.6 kilometers.)
 * 
 * 07/30/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_12 
{
	public static void main(String[] args)
	{
		double kilometer = 24 * 1.6;
		double time = ((((60.0 + 40) * 60) + 35) / 60) / 60;
		
		System.out.print("Average speed in kilometer per hour " + kilometer/time);
	}
}
