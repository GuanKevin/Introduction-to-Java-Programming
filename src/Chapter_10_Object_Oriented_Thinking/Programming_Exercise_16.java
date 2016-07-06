package Chapter_10_Object_Oriented_Thinking;
import java.util.Scanner;

/**
 * Divisible by 2 or 3
 * Find the first ten numbers with 50 decimal digits that are divisible by 2 or 3.
 * 
 * 03/10/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_16 
{
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		DivisibleBy db = new DivisibleBy();
		db.printDivisibleBy();
	}
}
