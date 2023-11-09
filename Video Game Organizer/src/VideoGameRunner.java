import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.InputMismatchException;

public class VideoGameRunner {

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
			//main program
			Scanner inputScanner = new Scanner(System.in);
			int input=0;
			do
			{
				input=0;
				System.out.println("---------------------------------------------");
				System.out.println("| Please choose from the following options: |");
				System.out.println("| 1:Collect games by genre                  |");
				System.out.println("| 2:Collect games by platform               |");
				System.out.println("| 3:Collect games by publisher              |");
				System.out.println("| 4:Collect games by total revenue          |");
				System.out.println("| 5:Exit the program                        |");
				System.out.println("---------------------------------------------");

				while(input !=1 || input !=2 || input !=3 || input !=4 || input !=5)
				{
					if(input ==1 || input ==2 || input ==3 || input ==4 || input ==5)
					{
						break;
					}
					String line = inputScanner.nextLine();
					try
					{
				        input = Integer.parseInt(line);
				    } 
					catch (NumberFormatException nfe) {
				    	System.out.println("Invalid input. Please choose a valid option.");
				    }
				}
				//using a switch statement to handle the 4 different options
				switch(input)
				{
					case 1: int genreCount=0;
							System.out.println("Please choose which genre to collect: ");
							String line = inputScanner.nextLine();
							String genreFileName = line + "Games.txt";
					        File outputFile = new File(genreFileName);
					        if(outputFile.exists())
					        {
					        	System.out.println(genreFileName + " already exists. Overwriting file.");
					        }
					        outputFile.createNewFile();
							PrintWriter printout1 = new PrintWriter(outputFile);
							printout1.println("Rank,Name,Platform,Year,Genre,Publisher,NA_Sales,EU_Sales,JP_Sales,Other_Sales,Global_Sales");
							for(int i=0;i<vgList.size();i++)
							{
								if(vgList.get(i).genre().equals(line))
								{
									genreCount++;
									printout1.println(genreCount + ", " + vgList.get(i).name() + ", " + vgList.get(i).platform()
											+ ", " + vgList.get(i).yearPublished() + ", " + vgList.get(i).genre()
											 + ", " + vgList.get(i).publisher() + ", " + vgList.get(i).salesNA()
											 + ", " + vgList.get(i).salesJP() + ", " + vgList.get(i).salesEU()
											 + ", " + vgList.get(i).salesOther() + ", " + vgList.get(i).salesTotal());
								}
							}
							if(genreCount !=0)
							{
								System.out.println("Sucess, " + genreCount + " games were collected in " + genreFileName);
							}
							else
							{
								System.out.println("No games with the genre " + line);
							}
							printout1.flush();
							printout1.close();
							break;
					case 2: int platformCount=0;
							System.out.println("Please choose which platform to collect: ");
							String line2 = inputScanner.nextLine();
							String platformFileName = line2 + "Games.txt";
					        File outputFile2 = new File(platformFileName);
					        if(outputFile2.exists())
					        {
					        	System.out.println(platformFileName +" already exists. Overwriting file.");
					        }
					        outputFile2.createNewFile();
							PrintWriter printout2 = new PrintWriter(outputFile2);
							printout2.println("Rank,Name,Platform,Year,Genre,Publisher,NA_Sales,EU_Sales,JP_Sales,Other_Sales,Global_Sales");
							for(int i=0;i<vgList.size();i++)
							{
								if(vgList.get(i).platform().equals(line2))
								{
									platformCount++;
									printout2.println(platformCount + ", " + vgList.get(i).name() + ", " + vgList.get(i).platform()
											+ ", " + vgList.get(i).yearPublished() + ", " + vgList.get(i).genre()
											 + ", " + vgList.get(i).publisher() + ", " + vgList.get(i).salesNA()
											 + ", " + vgList.get(i).salesJP() + ", " + vgList.get(i).salesEU()
											 + ", " + vgList.get(i).salesOther() + ", " + vgList.get(i).salesTotal());
								}
							}
							if(platformCount !=0)
							{
								System.out.println("Sucess, " + platformCount + " games were collected in " + platformFileName);
							}
							else
							{
								System.out.println("No games on the platform " + line2);
							}
							printout2.flush();
							printout2.close();
							break;
					case 3: int publisherCount=0;
							System.out.println("Please choose which publisher to collect: ");
							String line3 = inputScanner.nextLine();
							String publisherFileName = line3 + "Games.txt";
					        File outputFile3 = new File(publisherFileName);
					        if(outputFile3.exists())
					        {
					        	System.out.println(publisherFileName +" already exists. Overwriting file.");
					        }
					        outputFile3.createNewFile();
							PrintWriter printout3 = new PrintWriter(outputFile3);
							printout3.println("Rank,Name,Platform,Year,Genre,Publisher,NA_Sales,EU_Sales,JP_Sales,Other_Sales,Global_Sales");
							for(int i=0;i<vgList.size();i++)
							{
								if(vgList.get(i).publisher().equals(line3))
								{
									publisherCount++;
									printout3.println(publisherCount + ", " + vgList.get(i).name() + ", " + vgList.get(i).platform()
											+ ", " + vgList.get(i).yearPublished() + ", " + vgList.get(i).genre()
											 + ", " + vgList.get(i).publisher() + ", " + vgList.get(i).salesNA()
											 + ", " + vgList.get(i).salesJP() + ", " + vgList.get(i).salesEU()
											 + ", " + vgList.get(i).salesOther() + ", " + vgList.get(i).salesTotal());
								}
							}
							if(publisherCount !=0)
							{
								System.out.println("Sucess, " + publisherCount + " games were collected in " + publisherFileName);
							}
							else
							{
								System.out.println("No games by the publisher " + line3);
							}
							printout3.flush();
							printout3.close();
							break;
					case 4: int salesCount =0;
							System.out.println("Please choose the sales limit to collect: ");
							String line4 = inputScanner.nextLine();
							String salesFileName = "Revenue" + line4 + "Games.txt";
					        File outputFile4 = new File(salesFileName);
					        if(outputFile4.exists())
					        {
					        	System.out.println(salesFileName + " already exists. Overwriting file.");
					        }
					        outputFile4.createNewFile();
							PrintWriter printout4 = new PrintWriter(outputFile4);
							double salesLimit=0;
							boolean validSales = false;
							while(validSales==false)
							{
								try
								{
							        salesLimit = Double.parseDouble(line4);
							        validSales=true;
							    }
								catch (NumberFormatException nfe)
								{
							    	System.out.println("Invalid input. Please choose a valid option.");
							    	line4=inputScanner.nextLine();
							    }
							}
							System.out.println("Do you want to collect games with a sales total above or below " + salesLimit);
							System.out.println("1. Above and at");
							System.out.println("2. Below and at");
							int aboveOrBelow =0;
							while(aboveOrBelow !=1 || aboveOrBelow !=2)
							{
						    	line4=inputScanner.nextLine();
								try
								{
							        aboveOrBelow = Integer.parseInt(line4);
									if(aboveOrBelow ==1 || aboveOrBelow ==2)
									{
										break;
									}
							        if(aboveOrBelow !=1 || aboveOrBelow !=2 || aboveOrBelow ==0)
							        {
							        	System.out.println("Invalid input. Please choose a valid option.");
							        }
							    }
								catch (NumberFormatException nfe)
								{
							    	System.out.println("Invalid input. Please choose a valid option.");
							    }
								
							}
							printout4.println("Rank,Name,Platform,Year,Genre,Publisher,NA_Sales,EU_Sales,JP_Sales,Other_Sales,Global_Sales");
							if(aboveOrBelow==1)
							{
								for(int i=0;i<vgList.size();i++)
								{
									if(vgList.get(i).salesTotal() >= (salesLimit))
									{
										salesCount++;
										printout4.println(salesCount + ", " + vgList.get(i).name() + ", " + vgList.get(i).platform()
												+ ", " + vgList.get(i).yearPublished() + ", " + vgList.get(i).genre()
												 + ", " + vgList.get(i).publisher() + ", " + vgList.get(i).salesNA()
												 + ", " + vgList.get(i).salesJP() + ", " + vgList.get(i).salesEU()
												 + ", " + vgList.get(i).salesOther() + ", " + vgList.get(i).salesTotal());
									}
								}
								if(salesCount !=0)
								{
									System.out.println("Sucess, " + salesCount + "games were collected in " + salesFileName);
								}
								else
								{
									System.out.println("No games above or at " + salesLimit +" mil total sales");
								}
							}
							if(aboveOrBelow==2)
							{
								for(int i=0;i<vgList.size();i++)
								{
									if(vgList.get(i).salesTotal() <= (salesLimit))
									{
										salesCount++;
										printout4.println(salesCount + ", " + vgList.get(i).name() + ", " + vgList.get(i).platform()
												+ ", " + vgList.get(i).yearPublished() + ", " + vgList.get(i).genre()
												 + ", " + vgList.get(i).publisher() + ", " + vgList.get(i).salesNA()
												 + ", " + vgList.get(i).salesJP() + ", " + vgList.get(i).salesEU()
												 + ", " + vgList.get(i).salesOther() + ", " + vgList.get(i).salesTotal());
									}
								}
								if(salesCount !=0)
								{
									System.out.println("Sucess, " + salesCount + " games were collected in " + salesFileName);
								}
								else
								{
									System.out.println("No games below or at " + salesLimit +" mil total sales");
								}
							}
							printout4.flush();
							printout4.close();
							break;
					
					case 5: System.out.println("Exiting the program");
							break;
					default:
							break;
				}
			}
			while(input !=5);
			
			inputScanner.close();
		}
		catch(Exception x)
		{
			System.out.println("Error: " + x);
		}
	}

}
