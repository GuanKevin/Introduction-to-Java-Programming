package Chapter_04_Mathematical_Functions_Characters_And_Strings;
import java.util.Scanner;

/**
 * Student major and status
 * Write a program that prompts the user to enter two characters and displays the major and status represented in the characters. 
 * The first character indicates the major and the second is number character 1, 2, 3, 4, 
 * which indicates whether a student is a freshman, sophomore, junior, or senior.
 * Suppose the following characters are used to denote the majors: 
 * M: Mathematics 
 * C: Computer Science 
 * I: Information Technology
 * 
 * 02/14/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_18 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two characters to display your major and status: ");
		String studentms = input.next();
		
		//major -> M C I
		//Status -> 1 2 3 4
		//M2
		char major = studentms.charAt(0);
		int status = Character.getNumericValue(studentms.charAt(1));
		
		if (major == 'M')
		{
			if (status == 1)
			{
				System.out.print("You are a Mathematics major in your freshman year!");
			}
			else if (status == 2)
			{
				System.out.print("You are a Mathematics major in your sophmore year!");
			}
			else if (status == 3)
			{
				System.out.print("You are a Mathematics major in your junior year!");
			}
			else if (status == 4)
			{
				System.out.print("You are a Mathematics major in your senior year!");
			}
			else
			{
				System.out.print("You are a Mathematics major, your status is unknown!");
			}
		}
		else if (major == 'C')
		{
			if (status == 1)
			{
				System.out.print("You are a Computer Science major in your freshman year!");
			}
			else if (status == 2)
			{
				System.out.print("You are a Computer Science major in your sophmore year!");
			}
			else if (status == 3)
			{
				System.out.print("You are a Computer Science major in your junior year!");
			}
			else if (status == 4)
			{
				System.out.print("You are a Computer Science major in your senior year!");
			}
			else
			{
				System.out.print("You are a Computer Science major, your status is unknown!");
			}
		}
		else if (major == 'I')
		{
			if (status == 1)
			{
				System.out.print("You are a Information Technology major in your freshman year!");
			}
			else if (status == 2)
			{
				System.out.print("You are a Information Technology major in your sophmore year!");
			}
			else if (status == 3)
			{
				System.out.print("You are a Information Technology major in your junior year!");
			}
			else if (status == 4)
			{
				System.out.print("You are a Information Technology major in your senior year!");
			}
			else
			{
				System.out.print("You are a Information Technology major, your status is unknown!");
			}
		}
		else
		{
			System.out.print("Your major is unknown!");
		}
		
		input.close();
	}

}
