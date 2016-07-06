package Chapter_08_Multidimensional_Arrays;
import java.util.Scanner;
import java.util.Random;
/**
 * Explore matrix
 * Write a program that prompts the user to enter the length of a square matrix, randomly fills in 0s and 1s into the matrix, 
 * prints the matrix, and finds the rows, columns, and diagonals with all 0s or 1s.
 * 
 * 02/25/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_14 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the size of the matrix: ");
		int row = input.nextInt();
		int column = row;
		int[][] mymatrix = new int[row][column];
		insertBinary(mymatrix);
		printMatrix(mymatrix);
		exploreMatrix(mymatrix);
	}
	
	/**
	 * Report if a row, column, or diagonals is all 0s or all 1s
	 * @param mymatrix
	 */
	public static void exploreMatrix(int[][] mymatrix)
	{
		int check = 0;
		
		//Check rows if they have all 0 or all 1
		for (int i = 0; i < mymatrix.length; i++)
		{
			if (mymatrix[i][0] == 0)
			{
				check = 0;
			}
			else
			{
				check = 1;
			}
			for (int j = 1; j < mymatrix[0].length; j++)
			{
				if (mymatrix[i][j] != check)
				{
					break;
				}
				else if (j == mymatrix.length - 1)
				{
					System.out.println("Row " + i + " has all " + check);
				}
				
			}
		}
		
		//Check columns if they have all 0 or all 1
		for (int i = 0; i < mymatrix.length; i++)
		{
			if (mymatrix[0][i] == 0)
			{
				check = 0;
			}
			else
			{
				check = 1;
			}
			for (int j = 1; j < mymatrix[0].length; j++)
			{
				if (mymatrix[j][i] != check)
				{
					break;
				}
				else if (j == mymatrix.length - 1)
				{
					System.out.println("Column " + i + " has all " + check);
				}
			}
		}
		
		//Find if matrix has a major diagonal of all 0 or all 1
		for (int i = 0; i < 1; i++)
		{
			if (mymatrix[0][0] == 0)
			{
				check = 0;
			}
			else
			{
				check = 1;
			}
			for (int j = 1; j < mymatrix[0].length; j++)
			{
				if (mymatrix[j][j] != check)
				{
					break;
				}
				else if (j == mymatrix.length - 1)
				{
					System.out.println("Major Diagonal has all " + check);
				}
			}
		}
		
		int x = mymatrix.length - 1;
		int y = 0;
		
		//Find if matrix has a minor diagonal of all 0 or all 1
		for (int i = 0; i < 1; i++)
		{
			if (mymatrix[y][x] == 0)
			{
				check = 0;
			}
			else
			{
				check = 1;
			}
			for (int j = 1; j < mymatrix[0].length; j++)
			{
				++y;
				--x;
				if (mymatrix[y][x] != check)
				{
					break;
				}
				else if (j == mymatrix.length - 1)
				{
					System.out.println("Minor Diagonal has all " + check);
				}
			}
		}
	}
	
	/**
	 * Insert binary numbers into the matrix
	 * @param mymatrix
	 */
	public static void insertBinary(int[][] mymatrix)
	{
		Random rand = new Random();
		
		for (int i = 0; i < mymatrix.length; i++)
		{
			for (int j = 0; j < mymatrix[0].length; j++)
			{
				mymatrix[i][j] = rand.nextInt(2);
			}
		}
	}
	
	/**
	 * Print out the matrix
	 * @param mymatrix
	 */
	public static void printMatrix(int[][] mymatrix)
	{
		//Random rand = new Random();
		
		for (int i = 0; i < mymatrix.length; i++)
		{
			for (int j = 0; j < mymatrix[0].length; j++)
			{
				System.out.print(mymatrix[i][j] + " ");
			}
			
			System.out.println();
		}
	}
}
