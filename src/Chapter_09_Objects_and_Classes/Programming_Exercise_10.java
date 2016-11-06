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
 * Draw the UML diagram for the class and then implement the class. 
 * Write a test program that prompts the user to enter values for a, b, and c and displays the result based on the discriminant. If the discriminant is positive, display the two roots. 
 * If the discriminant is 0, display the one root. Otherwise, display “The equation has no roots.” 
 * See Programming Exercise 3.1 for sample runs.
 * 
 * 03/01/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_10 
{
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter a, b, c: ");
	    double a = input.nextDouble();
	    double b = input.nextDouble();
	    double c = input.nextDouble();

	    QuadraticEquation equation = new QuadraticEquation(a, b, c);
	    double discriminant = equation.getDiscriminant();

	    if (discriminant < 0) {
	      System.out.println("The equation has no roots");
	    }
	    else if (discriminant == 0)
	    {
	      System.out.println("The root is " + equation.getRoot1());
	    }
	    else // (discriminant >= 0)
	    {
	      System.out.println("The roots are " + equation.getRoot1() 
	        + " and " + equation.getRoot2());
	    }
	    
	    input.close();
	  }
	}

class QuadraticEquation 
{
	private double a;
	private double b;
	private double c;

	public QuadraticEquation(double newA, double newB, double newC) 
	{
	    a = newA;
	    b = newB;
	    c = newC; 
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

  double getDiscriminant() {
    return b * b - 4 * a * c;
  }

  double getRoot1() {
    if (getDiscriminant() < 0)
      return 0;
    else {
      return (-b + getDiscriminant()) / (2 * a);
    }
  }

  double getRoot2() {
    if (getDiscriminant() < 0)
      return 0;
    else {
      return (-b - getDiscriminant()) / (2 * a);
    }
  }
}
