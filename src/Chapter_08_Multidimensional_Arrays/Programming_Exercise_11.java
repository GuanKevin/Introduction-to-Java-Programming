package Chapter_08_Multidimensional_Arrays;
import java.util.Scanner;

/**
 * Game: nine heads and tails
 * Nine coins are placed in a 3-by-3 matrix with some face up and some face down. 
 * You can represent the state of the coins using a 3-by-3 matrix with values 0 (heads) and 1 (tails).
 * Each state can also be represented using a binary number.
 * 000010000		101001111		110100001
 * [0] [0] [0]		[1] [0] [1]		[1] [1] [0]
 * [0] [1] [0]  	[0] [0] [1] 	[1] [0] [0]
 * [0] [0] [0]  	[1] [1] [1]		[0] [0] [1]
 * There are a total of 512 possibilities, so you can use decimal numbers 0, 1, 2, 3, . . . , 
 * and 511 to represent all states of the matrix. 
 * Write a program that prompts the user to enter a number between 0 and 511 
 * and displays the corresponding matrix with the characters H and T.
 * 
 * 02/25/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_11 
{
	static Scanner input = new Scanner(System.in);
	static final int ROW = 3;
	static final int COLUMN = 3;
	public static void main(String[] args) 
	{
		System.out.print("Enter a number between 0 and 511: ");
		String binary = Integer.toBinaryString(input.nextInt());
		char[][] htmatrix = new char[ROW][COLUMN];
		headsOrTail(htmatrix, binary);
		printMatrix(htmatrix);
	}
	
	/**
	 * Print out the matrix
	 * @param htmatrix
	 */
	public static void printMatrix(char[][] htmatrix)
	{
		for (int i = 0; i < ROW; i++)
		{
			for (int j = 0; j < COLUMN; j++)
			{
				System.out.print(htmatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	/**
	 * Input a h or a t in the matrix depending on the user input that was converted to binary
	 * 4 = 000000100
	 * [-] [-] [-]		
	 * [-] [-] [-]		
	 * [-] [-] [-]
	 * @param htmatrix
	 */
	public static void headsOrTail(char[][] htmatrix, String binary)
	{
		int binarylength = binary.length();
		int cutoff = 9 - binarylength;
		int counter = 0;
		int index = 0;
		
		for (int i = 0; i < ROW; i++)
		{
			for (int j = 0; j < COLUMN; j++)
			{
				if (counter < cutoff)
				{
					htmatrix[i][j] = 'H';
				}
				else
				{
					if (binary.charAt(index) == '0')
					{
						htmatrix[i][j] = 'H';
					}
					else
					{
						htmatrix[i][j] = 'T';
					}
					index++;
				}
				counter++;
			}
		}
	}
}
