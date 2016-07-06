package Chapter_12_Exception_Handling_and_Text_IO;

@SuppressWarnings("serial")
public class HexFormatException extends Exception
{
	public HexFormatException(String message)
	{
		//super (message);
		System.out.println(message);
	}
}
