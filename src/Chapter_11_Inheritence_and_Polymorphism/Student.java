package Chapter_11_Inheritence_and_Polymorphism;

public class Student extends Person
{
	final private String[] classStatus = {"Freshman", "Sophomore", "Junior", "Senior"};
	private int status;
	
	public Student()
	{
		this (0);
	}
	
	public Student(int status)
	{
		this.status = status;
	}
	
	public String getClassStatus()
	{
		return classStatus[status];
	}
	
	public void setStatus(int status)
	{
		this.status = status;
	}
	
	public String toString()
	{
		return (getName() + " " + getClassStatus()); 
	}
}
