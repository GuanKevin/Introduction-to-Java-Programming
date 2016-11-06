package Chapter_08_Multidimensional_Arrays;
import java.util.Scanner;

/**
 * Geometry: rightmost lowest point
 * In computational geometry, often you need to find the rightmost lowest point in a set of points. 
 * Write the following method that returns the rightmost lowest point in a set of points.
 * public static double[]
 * getRightmostLowestPoint(double[][] points)
 * Write a test program that prompts the user to enter the coordinates of six points and displays the rightmost lowest point.
 * 
 * 10/28/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_34 
{
	public static void main(String[] args) 
	{
	    double[][] p = enterPoints();
	    double[] point = getRightmostLowestPoint(p);
	    
	    System.out.println("The rightmost lowest point is (" + point[0] + ", " + point[1] + ")");
	  }
	
	public static double[][] enterPoints()
	{
		Scanner input = new Scanner(System.in);
		double[][] p = new double[6][2];    
	    System.out.print("Enter " + p.length + " points: ");
	    for (int i = 0; i < p.length; i++)
	      for (int j = 0; j < p[i].length; j++) 
	        p[i][j] = input.nextDouble();
	    
	    input.close();
	    return p;
	}
	  
	  public static double[] getRightmostLowestPoint(double[][] p) 
	  {
		  int rightMostIndex = 0;
		  double rightMostX = p[0][0];
		  double rightMostY = p[0][1];
	    
		  for (int i = 1; i < p.length; i++) 
		  {
			  if (rightMostY > p[i][1]) 
			  {
				  rightMostY = p[i][1];
				  rightMostIndex = i;
			  }
			  else if (rightMostY == p[i][1] && rightMostX < p[i][0])
			  {
				  rightMostX = p[i][0];
				  rightMostIndex = i;
			  }
	    }
		  return new double[]{p[rightMostIndex][0], p[rightMostIndex][1]};
	  }
}
