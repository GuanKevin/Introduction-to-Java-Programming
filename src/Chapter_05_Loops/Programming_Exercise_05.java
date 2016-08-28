package Chapter_05_Loops;

/**
 * Conversion from kilograms to pounds and pounds to kilograms
 * Write a program that displays the following two tables side by side:
 * Kilograms 	Pounds 	| 	Pounds 	Kilograms 
 * 1 			2.2 	| 	20 		9.09 
 * 3 			6.6 	| 	25 		11.36 
 * ... 
 * 197 			433.4 	| 	510 	231.82 
 * 199 			437.8 	| 	515 	234.09
 * 
 * 08/20/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_05 
{
	public static void main(String[] args) 
	{
		System.out.printf("%s %8s %5s %8s %12s \n", "Kilograms", "Pounds", "|", "Pounds", "Kilograms");
		int pounds = 20;
		
		for (int i = 1; i <= 50; i += 2)
		{
			System.out.printf("%-11d %-10.1f %-3s %-9d %.2f \n", i, (i * 2.2), "|", pounds, (pounds / 1.609));
			pounds += 5;
		}
	}
}
