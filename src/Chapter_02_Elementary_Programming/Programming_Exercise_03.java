package Chapter_02_Elementary_Programming;

import java.util.Scanner;

/**
 * Convert feet into meters 
 * Write a program that reads a number in feet, converts it to meters, and displays the result. 
 * One foot is 0.305 meter.
 * 
 * 07/31/2016
 * @author kevgu
 *
 */
public class Programming_Exercise_03 
{
	public static void main(String[] args)
	{
		System.out.print("Enter the feet: ");
		Scanner input = new Scanner(System.in);
		double feet = input.nextDouble();
		double meter = feet * 0.305;
		
		System.out.print(feet + " feet = " + meter + " meter");
		
		input.close();
	}
}
