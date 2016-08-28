package Chapter_06_Methods;
import java.util.Scanner;

/**
 * Geometry: area of a pentagon
 * 
 *
 * 02/16/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_35 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter the side: ");
		double side = input.nextDouble();
		System.out.printf("The area of the pentagon is %f\n", area(side));
		
		input.close();		
	}
	
	public static double area(double side)
	{
		return ((5 * side * side)/(4 * Math.tan(Math.PI / 5)));
	}
}
