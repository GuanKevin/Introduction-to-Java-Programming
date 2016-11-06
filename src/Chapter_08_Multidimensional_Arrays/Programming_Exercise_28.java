package Chapter_08_Multidimensional_Arrays;
import java.util.Scanner;

/**
 * Strictly identical arrays
 * The two-dimensional arrays m1 and m2 are strictly identical if their corresponding elements are equal. 
 * Write a method that returns true if m1 and m2 are strictly identical, using the following header: 
 * public static boolean equals(int[][] m1, int[][] m2) 
 * Write a test program that prompts the user to enter two 3 * 3 arrays of integers and displays whether the two are strictly identical
 * 
 * 10/27/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_28 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int[][] matrix1 = enterMatrix(), matrix2 = enterMatrix();
		
		System.out.println(equals(matrix1, matrix2) ? "Both matrix are strictly identical" : "Both matrix are not strictly identical");
		input.close();
	}
	
	/**
	 * returns true if m1 and m2 are strictly identical
	 * 
	 * @param m1
	 * @param m2
	 * @return
	 */
	public static boolean equals(int[][] m1, int[][] m2) 
	{
		if (m1.length * m1[0].length != m2.length * m2[0].length)
			return false;
		
		for (int i = 0; i < m1.length; i++)
			for (int j = 0; j < m1[i].length; j++)
				if (m1[i][j] != m2[i][j])
					return false;
		
		return true;
	}
	
	public static int[][] enterMatrix()
	{		
		System.out.print("Enter matrix: ");
		int[][] matrix = new int[3][3];
		
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[i].length; j++)
				matrix[i][j] = input.nextInt(); 
		
		return matrix;
	}
}
