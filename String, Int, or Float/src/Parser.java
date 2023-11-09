import java.util.Scanner;
public class Parser {

	public static void main(String[] args) {
		try {
			System.out.print("Please enter a string: ");
			Scanner myScan = new Scanner(System.in);
			String input = myScan.next();
			System.out.println(input);
			System.out.print("Please enter an integer: ");
			int outputInt = myScan.nextInt();
			System.out.println(outputInt);
			System.out.print("Please enter an Integer, Float, or String: ");
			input = myScan.next();
			System.out.print("You entered a");
			if(isNumeric(input))
			{
				if(isInt(input))
				{
					System.out.println("n Integer");
				}
				else
				{
					System.out.println(" Float");
				}
			}
			else
			{
				System.out.println("String");
			}
			myScan.close();
		}
		catch(Exception e) {System.out.println("Error: " + e);}
		
	}
	
	protected static boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        double d = Double.parseDouble(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
	
	protected static boolean isInt(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        int i= Integer.parseInt(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
	
}
