package Chapter_08_Multidimensional_Arrays;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Identical arrays
 * The two-dimensional arrays m1 and m2 are identical if they have the same contents. 
 * Write a method that returns true if m1 and m2 are identical, using the following header:
 * public static boolean equals(int[][] m1, int[][] m2)
 * Write a test program that prompts the user to enter two 3 * 3 arrays of integers and displays whether the two are identical.
 * 
 * 10/28/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_29 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int[][] matrix1 = enterMatrix(), matrix2 = enterMatrix();
		
		System.out.print(equals(matrix1, matrix2) ? "Both array are identical" : "Both array are not identical");
		input.close();
	}
	
	public static boolean equals(int[][] m1, int[][] m2)
	{
		if (m1.length * m1[0].length != m2.length * m2[0].length)
	  		return false;
		
		for (int i = 0; i < m1.length; i++)
		{
			Arrays.sort(m1[i]);
			Arrays.sort(m2[i]);
			
			if (!Arrays.equals(m1[i], m2[i]))
				return false;
		}
		
		return true;
	}
	
	public static int[][] enterMatrix()
	{		
		System.out.print("Enter matrix: ");
		int[][] markovMatrix = new int[3][3];
		
		for (int i = 0; i < markovMatrix.length; i++)
			for (int j = 0; j < markovMatrix[i].length; j++)
				markovMatrix[i][j] = input.nextInt(); 
		
		return markovMatrix;
	}
}
