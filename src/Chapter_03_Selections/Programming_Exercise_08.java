package Chapter_03_Selections;
import java.util.Scanner;

/**
 * Sort three integers
 * Write a program that prompts the user to enter three integers and display the integers in non-decreasing order.
 * 
 * 02/06/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_08 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int a, b, c;
		System.out.print("Enter three integers: ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		if (a < b && a < c)
		{
			System.out.println(a);
			
			if (b < c)
			{
				System.out.println(b);
				System.out.println(c);
			}
			else
			{
				System.out.println(c);
				System.out.println(b);
			}
		}
		else if (b < a && b < c)
		{
			System.out.println(b);
			
			if (a < c)
			{
				System.out.println(a);
				System.out.println(c);
			}
			else
			{
				System.out.println(c);
				System.out.println(a);
			}
		}
		else
		{
			System.out.println(c);
			
			if (a < b)
			{
				System.out.println(a);
				System.out.println(b);
			}
			else
			{
				System.out.println(b);
				System.out.println(a);
			}
		}
		input.close();
	}
}
