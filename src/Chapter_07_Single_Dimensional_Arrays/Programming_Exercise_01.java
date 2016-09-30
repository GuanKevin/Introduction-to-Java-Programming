package Chapter_07_Single_Dimensional_Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Assign grades
 * Write a program that reads student scores, gets the best score, and then assigns grades based on the following scheme: 
 * Grade is A if score is >= best - 10;
 * Grade is B if score is >= best - 20;
 * Grade is C if score is >= best - 30;
 * Grade is D if score is >= best - 40;
 * Grade is F otherwise.
 * The program prompts the user to enter the total number of students, then prompts the user to enter all of the scores, 
 * and concludes by displaying the grades.
 * 
 * 09/30/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_01 
{
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) 
	{	
		System.out.print("Enter the number of students: ");
		int numStudents = input.nextInt();
		int[] gradeArray = new int[numStudents];
		
		storeScores(gradeArray);
		gradeStudent(gradeArray, findBestScore(gradeArray));
	}
	
	/**
	 * Return the highest score from the array
	 * 
	 * @param gradeArray
	 * @return
	 */
	public static int findBestScore(int[] gradeArray)
	{
		int bestScore = gradeArray[0];
		
		for (int i = 1; i < gradeArray.length; i++)
			if (bestScore < gradeArray[i])
				bestScore = gradeArray[i];
		
		return bestScore;
	}
	
	/**
	 * Give each student a letter grade
	 * 
	 * @param gradeArray
	 */
	public static void gradeStudent(int[] gradeArray, int bestScore)
	{
		for (int i = 0; i < gradeArray.length; i++)
			if (gradeArray[i] >= bestScore - 10)
				System.out.println("Student " + (i + 1) + " A." + " Grade: " + gradeArray[i]);
			else if (gradeArray[i] >= bestScore - 20)
				System.out.println("Student " + (i + 1) + " B." + " Grade: " + gradeArray[i]);
			else if (gradeArray[i] >= bestScore - 30)
				System.out.println("Student " + (i + 1) + " C." + " Grade: " + gradeArray[i]);
			else if (gradeArray[i] >= bestScore - 40)
				System.out.println("Student " + (i + 1) + " D." + " Grade: " + gradeArray[i]);
			else
				System.out.println("Student " + (i + 1) + " F." + " Grade: " + gradeArray[i]);
	}
	
	/**
	 *  prompts the user to enter all of the scores
	 *  
	 * @param gradeArray
	 */
	public static void storeScores(int[] gradeArray)
	{
		Random randScore = new Random();
		
		for (int i = 0; i < gradeArray.length; i++)
			gradeArray[i] =  randScore.nextInt(101);
	}
}
