package Utilities;

public class primeFactors 
{
	int number;
	StackOfIntegers soi;
	
	public primeFactors()
	{
		number = 120;
		soi = new StackOfIntegers();
		findPrimeFactors();
	}
	
	public primeFactors(int number)
	{
		this.number = number;
		soi = new StackOfIntegers();
		findPrimeFactors();
	}
	
	public void printReversePrimeFactors()
	{
		while (soi.getSize() != 0)
		{
			System.out.print(soi.pop() + " ");
		}
	}
	
	public void findPrimeFactors()
	{
		System.out.print("The prime factors of " + number + " is: ");
		int counter = 2;
		
		while(true)
		{
			if ((number % counter) == 0)
			{
				soi.push(counter);
				number /= counter;
			}
			else if (number == 1)
			{
				break;
			}
			else
			{
				++counter;
			}
		}
	}
}
