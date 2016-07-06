package Chapter_06_Methods;
import java.util.Scanner;
import java.util.Random;

/**
 * Display matrix of 0s and 1s
 * Write a method that displays an n-by-n matrix using the following header: 
 * public static void printMatrix(int n) 
 * Each element is 0 or 1, which is generated randomly. 
 * Write a test program that prompts the user to enter n and displays an n-by-n matrix.
 *
 * 02/16/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_17 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the matrix: ");
		int sizeofmatrix = input.nextInt();
		printMatrix(sizeofmatrix);
		
		input.close();		
	}
	
	public static void printMatrix(int n)
	{
		Random rand = new Random();
		int binary = rand.nextInt(2);
		
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				System.out.print(binary + " ");
				binary = rand.nextInt(2);
			}
			System.out.println();
		}
		
	}
}
