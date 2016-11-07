package Chapter_09_Objects_and_Classes;

import java.util.Scanner;

/**
 * Algebra: quadratic equations
 * Design a class named QuadraticEquation for a quadratic equation ax2 + bx + x = 0. The class contains:
 * Private data fields a, b, and c that represent three coefficients.
 * A constructor for the arguments for a, b, and c.
 * Three getter methods for a, b, and c.
 * A method named getDiscriminant() that returns the discriminant, which is b2 - 4ac. 
 * The methods named getRoot1() and getRoot2() for returning two roots of the equation
 * These methods are useful only if the discriminant is nonnegative. 
 * Let these methods return 0 if the discriminant is negative. 
 * Write a test program that prompts the user to enter values for a, b, and c and displays the result based on the discriminant. 
 * If the discriminant is positive, display the two roots. 
 * If the discriminant is 0, display the one root. Otherwise, display “The equation has no roots.” 
 * See Programming Exercise 3.1 for sample runs.
 * 
 * 11/07/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_10 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b and c: ");
		
		QuadraticEquation myEquation = new QuadraticEquation(input.nextDouble(), input.nextDouble(), input.nextDouble());
		
		if (myEquation.getDiscriminant() > 0)
			System.out.println("Root 1: " + myEquation.getRoot1() +
					"\nRoot 2: " + myEquation.getRoot2());
		if (myEquation.getDiscriminant() == 0)
			System.out.println("Root 1: " + myEquation.getRoot1());
		if (myEquation.getDiscriminant() < 0)
			System.out.println("The equation has no roots.");
		
		input.close();
	}
}

class QuadraticEquation
{
	private double a, b, c;

	public QuadraticEquation(double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}	
	
	public double getDiscriminant()
	{
		return (Math.pow(b, 2) - (4 * a * c));
	}
	
	public double getRoot1()
	{
		if (getDiscriminant() >= 0)
			return (-b + getDiscriminant()) / (2 * a);
		else
			return 0;
	}
	
	public double getRoot2()
	{
		if (getDiscriminant() >= 0)
			return (-b - getDiscriminant()) / (2 * a);
		return 0;
	}
}
