package Chapter_08_Multidimensional_Arrays;
import java.util.Scanner;

/**
 * Geometry: intersecting point
 * Write a method that returns the intersecting point of two lines. 
 * The intersecting point of the two lines can be found by using the formula shown in Programming Exercise 3.25. 
 * Assume that (x1, y1) and (x2, y2) are the two points on line 1 and (x3, y3) and (x4, y4) are on line 2. 
 * The method header is public static double[] getIntersectingPoint(double[][] points) 
 * The points are stored in a 4-by-2 two-dimensional array points with (points[0][0], points[0][1]) for (x1, y1). 
 * The method returns the intersecting point or null if the two lines are parallel. 
 * Write a program that prompts the user to enter four points and displays the intersecting point.
 * 
 * 10/28/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_31 
{
	public static void main(String[] args) 
	{
        double[][] intersectingPoints = enterPoints();
        double[] point = getIntersectingPoint(intersectingPoints);
        
        if (point == null) 
            System.out.println("The two lines are parallel");
        else
            System.out.println("(x, " + point[0] + ")" + point[1]);
	}
	
	public static double[][] enterPoints()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		double[][] intersectingPoints = new double[4][2];
		
		for (int i = 0; i < intersectingPoints.length; i++)
            for (int j = 0; j < intersectingPoints[i].length; j++)
            	intersectingPoints[i][j] = input.nextDouble();
		
		input.close();
		return intersectingPoints;
	}

	public static double[] getIntersectingPoint(double[][] points) 
	{
		double a = points[0][1] - points[1][1];  
        double b = -(points[0][0] - points[1][0]);
        double c = points[2][1] - points[3][1];
        double d = -(points[2][0] - points[3][0]);
        double e = (points[0][1] - points[1][1]) * points[0][0] - (points[0][0] - points[1][0]) * points[0][1];
        double f = (points[2][1] - points[3][1]) * points[2][0] - (points[2][0] - points[3][0]) * points[2][1];

        double ab_Minus_bc = a * d - b * c;

        if (ab_Minus_bc == 0) 
        	return null;
        
        double[] point = new double[2];
        point[0] = (e * d - b * f) / ab_Minus_bc;
        point[1] = (a * f - e * c) / ab_Minus_bc;

        return point;
    }
}
