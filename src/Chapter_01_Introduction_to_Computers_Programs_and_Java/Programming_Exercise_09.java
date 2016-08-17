package Chapter_01_Introduction_to_Computers_Programs_and_Java;

/**
 * Area and perimeter of a rectangle 
 * Write a program that displays the area and
 * perimeter of a rectangle with the width of 4.5 and height of 7.9 using the following
 * formula:
 * area = width * height
 * 
 * 07/30/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_09 
{
	public static void main(String[] args)
	{
		double width = 4.5;
		double height = 7.9;
		double area = width * height;
		
		System.out.print("The area of the rectangle is " + area);
	}
}
