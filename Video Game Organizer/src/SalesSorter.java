import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SalesSorter {

	public static void main(String[] args)
	{
		try
		{
			ArrayList<VideoGame> vgList = new ArrayList<VideoGame>();
			File inputFile = new File("vgsales.csv");
			Scanner fileScanner= new Scanner(inputFile);
			fileScanner.nextLine();
			while(fileScanner.hasNextLine())
			{
				Scanner lineScanner = new Scanner(fileScanner.nextLine());
				lineScanner.useDelimiter(",");
				VideoGame temp = new VideoGame();
				lineScanner.next();
				temp.setName(lineScanner.next());
				if(temp.name().equals("\"Hey You") || temp.name().equals("\"Monsters") || temp.name().equals("\"WarioWare") || temp.name().equals("\"The Chronicles of Narnia: The Lion"))
				{
					temp.setName(temp.name()+", " + lineScanner.next());
				}
				temp.setPlatform(lineScanner.next());
				String yearChecker = lineScanner.next();
				if(yearChecker.equals("N/A"))
				{
					temp.setYearPublished(0);
				}
				else
				{
					temp.setYearPublished(Integer.valueOf(yearChecker));
				}
				temp.setGenre(lineScanner.next());
				temp.setPublisher(lineScanner.next());
				if(temp.publisher().equals("\"mixi"))
				{
					temp.setPublisher(temp.publisher()+", " + lineScanner.next());
				}
				temp.setSalesNA(lineScanner.nextDouble());
				temp.setSalesEU(lineScanner.nextDouble());
				temp.setSalesJP(lineScanner.nextDouble());
				temp.setSalesOther(lineScanner.nextDouble());
				lineScanner.next();
				vgList.add(temp);
				lineScanner.close();
			}
			fileScanner.close();
			Collections.sort(vgList,  Comparator.comparing(VideoGame::salesTotal));
		}
		catch(Exception x)
		{
			System.out.println("Error: " + x);
		}

	}

}
