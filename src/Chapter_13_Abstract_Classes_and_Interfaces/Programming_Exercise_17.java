package Chapter_13_Abstract_Classes_and_Interfaces;

import utilities.Complex;

/**
 * Math: The Complex class
 * A complex number is a number in the form a + bi, where a and b are real numbers and i is root(-1). 
 * The numbers a and b are known as the real part and imaginary part of the complex number, respectively. 
 * You can perform addition, subtraction, multiplication, and division for complex numbers using the following formulas:
 * 
 * 12/14/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_17
{
	public static void main(String[] args) 
	{
		Complex num1 = new Complex(3.5, 5.5);
		Complex num2 = new Complex(-3.5, 1);
		
		System.out.println(num1.toString() + " + " + num2.toString() + " = " + num1.add(num2));
		System.out.println(num1.toString() + " - " + num2.toString() + " = " + num1.subtract(num2));
		System.out.println(num1.toString() + " * " + num2.toString() + " = " + num1.multiply(num2));
		System.out.println(num1.toString() + " / " + num2.toString() + " = " + num1.divide(num2));
		System.out.println(num1.toString() + " = " + num1.abs());
	}
}
