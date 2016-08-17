package Chapter_03_Selections;
import java.util.Scanner;

/**
 * Business: check ISBN-10
 * An ISBN-10 (International Standard Book Number) consists of 10 digits: d1d2d3d4d5d6d7d8d9d10
 * The last digit, d10, is a checksum, which is calculated from the other nine digits using the following formula: 
 * ((d1 * 1) + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + (d6 * 6) + (d7 * 7) + (d8 * 8) + (d9 * 9)) % 11
 * If the checksum is 10, the last digit is denoted as X according to the ISBN-10 convention. 
 * Write a program that prompts the user to enter the first 9 digits and displays the 10-digit ISBN (including leading zeros). 
 * Your program should read the input as an integer. 
 * 
 * 08/06/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_09 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, isbn10;
		System.out.print("Input a nine digit string: ");
		isbn10 = input.nextInt();
		
		d9 = isbn10 % 10; 
		isbn10 /= 10;
		d8 = isbn10 % 10; 
		isbn10 /= 10;
		d7 = isbn10 % 10; 
		isbn10 /= 10;
		d6 = isbn10 % 10; 
		isbn10 /= 10;
		d5 = isbn10 % 10; 
		isbn10 /= 10;
		d4 = isbn10 % 10;
		isbn10 /= 10;
		d3 = isbn10 % 10;
		isbn10 /= 10;
		d2 = isbn10 % 10;
		isbn10 /= 10;
		d1 = isbn10 % 10;
		d10 = ((d1 * 1) + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + (d6 * 6) + (d7 * 7) + (d8 * 8) + (d9 * 9)) % 11;
		
		if (d10 == 10)
			System.out.print("" + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");
		else
			System.out.print("" + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);
		
		input.close(); 
	}
}
