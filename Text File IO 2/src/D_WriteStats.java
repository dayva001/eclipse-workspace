import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D_WriteStats
{
	/*#4 - program that reads all the numbers from the file named numberGrid.txt you just made
    make a new file named gridStats.txt that contains statistics about that list of numbers
    grand total
    totals by row 
    totals by column
    average values of all numbers 
    the count of how many times the number 17 is in the list */
	public static void main(String[] args)
	{
		try
		{
			File inputFile = new File("numberGrid.txt");
			Scanner fileScanner= new Scanner(inputFile);
			File outputFile = new File("gridStats.txt");
			outputFile.createNewFile();
		    PrintWriter printout = new PrintWriter(outputFile);
		    int grandTotal = 0;
		    int[] totalsByRow = new int[10];
		    int[] totalsByColumn=new int[10];
		    int seventeenCount = 0;
		    int i=0;
			while (fileScanner.hasNextLine())
		    {
				int j=0;
				String line = fileScanner.nextLine();
				Scanner lineScanner = new Scanner(line);
				while(lineScanner.hasNext())
				{
					int holder=lineScanner.nextInt();
					if(holder==17)
					{
						seventeenCount++;
					}
					grandTotal+=holder;
					totalsByRow[i]+=holder;
					totalsByColumn[j]+=holder;
					j++;
				}
				lineScanner.close();
				i++;
		    }
			int averageOfFile=grandTotal/100;
			printout.println("grand total: " + grandTotal);
			printout.println("totals by row:");
			for(int k=0;k<10;k++)
			{
				printout.println("Row " + (k+1) +": " + totalsByRow[k]);
			}
			printout.println("totals by column:");
			for(int k=0;k<10;k++)
			{
				printout.println("Column " + (k+1) +": " + totalsByColumn[k]);
			}
			printout.println("Average Value: " + averageOfFile);
			printout.println("Total number of 17s: " + seventeenCount);
			fileScanner.close();
			printout.flush();
			printout.close();
		}
		catch(Exception x)
		{
			System.out.println("Error: " + x);
		}
	}

}
