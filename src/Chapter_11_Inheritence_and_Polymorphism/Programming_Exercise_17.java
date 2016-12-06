package Chapter_11_Inheritence_and_Polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Algebra: perfect square
 * Write a program that prompts the user to enter an integer m and find the smallest integer n such that m * n is a perfect square. 
 * (Hint: Store all smallest factors of m into an array list. 
 * n is the product of the factors that appear an odd number of times in the array list. 
 * For example, consider m = 90, store the factors 2, 3, 3, 5 in an array list. 
 * 2 and 5 appear an odd number of times in the array list. 
 * So, n is 10.)
 *
 * 12/06/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_17 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int m = input.nextInt();
		
		ArrayList<Integer> factorList = findFactors(m);
		System.out.println("Factors of " + m + " are " + factorList.toString());
		
		int n = productOddNumbers(factorList);
		
		if (n != 0)
			System.out.print(" = " + n +
					"\nn = " + n +
					", m = " + m +
					"\nn * m = " + (n * m) + 
					"\nThe perfect square is " + Math.sqrt(n * m));
		else
			System.out.println("There is no perfect square.");
		
		input.close();
	}
	
	public static int productOddNumbers(ArrayList<Integer> factorList)
	{
		if (factorList.isEmpty())
			return 0;
		
		ArrayList<Boolean> oddFactorList = new ArrayList<>();
		int product = 1;
		
		for (int i = 0; i <= factorList.get(factorList.size() - 1); i++)
			oddFactorList.add(false);
			
		for (int i = 0; i < factorList.size(); i++)
			oddFactorList.set(factorList.get(i), !oddFactorList.get(factorList.get(i)));
		
		boolean noSquare = true;
		for (int i = 0; i < oddFactorList.size(); i++)
			if (oddFactorList.get(i) == true)
			{
				noSquare = false;
				break;
			}
		
		if (noSquare)
			return 0;
		
		System.out.print("The odd factors are: 1");
		for (int i = 2; i < oddFactorList.size(); i++)
			if (oddFactorList.get(i))
			{
				product *= i;
				System.out.print(" * " + i);
			}
		
		return product;
	}
	
	public static ArrayList<Integer> findFactors(int number)
	{
		int factors = 2;
		ArrayList<Integer> tempFactorList = new ArrayList<>();
		
		while (number != 1)
		{
			if (number % factors == 0)
			{
				tempFactorList.add(factors);
				number /= factors;
			}
			else
				factors++;
		}
		
		return tempFactorList;
	}
}
