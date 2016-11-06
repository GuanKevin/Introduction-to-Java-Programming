package Chapter_08_Multidimensional_Arrays;
import java.util.Scanner;

/**
 * Sort students on grades
 * Rewrite Listing 8.2, GradeExam.java, to display the students in increasing order of the number of correct answers.
 * 
 * 10/03/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_03 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		char[][] answers = {
				{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
				{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
				{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
				{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
		
		char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
		int[] studentGrade = new int[answers.length];
		
		for (int i = 0; i < answers.length; i++) 
		{
			int correctCount = 0;
			for (int j = 0; j < answers[i].length; j++)
			{
				if (answers[i][j] == keys[j])
					correctCount++;
			}
			
			studentGrade[i] = correctCount;
		}
		
		for (int i = 0; i < studentGrade.length; i++)
		{
			int lowestGrade = studentGrade[0]; 
			int index = 0;
			
			for (int j = 1; j < studentGrade.length; j++)
				if (lowestGrade > studentGrade[j])
				{
					lowestGrade = studentGrade[j];
					index = j;
				}
			
			System.out.println("Student " + (index + 1) + " grade is " + studentGrade[index]);
			studentGrade[index] = Integer.MAX_VALUE;
		}
	}
}
