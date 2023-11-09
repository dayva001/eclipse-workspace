import java.io.File;
import java.io.PrintWriter;

public class A_Write100
{
	/*#1 - program that writes a file named numberRow.txt
    write a set of 100 random numbers with values between 0 and 1000
    the numbers should all be on the same line separated by a space*/
	public static void main(String[] args)
	{
		try
		{
			File outputFile = new File("numberRow.txt");
		    outputFile.createNewFile();
		    PrintWriter printout = new PrintWriter(outputFile);
			for(int i=0;i<100;i++)
			{

					printout.print(getRandomNumber(0,1000)+ " ");
			}
			printout.flush();
			printout.close();
			
			
		}
		catch(Exception x)
		{
			System.out.println("Error: " + x);
		}
	}
	
	public static int getRandomNumber(int min, int max)
	{
	    return (int) ((Math.random() * (max - min)) + min);
	}
}
