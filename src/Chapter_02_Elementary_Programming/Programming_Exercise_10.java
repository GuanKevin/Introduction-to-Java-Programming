package Chapter_02_Elementary_Programming;

import java.util.Scanner;

/**
 * Science: calculating energy 
 * Write a program that calculates the energy needed to heat water from an initial temperature to a final temperature. 
 * Your program should prompt the user to enter the amount of water in kilograms and the initial
 * and final temperatures of the water.
 * The formula to compute the energy is 
 * Q = M * (finalTemperature – initialTemperature) * 4184 
 * where M is the weight of water in kilograms, temperatures are in degrees Celsius, and energy Q is measured in joules.
 * 
 * 07/31/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_10 
{
	public static void main(String[] args) 
	{
		double Q, M, finalTemperature, initialTemperature;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the weight of water in kg, initial and the final temperature: ");
		M = input.nextDouble();
		initialTemperature = input.nextDouble();
		finalTemperature = input.nextDouble();
		Q = M * (finalTemperature - initialTemperature) * 4184;
		System.out.print("The energy needed is " + Q);
		
		input.close();
	}
}
