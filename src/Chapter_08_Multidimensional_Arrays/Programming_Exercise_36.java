package Chapter_08_Multidimensional_Arrays;
import java.util.Scanner;

/**
 * Latin square
 * A Latin square is an n-by-n array filled with n different Latin letters, each occurring exactly once in each row and once in each column. 
 * Write a program that prompts the user to enter the number n and the array of characters, as shown in the sample output, 
 * and checks if the input array is a Latin square. 
 * The characters are the first n characters starting from A.
 * 
 * 02/25/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_36 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter numbers of n: ");
		int n = input.nextInt();
		System.out.println("Enter " + n + " rows of seperated by spaces:");
		char[][] array = new char[n][n];
		char letter;
		input.nextLine();
		for(int i = 0; i < n; i++){
			String line = input.nextLine();
			for(int j = 0; j < n; ++j){
				letter = Character.toUpperCase(line.charAt(j * 2));
				for(int k = 0; k < n; k++){
					if((65 + k ) == letter){
						break;
					}
					else if((97 + k) != letter && k == n - 1){
						System.out.println("Wrong input: the letters must be from A to " + (char)(65 + n - 1));
						return;
					}
				}
				array[i][j] = letter;
			}
		}
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				for(int k = i + 1; k < n; k++){
					if(array[i][j] == array[k][j]){
						System.out.println("Not a Latin square");
						return;
					}
				}
				for(int k = j + 1; k < n; k++){
					if(array[i][j] == array[i][k]){
						System.out.println("Not a Latin square");
						return;
					}
				}
			}
		}
		System.out.println("The input is a Latin square.");
	}
}
