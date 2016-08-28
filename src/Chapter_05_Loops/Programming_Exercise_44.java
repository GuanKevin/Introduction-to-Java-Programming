package Chapter_05_Loops;
import java.util.Scanner;

/**
 * Computer architecture: bit-level operations
 * A short value is stored in 16 bits. 
 * Write a program that prompts the user to enter a short integer and displays the 16 bits for the integer.
 * 
 * 08/27/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_44 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		
		int number = input.nextInt();

        System.out.print("The bits are ");

        for (int i = 15; i >= 0; i--) 
        {
            System.out.print((number >> i) & 1);
        }
        
		input.close();
	}
}
