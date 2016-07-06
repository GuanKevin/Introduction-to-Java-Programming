package Chapter_07_Single_Dimensional_Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Random number chooser
 * Write a method that returns a random number between 1 and 54, excluding the numbers passed in the argument. 
 * The method header is specified as follows: 
 * public static int getRandom(int... numbers)
 * 
 * 02/18/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_13 
{	
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter size of the array: ");
		int size = input.nextInt();
		int[] myarray = new int[size];
		insertNumbers(myarray);
		System.out.print("Random distinct number: " + getRandom(myarray));
	}	
	
	/**
	 * It returns a number not inside the array. There will be no duplicate number.
	 * @param numbers
	 * @return
	 */
	public static int getRandom(int... numbers)
	{
		Random rand = new Random();
		int randomnumber = rand.nextInt(54) + 1;	//Bound of 54 is numbers between 0 to 53 --> + 1 = 1 to 54
		boolean foundnumber = true;
		
		/**
		 * Keep looping the for loop until I do not have a duplicate random number
		 */
		while (foundnumber)
		{
			/**
			 * Find a number not in the array
			 */
			for (int i = 0; i < numbers.length; i++)
			{
				/**
				 * Compares if randomly generated number is the same as the number in my array
				 * If it is the same, randomly generate a new random number and get out of the for loop
				 */
				if (numbers[i] == randomnumber)
				{
					randomnumber = rand.nextInt(54) + 1;
					break;
				}
				/**
				 * If the very last index is not the same number as the randomly generated number
				 * Get out of the loop, and return it back to the user
				 */
				if ((numbers.length - 1) == i)
				{
					foundnumber = false;
				}
			}
		}
		return randomnumber;		
	}
	
	/**
	 * Ask user to insert numbers up to the array length
	 * @param myarray
	 */
	public static void insertNumbers(int... myarray)
	{
		System.out.print("Enter " + myarray.length + " numbers: ");
		for (int i = 0; i < myarray.length; i++)
		{
			myarray[i] = input.nextInt();
		}
	}

}
