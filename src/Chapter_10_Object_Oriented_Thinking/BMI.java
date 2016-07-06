package Chapter_10_Object_Oriented_Thinking;

public class BMI 
{
	String name;
	int age;
	double weight;
	double feet;
	double inches;
	
	public BMI(String name, int age, double weight, double feet, double inches)
	{
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.feet = feet;
		this.inches = inches;
	}
	
	//BMI = ( Weight in Pounds / ( Height in inches x Height in inches ) ) x 703
	public double calcBMI()
	{
		return (weight / (((feet * 12) + inches) * ((feet * 12) + inches))) * 703;
	}
	
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	
	public void setFeet(double feet)
	{
		this.feet = feet;
	}
	
	public void setInches(double inches)
	{
		this.inches = inches;
	}
}
