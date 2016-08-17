package Chapter_02_Elementary_Programming;

import java.util.Scanner;

/**
 * Geometry: area of a hexagon 
 * Write a program that prompts the user to enter the side of a hexagon and displays its area.
 * Area of Hexagon = (3(square root(3))/2) * side^2
 * 
 * 08/01/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_16 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the side of a hexagon: ");
		double sideHexagon = input.nextDouble();
		double areaHexagon = (3 * Math.pow(3, 0.5) / 2) * Math.pow(sideHexagon, 2);
		System.out.print("The area of the hexagon is " + areaHexagon);
		
		input.close();
	}
}
