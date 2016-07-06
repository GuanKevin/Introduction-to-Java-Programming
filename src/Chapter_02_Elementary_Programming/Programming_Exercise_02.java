package Chapter_02_Elementary_Programming;
import java.util.Scanner;

/**
 * Compute the volume of a cylinder 
 * Write a program that reads in the radius and length of a cylinder and computes the area and volume using the following formulas: 
 * area = radius * radius * p 
 * volume = area * length
 * 
 * 02/02/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_02 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double radius = input.nextDouble();
		double pi = 3.14159;
		double area = radius * radius * pi;
		System.out.print("Enter the length: ");
		double length = input.nextDouble();
		double volume = area * length;
		System.out.print("The volume is: " + volume);
		System.out.print("\nThe area is: " + area);
		
		input.close();
	}

}
