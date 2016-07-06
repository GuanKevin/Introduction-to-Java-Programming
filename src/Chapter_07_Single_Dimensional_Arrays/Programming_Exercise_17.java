package Chapter_07_Single_Dimensional_Arrays;
import java.util.Scanner;

/**
 * Sort students
 * Write a program that prompts the user to enter the number of students, the students’ names, and their scores, 
 * and prints student names in decreasing order of their scores.
 * 
 * 02/21/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_17 
{
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.print("Enter the number of students: ");
		int numofstu = input.nextInt();
		String[] studentsname = new String[numofstu];
		int[] studentscore = new int[numofstu];
		
		grabStudentsInfo(studentsname, studentscore);
		printStudentsGrade(studentsname, studentscore);
		
	}
	
	/**
	 * Store students name and students grade into a string array and an integer array
	 * @param studentsname
	 * @param studentscore
	 */
	public static void grabStudentsInfo(String[] studentsname, int[] studentscore)
	{
		for (int i = 0; i < studentsname.length; i++)
		{
			System.out.print("Enter students name: " );
			studentsname[i] = input.next();
			System.out.print("Enter students score: ");
			studentscore[i] = input.nextInt();
		}
	}
	
	/**
	 * Returns index with highest grade
	 * @param studentscore
	 * @return
	 */
	public static int topScore(int[] studentscore)
	{
		int index = 0;
		
		for (int i = 0; i < studentscore.length; i++)
		{
			if (studentscore[i] == -1)
			{
				continue;
			}
			if (studentscore[index] < studentscore[i])
			{
				index = i;
			}
		}
		
		return index;
	}
	
	/**
	 * Display students name and score in descending order
	 * @param studentsname
	 * @param studentscore
	 */
	public static void printStudentsGrade(String[] studentsname, int[] studentscore)
	{
		int bestscoreindex;
		
		for (int i = 0; i < studentsname.length; i++)
		{
			bestscoreindex = topScore(studentscore);
			System.out.println(studentsname[bestscoreindex] + " " + studentscore[bestscoreindex ]);
			studentscore[bestscoreindex] = -1;
		}
	}
}
