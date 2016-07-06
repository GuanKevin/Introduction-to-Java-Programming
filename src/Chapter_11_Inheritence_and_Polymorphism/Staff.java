package Chapter_11_Inheritence_and_Polymorphism;

public class Staff extends Employee
{
	private String[] staffTitle = {"Public Relation Specialist", "Assistant Secretary", "Executive Director", "Chief Admin",
								"Deputy Director For Maintenance"};
	private int title;
	
	public Staff()
	{
		this (0);
	}
	
	public String toString()
	{
		return(getName() + " " + getTitle());
	}
	
	public Staff(int title)
	{
		this.title = title;
	}
	
	public String getTitle()
	{
		return staffTitle[title];
	}
	
	public void setTitle(int title)
	{
		this.title = title;
	}
}
