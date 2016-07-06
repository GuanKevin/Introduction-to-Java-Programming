package Chapter_10_Object_Oriented_Thinking;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Large prime numbers
 * Write a program that finds five prime numbers larger than Long.MAX_VALUE.
 * 
 * 03/10/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_18 
{
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println(Long.MAX_VALUE);
		String longnumber = Long.toString(Long.MAX_VALUE);
		System.out.println(longnumber);
		BigInteger mylongnum = new BigInteger(longnumber);
		System.out.println(mylongnum);
		
		findLargePrimes(5);
	}
	
	public static void findLargePrimes(int counter)
	{
		BigInteger largeNum = new BigInteger(Long.toString(Long.MAX_VALUE));
		BigInteger one = new BigInteger("1");
		largeNum = largeNum.add(one);
		
		while(counter > 0)
		{		
			for (BigInteger i = new BigInteger("1"); i.intValue() < largeNum.intValue(); i.add(one))
			{
				
			}
		}
	}
}
