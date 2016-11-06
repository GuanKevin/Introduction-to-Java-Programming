package Utilities;

import java.util.Random;

public class generateArrays 
{
	public int[] arrayOfIntegers()
	{
		Random randomInteger = new Random();
		int[] array = new int[10];
		
		for (int i = 0; i < 10; i++)
			array[i] = randomInteger.nextInt(10);
		
		return array;
	}
}
