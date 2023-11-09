
public class Money implements Calculable<Money>, Comparable<Money>, Cloneable
{
	double value = 0.00;
	
	public Money()
	{
	}
	
	public Money(double value)
	{
		this.value = Math.round(value * 100.0) / 100.0;
	}
	
	public Money(Money o)
	{
		value = Math.round(o.getTotal() * 100.0) / 100.0;
	}
	
	public double getTotal()
	{
		return value;
	}
	
	public void setAmount(double value)
	{
		this.value= Math.round(value * 100.0) / 100.0;
	}
	
	public Money add(Money o) 
	{
		double total = value + o.getTotal();
		total= Math.round(total * 100.0) / 100.0;
		return new Money(total);
	}

	public Money subtract(Money o) 
	{
		double total = value - o.getTotal();
		total= Math.round(total * 100.0) / 100.0;
		return new Money(value-o.getTotal());
	}

	public int compareTo(Money o) 
	{
		Double temp = value;
		Double temp2 = o.getTotal();
		return temp.compareTo(temp2);
	}
	
	public String toString()
	{
		return "$" + String.format("%.2f", value);
	}
	
	protected Money clone() throws CloneNotSupportedException
	{
		return (Money)super.clone();
	}
}
