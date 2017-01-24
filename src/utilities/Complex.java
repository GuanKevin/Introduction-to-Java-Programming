package utilities;

public class Complex implements Cloneable
{
	private double a, b;
	
	public Complex()
	{
		this (0, 0);
	}
	
	public Complex(double a)
	{
		this (a, 0);
	}
	
	public Complex (double a, double b)
	{
		this.a = a;
		this.b = b;
	}
	
	public double getRealPart()
	{
		return a;
	}
	
	public double getImaginaryPart()
	{
		return b;
	}
	
	/**
	 * a + bi - (c + di) = (a + c) + (b + d)i
	 * 
	 * @param num
	 * @return
	 */
	public Complex add(Complex num)
	{
		double ac = a + num.getRealPart(); 		//(a + c)
		double bd = b + num.getImaginaryPart();	//(b + d)
		
		return new Complex(ac, bd);
	}
	
	/**
	 * a + bi + c + di = (a - c) + (b - d)i
	 * 
	 * @param num
	 * @return
	 */
	public Complex subtract(Complex num)
	{
		double ac = a - num.getRealPart(); 		//(a - c)
		double bd = b - num.getImaginaryPart();	//(b - d)
		
		return new Complex(ac, bd);
	}
	
	/**
	 * (a + bi)*(c + di) = (ac - bd) + (bc + ad)i
	 * 
	 * @param num
	 * @return
	 */
	public Complex multiply(Complex num)
	{
		double ac = a * num.getRealPart(); 		//(ac)
		double bd = b * num.getImaginaryPart();	//(bd)
		double bc = b * num.getRealPart(); 		//(bc)
		double ad = a * num.getImaginaryPart();	//(ad)
		
		return new Complex((ac - bd), (bc + ad));
	}
	
	/**
	 * (a + bi)/(c + di) = (ac + bd)/(c^2 + d^2) + (bc - ad)i/(c^2 + d^2)
	 * 
	 * @param num
	 * @return
	 */
	public Complex divide(Complex num)
	{
		double ac = a * num.getRealPart(); 		//(ac)
		double bd = b * num.getImaginaryPart();	//(bd)
		double bc = b * num.getRealPart(); 		//(bc)
		double ad = a * num.getImaginaryPart();	//(ad)
		double cc = Math.pow(num.getRealPart(), 2);
		double dd = Math.pow(num.getImaginaryPart(), 2);
		
		return new Complex((ac + bd) / (cc + dd), (bc - ad) / (cc + dd));
	}
	
	/**
	 * |a + bi| = root(a^2 + b^2)
	 * @return
	 */
	public double abs()
	{
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}
	
	@Override
	public String toString()
	{
		return (b == 0 ? "(" + a + ")" : "(" + a + " + " + b + "i)");
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return (Complex) super.clone();
	}
}
