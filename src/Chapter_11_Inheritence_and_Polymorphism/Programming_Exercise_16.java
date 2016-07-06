package Chapter_11_Inheritence_and_Polymorphism;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Addition quiz
 * Rewrite Listing 5.1 RepeatAdditionQuiz.java to alert the user if an answer is entered again. 
 * Hint: use an array list to store answers.
 *
 * 03/15/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_16 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		ArrayList<Integer> additionList = new ArrayList<Integer>();
		additionList.add(0, (int)(Math.random() * 10));
		additionList.add(1, (int)(Math.random() * 10));
		
		System.out.print("What is " + additionList.get(0) + " + " + additionList.get(1) + "? ");
		additionList.add(2, input.nextInt());

		while (additionList.get(0) + additionList.get(1) != additionList.get(2)) 
		{
			System.out.print("Wrong answer. Try again. What is " + additionList.get(0) + " + " + additionList.get(1) + "? ");
			additionList.add(2, input.nextInt());;
		}
		
		System.out.println("You got it!");
	}
}
