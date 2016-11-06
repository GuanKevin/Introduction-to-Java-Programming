package Chapter_08_Multidimensional_Arrays;
import java.util.Scanner;

/**
 * Algebra: solve linear equations
 * Write a method that solves the following 2 x 2 system of linear equations:
 * The method header is public static double[] linearEquation(double[][] a, double[] b) 
 * The method returns null if a00a11 - a01a10 is 0. 
 * Write a test program that prompts the user to enter a00, a01, a10, a11, b0, and b1, and displays the result. 
 * If a00a11 - a01a10 is 0, report that “The equation has no solution.”
 * 
 * 10/28/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_30 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a00, a01, a10, a11, b0, b1: ");
		double[][] a = new double[2][2];
		double[] b = new double[2];
		a[0][0] = input.nextDouble();
		a[0][1] = input.nextDouble();
		a[1][0] = input.nextDouble();
		a[1][1] = input.nextDouble();
		b[0] = input.nextDouble();
		b[1] = input.nextDouble();

	    double[] result = linearEquation(a, b);
		        
	    if (result == null) 
	    	System.out.println("The equation has no solution");
	    else
	    	System.out.println("x is " + result[0] + " and y is " +  result[1]);
		    
	    input.close();
	}
	
	public static double[] linearEquation(double[][] a, double[] b) 
	{
		double detA = a[0][0] * a[1][1] - a[0][1] * a[1][0];
		    
		if (detA == 0) 
		    return null;
		else 
		{
			double[] result = new double[2];
			result[0] = (b[0] * a[1][1] - b[1] * a[0][1]) / detA;
			result[1] = (b[1] * a[0][0] - b[0] * a[1][0]) / detA;
		    
			return result;
	    }
	}
}
