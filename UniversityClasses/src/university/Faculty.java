package university;

public class Faculty extends Employee
{
	 protected String officeHours = "9am to 12am";
	 protected String rank = "Instructor";
	 
	 public Faculty()
	 {
		 super();
	 }
	 
	 public Faculty(String name, String address, String phoneNumber, String email, String office, int salary, String dateHired, String officeHours, String rank)
	 {
		 super(name, address, phoneNumber, email, office, salary, dateHired);
		 this.officeHours = officeHours;
		 this.rank = rank;
	 }
	 
	 public String toString()
	 {
		 return "Faculty - " + name;
	 }
}
