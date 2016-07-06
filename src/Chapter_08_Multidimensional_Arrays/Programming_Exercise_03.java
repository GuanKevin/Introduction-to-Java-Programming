package Chapter_08_Multidimensional_Arrays;
import java.util.Scanner;
import java.util.Random;

/**
 * Sort students on grades
 * Rewrite Listing 8.2, GradeExam.java, to display the students in increasing order of the number of correct answers.
 * 
 * 02/25/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_03 
{
	static Scanner input = new Scanner(System.in);
	static final int ROW = 2;
	public static void main(String[] args) 
	{
		System.out.print("How many students: ");
		int column = input.nextInt();
		String[][] mymatrix = new String[ROW][column];
		inputStudentInfo(mymatrix);
		//printStudentInfo(mymatrix);
		sortStudentInfo(mymatrix);
		printStudentInfo(mymatrix);
	}
	
	/**
	 * Uses bubble sort to sort in increasing order
	 * @param mymatrix
	 */
	public static void sortStudentInfo(String[][] mymatrix)
	{
		String nametemp;
		String gradetemp;
		
		for (int i = 0; i < mymatrix[0].length; i++)
		{
			for (int j = 0; j < mymatrix[0].length - 1; j++)
			{
				if (Integer.parseInt(mymatrix[1][j]) > Integer.parseInt(mymatrix[1][j + 1]))
				{
					nametemp = mymatrix[0][j];
					mymatrix[0][j] = mymatrix[0][j + 1];
					mymatrix[0][j + 1] = nametemp;
					
					gradetemp = mymatrix[1][j];
					mymatrix[1][j] = mymatrix[1][j + 1];
					mymatrix[1][j + 1] = gradetemp;
					
					
				}
			}
		}
	}
	
	/**
	 * Takes in students name and grade and store them into the matrix
	 * x x x x
	 * x x x x
	 * @param mymatrix
	 */
	public static void inputStudentInfo(String[][] mymatrix)
	{
		Random rand = new Random();
		
		for (int i = 0; i < mymatrix[0].length; i++)
		{
			System.out.print("Enter the students name: ");
			mymatrix[0][i] = input.next();
			mymatrix[1][i] = String.valueOf(rand.nextInt(101));
		}
	}
	
	/**
	 * Prints students name and grade
	 * @param mymatrix
	 */
	public static void printStudentInfo(String[][] mymatrix)
	{
		for (int i = 0; i < mymatrix[0].length; i++)
		{
			System.out.println(mymatrix[0][i] + "  " + mymatrix[1][i]);
		}
	}
}
