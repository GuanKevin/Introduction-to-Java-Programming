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
 * 10/05/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_11 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args)
	{
		int[][] binaryMatrix = new int[3][3];
		System.out.print("Enter a number between 0 and 511: ");
		String binaryString = length9(input.nextInt());
		setMatrix(binaryString, binaryMatrix);
		displayMatrix(binaryMatrix);

		input.close();
	}
	
	/**
	 * Display the matrix
	 * 
	 * @param binaryMatrix
	 */
	public static void displayMatrix(int[][] binaryMatrix)
	{
		for (int i = 0; i < binaryMatrix.length; i++)
		{
			for (int j = 0; j < binaryMatrix[i].length; j++)
				if (binaryMatrix[i][j] == 0)
					System.out.print("[ H ]");
				else
					System.out.print("[ T ]");
			System.out.println();
		}	
	}
	
	/**
	 * Set matrix according to binary string
	 * 
	 * @param binaryString
	 * @param binaryMatrix
	 */
	public static void setMatrix(String binaryString, int[][] binaryMatrix)
	{
		int indexCounter = 0;
		
		for (int i = 0; i < binaryMatrix.length; i++)
			for (int j = 0; j < binaryMatrix[i].length; j++)
			{
				binaryMatrix[i][j] = Character.getNumericValue(binaryString.charAt(indexCounter));
				indexCounter++;
			}
				
	}
	
	/**
	 * Return a binary string of length 9
	 * 
	 * @param number
	 * @return
	 */
	public static String length9(int number)
	{
		String binaryString = Integer.toBinaryString(number);
		int length = binaryString.length();
		
		for (int i = 0; i <= (8 - length); i++)
			binaryString = (0 + binaryString);
		System.out.println("Binary string: " + binaryString);
		return binaryString;
	}
}
