package university;

public class UniversityMain {

	public static void main(String[] args) {
		Person person1 = new Person("John Goodson", "445 W Palm St", "(222)452-7908", "J.GoodSon@sbcglobal.net");
		System.out.println(person1.toString());
		Student student1 = new Student("Billy Graham", "921 Avalanche Blvd" ,"(567)223-4456",  "bgraham@uni.edu", 3);
		System.out.println(student1.toString());
		Employee employee1 = new Employee("Terry Typhoon", "214 coffin way", "(111)786-0087", "tt@wh.gov", "B555", 44445, "04-14-1987");
		System.out.println(employee1.toString());
		Faculty faculty1 = new Faculty("Dizzy Stones", "22 Howcha Ave", "(542)394-8109", "pblartfan2@google.com", "F101", 27500, "07-08-2005", "9PM to 7:45AM", "professor");
		System.out.println(faculty1.toString());
		Staff staff1 = new Staff("Micheal Hawk", "21 Jump St.", "(479)853-2509", "MHawk4@pinterest.com", "UIJ440", 569500, "06-27-2010", "Mind prober");
		System.out.println(staff1.toString());
	}

}
