package Chapter_07_Single_Dimensional_Arrays;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Sort characters in a string
 * Write a method that returns a sorted string using the following header: 
 * public static String sort(String s) 
 * For example, sort("acb") returns abc. 
 * Write a test program that prompts the user to enter a string and displays the sorted string.
 * 
 * 09/27/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_34 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		System.out.print("Sorted string: " + sort(input.nextLine()));
		
		input.close();
	}
	
	public static String sort(String s) 
	{
		char[] sortArray = s.toCharArray();
		Arrays.sort(sortArray);
		
		return Arrays.toString(sortArray);
	}
}
