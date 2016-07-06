package Chapter_10_Object_Oriented_Thinking;

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
 * Draw the UML diagram for the class and then implement the class. 
 * Write a client program that tests all methods in the class.
 * 
 * 03/10/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_03 
{
	static final int NUMBERTHREE = 3;
	public static void main(String[] args) 
	{
		MyInteger number = new MyInteger();
		System.out.println(number.value + " " 
		+ number.isEven() + " "
		+ number.isOdd() + " "
		+ number.isPrime() + " "
		+ number.isEqual(10));
		
		number = new MyInteger(31);
		System.out.println(number.value + " " 
				+ number.isEven() + " "
				+ number.isOdd() + " "
				+ number.isPrime() + " "
				+ number.isEqual(31));
		
		MyInteger numbertwo = new MyInteger(15);
		System.out.println(numbertwo.value + " " 
				+ numbertwo.isEven() + " "
				+ numbertwo.isOdd() + " "
				+ numbertwo.isPrime() + " "
				+ numbertwo.isEqual(number));
		
		char[] mychararray = {'1', '2', '3', '4', '5'};
		System.out.println(MyInteger.parseInt(mychararray));
		
		String mystring = "54321";
		System.out.println(MyInteger.parseInt(mystring));
		
		MyInteger numberthree = new MyInteger(NUMBERTHREE);
		System.out.println(numberthree.value + " " 
				+ numberthree.isEven() + " "
				+ numberthree.isOdd() + " "
				+ numberthree.isPrime() + " "
				+ numberthree.isEqual(numbertwo));
	}
}
