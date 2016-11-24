package Utilities;

public class Course 
{
	private String courseName;
	private String[] students = new String[3];
	private int numberOfStudents;

	public Course(String courseName) 
	{
		this.courseName = courseName;
	}

	public void addStudent(String student) 
	{
		if (numberOfStudents >= students.length)
		{
			String[] temp = new String[students.length * 2];
			System.arraycopy(student, 0, temp, 0, students.length);
			students = temp;
		}
		
		students[numberOfStudents++] = student;
	}

	public String[] getStudents() 
	{
		return students;
	}

	public int getNumberOfStudents() 
	{
		return numberOfStudents;
	}

	public String getCourseName() 
	{
		return courseName;
	}

	public void dropStudent(String student) 
	{
		String[] temp = new String[students.length];
		int index = 0;
		
		for (int i = 0; i < numberOfStudents; i++)
			if (!students[i].equals(student))
			{
				temp[index] = students[i];
				index++;
			}
		
		students = temp;
		numberOfStudents--;
	}
	
	public void clear()
	{
		numberOfStudents = 0;
		students = new String[5];
	}
}