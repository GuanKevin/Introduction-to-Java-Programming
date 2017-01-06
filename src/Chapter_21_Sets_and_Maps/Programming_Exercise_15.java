package Chapter_21_Sets_and_Maps;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 * Addition quiz
 * Rewrite Programming Exercise 11.16 to store the answers in a set rather than a list.
 * 
 * 01/07/2017
 * @author kevgu
 *
 */

public class Programming_Exercise_15 
{
	public static void main(String[] args) 
	{
		Random randNum = new Random();
		int num1 = randNum.nextInt(10);
		int num2 = randNum.nextInt(10);
		
		System.out.print("What is " + num1 + " + " + num2 + " = ");
		Scanner input = new Scanner(System.in);
		int solution = input.nextInt(); 
		Set<Integer> set = new HashSet<>();
		
		while ((num1 + num2) != solution)
		{
			if (set.contains(solution))
				System.out.println("You've already entered " + solution);
			else
				set.add(solution);
			System.out.print("Incorrect, try again: ");
			solution = input.nextInt();
		}
		System.out.print("Correct!");
			
		input.close();
	}
}
