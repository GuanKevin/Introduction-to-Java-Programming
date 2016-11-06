package Chapter_08_Multidimensional_Arrays;

import java.util.Scanner;

/**
 * Markov matrix
 * An n * n matrix is called a positive Markov matrix if each element is positive and the sum of the elements in each column is 1. 
 * Write the following method to check whether a matrix is a Markov matrix. 
 * public static boolean isMarkovMatrix(double[][] m)
 * Write a test program that prompts the user to enter a 3 * 3 matrix of double values and tests whether it is a Markov matrix.
 * 
 * 10/27/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_25 
{
	public static void main(String[] args) 
	{
		double[][] markovMatrix = enterMatrix();
		
		System.out.print(isMarkovMatrix(markovMatrix) ? "It's a Markov Matrix!" : "It's not a Markov Matrix!");
	}
	
	/**
	 * Check if matrix is a markov matrix
	 * return true if there are no negative numbers, and the sum of each column is 1
	 * 
	 * @param m
	 * @return
	 */
	public static boolean isMarkovMatrix(double[][] m)
	{
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[i].length; j++)
				if (m[i][j] < 0)
					return false;
		
		for (int i = 0; i < m.length; i++)
		{
			double sumColumn = 0;
			
			for (int j = 0; j < m.length; j++)
				sumColumn += m[j][i];
			
			if (sumColumn != 1)
				return false;
		}
		
		return true;
	}
	
	/**
	 * Return a 2 dimensional array of double data type
	 * 
	 * @return
	 */
	public static double[][] enterMatrix()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Markov Matrix: ");
		double[][] markovMatrix = new double[3][3];
		
		for (int i = 0; i < markovMatrix.length; i++)
			for (int j = 0; j < markovMatrix[i].length; j++)
				markovMatrix[i][j] = input.nextDouble(); 
		
		input.close();
		return markovMatrix;
	}
}
