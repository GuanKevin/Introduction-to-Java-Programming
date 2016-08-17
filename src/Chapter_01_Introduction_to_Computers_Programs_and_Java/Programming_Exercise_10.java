package Chapter_01_Introduction_to_Computers_Programs_and_Java;

/**
 * Average speed in miles 
 * Assume a runner runs 14 kilometers in 45 minutes and 30
 * seconds. Write a program that displays the average speed in miles per hour. 
 * (Note that 1 mile is 1.6 kilometers.)
 * 
 * 07/30/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_10 
{
	public static void main(String[] args)
	{
		double miles = 14 / 1.6;
		double time = 60 / 45.5;
		double averageSpeed = miles/time;
		
		System.out.print("The runner's average speed is " + averageSpeed + " miles per hour.");
	}
}
