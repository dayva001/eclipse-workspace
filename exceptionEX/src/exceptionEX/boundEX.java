package exceptionEX;

import java.util.Random;
import java.util.Scanner;

public class boundEX {

	public static void main(String[] args)
	{
		int[] intArr = new int[100];
		Random rd = new Random();
		for(int i = 0; i < intArr.length;i++)
		{
			intArr[i] = rd.nextInt();
		}
		int pos = getInput();
		try
		{
			System.out.println(intArr[pos]);
		}
		catch(ArrayIndexOutOfBoundsException ax)
		{
			System.out.println("Out of Bounds");
		}
	}
	public static int getInput()
	{
		int i=-1;
		try
		{
			System.out.print("Please enter a number between 0 and 99: ");
			Scanner myScan = new Scanner(System.in);
			String input;
			Boolean isValidInt=false;

			while(!isValidInt)
			{
				isValidInt=true;
				input=myScan.nextLine();
				try
				{
			        i = Integer.parseInt(input);
			    } 
				catch (NumberFormatException nfe) 
				{
			    	System.out.println("Did not input an integer. Please enter an integer");
			        isValidInt= false;
			    }

			}		
			myScan.close();
			return i;
		}
		catch(Exception e) {System.out.println("Error: " + e);}
		return i;
	}
}
