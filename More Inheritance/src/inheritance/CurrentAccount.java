package inheritance;

public class CurrentAccount extends Account 
{
	//negative value that the balance can go into;
	private double odLimit;
	
	public CurrentAccount(int a)
	{
		super(a);
		odLimit=0;
	}

	public CurrentAccount(int a, double odLimit) {
		super(a);
		if(odLimit > 0)
		{
			System.err.println("CurrentAccount(...): "
			+"cannot have a non-negative odLimit.");
		}
		else
		{
			this.odLimit = odLimit;
		}
	}
	
	public void setODLimit(double odLimit)
	{
		if(odLimit > 0)
		{
			System.err.println("CurrentAccount.setODLimit(...): "
			+"cannot have a non-negative odLimit.");
		}
		else
		{
			this.odLimit = odLimit;
		}
	}

	public double getODLimit()
	{
		return odLimit;
	}
	
	public String toString()
	{
		return super.toString() + " Overdraft Limit = " + odLimit;
	}
}
