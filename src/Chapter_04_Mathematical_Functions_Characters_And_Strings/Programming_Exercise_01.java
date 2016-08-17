package Chapter_04_Mathematical_Functions_Characters_And_Strings;
import java.util.Scanner;

/**
 * Geometry: area of a pentagon
 * Write a program that prompts the user to enter the length from the center of a pentagon to a vertex 
 * and computes the area of the pentagon, as shown in the following figure.
 * Area = (5 x s2) / (4 x tan (pi / 5))
 * s = 2 * r * sin(pi/5)
 * 
 * @author kevgu
 * 08/11/2016
 *
 */

public class Programming_Exercise_01 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length from the center of a pentagon to a vertex: ");
		double r = input.nextDouble();
		double s = 2 * r * Math.sin(Math.PI / 5);
		double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));
		
		System.out.printf("The area of the pentagon is %.2f", area);

		input.close();		
	}
}
