package Chapter_02_Elementary_Programming;
import java.util.Scanner;

/**
 * Population projection 
 * Rewrite Programming Exercise 1.11 to prompt the user to enter the number of years and displays the population after the number of years. 
 * Use the hint in Programming Exercise 1.11 for this program. 
 * The population should be cast into an integer.
 * 
 * 02/03/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_11 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of years: ");
		int years = input.nextInt();
		int currentpopulation = 312032486;
		
		/*
		 *  One birth every 7 seconds
		 *  One death every 13 seconds
		 *  One new immigrant every 45 seconds 
		 */
		int population = (int) (currentpopulation + ((years * 365 * 24 * 60 * 60)/7.0 - (years * 365 * 24 * 60 * 60)/13 + (years * 365 * 24 * 60 * 60)/45));
		
		System.out.print("The population in " + years + " years is " + population);
		input.close();
	}
}
