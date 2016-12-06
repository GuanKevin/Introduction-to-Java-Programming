package Chapter_11_Inheritence_and_Polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Sum ArrayList
 * Write the following method that returns the sum of all numbers in an ArrayList: 
 * public static double sum(ArrayList<Double> list) 
 * Write a test program that prompts the user to enter 5 numbers, stores them in an array list, and displays their sum.
 *
 * 12/06/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_12 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<>();
		
		System.out.print("Enter 5 numbers: ");
		for (int i = 0; i < 5; i++)
			list.add(input.nextDouble());
		
		System.out.print("The sum is: " + sum(list));
		
		input.close();
	}
	
	public static double sum(ArrayList<Double> list) 
	{
		if (list.isEmpty())
			return 0d;
		
		double sum = 0;
		
		for (int i = 0; i < list.size(); i++)
			sum += list.get(i);
		
		return sum;
	}
}
