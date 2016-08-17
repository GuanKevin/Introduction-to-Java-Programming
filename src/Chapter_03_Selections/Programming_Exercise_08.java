package Chapter_03_Selections;
import java.util.Scanner;

/**
 * Sort three integers
 * Write a program that prompts the user to enter three integers and display the integers in non-decreasing order.
 * 
 * 08/02/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_08 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three integers: ");
		int a, b, c;
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		if (a < b && a < c)
		{
			System.out.print(a + " ");
			
			if (b < c)
			{
				System.out.print(b + " " + c);
			}
			else
			{
				System.out.print(c + " " + b);
			}
		}
		else if (b < a && b < c)
		{
			System.out.print(b + " ");
			
			if (a < c)
			{
				System.out.print(a + " " + c);
			}
			else
			{
				System.out.print(c + " " + a);
			}
		}
		else
		{
			System.out.print(c + " ");
			
			if (a < b)
			{
				System.out.print(a + " " + b);
			}
			else
			{
				System.out.print(b + " " + a);
			}
		}
		
		input.close();
	}
}
