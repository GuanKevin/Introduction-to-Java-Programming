package Chapter_07_Single_Dimensional_Arrays;

import java.util.Scanner;

/**
 * Algebra: solve quadratic equations
 * Write a method for solving a quadratic equation using the following header: 
 * public static int solveQuadratic(double[] eqn, double[] roots) 
 * The coefficients of a quadratic equation ax2 + bx + c = 0 are passed to the array eqn and the real roots are stored in roots. 
 * The method returns the number of real roots. 
 * See Programming Exercise 3.1 on how to solve a quadratic equation. 
 * Write a program that prompts the user to enter values for a, b, and c and displays the number of real roots and all real roots.
 * 
 * 09/25/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_25 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Quadratic equation ax^2 + bx + c = 0");
		double[] quadraticArray = new double[3];
		enterValues(quadraticArray);
		double[] storeRoots = new double[2];
		displayRoots(solveQuadratic(quadraticArray, storeRoots), storeRoots);		
		
		input.close();
	}
	
	/**
	 * Dsplays the number of real roots and all real roots.
	 * 
	 * @param numRoots
	 * @param storeRoots
	 */
	public static void displayRoots(int numRoots, double[] storeRoots)
	{
		if (numRoots > 1)
			System.out.print("Number of real roots: " + numRoots 
					+ "\nRoots are " + storeRoots[0] + " and " + storeRoots[1]);
		else if (numRoots > 0)
			System.out.print("Number of real roots: " + numRoots 
					+ "\nRoots are " + storeRoots[0]);
		else 
			System.out.print("Number of real roots: " + numRoots);

	}
	
	/**
	 * Store value a, b, and c for the quadratic equation
	 * 
	 * @param quadraticArray
	 */
	public static void enterValues(double[] quadraticArray)
	{
		System.out.print("Enter the values for a, b, and c: ");
		
		for (int i = 0; i < 3; i++)
			quadraticArray[i] = input.nextDouble();
	}
	
	/**
	 * The method returns the number of real roots. 
	 * 
	 * @param eqn
	 * @param roots
	 * @return
	 */
	public static int solveQuadratic(double[] eqn, double[] roots) 
	{
		double a, b, c, discriminant;
		System.out.println("eqn: " + eqn[1]);
		a = eqn[0];
		b = eqn[1];
		c = eqn[2];
		discriminant = Math.pow((b * b) - (4 * a * c), 0.5);

		if (discriminant > 0)
		{
			System.out.print((-b + discriminant) / (2 * a));
			roots[0] = (-b + discriminant) / (2 * a);
			roots[1] = (-b - discriminant) / (2 * a);
			return 2;
		}
		else if (discriminant == 0)
		{
			roots[0] = (-b - discriminant) / (2 * a); 
			return 1;
		}
		else
			return 0;
	}
}
