import java.util.Scanner;

public class IntLoop {

	public static void main(String[] args) {
		try {
			System.out.print("Please enter an Integer: ");
			Scanner myScan = new Scanner(System.in);
			String input;
			Boolean isInt=false;
			while(!isInt)
			{
				isInt=true;
				input=myScan.nextLine();
				try {
			        int i = Integer.parseInt(input);
			    } catch (NumberFormatException nfe) {
			        isInt= false;
			    }
			    if(isInt || input.matches("quit"))
			    {
			    	if(isInt)
			    	{
			    		System.out.println(input);
			    	}
			    	else
			    	{
			    		isInt=true;
			    	}
			    }
			    else
			    {
			    	System.out.println("Did not input an integer. Please enter an integer");
			    	isInt=false;
			    }
			}
			
			myScan.close();
		}
		catch(Exception e) {System.out.println("Error: " + e);}
	}

}
