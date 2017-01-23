package Chapter_13_Abstract_Classes_and_Interfaces;

import java.math.BigInteger;

import utilities.Rational;

/**
 * Use BigInteger for the Rational class
 * Redesign and implement the Rational class in Listing 13.13 using BigInteger for the numerator and denominator.
 * 
 * 12/14/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_15
{
	public static void main(String[] args) 
	{
		Rational r1 = new Rational(new BigInteger("9457734514"), new BigInteger("131340"));
		Rational r2 = new Rational(new BigInteger("2456867891"), new BigInteger("4234257"));
		
		System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
		System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
		System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
		System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
		System.out.println(r2 + " is " + r2.doubleValue());
	}
}
