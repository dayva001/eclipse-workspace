import java.util.Scanner;

public class squaredFloat {

	public static void main(String[] args) {
		float toBeSquared = askForFloat();
		float isSquared = squareFloat(toBeSquared);
		System.out.println(toBeSquared +" squared is " + isSquared);
	}
	
	protected static float askForFloat()
	{
		float returnF =0;
		try 
		{
			System.out.print("Please enter a float: ");
			Scanner myScan = new Scanner(System.in);
			float input=0;
	        while (myScan.hasNext())
	        {
	            if (myScan.hasNextFloat())
	            {
	                input=myScan.nextFloat();
	    			myScan.close();
	                return input;
	            }
	            else 
	            {
	                System.out.print("That wasn't a float, please enter a float: ");
	                myScan.next();
	            }
	        }
			myScan.close();
		}
		catch(Exception e) {System.out.println("Error: " + e);}
		return returnF;
	}
	
	protected static float squareFloat(float squareMe)
	{
		return squareMe*squareMe;
	}
	
}
