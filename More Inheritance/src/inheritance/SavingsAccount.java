package inheritance;

public class SavingsAccount extends Account
{
	//interest as a percentage i.e. 24.00 == 24%
	private double interest;

	public SavingsAccount(int a, double interest) 
	{
		super(a);
		if(interest <0)
		{
			System.err.println("SavingsAccount(...): "
			+"cannot have negative interest amount.");
		}
		else
		{
			this.interest = interest;
		}
		// TODO Auto-generated constructor stub
	}
	
	public void setInterest(double interest)
	{
		if(interest <0)
		{
			System.err.println("SavingsAccount.setInterest(...): "
			+"cannot have negative interest amount.");
		}
		else
		{
			this.interest = interest;
		}
	}
	
	public double getInterest()
	{
		return interest;
	}
	
	public void addInterest()
	{
		super.deposit((interest/100)*super.getBalance());
	}
	
	public String toString()
	{
		return super.toString() + " Interest: " + interest;
	}
}
