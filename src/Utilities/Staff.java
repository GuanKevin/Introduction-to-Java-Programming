package Utilities;

public class Staff extends Employee
{
	private String[] staffTitle = {"Public Relation Specialist", "Assistant Secretary", "Executive Director", "Chief Admin",
								"Deputy Director For Maintenance"};
	private int title;
	
	public Staff()
	{
		this (0);
	}
	
	@Override
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
