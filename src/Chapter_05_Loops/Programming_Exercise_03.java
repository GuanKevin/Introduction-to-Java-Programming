package Chapter_05_Loops;

/**
 * Conversion from kilograms to pounds
 * Write a program that displays the following table (note that 1 kilogram is 2.2 pounds): 
 * Kilograms 	Pounds 
 * 1 			2.2 
 * 3 			6.6 
 * ... 
 * 197 			433.4 
 * 199 			437.8
 * 
 * 08/19/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_03 
{
	public static void main(String[] args) 
	{
		System.out.printf("%s%10s\n", "Kilograms", "Pounds");
		
		for (int i = 1; i < 99; i += 2)
		{
			System.out.printf("%-13d%.1f\n", i, (i * 2.2));
		}
	}
}
