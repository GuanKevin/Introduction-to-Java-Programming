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
 * 02/25/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_09 
{
	static Scanner input = new Scanner(System.in);
	final static int ROW = 3;
	final static int COLUMN = 3;
	public static void main(String[] args) 
	{
		char[][] tttboard= new char[ROW][COLUMN];
		playTicTacToe(tttboard);
	}
	
	/**
	 * Ask the user to enter X or O at specific coordinates and the coordinates input the X or O and saves it onto the board.
	 * It then displays the board, and check the status of the game.
	 * [x] [ ] [ ]
	 * [X] [ ] [ ]
	 * [X] [O] [O]
	 * Check if the game is won starting at the 5 turn because it takes a minimum of 5 moves before either player can win the game
	 * @param tttboard
	 */
	public static void playTicTacToe(char[][] tttboard)
	{
		char userinput;
		int x;
		int y;
		
		for (int i = 0; i < 9; i++)
		{
			System.out.print("Enter X or O, and then enter coordinates 0 to 2 [x][y]");
			userinput = input.next().charAt(0);
			x = input.nextInt();
			y = input.nextInt();
			
			if (i > 3)
			{
				tttboard[x][y] = userinput;
				printBoard(tttboard);
				if (checkGameStatus(tttboard))
				{
					break;
				}
			}
			else if (i == 8)
			{
				tttboard[x][y] = userinput;
				printBoard(tttboard);
				if (!checkGameStatus(tttboard))
				{
					System.out.print("The game is a draw!");
				}
			}
			else
			{
				tttboard[x][y] = userinput;
				printBoard(tttboard);
			}
		}
	}
	
	/**
	 * Prints out the tic tac toe board
	 * @param tttboard
	 */
	public static void printBoard(char[][] tttboard)
	{
		for (int i = 0; i < ROW; i++)
		{
			for(int j = 0; j < COLUMN; j++)
			{
				System.out.printf(tttboard[i][j] + "%-1s", " ");
			}
			System.out.println();
		}
	}
	
	/**
	 * Check the game status and return true if the user won, else false, if the game has not ended yet!
	 * @param tttboard
	 * @return
	 */
	public static boolean checkGameStatus(char[][] tttboard)
	{
		boolean gamestatus = false;
		
		if (tttboard[0][0] == 'X' && tttboard[1][0] == 'X' && tttboard[2][0] == 'X'
				|| tttboard[0][0] == 'O' && tttboard[1][0] == 'O' && tttboard[2][0] == 'O')
		{
			System.out.print("You win!");
			gamestatus = true;
		}
		else if (tttboard[0][1] == 'X' && tttboard[1][1] == 'X' && tttboard[2][1] == 'X'
				|| tttboard[0][1] == 'O' && tttboard[1][1] == 'O' && tttboard[2][1] == 'O')
		{
			System.out.print("You win!");
			gamestatus = true;
		}
		else if (tttboard[0][2] == 'X' && tttboard[1][2] == 'X' && tttboard[2][2] == 'X'
				|| tttboard[0][2] == 'O' && tttboard[1][2] == 'O' && tttboard[2][2] == 'O')
		{
			System.out.print("You win!");
			gamestatus = true;
		}
		else if (tttboard[0][0] == 'X' && tttboard[0][1] == 'X' && tttboard[0][2] == 'X'
				|| tttboard[0][0] == 'O' && tttboard[0][1] == 'O' && tttboard[0][2] == 'O')
		{
			System.out.print("You win!");
			gamestatus = true;
		}
		else if (tttboard[1][0] == 'X' && tttboard[1][1] == 'X' && tttboard[1][2] == 'X'
				|| tttboard[1][0] == 'O' && tttboard[1][1] == 'O' && tttboard[1][2] == 'O')
		{
			System.out.print("You win!");
			gamestatus = true;
		}
		else if (tttboard[2][0] == 'X' && tttboard[2][1] == 'X' && tttboard[2][2] == 'X'
				|| tttboard[2][0] == 'O' && tttboard[2][1] == 'O' && tttboard[2][2] == 'O')
		{
			System.out.print("You win!");
			gamestatus = true;
		}
		else if (tttboard[0][0] == 'X' && tttboard[1][1] == 'X' && tttboard[2][2] == 'X'
				|| tttboard[0][0] == 'O' && tttboard[1][1] == 'O' && tttboard[2][2] == 'O')
		{
			System.out.print("You win!");
			gamestatus = true;
		}
		else if (tttboard[0][2] == 'X' && tttboard[1][1] == 'X' && tttboard[2][0] == 'X'
				|| tttboard[0][2] == 'O' && tttboard[1][1] == 'O' && tttboard[2][0] == 'O')
		{
			System.out.print("You win!");
			gamestatus = true;
		}
		
		return gamestatus;
	}
}
