package Chapter_02_Elementary_Programming;
import java.util.Scanner;

/**
 * Science: calculating energy 
 * Write a program that calculates the energy needed to heat water from an initial temperature to a final temperature. 
 * Your program should prompt the user to enter the amount of water in kilograms and the initial
 * and final temperatures of the water.
 * 
 * 02/03/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_10 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount of water in kilograms: ");
		double waterkg = input.nextDouble();
		System.out.print("Enter the initial temperature ");
		double initialtemperature = input.nextDouble();
		System.out.print("Enter the final temperature ");
		double finaltemperature = input.nextDouble();
		
		//Formula to compute the energy
		double energy = waterkg * (finaltemperature - initialtemperature) * 4184;
		
		System.out.print("The energy needed is " + energy);
		
		input.close();
	}
}
