package inheritance;

public class Employee extends Person
{
	private double annSalary;
	private int yearHired;
	private String insuranceNum;
	
	public Employee()
	{
		super();
		annSalary = 0;
		yearHired = 0;
		insuranceNum = "";
	}
	
	public Employee(String name, double annSalary, int yearHired, String insuranceNum)
	{
		super(name);
		if(annSalary < 0)
		{
			System.err.println("Employee(...): "
			+"cannot have a negative salary.");
		}
		else
		{
			this.annSalary = annSalary;
		}
		if(yearHired< 0)
		{
			System.err.println("Employee(...): "
			+"cannot have a negative starting year.");
		}
		else
		{
			this.yearHired = yearHired;
		}
		this.insuranceNum = insuranceNum;
	}
	
	public void setSalary(double annSalary)
	{
		if(annSalary < 0)
		{
			System.err.println("Employee(...): "
			+"cannot have a negative salary.");
		}
		else
		{
			this.annSalary = annSalary;
		}
	}
	
	public void setYearHired(int yearHired)
	{
		if(yearHired< 0)
		{
			System.err.println("Employee.setYearHired(...): "
			+"cannot have a negative starting year.");
		}
		else
		{
			this.yearHired = yearHired;
		}
	}
	
	public void setInsuranceNum(String insuranceNum)
	{
		this.insuranceNum = insuranceNum;
	}
	
	public double getSalary()
	{
		return annSalary;
	}
	
	public int getYearHired()
	{
		return yearHired;
	}
	
	public String getInsuranceNum()
	{
		return insuranceNum;
	}
	
	public String toString()
	{
		return super.toString() + " Annual Salary: $" + annSalary + " Year Hired: " + yearHired + " Insurance Number: " + insuranceNum;
	}
	
	public static Employee copyOf(Employee e)
	{
		return new Employee(e.getName(), e.annSalary, e.yearHired, e.insuranceNum);
	}
	
	public boolean equals(Employee e)
	{
		if(super.equals(e)==false)
		{
			return false;
		}
		else
		{
			if(annSalary == e.getSalary() && yearHired == e.getYearHired() && insuranceNum.equals(e.getInsuranceNum()))
			{
				return true;
			}
		}
		return false;
	}
}
