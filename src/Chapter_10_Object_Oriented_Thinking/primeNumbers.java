package Chapter_10_Object_Oriented_Thinking;

public class primeNumbers 
{
	int number;
	StackOfIntegers soi;
	
	public primeNumbers()
	{
		number = 120;
		soi = new StackOfIntegers();
		findPrimeNumbers();
	}
	
	public primeNumbers(int number)
	{
		this.number = number;
		soi = new StackOfIntegers();
		findPrimeNumbers();
	}
	
	public void displayPrimeNumbers()
	{
		int counter = 0;
		while (soi.getSize() != 0)
		{
			++counter;
			if ((counter % 10) == 0)
			{
				System.out.println(soi.pop() + " ");
			}
			System.out.print(soi.pop() + " ");
		}
	}
	
	public void findPrimeNumbers()
	{
		boolean isPrime = true;
		
		for (int i = 2; i <= number; i++)
		{
			for (int j = 2; j < i; j++)
			{
				if ((i % j) == 0)
				{
					isPrime = false;
					break;
				}
			}
			if (isPrime == true)
			{
				soi.push(i);
			}
			isPrime = true;
		}
	}
}
