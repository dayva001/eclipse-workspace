import java.io.File;
import java.util.Scanner;
public class H_ReadFile {
	/*#8 Exercise  12.13 (pg494) from the textbook

	Count characters, words, and lines in a file.

	try using these files to test it on. They are stored on the Github repository in the File-IO-Demo folder:

	jabberwocky.txt

	mindkiller.txt*/
	  public static void main(String[] args)
	  {
		  try
		  {
			  if (args.length != 1)
			  {
					System.out.println("Error: no file given");
					System.exit(1);
			  }
		    int characters = 0, words = 0, lines = 0;
		    File inputFile = new File(args[0]);
		    if (!inputFile.exists())
		    {
		      System.out.println("File does not exist");
		      return;
		    }
		    Scanner fileScanner = new Scanner(inputFile);
		    String line;
		    while (fileScanner.hasNextLine())
		    {
		      line=fileScanner.nextLine();
		      lines++;
		      characters += line.length();
		      String[] wordsInLine = line.split(" ");
		      words += wordsInLine.length;
		    }
		    fileScanner.close();
		    System.out.println("Lines: " + lines);
		    System.out.println("Words: " + words);
		    System.out.println("Characters: " + characters);
		  }
		  catch(Exception x)
		  {
			  System.out.println("Error: " + x);
		  }
	  }
}
