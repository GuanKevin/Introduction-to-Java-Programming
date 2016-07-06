package Chapter_05_Loops;
import java.util.Scanner;

/**
 * Find the two highest scores
 * Write a program that prompts the user to enter the number of students and each student’s name and score, 
 * and finally displays the student with the highest score and the student with the second-highest score.
 * 
 * @author kevgu
 *
 */

public class Programming_Exercise_09 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		final int numberofstudents = input.nextInt(); 
		String topstudentname1 = null;
		String topstudentname2 = null;
		String tempname;
		double topstudentscore1, topstudentscore2, tempscore;
		topstudentscore1 = topstudentscore2 = 0;
		
		for (int i = 1; i <= numberofstudents; i++)
		{
			System.out.print("Enter the name of student " + i + ": ");
			tempname = input.next();
			System.out.print("Enter the score of student " + i + ": ");
			tempscore = input.nextDouble();
			
			if (topstudentname1 == null)
			{
				topstudentname1 = new String(tempname);
				topstudentscore1 = tempscore;
			}
			else
			{
				if (topstudentscore1 < tempscore)
				{
					topstudentname2 = new String(topstudentname1);
					topstudentscore2 = topstudentscore1;
					topstudentname1 = new String(tempname);
					topstudentscore1 = tempscore;
				}
			}
		}
		
		//Alex 90, Calvin 99, Stanislav 50, Jimmie 75, Roy 95, Kevin 105, Shafia 10
		
		System.out.print("The top 2 student is: " 
		+ "\n" + topstudentname1 + " " + topstudentscore1
		+ "\n" + topstudentname2 + " " + topstudentscore2
				);
		
		input.close();
	}
}
