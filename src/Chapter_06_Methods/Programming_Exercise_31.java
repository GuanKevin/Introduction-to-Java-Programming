package Chapter_06_Methods;
import java.util.Scanner;

/**
 * Financial: credit card number validation
 * Credit card numbers follow certain patterns. 
 * A credit card number must have between 13 and 16 digits. 
 * It must start with:
 * 	 4 for Visa cards
 *   5 for Master cards
 *   37 for American Express cards
 *   6 for Discover cards
 * In 1954, Hans Luhn of IBM proposed an algorithm for validating credit card numbers. 
 * The algorithm is useful to determine whether a card number is entered correctly or whether a credit card is scanned correctly by a scanner. 
 * Credit card numbers are generated following this validity check, commonly known as the Luhn check or the Mod 10 check, 
 * which can be described as follows (for illustration, consider the card number 4388576018402626): (SEE BOOK)
 *
 * 09/09/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_31 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a credit card number: ");
		
		if (isValid(input.nextLong()))
			System.out.print("Credit card number is valid!");
		else
			System.out.print("Credit card number is invalid!");
			
		input.close();		
	}
	
	/**
	 * Return true if the credit card number is valid
	 * 
	 * @param number
	 * @return
	 */
	public static boolean isValid(long number)
	{
		int sumEvenPlaces = 0;
		int sumOddPlaces = 0;
		boolean result = false;
		
		if (getSize(number) >= 13 && getSize(number) <= 16)
			if (prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 6) || prefixMatched(number, 37))
			{
				sumEvenPlaces = sumOfDoubleEvenPlace(number);
				sumOddPlaces = sumOfOddPlace(number);
				result = ((sumEvenPlaces + sumOddPlaces) % 10 == 0);
			}
		
		return result;
	}

	/**
	 * Return sum of odd-place digits in number
	 * 
	 * @param number
	 * @return
	 */
	public static int sumOfOddPlace(long number)
	{
		int sumOddPlaces = 0;
		String numberToString = Long.toString(number);
		
		for (int i = 1; i < numberToString.length(); i += 2)
			sumOddPlaces += getDigit(Character.getNumericValue(numberToString.charAt(i)));
		
		return sumOddPlaces;
	}
	
	
	/**
	 * Get the result from Step 2
	 * 
	 * @param number
	 * @return
	 */
	public static int sumOfDoubleEvenPlace(long number)
	{
		int sumEvenPlaces = 0;
		String numberToString = Long.toString(number);
		
		for (int i = 0; i < numberToString.length(); i += 2)
			sumEvenPlaces += (getDigit(Character.getNumericValue(numberToString.charAt(i)) * 2));
		
		return sumEvenPlaces;
	}
	
	/**
	 * Return this number if it is a single digit, otherwise, 
	 * return the sum of the two digits
	 * 
	 * @param number
	 * @return
	 */
	public static int getDigit(int number)
	{
		if (Integer.toString(number).length() == 1)
			return number;
		else
			return ((number % 10) + 1);
	}
	
	/**
	 * Return true if the digit d is a prefix for number
	 * 
	 * @param numbe
	 * @param d
	 * @return
	 */
	public static boolean prefixMatched(long number, int d)
	{
		int length = new StringBuilder(Integer.toString(d)).length();
		String numberToString = Long.toString(number);
		String dToString = Integer.toString(d);
		
		for (int i = 0; i < length; i++)
			if (numberToString.charAt(i) != dToString.charAt(i))
				return false;
		
		return true;
	}
	
	/**
	 * Return the number of digits in d
	 * 
	 * @param d
	 * @return
	 */
	public static int getSize(long d)
	{
		return Long.toString(d).length();
	}
}
