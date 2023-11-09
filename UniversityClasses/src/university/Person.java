package university;

public class Person 
{
	protected String name = "John Doe";
	protected String address = "123 Beverly Blvd.";
	protected String phoneNumber = "(123)555-1234";
	protected String email = "JohnDoe@domain.com";
	
	public Person()
	{
	}
	
	public Person(String name, String address, String phoneNumber, String email)
	{
		this.name=name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	public String toString()
	{
		return "Person - " + name;
	}
}
