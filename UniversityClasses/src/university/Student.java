package university;

public class Student extends Person
{
	protected static final String[] classStatus = {"Freshman", "Sophomore", "Junior", "Senior"};
	protected int currStatus =0;
	
	public Student()
	{
		super();
	}
	
	public Student(String name, String address, String phoneNumber, String email,int currStatus)
	{
		super(name, address, phoneNumber, email);
		if(currStatus >=0 && currStatus < classStatus.length)
		{
			this.currStatus = currStatus;
		}
	}
	
	public String toString()
	{
		return "Student - " + name;
	}
}
