
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class G_FilesValid {

	/*#7 - write a program that checks if all the program generated Activity
	 *  Lab files exist in the project folder (assumes Eclipse IDE).
	 *  writes to the console "all complete" and lists the file names, or
	 *  "missing files" list the files with "missing" in front of the absent files.

	The file names to check for are:
									numberRow.txt
									numbersColumn.txt
									numberGrid.txt
									gridStats.txt
									randomPeople.txt
									namesList.txt */
	public static void main(String[] args)
	{
		try
		{
			String[] fileNames = {"numberRow.txt", "numbersColumn.txt",
			"numberGrid.txt", "gridStats.txt", "randomPeople.txt", "namesList.txt"};
			List<String> missingFiles=new ArrayList<String>();
			for(int i=0;i<fileNames.length;i++)
			{
				File fileChecker = new File(fileNames[i]);
				if(!fileChecker.isFile())
				{
					missingFiles.add(fileNames[i]);
				}
			}
			if(missingFiles.isEmpty())
			{
				System.out.println("all complete");
				for(int i=0;i<fileNames.length;i++)
				{
					System.out.println(fileNames[i]);
				}
			}
			else
			{
				System.out.println("missing files");
				for(int i=0;i<missingFiles.size();i++)
				{
					System.out.println("missing " + missingFiles.get(i));
				}
			}
		}
		catch(Exception x)
		{
			System.out.println("Error: " + x);
		}
	}
}
