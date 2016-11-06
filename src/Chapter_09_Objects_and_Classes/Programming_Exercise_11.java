package Chapter_09_Objects_and_Classes;

import java.util.Scanner;

/**
 * Algebra: 2 x 2 linear equations
 * Design a class named LinearEquation for a 2 x 2 system of linear equations:
 * The class contains:
 * Private data fields a, b, c, d, e, and f. 
 * A constructor with the arguments for a, b, c, d, e, and f.
 * Six getter methods for a, b, c, d, e, and f.
 * A method named isSolvable() that returns true if ad - bc is not 0.
 * Methods getX() and getY() that return the solution for the equation. 
 * Write a test program that prompts the user to enter a, b, c, d, e, and f and displays the result. 
 * If ad - bc is 0, report that “The equation has no solution.”
 * 
 * 10/29/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_11 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter linear equations variable: ");
		double[] linearEquationVariables = storeVariables();
		LinearEquation equationOne = new LinearEquation(linearEquationVariables);
		
		if (equationOne.isSolvable())
			System.out.print("The equation has no solution.");
		else
			System.out.print("X is " + equationOne.getX() + " Y is " + equationOne.getY());
	}
	
	/**
	 * Store variables into array
	 * 
	 * @return
	 */
	public static double[] storeVariables()
	{
		Scanner input = new Scanner(System.in);
		double[] linearEquationVariables = new double[6];
		
		for (int i = 0; i < linearEquationVariables.length; i++)
			linearEquationVariables[i] = input.nextDouble();
		
		input.close();
		return linearEquationVariables;
	}
}

class LinearEquation
{
	private double a, b, c, d, e, f;
	
	public LinearEquation(double[] linearEquationVariables)
	{
		a = linearEquationVariables[0];
		b = linearEquationVariables[1];
		c = linearEquationVariables[2];
		d = linearEquationVariables[3];
		e = linearEquationVariables[4];
		f = linearEquationVariables[5];
	}
	
	double getA() 
	{
		return a;
	}

	double getB() 
	{
		return b;
	}
	
	double getC() 
	{
		return c;
	}
  
	double getD() 
	{
		return d;
	}

	double getE() 
	{
		return e;
	}

	double getF() 
	{
		return f;	
	}
	
	boolean isSolvable()
	{
		if ((getA() * getD()) - (getB() * getC()) != 0)
			return true;
		return false;
	}
	
	double getX()
	{
		return ((getE() * getD()) - (getB() * getF())) / ((getA() * getD()) - (getB() * getC()));
	}
	
	double getY()
	{
		return ((getA() * getF()) - (getE() * getC())) / ((getA() * getD()) - (getB() * getC()));
	}
}
