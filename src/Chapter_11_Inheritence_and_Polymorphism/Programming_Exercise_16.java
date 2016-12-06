package Chapter_11_Inheritence_and_Polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Addition quiz
 * Rewrite Listing 5.1 RepeatAdditionQuiz.java to alert the user if an answer is entered again. 
 * Hint: use an array list to store answers.
 *
 * 12/06/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_16 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
	    
	    int number1 = (int) (Math.random() * 10);
	    int number2 = (int) (Math.random() * 10);

	    Scanner input = new Scanner(System.in);
	    System.out.print("What is " + number1 + " + " + number2 + "? ");
	    int answer = input.nextInt();
	    list.add(answer);
	      
	    while (number1 + number2 != answer) 
	    {
	    	System.out.print("Wrong. Try again. What is " + number1 + " + " + number2 + "? ");
	    	answer = input.nextInt();
	      
	    	if (list.contains(answer)) 
	    		System.out.println("You already entered " + answer);
	    	else 
	    	  list.add(answer);   
	    }	    
	    System.out.println("You got it!");
	    
	    input.close();
	}
}
