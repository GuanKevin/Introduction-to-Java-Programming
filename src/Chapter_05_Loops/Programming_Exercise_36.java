package Chapter_05_Loops;
import java.util.Scanner;

/**
 * Business application: checking ISBN  
 * Use loops to simplify Programming Exercise 3.9.
 * 
 * 03/24/2016
 * @author kevgu
 *
 */


public class Programming_Exercise_36 {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 9 digit number: ");
		String isbn = input.next();
		int checksum = 0;
		
		//(d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11
		
		for (int i = 0; i < 9; i++)
		{
			//checksum += isbn.charAt(i) * (i + 1);
			//0 1 3 6 0 1 2 6 7
			System.out.println(isbn.charAt(i) + " * " + (i + 1) + " = " + (Character.getNumericValue(isbn.charAt(i)) * (i + 1)));
			checksum += Character.getNumericValue(isbn.charAt(i)) * (i + 1);
		}
		
		checksum %= 11;
		
		if (checksum == 10)
		{
			System.out.println("Your ISBN number is: " + isbn + 'X');
		}
		else
		{
			System.out.println("Your ISBN number is: " + isbn + checksum);
		}
		
		input.close();
	}
}
