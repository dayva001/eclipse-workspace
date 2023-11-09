import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class B_ReadWrite100
{
	/*#2 - program that reads all the numbers from the file named numberRow.txt you just made
    write those numbers out to a new file numbersColumn.txt
    the new file will have all the numbers listed one per line*/
	public static void main(String[] args)
	{
		try
		{
			File inputFile = new File("numberRow.txt");
			Scanner myScan= new Scanner(inputFile);
			File outputFile = new File("numbersColumn.txt");
			outputFile.createNewFile();
		    PrintWriter printout = new PrintWriter(outputFile);
			while (myScan.hasNext())
		    {
				printout.println(myScan.next());
		    }
			myScan.close();
			printout.flush();
			printout.close();
		}
		catch(Exception x)
		{
			System.out.println("Error: " + x);
		}
	}

}
