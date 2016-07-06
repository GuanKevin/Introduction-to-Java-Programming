package Chapter_03_Selections;
import java.util.Scanner;

/**
 * Game: addition quiz
 * Listing 3.3, SubtractionQuiz.java, randomly generates a subtraction question. 
 * Revise the program to randomly generate an addition question with two integers less than 100.
 * 
 * 02/06/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_10 
{
	public static void main(String[] args) 
	{
		// Generate two random single-digit integers
		int number1 = (int)(Math.random() * 100);
		int number2 = (int)(Math.random() * 100);
		
		// 2. If number1 < number2, swap number1 with number2
		if (number1 < number2) 
		{
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		
		// 3. Prompt the student to answer ”What is number1 – number2?”
		System.out.print("What is " + number1 + " + " + number2 + "? ");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		
		// 4. Grade the answer and display the result
		if (number1 + number2 == answer)
		{
			System.out.println("You are correct!");
		}
		else 
		{
			System.out.println("Your answer is wrong.");
			System.out.println(number1 + " + " + number2 + " should be " + (number1 + number2));
		}
		
		input.close();
	}
}
