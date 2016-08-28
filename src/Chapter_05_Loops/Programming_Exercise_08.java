package Chapter_05_Loops;
import java.util.Scanner;

/**
 * Find the highest score
 * Write a program that prompts the user to enter the number of students and each student’s name and score, 
 * and finally displays the name of the student with the highest score.
 * 
 * 08/20/2016
 * @author kevgu
 */ 
 
public class Programming_Exercise_08 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);		
		System.out.print("Enter the number of students: ");
		int numStudents = input.nextInt();
		input.nextLine(); 
		
		System.out.print("Enter the student's name and score: ");
		String studentNameScore = input.nextLine(); 
		int studentScore = Integer.parseInt(studentNameScore.substring(studentNameScore.indexOf(' ') + 1, studentNameScore.length()));
		
		for (int i = 1; i < numStudents; i++)
		{
			System.out.print("Enter the student's name and score: ");
			String tempNameScore = input.nextLine(); 
			int tempScore = Integer.parseInt(tempNameScore.substring(tempNameScore.indexOf(' ') + 1, tempNameScore.length()));
			
			if (studentScore < tempScore)
				studentNameScore = tempNameScore;
		}
		
		System.out.print("The top student is " + studentNameScore.substring(0, studentNameScore.indexOf(' ')));
		
		input.close();
	}
}
