package utilities;

public class BMI 
{
	String name;
	int age;
	double weight;		//Weight in pounds/lb
	double kilogram; 
	double feet;
	double inches;
	double centimeter;
	
	public BMI(String name, int age, double weight, double feet, double inches)
	{
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.feet = feet;
		this.inches = inches;
		kilogram = weight * 0.45;
		centimeter = ((feet * 12) + inches) * 0.025;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public double getBMI()
	{
		return kilogram / (Math.pow(centimeter, 2));
	}
	
}
