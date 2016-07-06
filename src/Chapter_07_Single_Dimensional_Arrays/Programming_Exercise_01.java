package Chapter_07_Single_Dimensional_Arrays;
import java.util.Scanner;

/**
 * Assign grades
 * Write a program that reads student scores, gets the best score, and then assigns grades based on the following scheme: 
 * Grade is A if score is >= best - 10 
 * Grade is B if score is >= best - 20;
 * Grade is C if score is >= best - 30;
 * Grade is D if score is >= best - 40;
 * Grade is F otherwise.
 * The program prompts the user to enter the total number of students, then prompts the user to enter all of the scores, 
 * and concludes by displaying the grades.
 * 
 * 02/18/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_01 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the total number of students: ");
		int numofstu = input.nextInt();
		int[] studentscore = new int[numofstu];
		
		inputGrade(studentscore);
		displayGrade(studentscore); 
		
		input.close();
	}
	
	public static void inputGrade(int[] studentscore)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter student's score: ");
		for (int i = 0; i < studentscore.length; i++)
		{
			studentscore[i] = input.nextInt();
		}
		
		input.close();
	}
	
	public static void displayGrade(int[] studentscore)
	{
		for (int i = 0; i < studentscore.length; i++)
		{
			if (studentscore[i] <= 65)
			{
				System.out.println("Student " + (i + 1) + " got a grade of F");
			}
			else if (studentscore[i] <= 75)
			{
				System.out.println("Student " + (i + 1) + " got a grade of C");
			}
			else if (studentscore[i] <= 85)
			{
				System.out.println("Student " + (i + 1) + " got a grade of B");
			}
			else
			{
				System.out.println("Student " + (i + 1) + " got a grade of A");
			}
		}
	}
}
