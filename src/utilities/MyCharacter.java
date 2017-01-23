package utilities;

public class MyCharacter 
{
	private char value;

	public MyCharacter(char value)
	{
		this.value = value;
	}
	
	public char charValue()
	{
		return value;
	}
	
	public static int compare(char x, char y)
	{
		if (x > y)
			return 1;
		if (x == y)
			return 0;
		
		return -1;
	}
	
	public int compareTo(MyCharacter anotherCharacter)
	{
		return value - anotherCharacter.value;
	}
	
	public boolean equals(MyCharacter anotherCharacter)
	{
		return value == anotherCharacter.value;
	}
	
	public static boolean isDigit(MyCharacter anotherCharacter)
	{
		return anotherCharacter.value >= '0' && anotherCharacter.value <= '9';
	}
	
	public static boolean isLetter(MyCharacter anotherCharacter)
	{
		return (anotherCharacter.value >= 'a' && anotherCharacter.value <= 'z') || (anotherCharacter.value >= 'A' && anotherCharacter.value <= 'Z');
	}
	
	public static char toUpperCase(char anotherCharacter)
	{
		return (char) (anotherCharacter - 'a' + 'A');
	}
	
	public static char toLowerCase(char anotherCharacter)
	{
		return (char) (anotherCharacter - 'A' + 'a');
	}
}
