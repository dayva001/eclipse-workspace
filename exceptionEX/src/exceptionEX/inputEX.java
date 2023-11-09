package exceptionEX;
import java.util.InputMismatchException;
import java.util.Scanner;

public class inputEX {

	public static void main(String[] args)
	{
			try {
				System.out.print("Please enter two Integer: ");
				Scanner myScan = new Scanner(System.in);
				String input;
				Boolean isInt=false;
				int i = 0,j=0;
				while(!isInt)
				{
					isInt=true;
					Scanner lineScanner = new Scanner(myScan.nextLine());
					try 
					{
						i = Integer.parseInt(lineScanner.next());
				    } 
					catch (NumberFormatException ix)
					{
				    	System.out.println("Did not input an integer. Please enter an integer");
				    	isInt=false;
				    }
					try 
					{
						j = Integer.parseInt(lineScanner.next());
				    } 
					catch (NumberFormatException ix)
					{
				    	System.out.println("Did not input an integer. Please enter an integer");
				    	isInt=false;
				    }
					lineScanner.close();
				}
				int k = i+j;
				System.out.println(i + " + " + j + " = " + k);
				myScan.close();
			}
			catch(Exception e) {System.out.println("Error: " + e);}

	}

}
