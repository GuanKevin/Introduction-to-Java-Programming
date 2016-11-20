package Utilities;

public class Calculator {
	int num1 = 0;
	int num2 = 0;
	char operand;
	
	Calculator(String line)
	{
		line = line.replaceAll(" ", "");
		num1 = Integer.parseInt(line.substring(0, 1));
		num2 = Integer.parseInt(line.substring(2, 3));
		operand = line.charAt(1);
	}
	
	public double calculate()
	{
		return 
				(operand == '+') ? num1 + num2 
				: (operand == '*') ? num1 * num2 
				: (operand == '-') ? num1 - num2
				: ((double)num1 / num2);
	}
}
