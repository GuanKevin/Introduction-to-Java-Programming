package Chapter_05_Loops;
import java.util.Random;

/**
 * Game: lottery
 * Generate a lottery of a two digit number. 
 * The two digits in the number are distinct. 
 * (Hint: Generate the first digit. Use a loop to continuously generate the second digit until it is different from the first digit.)
 * 
 * 02/15/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_32 {
	public static void main(String[] args) 
	{
		Random rand = new Random();
		int digit1 = rand.nextInt(10);
		int digit2 = rand.nextInt(10);
		StringBuilder lottery = new StringBuilder();
		
		if (digit1 != digit2)
		{
			lottery = lottery.append(digit1).append(digit2);
		}
		else
		{
			while(true)
			{
				digit2 = rand.nextInt(10);
				if (digit1 != digit2)
				{
					lottery = lottery.append(digit1).append(digit2);
					break;
				}
			}
		}
		
		System.out.print("The lottery numbers is: " + lottery);
	}
}
