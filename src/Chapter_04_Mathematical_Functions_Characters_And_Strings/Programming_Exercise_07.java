package Chapter_04_Mathematical_Functions_Characters_And_Strings;

import java.util.Scanner;

/**
 * Corner point coordinates
 * Suppose a pentagon is centered at (0, 0) with one point at the 0 o’clock position, as shown in Figure 4.7c. 
 * Write a program that prompts the user to enter the radius of the bounding circle of a pentagon 
 * and displays the coordinates of the five corner points on the pentagon.
 *
 * 08/16/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_07 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius of the bounding circle of a pentagon: ");
		double radius = input.nextDouble();
		double theta = Math.random() *  2 * Math.PI;
		double x = radius * Math.cos(theta) * 1;
		double y = radius * Math.sin(theta) * 1;
		
		System.out.print("(" + x + "," + y + ")");
		
		input.close();
	}
}
