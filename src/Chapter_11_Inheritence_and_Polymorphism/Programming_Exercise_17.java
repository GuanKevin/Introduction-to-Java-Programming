package Chapter_11_Inheritence_and_Polymorphism;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

/**
 * Algebra: perfect square
 * Write a program that prompts the user to enter an integer m and find the smallest integer n such that m * n is a perfect square. 
 * (Hint: Store all smallest factors of m into an array list. 
 * n is the product of the factors that appear an odd number of times in the array list. 
 * For example, consider m = 90, store the factors 2, 3, 3, 5 in an array list. 
 * 2 and 5 appear an odd number of times in the array list. 
 * So, n is 10.)
 *
 * 03/15/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_17 
{
	static Scanner input = new Scanner(System.in);
	static Random rand = new Random();
	public static void main(String[] args) 
	{
		int myInteger = rand.nextInt(10000);
		System.out.println("Your integer is " + myInteger);
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		findFactors(integerList, myInteger);
		System.out.println("Factors of " + myInteger + " is " + integerList);
		removeEvenDuplicates(integerList);
		System.out.println("Non duplicate factors: " + integerList);
		System.out.println("The perfect square are: " + (myInteger * perfectSquare(integerList)));
		System.out.println("The square root of: " + (myInteger * perfectSquare(integerList)) 
				+ " is " + Math.sqrt((myInteger * perfectSquare(integerList))));
	}
	
	public static int perfectSquare(ArrayList<Integer> integerList)
	{
		int product = 1;
		
		for (int i = 0; i < integerList.size(); i++)
		{
			product *= integerList.get(i);
		}
		
		return product;
	}
	
	public static void findFactors(ArrayList<Integer> integerList, int myInteger)
	{
		int counter = 2;
		
		while (myInteger != 1)
		{
			if ((myInteger % counter) == 0)
			{
				integerList.add(counter);
				myInteger /= counter;
			}
			else
			{
				counter++;
			}
		}
	}
	
	public static void removeEvenDuplicates(ArrayList<Integer> integerList)
	{
		int counter;
		ArrayList<Integer> tempList = new ArrayList<Integer>();
		ArrayList<Integer> readNum = new ArrayList<Integer>();
		
		if (integerList.size() != 1)
		{
			for (int i = 0; i < integerList.size(); i++)
			{
				counter = 1;
				for (int j = i + 1; j < integerList.size(); j++)
				{
					if (readNum.contains(integerList.get(i)))
					{
						counter++;
						break;
					}
					if (integerList.get(i) == integerList.get(j))
					{
						++counter;
					}
				}
				
				if ((counter % 2) != 0)
				{
					if (!tempList.contains(integerList.get(i)))
					{
						if (i < integerList.size() - 1)
						{
							tempList.add(integerList.get(i));
						}
						else if (i == integerList.size() - 1 && !readNum.contains(integerList.get(i)))
						{
							tempList.add(integerList.get(i));
						}
					}
				}
				
				if (!readNum.contains(integerList.get(i)))
				{
					readNum.add(integerList.get(i));
				}
			}
			
			integerList.clear();
			integerList.addAll(tempList);
		}
	}
}
