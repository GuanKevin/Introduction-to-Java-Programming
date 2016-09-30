package Chapter_07_Single_Dimensional_Arrays;
import java.util.Scanner;

/**
 * Culture: Chinese Zodiac
 * Simplify Listing 3.9 using an array of strings to store the animal names.
 * 
 * 09/27/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_33 
{
	public static void main(String[] args) 
	{
		String[] zodiacArray = {"Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep"};
		System.out.print("Enter a year: ");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Your zodiac sign is the " + zodiacArray[input.nextInt() % 12]);
		input.close();
	}
}
