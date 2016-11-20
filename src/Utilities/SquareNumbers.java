package Utilities;

public class SquareNumbers 
{
	long number;
	
	public SquareNumbers()
	{
		number = Long.MAX_VALUE;
	}
	
	public SquareNumbers(Long number)
	{
		this.number = number;
	}
	
	public void squareNumberGreaterThan(int size)
	{
		long mynumber = (long) Math.sqrt(number);
		
		for (int i = 0; i < size; i++)
		{
			System.out.printf("%.0f \n",Math.pow(++mynumber, 2));
		}
	}
}
