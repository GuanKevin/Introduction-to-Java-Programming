package Chapter_10_Object_Oriented_Thinking;
import java.util.Scanner;

/**
 * Financial: the Tax class
 * Programming Exercise 8.12 writes a program for computing taxes using arrays. 
 * Design a class named Tax to contain the following instance data fields: 
 * int filingStatus: One of the four tax-filing statuses: 0—single filer, 1— married filing jointly or qualifying widow(er), 2—married filing separately, and 3—head of household. 
 * Use the public static constants SINGLE_FILER (0), MARRIED_JOINTLY_OR_QUALIFYING_WIDOW(ER) (1), MARRIED_SEPARATELY (2), HEAD_OF_HOUSEHOLD (3) to represent the statuses. 
 * int[][] brackets: Stores the tax brackets for each filing status.
 * double[] rates: Stores the tax rates for each bracket.
 * double taxableIncome: Stores the taxable income.
 * Provide the getter and setter methods for each data field and the getTax() method that returns the tax. 
 * Also provide a no-arg constructor and the constructor Tax(filingStatus, brackets, rates, taxableIncome). 
 * Draw the UML diagram for the class and then implement the class. 
 * Write a test program that uses the Tax class to print the 2001 and 2009 tax tables for taxable income from $50,000 to $60,000 with intervals of $1,000 for all four statuses. 
 * The tax rates for the year 2009 were given in Table 3.2. The tax rates for 2001 are shown in Table 10.1.
 * 
 * 03/10/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_08 
{
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		
	}
}
