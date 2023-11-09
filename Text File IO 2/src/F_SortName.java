import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class F_SortName
{
	/*#6 - program that reads the file named randomPeople.txt 
    sort all the names alphabetically by last name
    write all the unique names to a file named namesList.txt , there should be no repeats*/
	public static void main(String[] args)
	{
		try
		{
			File outputFile = new File("namesList.txt");
		    outputFile.createNewFile();
		    PrintWriter printout = new PrintWriter(outputFile);
			List<String> orderedNames=new ArrayList<String>();
			File peoplesNames = new File("randomPeople.txt");
			Scanner myScan=new Scanner(peoplesNames);
			while(myScan.hasNextLine())
			{
				
				orderedNames.add(reverseNameOrder(myScan.nextLine()));
			}
			Set<String> set = new HashSet<>(orderedNames);
			orderedNames.clear();
			orderedNames.addAll(set);
			Collections.sort(orderedNames);
			for(int i=0;i<orderedNames.size();i++)
			{
				printout.println(reverseNameOrder(orderedNames.get(i)));
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
	
	public static String reverseNameOrder(String name)
	{
		Scanner reverser = new Scanner(name);
		String firstName=reverser.next();
		String lastName=reverser.next();
		String newName=lastName + " " + firstName;
		reverser.close();
		return newName;
		
	}

}
