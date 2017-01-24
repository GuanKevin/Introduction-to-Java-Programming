package utilities;

public class Calculator 
{
	private String[] args;
	private int result;
	
	public Calculator(String[] args)
	{
		this.args = args;
	}
	
	public void Calculate()
	{
		switch (args[1].charAt(0)) 
		{
	        case '+':
	            result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
	            break;
	        case '-':
	            result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
	            break;
	        case '*':
	            result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
	            break;
	        case '/':
	            result = Integer.parseInt(args[0]) /  Integer.parseInt(args[2]);
		}
	}
	
	public void printResult()
	{
		System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
	}
}
