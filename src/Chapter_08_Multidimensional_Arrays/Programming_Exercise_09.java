package Chapter_08_Multidimensional_Arrays;

import java.util.Scanner;

/**
 * Game: play a tic-tac-toe game
 * In a game of tic-tac-toe, two players take turns marking an available cell in a 3 * 3 grid with their respective tokens (either X or O). 
 * When one player has placed three tokens in a horizontal, vertical, or diagonal row on the grid, the game is over 
 * and that player has won. A draw (no winner) occurs when all the cells on the grid have been filled with tokens 
 * and neither player has achieved a win. Create a program for playing tic-tac-toe.
 * The program prompts two players to enter an X token and O token alternately.
 * Whenever a token is entered, the program redisplays the board on the console and determines the status of the game 
 * (win, draw, or continue).
 * 
 * 10/04/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_09 
{
	static Scanner input = new Scanner(System.in);
	public static void main (String[] args)
	{
		displayAvailableBoardMoves();
		playTicTacToe();
		input.close();
	}
	
	/**
	 * Play the tic tac toe game
	 */
	public static void playTicTacToe()
	{
		char[][] tBoard = new char[3][3];
		char token = 0;
		
		while (true)
		{
			token = enterToken(token);
			int[] setTokenPosition = new int[2];
			
			while (true)
			{
				setPositionOnBoard(setTokenPosition);
				if (setTokenOnBoard(token, setTokenPosition, tBoard))
					break;
			}
			
			if (checkGameStatus(token, tBoard))
				displayBoard(tBoard);
			else
			{
				displayBoard(tBoard);
				System.out.print(token + " wins!");
				break;
			}
		}
	}
	
	/**
	 * Display the tic tac toe board and all the tokens that have been placed on top
	 * 
	 * @param tBoard
	 */
	public static void displayBoard(char[][] tBoard)
	{
		System.out.println("Tic Tac Toe Board [X Y]");
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
				System.out.printf("[ %s ] ", tBoard[i][j]);
			System.out.println();
		}
	}
	
	/**
	 * Return false if the game is over
	 * When one player has placed three tokens in a horizontal, vertical, or diagonal row on the grid, the game is over 
	 * and that player has won. A draw (no winner) occurs when all the cells on the grid have been filled with tokens 
	 * and neither player has achieved a win.
	 * 
	 * @param token
	 * @param tBoard
	 * @return
	 */
	public static boolean checkGameStatus(char token, char[][] tBoard)
	{
		if (checkHorizontalWin(token, tBoard))
			return false;
		if (checkVerticalWin(token, tBoard))
			return false;
		if (checkMajorDiagonalWin(token, tBoard))
			return false;
		if (checkMinorDiagonalWin(token, tBoard))
			return false;
		checkDraw(tBoard);
		
		return true;
	}
	
	/**
	 * End the program if neither player wins and the board is full
	 * 
	 * @param checkDraw
	 */
	public static void checkDraw(char[][] tBoard)
	{
		outerloop:
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				if (tBoard[i][j] == 0)
					break outerloop;
				else if (i == 2 && j == 2 && tBoard[i][j] != 0)
				{
					System.out.print("Draw! Game Over!");
					System.exit(0);
				}
	}
	
	/**
	 * Return true if there is a matching 3 on the major diagonal
	 * 
	 * @param token
	 * @param tBoard
	 * @return
	 */
	public static boolean checkMinorDiagonalWin(char token, char[][] tBoard)
	{
		int match3 = 0;
		
		for (int i = 2; i >= 0; i--)
		{
			if (tBoard[(5 - i) % 3][i] == token)
				match3++;
			if (match3 == 3)
				return true;
		}
		
		return false;
	}
	
	/**
	 * Return true if there is a matching 3 on the major diagonal
	 * 
	 * @param token
	 * @param tBoard
	 * @return
	 */
	public static boolean checkMajorDiagonalWin(char token, char[][] tBoard)
	{
		int match3 = 0;
		
		for (int i = 0; i < 3; i++)
		{
			if (tBoard[i][i] == token)
				match3++;
			if (match3 == 3)
				return true;
		}
		
		return false;
	}
	
	/**
	 * Return true if there is 3 vertivcal matching token
	 * 
	 * @param token
	 * @param tBoard
	 * @return
	 */
	public static boolean checkVerticalWin(char token, char[][] tBoard)
	{
		int match3 = 0;
		
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				if (tBoard[j][i] == token)
					match3++;
				if (match3 == 3)
				{
					System.out.println("Vertical win");
					return true;
				}
			}
			
			match3 = 0;
		}
		
		return false;
	}
	
	/**
	 * Return true if there is 3 horizontal matching token
	 * 
	 * @param token
	 * @param tBoard
	 * @return
	 */
	public static boolean checkHorizontalWin(char token, char[][] tBoard)
	{
		int match3 = 0;
		
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				if (tBoard[i][j] == token)
					match3++;
				if (match3 == 3)
				{
					System.out.println("Horizontal win");
					return true;
				}
			}
			
			match3 = 0;
		}
		
		return false;
	}
	
	/**
	 * Set the token onto the board.
	 * Return false if there is already a token on that point
	 * 
	 * @param token
	 * @param setTokenPosition
	 * @return
	 */
	public static boolean setTokenOnBoard(char token, int[] setTokenPosition, char[][] tBoard)
	{
		if (tBoard[setTokenPosition[0]][setTokenPosition[1]] == 0)
			tBoard[setTokenPosition[0]][setTokenPosition[1]] = token;
		else
		{
			System.out.println("Position taken, try again!");
			return false;
		}
		
		return true;
	}
	
	/**
	 * Ask user to input the points on the board
	 * 
	 * @param setTokenPosition
	 */
	public static void setPositionOnBoard(int[] setTokenPosition)
	{
		System.out.print("Enter the positions as shown above: " 
				+ "\nx: ");
		setTokenPosition[0] = input.nextInt();
		System.out.print("y: ");
		setTokenPosition[1] = input.nextInt();
	}
	
	/**
	 * Return a X or an O
	 * 
	 * @param token
	 * @return
	 */
	public static char enterToken(char token)
	{
		if (token == 'X')
		{
			System.out.print("O player next. ");
			token = 'O';
		}
		else if (token == 'O')
		{
			System.out.print("X player next. ");
			token = 'X';
		}
		else
			while (token != 'X' && token != 'O')
			{
				System.out.print("Enter X or O: ");
				token = input.next().charAt(0);
				token = Character.toUpperCase(token);
			}
		return token;
	}
	
	/**
	 * Display the positions to be entered for a token to be displayed on the board
	 */
	public static void displayAvailableBoardMoves()
	{
		System.out.println("Tic Tac Toe Board [X Y]");
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
				System.out.printf("[%d %d] ", i, j);
			System.out.println();
		}
	}
}