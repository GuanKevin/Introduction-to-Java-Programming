package Utilities;

public class Tax 
{
	public static final int SINGLE_FILER = 0;
	public static final int MARRIED_FILING_JOINTLY_OR_QUALIFYING_WIDOWER = 1;
	public static final int MARRIED_FILING_SEPARELY = 2;
	public static final int HEAD_OF_HOUSEHOLD = 3;
	
	private int filingStatus;
	private int[][] brackets;
	private double[] rates;
	private double taxableIncome;
	
	public Tax()
	{
		
	}
	
	public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome)
	{
		this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
	}
	
	public double getTax() 
	{
        double tax;
        if (taxableIncome <= brackets[filingStatus][0]) return Math.round(taxableIncome * rates[0]);

        tax = brackets[filingStatus][0] * rates[0];

        for (int i = 1; i < brackets[filingStatus].length; i++) 
        {
            if (taxableIncome > brackets[filingStatus][i]) 
                tax += (brackets[filingStatus][i] - brackets[filingStatus][i - 1]) * rates[i];
        	else
                return Math.round(tax + (taxableIncome - brackets[filingStatus][i - 1]) * rates[i]);
        }
        return Math.round(tax + (taxableIncome - brackets[filingStatus][4]) * rates[5]);
    }

	
	public int getFilingStatus() 
	{
		return filingStatus;
	}
	
	public void setFilingStatus(int filingStatus) 
	{
		this.filingStatus = filingStatus;
	}
	
	public int[][] getBrackets() 
	{
		return brackets;
	}
	
	public void setBrackets(int[][] brackets) 
	{
		this.brackets = brackets;
	}
	
	public double[] getRates() 
	{
		return rates;
	}
	
	public void setRates(double[] rates) 
	{
		this.rates = rates;
	}
	
	public double getTaxableIncome() 
	{
		return taxableIncome;
	}
	
	public void setTaxableIncome(double taxableIncome) 
	{
		this.taxableIncome = taxableIncome;
	}
}
