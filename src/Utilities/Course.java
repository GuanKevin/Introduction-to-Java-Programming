package Utilities;

public class Course 
{
	private String courseName;
	private int numberOfStudents;
	private int studentCounter = 0;
	private String[] students = new String[numberOfStudents];
	private final static int DEFAULT_CAPACITY = 4;
	private final static String DEFAULT_NAME = "Intro to Java";
	
	public Course(String courseName)
	{
		this (DEFAULT_NAME, DEFAULT_CAPACITY);
		this.courseName = courseName; 
	}
	
	public Course(String courseName, int numberOfStudents)
	{
		this.courseName = courseName;
		this.numberOfStudents = numberOfStudents;
	}
	
	public void addStudent(String student)
	{		
		if (studentCounter >= students.length)
		{
			String[] temp = new String[numberOfStudents * 2];
			System.arraycopy(students, 0, temp, 0, students.length);
			students = temp;
		}
		
		students[studentCounter++] = student;
	}
	
	public String[] getStudents()
	{
		return students;
	}
	
	public int getNumberOfStudents()
	{
		return studentCounter--;
	}
	
	public String getCourseName()
	{
		return courseName;
	}
	
	public void clear()
	{
		students = new String[getNumberOfStudents()];
	}
	
	public void dropStudent(String student)
	{
		for (int i = 0; i < numberOfStudents; i++)
		{
			if (students[i] == null)
			{
				break;
			}
			if (students[i].equals(student))
			{
				if (i == 0)
				{
					String[] temp = new String[numberOfStudents];
					System.arraycopy(students, 1, temp, 0, studentCounter);
					students = temp;
				}
				else if (i == --numberOfStudents)
				{
					String[] temp = new String[numberOfStudents];
					System.arraycopy(students, 1, temp, 0, studentCounter - 1);
					students = temp;
				}
				else
				{
					String[] temp = new String[numberOfStudents];
					System.arraycopy(students, 1, temp, 0, i - 1);
					System.arraycopy(students, i + 1, temp, 0, studentCounter);
					students = temp;
				}
			}
		}
	}
}
