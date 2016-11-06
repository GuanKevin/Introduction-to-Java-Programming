package Chapter_08_Multidimensional_Arrays;
import java.util.Scanner;

/**
 * Central city
 * Given a set of cities, the central city is the city that has the shortest total distance to all other cities. 
 * Write a program that prompts the user to enter the number of the cities and the locations of the cities (coordinates), 
 * and finds the central city and its total distance to all other cities.
 * 
 * 10/26/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_21 
{    
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
    {
        System.out.print("Enter the number of cities: ");
        double[][] coordinates = new double[input.nextInt()][3];

        enterPoints(coordinates);
        double[] centralCity = getCentralPoint(coordinates);

        System.out.printf("The central city is at (%.1f, %.1f)\nThe total distance to all other cities is %.2f", centralCity[0], centralCity[1], centralCity[2]);
        
        input.close();
    }

	/**
	 * Ask the user to enter the coordinates for n amount of cities
	 * 
	 * @param coordinates
	 */
	public static void enterPoints(double[][] coordinates)
	{
		System.out.print("Enter the coordinates of the cities:\n");
		
        for (int i = 0; i < coordinates.length; i++)
            for (int j = 0; j < 2; j++)
                coordinates[i][j] = input.nextDouble();
	}

    public static double distance(double x1, double y1, double x2, double y2) 
    {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    /**
     * Grab the dstiance and store it in the 2nd column
     * 
     * @param coordinates
     * @return
     */
    public static double[] getCentralPoint(double[][] coordinates) 
    {	
        for (int i = 0; i < coordinates.length; i++) 
            for (int j = 0; j < coordinates.length; j++) 
                if (j != i) 
                    coordinates[i][2] += distance(coordinates[i][0], coordinates[i][1], coordinates[j][0], coordinates[j][1]);

        double[] centralCity = coordinates[0];
        
        for (int i = 1; i < coordinates.length; i++)
            if (coordinates[i][2] < centralCity[2]) 
                centralCity = coordinates[i];

        return centralCity;
    }
}
