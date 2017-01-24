package Chapter_13_Abstract_Classes_and_Interfaces;

import java.math.BigInteger;

import utilities.Rational;

/**
 * Algebra: vertex form equations
 * The equation of a parabola can be expressed in either standard form (y = ax2 + bx + c) or vertex form (y = a(x - h)2 + k). 
 * Write a program that prompts the user to enter a, b, and c as integers in standard form and displays h and k in the vertex form.
 * 
 * 12/14/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_21
{
	public static void main(String[] args) 
	{
		Rational a = new Rational(BigInteger.ONE, BigInteger.ONE);
		Rational b = new Rational(new BigInteger("3"), BigInteger.ONE);
		Rational c = new Rational(BigInteger.ONE, BigInteger.ONE);
		
		Rational h = new Rational(BigInteger.ZERO.subtract(b.getNumerator()), a.getNumerator().multiply(new BigInteger("2")));	// h = -b / 2a
		Rational k = (a.multiply(h.multiply(h)).add(b.multiply(h))).add(c);														// k = f(h) = a * h^2 + b * h + c
		
		System.out.println("h is " + h + " k is " + k);
	}
}
