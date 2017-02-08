package Chapter_22_Developing_Efficient_Algorithms;

import utilities.SudokuGenerator;
import utilities.SudokuSolver;

/**
 * (Game: recursive Sudoku) 
 * Write a recursive solution for the Sudoku problem.
 * @author kevgu
 *
 */

public class Programming_Exercise_22 
{
	public static void main(String[] args)
	{
		SudokuGenerator sudoku = new SudokuGenerator();
		sudoku.display();
		System.out.print("\n");
		SudokuSolver solve = new SudokuSolver(sudoku.getBoard());
		solve.display();
	}
}
