package utilities;

import java.util.Random;

public class SudokuGenerator implements Sudoku{
	private int [][] board;
	
	public SudokuGenerator()
	{
		board = new int[9][9];
		insert(0, 0);
		makeHoles(40);
	}
	
	private boolean validInsert(int z, int x, int y)
	{
		for(int i = 0; i < 9; i++)
		{
			if(board[i][y] == z)
				return false;
		}
		
		for(int i = 0; i < 9; i++)
		{
			if(board[x][i] == z)
				return false;
		}
		
		int bx = x - (x % 3);
		int by = y - (y % 3);
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				if(board[bx + i][by + j] == z)
					return false;
			}
		}
		
		return true;
	}
	
	/**
	 * Use x and y of the 2d array to start inserting numbers
	 * Start from the top left
	 * @param x
	 * Column of 2d array
	 * @param y
	 * Row of 2d array
	 * @return
	 * Returns true if it works
	 */
	private boolean insert(int x, int y)
	{
		if(y == 9)
		{
			if(x == 8)
				return true;
			x++;
			y = 0;
		}
		Random rand = new Random();
		int num = rand.nextInt(9);
		
		for(int i = 0; i < 9; i++)
		{
			if(num + i + 1 < 10)
			{
				if(validInsert(num + i + 1, x, y))
				{
					board[x][y] = num + i + 1;
					if(insert(x, y+1))
						return true;
				}
			}
			else
			{
				if(validInsert(num + i - 8, x, y))
				{
					board[x][y] = num + i - 8;
					if(insert(x, y+1))
						return true;
				}
			}
		}
		board[x][y] = 0;
		return false;
	}
	/**
	 * User enter number of holes as parameter
	 * 
	 * @param num
	 */
	private void makeHoles(int num)
	{
		Random rand = new Random();
		boolean [] tracker = new boolean[81];
		for(int i = 0; i < num; i++)
		{
			int temp = rand.nextInt(81) + 1;
			while(tracker[temp])
				temp = rand.nextInt(81) + 1;
			board[temp / 9][temp % 9] = 0;
			tracker[temp] = true;
		}
	}
	
	public void display()
	{
		for(int i = 0; i < 9; i++)
		{
			for(int j = 0; j < 9; j++)
			{
				if(board[i][j] == 0)
					System.out.print("  ");
				else
					System.out.print(board[i][j] + " ");
				if((j+1) % 3 == 0 && j + 1 != 9)
				{
					System.out.print("| ");
				}
			}
			System.out.print("\n");
			if((i+1) % 3 == 0 && i + 1 != 9)
			{
				System.out.print("- - - - - - - - - - -\n");
			}
		}
	}
	
	public int[][] getBoard()
	{
		return board;
	}
}
