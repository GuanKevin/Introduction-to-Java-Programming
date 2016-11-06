package Chapter_08_Multidimensional_Arrays;

import java.util.Scanner;

/**
 * Latin square
 * A Latin square is an n-by-n array filled with n different Latin letters, each occurring exactly once in each row and once in each column. 
 * Write a program that prompts the user to enter the number n and the array of characters, as shown in the sample output, 
 * and checks if the input array is a Latin square. 
 * The characters are the first n characters starting from A.
 * 
 * 10/29/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_36 
{
	public static void main(String[] args) 
	{
		char[][] latinSquare = enterLatinSquare();
		displaySquare(latinSquare);
		System.out.print(checkLatinSquare(latinSquare) ? "It's a latin square." : "It's not a latin square.");
	}

	/**
	 * Check if column if matrix has unique characters and is within the size range
	 * 
	 * @param latinSquare
	 * @return
	 */
	public static boolean checkLatinSquare(char[][] latinSquare)
	{
		char[] tempList = new char[latinSquare.length];
		
		for (int i = 0; i < latinSquare.length; i++)
		{
			for (int j = 0; j < latinSquare.length; j++)
				tempList[j] = latinSquare[j][i];
			if (checkRow(tempList))
				return false;
		}
		
		return true;
	}
	
	/**
	 * Display the matrix
	 * 
	 * @param latinSquare
	 */
	public static void displaySquare(char[][] latinSquare)
	{
		for (int i = 0; i < latinSquare.length; i++)
		{
			for (int j = 0; j < latinSquare[i].length; j++)
				System.out.print(latinSquare[i][j] + " ");
			System.out.println();
		}
	}
	
	/**
	 * Ask user to input characters of size n
	 * Return the matrix back 
	 * 
	 * @return
	 */
	public static char[][] enterLatinSquare()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the square: ");
		int size = input.nextInt();
		char[][] latinSquare  = new char[size][size];
		
		for (int i = 0; i < latinSquare.length; i++)
		{
			System.out.print("Enter for row " + i + ": ");
			
			for (int j = 0; j < latinSquare[i].length; j++)
				latinSquare[i][j] = Character.toUpperCase(input.next().charAt(0));
			
			if (checkRow(latinSquare[i]))
			{
				i--;
				System.out.println("Try again, input must be from A - " + (char) (65 + latinSquare.length - 1) + ".");
			}
		}
		
		input.close();
		return latinSquare;
	}
	
	/**
	 * Return true if the array contains character that is either repeated or it is greater than the range initially inputed
	 * 
	 * @param latinSquare
	 * @return
	 */
	public static boolean checkRow(char[] latinSquare)
	{	
		for (int i = 0; i < latinSquare.length - 1; i++)
			for (int j = i + 1; j < latinSquare.length; j++)
				if ((latinSquare[j] >= ('A' + latinSquare.length)) || latinSquare[i] == latinSquare[j])
						return true;
		return false;
	}
}
