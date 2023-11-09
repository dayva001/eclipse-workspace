import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TextFileIO {

	public static void main(String[] args) {
		try
		{
			File inputFile= new File("src/text");
			Scanner myScan= new Scanner(inputFile);
			int sum=0;
			List<Integer> intsInFile=new ArrayList<Integer>();
	        while (myScan.hasNext())
	        {
	            if (myScan.hasNextInt())
	            {
	                intsInFile.add(myScan.nextInt());
	            }
	            else 
	            {
	                myScan.next();
	            }
	        }
	        for(int i=0;i<intsInFile.size();i++)
	        {
	        	sum += intsInFile.get(i);
	        }
	        int avg = sum/intsInFile.size();
	        File outputFile = new File("Output.txt");
	        outputFile.createNewFile();
			PrintWriter printout = new PrintWriter(outputFile);
			printout.println("Sum: " + sum + " Average: " + avg);
			 for(int i=0;i<intsInFile.size();i++)
		        {
		        	printout.println(intsInFile.get(i));
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
