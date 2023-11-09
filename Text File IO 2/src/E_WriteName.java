import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E_WriteName
{
	/*#5 - program that reads the name data from the provided files named firstNames.txt and lastNames.txt
    and produces a list of 1000 random names  randomPeople.txt
    one complete name (firstname lastname) per line*/
	public static void main(String[] args)
	{
		try
		{
			File outputFile = new File("randomPeople.txt");
		    outputFile.createNewFile();
		    PrintWriter printout = new PrintWriter(outputFile);
			List<String> firstNames=new ArrayList<String>();
			List<String> lastNames=new ArrayList<String>();
			File firstNameFile = new File("firstNames.txt");
			Scanner firstNameScanner=new Scanner(firstNameFile);
			while(firstNameScanner.hasNext())
			{
				firstNames.add(firstNameScanner.next());
			}
			File lastNameFile = new File("lastNames.txt");
			Scanner lastNameScanner =new Scanner(lastNameFile);
			while(lastNameScanner.hasNext())
			{
				lastNames.add(lastNameScanner.next());
			}
			for(int i=0;i<1000;i++)
			{
				printout.println(firstNames.get(getRandomNumber(0,firstNames.size()-1)) 
						+ " " + lastNames.get(getRandomNumber(0,lastNames.size()-1)));
			}
			firstNameScanner.close();
			lastNameScanner.close();
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
