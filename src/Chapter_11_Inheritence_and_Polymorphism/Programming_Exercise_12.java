package Chapter_11_Inheritence_and_Polymorphism;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Sum ArrayList
 * Write the following method that returns the sum of all numbers in an ArrayList: 
 * public static double sum(ArrayList<Double> list) 
 * Write a test program that prompts the user to enter 5 numbers, stores them in an array list, and displays their sum.
 *
 * 03/14/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_12 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		ArrayList<Double> list = new ArrayList<Double>();
		inputToList(list);
	}
	
	public static void inputToList(ArrayList<Double> list)
	{
		System.out.println("Enter size of list: ");
		int size = input.nextInt();
		System.out.println("Enter " + size + " numbers: ");
		for (int i = 0; i < size; i++)
		{
			list.add(input.nextDouble());
		}
		
		System.out.print("The sum of the list is " + sum(list));
	}
	
	public static double sum(ArrayList<Double> list) 
	{
		double sum = 0;
		
		for (int i = 0; i < list.size(); i++)
		{
			sum += list.get(i);
		}
		
		/*for (Double i : list)
		{
			sum += i;
		}*/
		
		return sum;
	}
}
