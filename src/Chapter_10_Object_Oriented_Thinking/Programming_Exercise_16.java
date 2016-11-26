package Chapter_10_Object_Oriented_Thinking;

import java.math.BigInteger;

/**
 * Divisible by 2 or 3
 * Find the first ten numbers with 50 decimal digits that are divisible by 2 or 3.
 * 
 * 11/25/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_16 
{
	public static void main(String[] args) 
	{
		BigInteger bigNum = new BigInteger("10000000000000000000000000000000000000000000000000");
		
		int count = 1;
		    
		while (count <= 10) 
		{
			if (bigNum.remainder(new BigInteger("2")).equals(BigInteger.ZERO) || bigNum.divide(new BigInteger("3")).equals(BigInteger.ZERO)) 
			{
				System.out.println(bigNum);
		        count++;
			}
			
			bigNum = bigNum.add(BigInteger.ONE);
		}
	}
}
