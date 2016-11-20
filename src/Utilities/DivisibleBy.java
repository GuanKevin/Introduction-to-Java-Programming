package Utilities;

public class DivisibleBy 
{
	private int divisorone;
	private int divisortwo;
	int size = 50;
	private int smallest;
	
	public DivisibleBy()
	{
		divisorone = 2;
		divisortwo = 3;
		checkSmallest();
	}
	
	public DivisibleBy(int divisorone, int divisortwo)
	{
		this.divisorone = divisorone;
		this.divisortwo = divisortwo;
		checkSmallest();
	}
	
	public void checkSmallest()
	{
		if (divisorone < divisortwo)
		{
			smallest = divisorone;
		}
		else
		{
			smallest = divisortwo;
		}
	}
	
	public void printDivisibleBy()
	{
		int counter = 0;
		int number = smallest;
		
		while(counter < 50)
		{
			if ((number % divisorone == 0) || (number % divisortwo == 0))
			{
				counter++;
				if (counter % 10 == 0)
				{
					System.out.println(number + " ");
				}
				else
					System.out.print(number + " ");
			}
			number++;
		}
	}
}
