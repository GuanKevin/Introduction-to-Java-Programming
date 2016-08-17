package Chapter_02_Elementary_Programming;

import java.util.Scanner;

/**
 * Population projection 
 * Rewrite Programming Exercise 1.11 to prompt the user to enter the number of years and displays the population after the number of years. 
 * Use the hint in Programming Exercise 1.11 for this program. 
 * The population should be cast into an integer.
 * 
 * 07/31/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_11 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of years: ");
		int year = input.nextInt(); 
		
		int secondsPerYear = 365 * 24 * 60 * 60;
		int population = 312032486;
		
		System.out.println("Year 0 " + population);
		
		int birth = secondsPerYear / 7;
		int death = secondsPerYear / 13;
		int immigrant = secondsPerYear / 45;
		
		population += ((birth - death + immigrant) * year);
		
		System.out.println("Year " + year + " " + population);
		
		population = population + birth - death + immigrant;
		
		System.out.println("Year " + ++year + " " + population);
		
		population += birth - death + immigrant;
		
		System.out.println("Year " + ++year + " " + population);
		
		population += birth - death + immigrant;
		
		System.out.println("Year " + ++year + " " + population);
		
		population += birth - death + immigrant;
		
		System.out.println("Year " + ++year + " " + population);
		
		population += birth - death + immigrant;
		
		System.out.println("Year " + ++year + " " + population);
		
		input.close();
	}
}
