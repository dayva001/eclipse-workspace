import java.util.Scanner;
public class ArrayPlayer{
	  public static void main(String[] args)
	  {
		  try
		  {
			  Scanner inputScan = new Scanner(System.in);
			  System.out.print("Please enter a value for Columns for a 2D array, with a minimum of 5 and maximum of 10: ");
			  int firstDim= inputScan.nextInt();
			  while(firstDim<5 || firstDim>10)
			  {
				  System.out.print("Value is not between 5 and 10, please enter a new value between 5 and 10: ");
				  firstDim=inputScan.nextInt();
			  }
			  System.out.print("Please enter a value for Rows for a 2D array, with a minimum of 5 and maximum of 10: ");
			  int secondDim=inputScan.nextInt();
			  while(secondDim<5 || secondDim>10)
			  {
				  System.out.print("Value is not between 5 and 10, please enter a new value between 5 and 10: ");
				  secondDim=inputScan.nextInt();
			  }
			  int[][] twoDArray=createtwoDArray(firstDim, secondDim);
			  System.out.println("Generating random int array with " + firstDim + " Rows, and " + secondDim + " Columns");
			  System.out.println("---------------------------------------------");
			  printArray(twoDArray);
			  System.out.println("---------------------------------------------");
			  System.out.println("Total sum of the array: " + findSum(twoDArray));
			  System.out.println("Average of the array: " + findAverage(twoDArray));
			  System.out.println("Number of rings in the array: " + findRings(twoDArray));
			  System.out.println("Total number of elements in the outer ring: " + countOuterRing(twoDArray));
			  System.out.println("Numbers in the outer ring, clockwise, starting from the top right: ");
			  printOuterRing(twoDArray);
			  System.out.println();
			  System.out.println("Sum of the outer ring elements: " + sumOuterRing(twoDArray));
			  System.out.println("Average of the outer ring elements: " + averageOuterRing(twoDArray));
			  inputScan.close();
		  }
		  catch(Exception x)
		  {
			  System.out.println("Error: " + x);
		  }
	  }
	  
	  public static int[][] createtwoDArray(int i, int j)
	  {
			  int[][] returnArray=new int[i][j];
			  for(int k=0; k<i; k++)
			  {
				  for(int l=0; l<j; l++)
				  {
					  returnArray[k][l]=getRandomNumber(100,999);
				  }
			  }
			  return returnArray;
	  }
  
	public static int getRandomNumber(int min, int max)
	{
	    return (int) ((Math.random() * (max - min)) + min);
	}
	
	public static void printArray( int [][] myArr)
	{
		for(int i=0; i<myArr.length; i++)
		{
			for(int j=0; j<myArr[0].length; j++)
			{
				System.out.print(myArr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static int findSum(int testArray[][]) 
	{
		int total=0;
		for(int i=0; i<testArray.length ;i++)
		{
			for(int j=0; j<testArray[0].length ;j++)
			{
				total+=testArray[i][j];
			}
				
		}
		return total;
	}
	
	public static double findAverage(int testArray[][])
	{
		return (double)findSum(testArray)/(testArray.length*testArray[0].length);	
	}
	
	public static int findRings(int testArray[][])
	{
		int rows = testArray.length;
		int columns = testArray[0].length;
		int rings=0;
		while(rows >= 1 && columns >=1)
		{
			rows -= 2;
			columns -=2;
			rings++;
		}
		return rings;
	}
	
	public static void printOuterRing(int testArray[][])
	{
		//print right side
		for(int i=0; i< testArray.length; i++)
		{
			System.out.print(testArray[i][testArray[0].length-1] + " ");
		}
		//print bottom row
		for(int i = testArray[0].length-2; i >= 0; i--)
		{
			System.out.print(testArray[testArray.length-1][i] + " ");
		}
		//print left side
		for(int i = testArray.length-2; i >= 0; i--)
		{
			System.out.print(testArray[i][0] + " ");
		}
		//print top row
		for(int i= 1; i<testArray[0].length-1; i++)
		{
			System.out.print(testArray[0][i] + " ");
		}
	}
	
	public static int countOuterRing(int testArray[][])
	{
		int outerRingTotal=0;
		//check right side
		for(int i=0; i< testArray.length; i++)
		{
			outerRingTotal++;
		}
		//check bottom row
		for(int i = testArray[0].length-2; i >= 0; i--)
		{
			outerRingTotal++;
		}
		//check left side
		for(int i = testArray.length-2; i >= 0; i--)
		{
			outerRingTotal++;
		}
		//check top row
		for(int i= 1; i<testArray[0].length-1; i++)
		{
			outerRingTotal++;
		}
		return outerRingTotal;
	}
	
	public static int sumOuterRing(int testArray[][])
	{
		int outerRingSum=0;
		//check right side
		for(int i=0; i< testArray.length; i++)
		{
			outerRingSum += testArray[i][testArray[0].length-1];
		}
		//check bottom row
		for(int i = testArray[0].length-2; i >= 0; i--)
		{
			outerRingSum += testArray[testArray.length-1][i];
		}
		//check left side
		for(int i = testArray.length-2; i >= 0; i--)
		{
			outerRingSum += testArray[i][0];
		}
		//check top row
		for(int i= 1; i<testArray[0].length-1; i++)
		{
			outerRingSum += testArray[0][i];
		}
		return outerRingSum;
	}
	
	public static double averageOuterRing(int testArray[][])
	{
		return  (double)sumOuterRing(testArray)/countOuterRing(testArray);
	}
}
