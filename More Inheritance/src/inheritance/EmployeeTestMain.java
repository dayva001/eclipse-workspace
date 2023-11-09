package inheritance;

public class EmployeeTestMain {

	public static void main(String[] args) 
	{
		Employee emp1 = new Employee("Stubbs McKenzy", 56000, 2023, "(555)454-2423");
		System.out.println("Employee 1: " + emp1);
		Employee emp2 = Employee.copyOf(emp1);
		System.out.println("Employee 2 copies Employee 1: " + emp2);
		System.out.println("Employee 1 is a copy of Employee 2: " + emp1.equals(emp2));
		emp2.setName("Bobby Dillard");
		System.out.println("Changed Employee 2's name: " + emp2);
		System.out.println("Does Employee 2 still equal Employee1: " + emp1.equals(emp2));
		emp2.setInsuranceNum("2");
		emp2.setSalary(32000);
		emp2.setYearHired(1024);
		System.out.println(emp2);

	}

}
