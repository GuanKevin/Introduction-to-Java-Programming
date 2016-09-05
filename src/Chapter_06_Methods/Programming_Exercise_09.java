package Chapter_06_Methods;
import java.util.Scanner;

/**
 * Conversions between feet and meters
 * Write a class that contains the following two methods:
 * Convert from feet to meters  
 * public static double footToMeter(double foot)
 * Convert from meters to feet 
 * public static double meterToFoot(double meter) 
 * The formula for the conversion is: 
 * meter = 0.305 * foot 
 * foot = 3.279 * meter
 *
 * 08/29/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_09 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size in feet(s): ");
		double feet = input.nextDouble();
		System.out.print("Enter size in meter(s): ");
		double meter = input.nextDouble();
		
		System.out.println("Foot to meter: " + footToMeter(feet));
		System.out.println("Meter to foot: " + meterToFoot(meter));
		
		input.close();		
	}
	
	/**
	 * Convert from feet to meters
	 * 
	 * @param foot
	 * @return
	 */
	public static double footToMeter(double foot)
	{
		return (0.305 * foot);
	}
	
	/**
	 * Convert from meters to feet 
	 * 
	 * @param meter
	 * @return
	 */
	public static double meterToFoot(double meter) 
	{
		return (3.279 * meter);
	}
}
