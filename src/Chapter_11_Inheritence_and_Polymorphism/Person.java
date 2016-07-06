package Chapter_11_Inheritence_and_Polymorphism;

public class Person 
{
	private String name;
	private String address;
	private String phoneNumber; 
	private String emailAddress;
	
	public Person()
	{
		this ("Kevin", "Brooklyn", "347-888-1234", "kevin@gmail.com");
	}
	
	public Person(String name, String address, String phoneNumber, String emailAddress)
	{
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}
	
	public String toString()
	{
		return (getName() + " " + this.getClass());
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	
	public String getEmail()
	{
		return emailAddress;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	
	public void setEmail(String emailAddress)
	{
		this.emailAddress = emailAddress;
	}
}
