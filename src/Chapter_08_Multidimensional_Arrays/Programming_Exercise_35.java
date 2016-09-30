package Chapter_08_Multidimensional_Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Largest block
 * Given a square matrix with the elements 0 or 1, write a program to find a maximum square submatrix whose elements are all 1s. 
 * Your program should prompt the user to enter the number of rows in the matrix. 
 * The program then displays the location of the first element in the maximum square submatrix 
 * and the number of the rows in the submatrix. 
 * Your program should implement and use the following method to find the maximum square submatrix: 
 * public static int[] findLargestBlock(int[][] m)
 * The return value is an array that consists of three values. 
 * The first two values are the row and column indices for the first element in the submatrix, 
 * and the third value is the number of the rows in the submatrix.
 * 
 * 02/25/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_35 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter size: ");
		int size = input.nextInt();
		int[][] binaryArray = new int[size][size];
		
		fillBinaryArray(binaryArray);
		displayArray(binaryArray);
		int[] answer = findLargestBlock(binaryArray);
		System.out.println("The maximum square submatrix is at (" + answer[0] + ", " + answer[1] + ") with size " + answer[2]);
	}
	
	public static void displayArray(int[][] binaryArray)
	{
		for (int i = 0; i < binaryArray.length; i++)
		{
			for (int j = 0; j < binaryArray[i].length; j++)
				System.out.print(binaryArray[i][j] + " ");
			System.out.println();
		}
	}
	
	public static void fillBinaryArray(int[][] binaryArray)
	{
		Random randBinary = new Random();
		
		for (int i = 0; i < binaryArray.length; i++)
			for (int j = 0; j < binaryArray[i].length; j++)
				binaryArray[i][j] = randBinary.nextInt(2);
	}
	
	public static int[] findLargestBlock(int[][] m)
	{
		int[] answer = new int[3];
		int[] temp = new int[3];
		int counter = 0;
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m.length; j++){
				if(m[i][j] == 1){
					counter++;
				}
				else{
					temp = check(m, i, j, counter);
					if(temp[2] > answer[2])
						answer = temp;
					counter = 0;
				}
			}
		}
		
		return answer;
	}
	
	public static int[] check(int[][] m, int i, int j, int counter){
		int[] answer;
		int count = 0;
		for(;i < i + counter - 1; i++){
			for(; j < j + counter - 1; j++){
				System.out.println("sdfsd" + i + " " + j);
				if(m[i][j] == 0){
					check(m, i, j, count);
					break;
				}
				count++;
			}
			count = 0;
		}
		answer = new int[]{i, j , counter};
		return answer;
	}
}
