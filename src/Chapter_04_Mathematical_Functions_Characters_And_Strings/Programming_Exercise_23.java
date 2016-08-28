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
 * 08/16/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_23 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter employee's name: ");
		String empName = input.next();
		
		System.out.print("Number of hours worked in a week: ");
		int hoursWorked = input.nextInt();
		
		System.out.print("Enter hourly payrate: ");
		double payRate = input.nextDouble();
		
		System.out.print("Enter federal tax withholding: ");
		double fedTax = input.nextDouble() / 100.0;
		
		System.out.print("Enter state tax withholding: ");
		double stateTax = input.nextDouble() / 100.0;
		
		double wage = hoursWorked * payRate;
		
		System.out.print("Name: " + empName + 
				"\nWage before tax deduction:" + wage +
				"\nFederal Tax Withholding rate: " + (wage * fedTax) +
				"\nState Tax Withholding rate: " + (wage * stateTax) + 
				"\nWage after tax deduction: " + ((wage - (wage * fedTax)) - (wage * stateTax)));
		
		
		input.close();
	}
}
