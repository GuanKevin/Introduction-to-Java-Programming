package Chapter_10_Object_Oriented_Thinking;
import utilities.MyInteger;

/**
 * The MyInteger class
 * Design a class named MyInteger. 
 * The class contains:
 * An int data field named value that stores the int value represented by this object. 
 * A constructor that creates a MyInteger object for the specified int value. 
 * A getter method that returns the int value. 
 * The methods isEven(), isOdd(), and isPrime() that return true if the value in this object is even, odd, or prime, respectively. 
 * The static methods isEven(int), isOdd(int), and isPrime(int) that return true if the specified value is even, odd, or prime, respectively. 
 * The static methods isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger) that return true if the specified value is even, odd, or prime, respectively.
 * The methods equals(int) and equals(MyInteger) that return true if the value in this object is equal to the specified value. 
 * A static method parseInt(char[]) that converts an array of numeric characters to an int value. 
 * A static method parseInt(String) that converts a string into an int value. 
 * Write a client program that tests all methods in the class.
 * 
 * 11/21/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_03 
{
	public static void main(String[] args) 
	{
		MyInteger myInteger = new MyInteger(100);
		System.out.println((myInteger.isOdd()) ? "It is an odd number!" : "It is not an odd number!");
		System.out.println((MyInteger.isEven(myInteger)) ? "It is an even number!" : "It is not an even number!");
	}
}
