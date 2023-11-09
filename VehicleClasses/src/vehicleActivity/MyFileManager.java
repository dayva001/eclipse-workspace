package vehicleActivity;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class MyFileManager 
{
	public MyFileManager()
	{
	}
	public void clearFile(String fileName)
	{
		try
		{
		File outputFile = new File(fileName);
		if(!outputFile.exists())
		{
			outputFile.createNewFile();
		}
		FileWriter fw = new FileWriter(fileName, false);
	    PrintWriter flusher = new PrintWriter(fw, false);
	    flusher.flush();
	    fw.close();
	    flusher.close();
		}
		catch(Exception E)
		{
			System.out.println("Error: " + E);
		}
	}
	
	public void appendLine(String lineToPrint, String fileName)
	{
		try
		{
		File outputFile = new File(fileName);
		if(!outputFile.exists())
		{
			outputFile.createNewFile();
		}
	    FileWriter fileOut = new FileWriter(outputFile, true);
	    BufferedWriter buffOut = new BufferedWriter(fileOut);
	    buffOut.write(lineToPrint);
	    buffOut.newLine();
		buffOut.flush();
	    fileOut.close();
	    buffOut.close();
		}
		catch(Exception E)
		{
			System.out.println("Error: " + E);
		}
	}
	
	public void appendArray(ArrayList<Vehicle> v, String fileName)
	{
		try
		{
		File outputFile = new File(fileName);
		if(!outputFile.exists())
		{
			outputFile.createNewFile();
		}
	    FileWriter fileOut = new FileWriter(outputFile, true);
	    BufferedWriter buffOut = new BufferedWriter(fileOut);
	    for(int i=0;i<v.size();i++)
	    {
	    	buffOut.write(v.get(i).toString());
	    	buffOut.newLine();
	    }
		buffOut.flush();
	    fileOut.close();
	    buffOut.close();
		}
		catch(Exception E)
		{
			System.out.println("Error: " + E);
		}
	}
}
