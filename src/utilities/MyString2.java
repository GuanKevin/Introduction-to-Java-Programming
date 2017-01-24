package utilities;

public class MyString2 
{
	public String s;
	
	public MyString2(String s)
	{
		this.s = s;
	}
	
	public static String[] split(String s, String regex)
	{
		if (regex.length() == 1)
			return splitChar(s, regex.charAt(0));
		else
			return splitStr(s, regex);	
	}
	
	public static String[] splitStr(String s, String regex)
	{
		char[] tempCharArr = new char[regex.length() - 2];
		String[] tempStrArr = new String[s.length()];
		int index = 0;
		String tempStr = "";
		boolean match = false;
		char deliminator = ' ';
		
		for (int i = 1; i <= tempCharArr.length; i++)
			tempCharArr[i - 1] = regex.charAt(i);
		
		for (int i = 0; i < s.length(); i++)
		{
			for (int j = 0; j < tempCharArr.length; j++)
			{
				if (tempCharArr[j] == (s.charAt(i)))
				{
					match = true;
					deliminator = s.charAt(i);
					break;
				}
				else if (j + 1 == tempCharArr.length)
					tempStr += s.charAt(i);
			}
			
			if (match == true)
			{
				match = false;
				tempStrArr[index++] = tempStr;
				tempStrArr[index++] = deliminator + "";
				tempStr = "";
			}
		}
		
		tempStrArr[index++] = tempStr;
		
		String[] tempArr2 = new String[index];
		
		for (int i = 0; i < index; i++)
			tempArr2[i] = tempStrArr[i];
		
		return tempArr2;
	}
	
	public static String[] splitChar(String s, char regex)
	{
		String[] tempArr = new String[s.length()];
		String tempStr = "";
		int index = 0;
		
		for (int i = 0; i < s.length(); i++)
		{
			if (regex == (s.charAt(i)))
			{
				tempArr[index++] = tempStr;
				tempStr = "";
				tempArr[index++] = regex + "";
			}
			else
				tempStr += s.charAt(i);
		}
		
		tempArr[index++] = tempStr;
		String[] tempArr2 = new String[index];
		
		for (int i = 0; i < index; i++)
			tempArr2[i] = tempArr[i];
		
		return tempArr2;
	}
	
	public int compare(String s)
	{
		for (int i = 0; i < s.length(); i++)
			if (this.s.charAt(i) != s.charAt(i))
				if (this.s.charAt(i) > s.charAt(i))
					return 1;
				else
					return -1;
		
		return 0;		
	}
	
	public MyString2 substring(int begin)
	{
		String temp = "";
		
		for (int i = begin; i < s.length(); i++)
			temp += s.charAt(i);
		
		return new MyString2(temp);
	}
	
	public MyString2 toUpperCase()
	{
		s = s.toUpperCase();
		
		return new MyString2(s);
	}
	
	public char[] toChars()
	{
		char[] temp = new char[s.length()];
		
		for (int i = 0; i < s.length(); i++)
			temp[i] = s.charAt(i);
		
		return temp;
	}
	
	public static MyString2 valueOf(boolean b)
	{
		return new MyString2((b) ? "true" : "false");
	}
	
	public String getString()
	{
		return s;
	}
}
