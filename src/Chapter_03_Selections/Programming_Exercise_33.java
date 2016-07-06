package Chapter_03_Selections;
import java.util.Scanner;

/**
 * Financial: compare costs
 * Suppose you shop for rice in two different packages. 
 * You would like to write a program to compare the cost. 
 * The program prompts the user to enter the weight and price of the each package and displays the one with the better price.
 * 
 * 02/
 * @author kevgu
 *
 */

public class Programming_Exercise_33 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the weight of package A: ");
		double weighta = input.nextDouble();
		System.out.print("Enter the price of package A: ");
		double pricea = input.nextDouble();
		
		System.out.print("Enter the weight of package B: ");
		double weightb = input.nextDouble();
		System.out.print("Enter the price of package B: ");
		double priceb = input.nextDouble();
		
		if ((weighta * pricea) < (weightb * priceb))
		{
			System.out.println("Package A cost: $" + (weighta * pricea));
			System.out.println("Package A is cheaper by: $" + ((weightb * priceb) - (weighta * pricea)));
		}
		else
		{
			System.out.println("Package B cost: $" + (weightb * priceb));
			System.out.println("Package B is cheaper by: $" + ((weighta * pricea) - (weightb * priceb)));
		}
		
		
		input.close();
	}

}
