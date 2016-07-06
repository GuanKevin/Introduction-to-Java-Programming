package Chapter_04_Mathematical_Functions_Characters_And_Strings;
import java.util.Scanner;

/**
 * Order three cities
 * Write a program that prompts the user to enter three cities and displays them in ascending order.
 * 
 * 02/14/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_24 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the 1st city: ");
		String city1 = input.nextLine();
		System.out.print("Enter the 2nd city: ");
		String city2 = input.nextLine();
		System.out.print("Enter the 3rd city: ");
		String city3 = input.nextLine();
		
		//Albany, Buffalo, Syracuse, 
		//Albany --> Buffalo --> Syracuse
		//Take first char of the first city
		//Compare 1st char with the 1st char of the second city
		//Less than
		
		if (city1.charAt(0) < city2.charAt(0))
		{
			if (city1.charAt(0) < city3.charAt(0))
			{
				System.out.println(city1);
				
				if (city2.charAt(0) < city3.charAt(0))
				{
					System.out.println(city2);
					System.out.println(city3);
				}
				else
				{
					System.out.println(city3);
					System.out.println(city2);
				}
			}
			else
			{
				System.out.println(city3);
				System.out.println(city1);
				System.out.println(city2);
			}
		}
		else if (city2.charAt(0) < city3.charAt(0))
		{
			System.out.println(city2);
			
			if (city1.charAt(0) < city3.charAt(0))
			{
				System.out.println(city1);
				System.out.println(city3);
			}
			else
			{
				System.out.println(city3);
				System.out.println(city1);
			}
		}
		else
		{
			System.out.println(city3);
			System.out.println(city2);
			System.out.println(city1);
		}
		
		input.close();
	}

}
