package university;

public class Staff extends Employee
{
	String title = "Receptionist";
	
	public Staff()
	{
		super();
	}
	
	public Staff(String name, String address, String phoneNumber, String email, String office, int salary, String dateHired, String title)
	{
		super(name, address, phoneNumber, email, office, salary, dateHired);
		this.title=title;
	}
	
	public String toString()
	{
		return "Staff - " + name;
	}
}
