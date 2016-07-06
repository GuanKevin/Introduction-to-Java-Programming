package Chapter_02_Elementary_Programming;
import java.util.Scanner;

/**
 * Convert feet into meters 
 * Write a program that reads a number in feet, converts it to meters, and displays the result. 
 * One foot is 0.305 meter.
 * 
 * 02/02/2016
 * @author kevgu
 *
 */
public class Programming_Exercise_03 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of feet: ");
		double feet = input.nextDouble();
		double meter = feet * 0.305;
		System.out.print(feet + " feet to meters is: " + meter);
		input.close();	
	}
}
