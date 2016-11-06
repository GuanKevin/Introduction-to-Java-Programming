package Chapter_11_Inheritence_and_Polymorphism;

public class Faculty extends Employee
{
	/*
	 * [[Monday] [Tuesday] [Wednesday] [Thursday] [Friday] [Saturday] [Sunday]
	 * 	[9 - 5 ] [9 - 5  ] [  9 - 5  ] [ 9 - 5  ] [9 - 5 ] [ 9 - 5  ] [9 - 5 ]
	 */
	final private static String[][] officeHours = 	{{"Monday", "Tuesday", "Wednesday", "Thursday", 
															"Friday", "Saturday", "Sunday"},
														{"9:00 A.M. - 5:00 P.M.", "9:00 A.M. - 5:00 P.M.", 
															"9:00 A.M. - 5:00 P.M.", "9:00 A.M. - 5:00 P.M.", 
															"9:00 A.M. - 5:00 P.M.", "9:00 A.M. - 5:00 P.M.", 
															"9:00 A.M. - 5:00 P.M."}};
	private String[] academicRank = {"University Professor", "Professor", 
										"Associate Professor", "Assistant Professor",
										"Research Associate", "Adjunct Professor"};
	private int rank;
	
	public Faculty()
	{
		this(0);
	}
	
	public Faculty(int rank)
	{
		this.rank = rank;
	}
	
	@Override
	public String toString()
	{
		return (getName() + " " + getRank());
	}
	
	public String getRank()
	{
		return academicRank[rank];
	}
	
	public void setRank(int rank)
	{
		this.rank = rank;
	}
	
	public static void displayOfficeHours()
	{
		for (int i = 0; i < 7; i++)
		{
			System.out.println(officeHours[0][i] + " " + officeHours[1][i]);
		}
	}
}
