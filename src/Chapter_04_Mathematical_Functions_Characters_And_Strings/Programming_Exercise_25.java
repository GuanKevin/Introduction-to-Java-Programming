package Chapter_04_Mathematical_Functions_Characters_And_Strings;

import java.util.Random;

/**
 * Generate vehicle plate numbers
 * Assume a vehicle plate number consists of three uppercase letters followed by four digits. 
 * Write a program to generate a plate number.
 * 
 * 02/14/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_25 
{
	public static void main(String[] args) 
	{
		//A - Z 
		//length 26
		Random rand = new Random();
		char rl1 = (char) (rand.nextInt(26) + 'A');
		char rl2 = (char) (rand.nextInt(26) + 'A');
		char rl3 = (char) (rand.nextInt(26) + 'A');
		//Bound of 9000 is between 0 to 8999
		//3456 + 1000
		//0 + 1000 = 1000 -> minimum of four digits
		int number = rand.nextInt(9000) + 1000;
		
		StringBuilder platenumber = new StringBuilder();
		platenumber = platenumber.append(rl1).append(rl2).append(rl3).append(number);
		
		System.out.print(platenumber);
	}

}