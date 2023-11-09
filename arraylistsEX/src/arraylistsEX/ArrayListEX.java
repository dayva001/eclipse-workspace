package arraylistsEX;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListEX {

	public static void main(String[] args)
	{
		List<String> sentence= new ArrayList<String>
		(Arrays.asList("will", "you", "get", "a", "headache", "if", "you", "think", "too", "hard"));
		System.out.println(sentence);
		sortSentence(sentence);
		System.out.println("Sorted: " + sentence);
		String mindKiller = "I, must not fear. Fear is the mind-killer. Fear is the little-death that brings total obliteration. I will face my fear. I will permit it to pass over me and through me. And when it has gone past I will turn the inner eye to see its path. Where the fear has gone there will be nothing. Only I will remain.";
		List<String> duneQuote = new ArrayList<String>(Arrays.asList(mindKiller.split(" ")));
		System.out.println(mindKiller);
		sortSentence(duneQuote);
		System.out.println("Sorted: " + duneQuote);
		
		List<Car> garage = new ArrayList<Car>();
		String fileName;
		try
		{
			Scanner myScan = new Scanner(System.in);
			System.out.println("From which file do you want to load this information? ");
			fileName = myScan.nextLine();
			File inputFile= new File(fileName);
		    while(!inputFile.exists() || fileName.equals("exit"))
		    {
			      System.out.println("File does not exist. Please try again or type exit to quit: ");
			      fileName = myScan.nextLine();
			      inputFile= new File(fileName);
		    }
		    Scanner inputScanner = new Scanner(inputFile);
		    while(inputScanner.hasNext())
		    {
		    	garage.add(new Car(inputScanner.nextInt(), inputScanner.next(), inputScanner.next(), inputScanner.next()));
		    }
		    System.out.println("Data loaded.");
		    Collections.sort(garage);
		    System.out.println("Data Sorted.");
		    System.out.println(garage);
		    myScan.close();
		    inputScanner.close();
		}
		
		catch(Exception E)
		{
			  System.out.println("Error: " + E);
		}
		
	}
	
	public static void sortSentence(List<String> words)
	{
		Collections.sort(words);
	}
	


}
