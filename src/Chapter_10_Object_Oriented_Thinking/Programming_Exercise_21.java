package Chapter_10_Object_Oriented_Thinking;

import java.math.BigInteger;

/**
 * Divisible by 5 or 6
 * Find the first ten numbers greater than Long.MAX_VALUE that are divisible by 5 or 6.
 * 
 * 11/26/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_21 
{
	public static void main(String[] args) 
	{
		BigInteger bigNum = new BigInteger(Long.MAX_VALUE + "");
		bigNum = bigNum.add(BigInteger.ONE);
		
		int count = 1;
		    
		while (count <= 10) 
		{
			if (bigNum.remainder(new BigInteger("5")).equals(BigInteger.ZERO) || bigNum.remainder(new BigInteger("6")).equals(BigInteger.ZERO)) 
			{
				System.out.println(bigNum);
		        count++;
			}
			
			bigNum = bigNum.add(BigInteger.ONE);
		}
	}
}
