package Chapter_06_Methods;

/**
 * Sum series
 * Write a method to compute the following series: (See Book)
 *
 * 08/30/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_13 
{
	public static void main(String[] args) 
	{
		sumSeriesTable();
	}
	
	/**
	 * Sum the series and display each n
	 * on the table
	 */
	public static void sumSeriesTable()
	{
		System.out.printf("%-3s %s \n%s \n", "i", "m(i)", "--------");
		double sumSeries = 0;
		
		for (int i = 1; i <= 7; i++)
		{
			for (int j = 1; j <= i; j++)
				sumSeries += (j / (j + 1.0));
			System.out.printf("%-3d %.4f \n", i, sumSeries);
			sumSeries = 0;
		}
	}
}
