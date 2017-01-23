package utilities;

import java.util.Arrays;

public class MyStringBuilder2 
{
	private char[] chars;
	
	public MyStringBuilder2()
	{
		
	}
	
	public MyStringBuilder2(char[] chars)
	{
		this.chars = chars;
	}
	
	public MyStringBuilder2(String s)
	{
		this(s.toCharArray());
	}
	
	public MyStringBuilder2 insert(int offset, MyStringBuilder2 s)
	{
		char[] temp = new char[chars.length + s.chars.length];
		
		for (int i = 0; i < offset; i++)
			temp[i] = chars[i];
		
		for (int i = offset; i < (s.chars.length + offset); i++)
			temp[i] = s.chars[i - offset];
		
		for (int i = (s.chars.length + offset); i < temp.length; i++)
			temp[i] = chars[offset++];
		
		return new MyStringBuilder2(temp);
	}
	
	public MyStringBuilder2 reverse()
	{
		char[] temp = new char[chars.length];
		
		for (int i = chars.length - 1; i >= 0; i--)
			temp[chars.length - i - 1] = chars[i];
		
		return new MyStringBuilder2(temp);
	}
	
	public MyStringBuilder2 substring(int begin)
	{
		char[] temp = new char[chars.length - begin];
		
		for (int i = 0; i < temp.length; i++)
			temp[i] = chars[begin++];
		
		return new MyStringBuilder2(temp);
	}
	
	public MyStringBuilder2 toUpperCase()
	{
		char[] temp = new char[chars.length];
		
		for (int i = 0; i < temp.length; i++)
			if (chars[i] >= 97 && chars[i] <= 122)
				temp[i] = (char) (chars[i] - 32);
			else
				temp[i] = chars[i];
		
		return new MyStringBuilder2(temp);
	}
	
	public String toString()
	{
		return (Arrays.toString(chars));
	}
}
