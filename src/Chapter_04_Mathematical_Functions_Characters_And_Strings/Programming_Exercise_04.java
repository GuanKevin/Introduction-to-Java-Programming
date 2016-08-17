package Chapter_04_Mathematical_Functions_Characters_And_Strings;

import java.util.Scanner;

/**
 * Geometry: area of a hexagon
 * Write a program that prompts the user to enter the side of a hexagon and displays its area.
 * 
 * 08/15/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_04 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the side of the hexagon: ");
		double side = input.nextDouble();
		double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));
		
		System.out.printf("Area of the Hexagon: %.2f", area);
		
		input.close();
	}
}
