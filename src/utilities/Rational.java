package utilities;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Rational extends Number implements Comparable<Rational>
{
	private static final long serialVersionUID = 3441362505826302451L;
	private BigInteger[] r = new BigInteger[2];
	
	public Rational()
	{
		this (BigInteger.ZERO, BigInteger.ONE);
	}
	
	public Rational(BigInteger numerator, BigInteger demoninator)
	{
		BigInteger gcd = gcd(numerator, demoninator);
		
		this.r[0] = numerator.divide(gcd);
		this.r[1] = demoninator.divide(gcd);
	}
	
	private BigInteger gcd(BigInteger n, BigInteger d)
	{
		BigInteger t1 = n.abs();
		BigInteger t2 = d.abs();
		BigInteger remainder = t1.mod(t2);
		
		while (!remainder.equals(BigInteger.ZERO))
		{
			t1 = t2;
			t2 = remainder;
			remainder = t1.mod(t2);
		}
		
		return t2;
	}
	
	public BigInteger getNumerator()
	{
		return r[0];
	}
	
	public BigInteger getDenominator()
	{
		return r[1];
	}

	public Rational add(Rational secondNewRational) 
	{
		BigInteger n = r[0].multiply(secondNewRational.getDenominator()).add(r[1].multiply(secondNewRational.getNumerator()));
		BigInteger d = r[1].multiply(secondNewRational.getDenominator());
		
		return new Rational(n, d);
	}
	
	public Rational subtract(Rational secondNewRational) 
	{
		BigInteger n = r[0].multiply(secondNewRational.getDenominator()).subtract(r[1].multiply(secondNewRational.getNumerator()));
		BigInteger d = r[1].multiply(secondNewRational.getDenominator());
	    
	    return new Rational(n, d);
	}
	
	public Rational multiply(Rational secondNewRational) 
	{
		BigInteger n = r[0].multiply(secondNewRational.getNumerator());
		BigInteger d = r[1].multiply(secondNewRational.getDenominator());
		
		return new Rational(n, d);
	}
	
	public Rational divide(Rational secondNewRational) 
	{
		BigInteger n = r[0].multiply(secondNewRational.getDenominator());
		BigInteger d = r[1].multiply(secondNewRational.r[0]);
		
		return new Rational(n, d);
	}
	
	@Override
	public String toString() 
	{
		if (r[1].equals(BigInteger.ONE))
			return r[0] + "";
		else
			return r[0] + "/" + r[1];
	}
	
	public boolean equals(Object parm1) 
	{
		if ((this.subtract((Rational)(parm1))).getNumerator().equals(BigInteger.ZERO))
			return true;
		else
			return false;
	}
	
	@Override
	public int compareTo(Rational o) 
	{
		if ((this.subtract((Rational) o)).getNumerator().signum() > 0)
			return 1;
		else if ((this.subtract((Rational)o)).getNumerator().signum() < 0)
			return -1;
		else
			return 0;
	}
	
	public BigInteger bigIntegerValue()
	{
		return r[0].divide(r[1]);
	}

	@Override
	public double doubleValue() 
	{
		BigDecimal numerator = new BigDecimal(r[0]);
		return numerator.divide(new BigDecimal(r[1]), 10, RoundingMode.HALF_UP).doubleValue();
	}

	@Override
	public float floatValue() 
	{
		return (float) doubleValue();
	}

	@Override
	public int intValue() 
	{
		return (int) doubleValue();
	}

	@Override
	public long longValue() 
	{
		return (long) doubleValue();
	}
}
