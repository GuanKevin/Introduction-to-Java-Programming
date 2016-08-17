package Chapter_01_Introduction_to_Computers_Programs_and_Java;

/**
 * Area and perimeter of a circle 
 * Write a program that displays the area and perimeter
 * of a circle that has a radius of 5.5 using the following formula:
 * perimeter = 2 * radius * pi
 * area = radius * radius * pi
 * 
 * 07/30/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_08 
{
	public static void main(String[] args)
	{
		double radius = 5.5;
		double pi = 3.14;
		double perimeter = 2 * radius * pi;
		double area = radius * radius * pi;
		
		System.out.println("Perimeter = " + perimeter);
		System.out.println("Area = " + area);
	}
}
