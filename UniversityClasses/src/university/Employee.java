package university;

public class Employee extends Person
{
	protected String office = "B402";
	protected int salary = 24000;
	protected String dateHired = "1-1-1976";
	
	public Employee()
	{
	}
	
	public Employee(String name, String address, String phoneNumber, String email, String office, int salary, String dateHired)
	{
		super(name, address, phoneNumber, email);
		this.office = office;
		if(salary>=0)
		{
			this.salary = salary;
		}
		this.dateHired = dateHired;
	}
	
	public String toString()
	{
		return "Employee - " + name;
	}
}
