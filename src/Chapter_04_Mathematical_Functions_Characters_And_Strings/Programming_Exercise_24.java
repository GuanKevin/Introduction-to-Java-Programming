package Chapter_04_Mathematical_Functions_Characters_And_Strings;
import java.util.Scanner;

/**
 * Order three cities
 * Write a program that prompts the user to enter three cities and displays them in ascending order.
 * 
 * 08/18/2016
 * @author kevgu
 *
 */ 

public class Programming_Exercise_24 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the 3 cities: ");
		String c1, c2, c3;
		c1 = input.next();
		c2 = input.next();
		c3 = input.next();
		
		// c1 Chicago 
		// c2 Los_Angeles 
		// c3 Atlanta
		
		if (c1.compareTo(c2) < 0 && c2.compareTo(c3) < 0)
			System.out.print(c1 + ' ' + c2 + ' ' + c3); 
		else if (c1.compareTo(c3) < 0 && c3.compareTo(c2) < 0)
			System.out.print(c1 + ' ' + c3 + ' ' + c2);
		else if (c2.compareTo(c1) < 0 && c1.compareTo(c3) < 0)
			System.out.print(c2 + ' ' + c1 + ' ' + c3);
		else if (c2.compareTo(c3) < 0 && c3.compareTo(c1) < 0)
			System.out.print(c2 + ' ' + c3 + ' ' + c2);
		else if (c3.compareTo(c1) < 0 && c1.compareTo(c2) < 0)
			System.out.print(c3 + ' ' + c1 + ' ' + c2);
		else
			System.out.print(c3 + ' ' + c2 + ' ' + c1);
		
		
		input.close();
	}
}
