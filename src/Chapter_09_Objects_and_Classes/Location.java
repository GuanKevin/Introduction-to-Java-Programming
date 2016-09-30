package Chapter_09_Objects_and_Classes;

import java.util.Random;

public class Location 
{
	public static int row, column = 0;
	public static  double maxValue = 0;
	public static double[][] values = null;
	
	Location(int row, int column)
	{
		values = new double[row][column];
		insert();
		display();
		search();
	}
	
	public static void insert()
	{
		Random randNumber = new Random();
		
		for (int i = 0; i < values.length; i++)
			for (int j = 0; j < values[i].length; j++)
				values[i][j] = randNumber.nextInt(100); 
	}
	
	public static void display()
	{
		Random randNumber = new Random();
		
		for (int i = 0; i < values.length; i++)
		{
			for (int j = 0; j < values[i].length; j++)
				System.out.print(values[i][j] + " ");
			System.out.println();
		}
	}
	
	public static void search()
	{
		for (int i = 0; i < values.length; i++)
			for (int j = 0; j < values[i].length; j++)
				if(values[i][j] > maxValue)
				{
					row = i;
					column = j;
					maxValue = values[i][j];
				}
	}
}
