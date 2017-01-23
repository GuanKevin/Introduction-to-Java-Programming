package utilities;

public class HexFormatException extends Exception 
{
	private static final long serialVersionUID = 1L;

	public HexFormatException() 
	{
		super("Illegal hex character");		  
	}

	public HexFormatException(String message) 
	{
		super(message);
	}
}