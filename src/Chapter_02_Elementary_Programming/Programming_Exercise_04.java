package Chapter_02_Elementary_Programming;

import java.util.Scanner;

/**
 * Convert pounds into kilograms 
 * Write a program that converts pounds into kilograms.
 * The program prompts the user to enter a number in pounds, converts it to kilograms, and displays the result. 
 * One pound is 0.454 kilograms.
 * 
 * 07/31/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_04 
{
	public static void main(String[] args)
	{
		System.out.println("Enter a number in pounds ");
		Scanner input = new Scanner(System.in);
		double pound = input.nextDouble();
		double kilogram = pound * 0.454;
		
		System.out.print(pound + " pound = " + kilogram + " kilogram");
		
		input.close();
	}
}
