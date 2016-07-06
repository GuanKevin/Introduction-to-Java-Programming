package Chapter_05_Loops;
import java.util.Scanner;

/**
 * Find the highest score
 * Write a program that prompts the user to enter the number of students and each student’s name and score, 
 * and finally displays the name of the student with the highest score.
 * 
 * 03/24/2016
 * @author kevgu
 */

public class Programming_Exercise_08 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int numOfStudents = input.nextInt();
		double score = 0;
		String studentsName = "";
		
		System.out.print("Enter students score and enter students name: ");
		for (int i = 0; i < numOfStudents; i++)
		{
			double userInput = input.nextDouble();
			String studentsNameInput = input.next();
			
			if (score < userInput)
			{
				score = userInput;
				studentsName = studentsNameInput;
			}
		}
		
		System.out.println("The top student is: " 
				+ "\nStudent's name: " + studentsName 
				+ "\nStudent's score: " + score);
		
		input.close();
	}
}
