package utilities;

public class MyStringBuilder1 
{
	private String s;
	
	public MyStringBuilder1(String s)
	{
		this.s = s;
	}
	
	public MyStringBuilder1 append(MyStringBuilder1 s)
	{
		this.s += s;
		
		return new MyStringBuilder1(this.s);
	}
	
	public MyStringBuilder1 append(int i)
	{
		s += i + "";
		
		return new MyStringBuilder1(s);
	}
	
	public int length()
	{
		return s.length();
	}
	
	public char charAt(int index)
	{
		return s.charAt(index);
	}
	
	public MyStringBuilder1 toLowerCase()
	{
		return new MyStringBuilder1(s.toLowerCase());
	}
	
	public MyStringBuilder1 substring(int begin, int end)
	{
		String temp = "";
		
		for (int i = begin; i < end; i++)
			temp += s.charAt(i);
		
		return new MyStringBuilder1(temp);
	}
	
	public String toString()
	{
		return ("String: " + s);
	}
	
}


