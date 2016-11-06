package Chapter_08_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Check Sudoku solution
 * Listing 8.4 checks whether a solution is valid by checking whether every number is valid in the board. 
 * Rewrite the program by checking whether every row, every column, and every small box has the numbers 1 to 9.
 * 
 * 10/27/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_24 
{
	public static void main(String[] args) 
	{
		int[][] sudokuGrid = sudokuSolution();
		
		System.out.print(isValid(sudokuGrid) ? "Valid solution!" : "Invalid solution!");
	}
	
	/**
	 * Checks whether sudoku solution is valid by checking
	 * whether every number is valid in the board
	 * Return true every row, column, and small box has the numbers 1 to 9
	 * 
	 * @param sudokuGrid
	 * @return
	 */
	public static boolean isValid(int[][] sudokuGrid)
	{
		for (int i = 0; i < sudokuGrid.length; i++)
			if (!checkValid(sudokuGrid[i]))
				return false;
		
		for (int i = 0; i < sudokuGrid.length; i++)
		{
			int[] columnArray = new int[9];
			
			for (int j = 0; j < sudokuGrid[i].length; j++)
				columnArray[j] = sudokuGrid[j][i];
			
			if (!checkValid(columnArray))
				return false;
		}
		
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
			{
				int[] columnArray = new int[9];
				int indexCounter = 0;
				
				for (int row = i * 3; row < i * 3 + 3; row++)
					for (int column = j * 3; column < j * 3 + 3; column++)
						columnArray[indexCounter++] = sudokuGrid[row][column];
				
				if (!checkValid(columnArray))
					return false;
			}
		
		
		return true;
	}
	
	/**
	 * Sort the array, and check if there is a repeating number
	 * Return false if a number is repeated
	 * 
	 * @param sudokuGrid
	 * @return
	 */
	public static boolean checkValid(int[] sudokuGrid)
	{
		int[] tempArray = new int[sudokuGrid.length];
		System.arraycopy(sudokuGrid, 0, tempArray, 0, sudokuGrid.length);
		Arrays.sort(tempArray);
		
		for (int i = 1; i <= 9; i++)
			if (tempArray[i - 1] != i)
				return false;
		
		return true;
	}
	
	/**
	 * Ask user to enter their sudoku solution and store it into a 2 dimensional array
	 * Return array back
	 * 
	 * @return
	 */
	public static int[][] sudokuSolution()
	{
		Scanner input = new Scanner(System.in);
		int[][] sudokuGrid = new int[9][9];
		
		for (int i = 0; i < 9; i++)
			for (int j = 0; j < 9; j++)
				sudokuGrid[i][j] = input.nextInt();
				
		input.close();
		return sudokuGrid;
	}
}
