package Chapter_11_Inheritence_and_Polymorphism;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 * Largest rows and columns
 * Write a program that randomly fills in 0s and 1s into an n-by-n matrix, prints the matrix, 
 * and finds the rows and columns with the most 1s. 
 * (Hint: Use two ArrayLists to store the row and column indices with the most 1s.)
 *
 * 03/20/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_09 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter size of sqaure matrix: ");
		int size = scanner.nextInt();
		//ArrayList<Integer><Integer> matrix = new ArrayListInteger><Integer>();
		Random rand = new Random();
		for(int i = 0; i < size; i++)
		{
			for(int j = 0; j < size; j++)
			{
				//matrix[i][j] = rand.nextInt(2);
			}
		}
	}
}
