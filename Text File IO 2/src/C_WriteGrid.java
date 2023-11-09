import java.io.File;
import java.io.PrintWriter;

public class C_WriteGrid
{
	/*#3 - program that writes a file named numberGrid.txt
    write a set of 100 random numbers with values between 0 a 20
    The numbers should be arraigned as 10 lines that each contains 10 numbers */
	public static void main(String[] args)
	{
		try
		{
			File outputFile = new File("numberGrid.txt");
		    outputFile.createNewFile();
		    PrintWriter printout = new PrintWriter(outputFile);
			for(int i=0;i<10;i++)
			{
				for(int j=0;j<10;j++)
				{
					if(j<9)
					{
						printout.print(getRandomNumber(0,20)+ " ");
					}
					else
					{
						printout.println(getRandomNumber(0,20));

					}
				}
			}
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
