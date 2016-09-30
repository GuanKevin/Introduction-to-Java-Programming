package Chapter_07_Single_Dimensional_Arrays;

import java.util.Scanner;

/**
 * Sort students
 * Write a program that prompts the user to enter the number of students, the students’ names, and their scores, 
 * and prints student names in decreasing order of their scores.
 * 
 * 09/21/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_17 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the number of students: ");
		int size = input.nextInt();
		String[] studentName = new String[size];
		double[] studentScore = new double[size];
		
		studentStudentScore(studentName, studentScore);
		sortStudentByGrade(studentName, studentScore);
		displayStudentNameGrade(studentName, studentScore);
		
		input.close();
	}
	
	/**
	 * Display student's name and their score
	 * 
	 * @param studentName
	 * @param studentScore
	 */
	public static void displayStudentNameGrade(String[] studentName, double[] studentScore)
	{
		System.out.printf("\n%-15s%s\n", "Name", "Score");
		
		for (int i = 0; i < studentName.length; i++)
			System.out.printf("%-15s%s\n", studentName[i], studentScore[i]);
	}
	
	/**
	 * Sort student names and score in decreasing order of their score
	 * 
	 * @param studentName
	 * @param studentScore
	 */
	public static void sortStudentByGrade(String[] studentName, double[] studentScore)
	{
		for (int i = 0; i < studentName.length - 1; i++)
			for (int j = i + 1; j < studentName.length; j++)
				if (studentScore[i] < studentScore[j])
					swap(studentName, i, studentScore, j);
	}
	
	/**
	 * Swap student's name and score
	 * 
	 * @param studentScore
	 * @param i
	 * @param studentScore
	 * @param j
	 */
	public static void swap(String[] studentName, int i, double[] studentScore, int j)
	{
		String tempName = studentName[i];
		studentName[i] = studentName[j];
		studentName[j] = tempName;
		
		double tempScore = studentScore[i];
		studentScore[i] = studentScore[j];
		studentScore[j] = tempScore;
	}
	
	/**
	 * Prompts the user to enter the student's name and their score
	 * 
	 * @param studentName
	 * @param studentScore
	 */
	public static void studentStudentScore(String[] studentName, double[] studentScore)
	{
		for (int i = 0; i < studentName.length; i++)
		{
			System.out.print("Enter student " + (i + 1) + "'s name: ");
			input.nextLine();
			studentName[i] = input.nextLine();
			System.out.print("Enter " + studentName[i] + "'s score: ");
			studentScore[i] = input.nextDouble();
		}
	}
}
