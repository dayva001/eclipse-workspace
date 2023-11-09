
public class Tester {

	public static void main(String[] args)
	{
		CustomString testerString = new CustomString("help".toCharArray());
		System.out.println("using string: " + testerString.toString());
		CustomString tester2 = testerString.changeCase();
		System.out.println("Changing of case: " + tester2.toString());
		System.out.println("getting character at pos. 0: " + testerString.charAt(0));
		System.out.println("comparing the strings results: " + testerString.compareTo(tester2));
		CustomString tester3 = tester2.concat(testerString);
		System.out.println("Concatination of the two strings: " + tester3.toString());
		if(tester2.equals(testerString))
		{
			System.out.println(testerString.toString() + " is equal to " + tester2.toString());
		}
		else
		{
			System.out.println(testerString.toString() + " is not equal to " + tester2.toString());
		}
		CustomString[] testerArray = tester3.split('E');
		System.out.println("Split of the concat string at any 'E' character:");
		for(int i=0;i<testerArray.length;i++)
		{
			System.out.println(testerArray[i].toString());
		}
		CustomString tester4 = tester3.substring(3);
		System.out.println("substring cut off at position 3 = " + tester4.toString());
		System.out.println("substring from position 3 to 5 = " + tester3.substring(3,5));

		CustomString tester5 = new CustomString("this is a test for capitalization".toCharArray());
		System.out.println("\"" + tester5.toString() + "\" titleized is : " + tester5.titleize().toString());
		System.out.println("and all lowercase is: " + tester5.toLowerCase());
		System.out.println("and all uppercase is: " + tester5.toUpperCase());
	}

}
