package Chapter_11_Inheritence_and_Polymorphism;
import java.util.Scanner;

/**
 * The Person, Student, Employee, Faculty, and Staff classes
 * Design a class named Person and its two subclasses named Student and Employee. 
 * Make Faculty and Staff subclasses of Employee. A person has a name, address, phone number, and email address. 
 * A student has a class status (freshman, sophomore, junior, or senior). 
 * Define the status as a constant. 
 * An employee has an office, salary, and date hired. 
 * Use the MyDate class defined in Programming Exercise 10.14 to create an object for date hired. 
 * A faculty member has office hours and a rank. 
 * A staff member has a title. 
 * Override the toString method in each class to display the class name and the person’s name. 
 * Write a test program that creates a Person, Student, Employee, Faculty, and Staff, and invokes their toString() methods.
 * 
 * 03/15/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_02 
{
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		Person Kevin = new Person();
		System.out.println(Kevin.toString());
		Kevin = new Student();
		System.out.println(Kevin.toString());
		Kevin = new Employee();
		System.out.println(Kevin.toString());
		Kevin = new Faculty();
		System.out.println(Kevin.toString());
		Kevin = new Staff();
		System.out.println(Kevin.toString());
	}
}
