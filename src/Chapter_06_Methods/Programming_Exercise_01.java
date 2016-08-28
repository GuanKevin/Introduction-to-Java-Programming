package Chapter_06_Methods;
import java.util.Scanner;

/**
 * Math: pentagonal numbers
 * A pentagonal number is defined as n(3n–1)/2 for n = 1, 2, . . ., and so on. 
 * Therefore, the first few numbers are 1, 5, 12, 22, . . . . 
 * Write a method with the following header that returns a pentagonal number: 
 * public static int getPentagonalNumber(int n) 
 * Write a test program that uses this method to display the first 100 pentagonal numbers with 10 numbers on each line.
 *
 * 08/28/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_01 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int counter = 0;
		for (int i = 1; i <= 100; i++)
		{
			if (counter == 10)
			{
				System.out.println(getPentagonalNumber(i) + " ");
				counter = 0;
			}
			else
			{
				System.out.print(getPentagonalNumber(i) + " ");
			}
			counter++;
		}
		
		input.close();		
	}
	
	public static int getPentagonalNumber(int n)
	{	
		return (n * ((3 * n) - 1)) / 2;
	}
}
