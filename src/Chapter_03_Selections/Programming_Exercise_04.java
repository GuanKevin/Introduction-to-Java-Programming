package Chapter_03_Selections;

/**
 * Random month
 * Write a program that randomly generates an integer between 1 and 12 and displays the English month name 
 * January, February, …, December for the number 1, 2, …, 12, accordingly.
 * 
 * 08/02/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_04 
{
	public static void main(String[] args) 
	{
		int month = (int) (Math.random() * 12 + 1);
		System.out.println("month = " + month);
		
		if (month == 1)
		{
			System.out.print("January");
		}
		else if (month == 2)
		{
			System.out.print("February");
		}
		else if (month == 3)
		{
			System.out.print("March");
		}
		else if (month == 4)
		{
			System.out.print("April");
		}
		else if (month == 5)
		{
			System.out.print("May");
		}
		else if (month == 6)
		{
			System.out.print("June");
		}
		else if (month == 7)
		{
			System.out.print("July");
		}
		else if (month == 8)
		{
			System.out.print("August");
		}
		else if (month == 9)
		{
			System.out.print("September");
		}
		else if (month == 10)
		{
			System.out.print("October");
		}
		else if (month == 11)
		{
			System.out.print("November");
		}
		else
		{
			System.out.print("December");
		}
	}
}
