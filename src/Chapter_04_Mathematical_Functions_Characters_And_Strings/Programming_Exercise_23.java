package Chapter_04_Mathematical_Functions_Characters_And_Strings;
import java.util.Scanner;

/**
 * Financial application: payroll
 * Write a program that reads the following information and prints a payroll statement:
 * Employee’s name (e.g., Smith) 
 * Number of hours worked in a week (e.g., 10) 
 * Hourly pay rate (e.g., 9.75) 
 * Federal tax withholding rate (e.g., 20%) 
 * State tax withholding rate (e.g., 9%)
 * 
 * 02/14/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_23 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name: ");
		//Will Smith
		String name = input.nextLine();
		System.out.print("Enter number of hours worked in a week: ");
		//40 hours in a week. 41.5 <- double
		double hours = input.nextDouble();
		System.out.print("Enter your hourly pay rate: ");
		double payrate = input.nextDouble();
		double wage = hours * payrate;
		
		System.out.print("Name: " + name + 
				"\nWage before tax deduction:" + wage +
				"\nFederal Tax Withholding rate: " + (wage * .2) +
				"\nState Tax Withholding rate: " + (wage * .09) + 
				"\nWage after tax deduction: " + ((wage - (wage * .2)) - (wage * .09)));
		
		input.close();
	}

}
